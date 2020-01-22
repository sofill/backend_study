// Hashtable과 Iterator
package com.eomcs.corelib.ex08;

import java.util.Iterator;
import java.util.Set;

public class Exam0331 {
  public static void main(String[] args) {
    Member v1 = new Member("홍길동", 20);
    Member v2 = new Member("임꺽정", 30);
    Member v3 = new Member("유관순", 16);
    Member v4 = new Member("안중근", 20);
    Member v5 = new Member("윤봉길", 25);

    Set keys = map.keySet();
    Iterator iterator = keys.iterator();
    // Iterator 객체를 생성할 때,
    // 현재 목록 객체를 바탕으로 생성한다.
    //
    // 따라서 다음과 같이 Iterator를 생성한 후에 목록의 값을 변경하면,
    map.remove("s01");
    map.remove("s02");
    map.remove("s03");

    // Iterator를 사용할 때 오류가 발생할 것이다.

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}


