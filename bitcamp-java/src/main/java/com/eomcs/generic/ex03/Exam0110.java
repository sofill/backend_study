package com.eomcs.generic.ex03;

import java.lang.reflect.Array;

public class Exam0110 {

  // 제네릭의 타입을 지정할 때 수퍼 클래스르를 지정하지 않으면 모든 타입이 가능하다.
  // 즉 T 자리에 어떤 타입이라도 올 수 있다.
  
  static class ArrayList<T>
    T[] arr;
    int index = 0;

    public ArrayList(Class<?> clazz) {

      //final T[] arr = new T[10]; // 컴파일 오류!

      final T[] arr = (T[])Array.newInstance(clazz, 10);
      this.arr = arr;
    }
  
    public void add(T v) {
      arr[index++] = v;
    }
  
    public T get(int index) {
      return arr[index];
    }

  public static void main(String[] args) {

    Exam0110<Member> obj = new Exam0110<>(Member.class);
    obj.add(new Member());
    obj.add(new Student());
    obj.add(new Teacher());
    obj.add(new Manager());

    System.out.println(obj.get(0));
    System.out.println(obj.get(1));
    System.out.println(obj.get(2));
    System.out.println(obj.get(3));
  }

}
