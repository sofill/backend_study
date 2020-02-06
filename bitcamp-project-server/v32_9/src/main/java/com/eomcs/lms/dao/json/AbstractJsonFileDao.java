package com.eomcs.lms.dao.json;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

// 서브 클래스에게 공통 필드나 메서드를 상속해주는 역할을 하기 때문에
// => abstract
// 서브 클래스에게 상속 해주는 메서드 중에서 indexOf() 처럼 구현되지 않은 메서드가 있기 때문에
// => abstract
//
public abstract class AbstractJsonFileDao<T> {
  protected String filename;
  protected List<T> list;

  public AbstractJsonFileDao(String filename) {
    this.filename = filename;
    list = new ArrayList<>();
    loadData();
  }

  @SuppressWarnings("unchecked")
  protected void loadData() {
    File file = new File(filename);
    // new TypeToken<ArrayList<T>>() {}.getType()
    try (BufferedReader in = new BufferedReader(new FileReader(file))) {

      // 현재 클래스의 정보를 알아낸다.
      Class<?> currType = this.getClass();
      System.out.println(currType);

      // 제네릭 타입의 수퍼 클래스 정보를 알아낸다.
      // 어떻게?
      Type parentType = currType.getGenericSuperclass();
      System.out.println(parentType);

      // 수퍼 클래스의 타입 파라미터 중에서 T 값을 추출한다.
      // -> 수퍼 클래스의 제네릭이 적용된 경우 실제 타입은 다음과 같다.
      ParameterizedType parentType2 = (ParameterizedType) parentType;

      // -> 제네릭 수퍼 클래스 정보로부터 "타입 파라미터" 목록을 꺼낸다.
      // => 예를 들어 수퍼 클래스가 다음과 같다면,
      //    class My<T,S,U,V> {...}
      //    타입 파라미터 목록은 T, S, U, V 의 목록이다.
      // => 그런데 AbstractJsonFileDao 클래스는 타입 파라미터가 한 개이다.
      //    따라서 리턴되는 배열에는 T 정보가 한 개 있다.
      Type[] typeParams = parentType2.getActualTypeArguments();

      // 여기에서 우리가 관심있는 것은 T 타입 정보이다.
      // 배열의 0번 방에 있다.
      Type itemType = typeParams[0]; //아이템타입은 타입파람스의 0번 방에 있다.
      System.out.println(itemType);

      // T가 실제 어떤 타입인지 알아냈으면 이것을 가지고 배열을 만들자.
      // => 크기가 0인 배열을 생성한다.
      // => 실제 배열을 사용하려는 것이 아니라 배열의 타입을 꺼내기 위함이다.
      @SuppressWarnings("rawtypes")
      T[] arr = (T[]) Array.newInstance((Class)itemType, 0);

      // T 타입의 배열 정보를 가지고 JSON 데이터를 읽는다.
      // 리턴 값은 실제 T 타입의 객체가 들어 있는 배열이다.
      T[] dataArr = (T[]) new Gson().fromJson(in, arr.getClass());
      for (T b: dataArr) {
        list.add(b);
      }

      //      @SuppressWarnings("serial")
      //      TypeToken<ArrayList<T>> typeToken = new TypeToken<ArrayList<T>>() {
      //        // TypeToken 이라는 추상 클래슬르 상속 받은 서브 클래스를 정의한다.
      //        // => 이 타입의 객체를 한 번만 사용할 것이기 때문에 익명 클래스로 정의한다.
      //        // => 따로 상속 받은 메서드를 오버라이딩 할 필요는 없다.
      //      };
      //      Type type = typeToken.getType();
      //      list = new Gson().fromJson(in, type);
      System.out.printf("총 %d 개의 객체를 로딩했습니다.\n", list.size());

    } catch (Exception e) {
      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());
    }
  }

  protected void saveData() {
    File file = new File(filename);

    try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
      out.write(new Gson().toJson(list));
      System.out.printf("총 %d 개의 객체를 저장했습니다.\n", list.size());

    } catch (IOException e) {
      System.out.println("파일 쓰기 중 오류 발생! - " + e.getMessage());

    }
  }

  // 서브 클래스들의 공통 메서드이기 때문에
  // => 수퍼 클래스에 정의한다.
  // 서브 클래스에서 접근할 수 있어야 하기 때문에
  // => protected
  // 서브 클래스마다 구현 방법이 다르기 때문에
  // => abstract
  // => 수퍼 클래스에서 구현할 수도 없고, 구현해 봐야 소용없다.
  // 서브 클래스에서 반드시 구현해야 할 메서드이기 때문에
  // => abstract
  //
  protected abstract <K> int indexOf(K key);
}


