// 제네릭(Generic) 문법 정리 - 제네릭 파라미터
package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0221 {

  static class A {} // 얘는 Object를 상속받는다. 
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}
  /*
   *   Object
   *     |
   *     A
   *    / \
   *   B1 B2
   *   |
   *   C
   */

  public static void main(String[] args) {
    // m1(ArrayList<Object>)
    // => Object로 지정된 ArrayList만 파라미터로 넘길 수 있다.
    // => Object의 하위 클래스는 안된다.
    //
    m1(new ArrayList ());
//    m1(new ArrayList<A>());
//    m1(new ArrayList<B1>());
//    m1(new ArrayList<B2>());
//    m1(new ArrayList<C>());

  }
  static void m1 (ArrayList<Object> list) {

  }
}











