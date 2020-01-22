// anonymous class - 익명 클래스가 놓이는 장소: 스태틱 필드
package com.eomcs.oop.ex11.a;

public class Exam0510 {
  // 인터페이스의 경우 static으로 선언하지 않아도 스태틱 멤버에서 사용할 수 있다.
  interface A {
    void print();
  }

  // 스태틱 필드의 값을 준비할 때, 익명클래스를 사용할 수 있다.
  // 위 인터페이스 A를 스태틱 필드의 값으로 사용하려면 반드시 print()를 구현해야 함.
  // 아래는 익명클래스를 사용하여 인터페이스 A를 구현한 것. 
  static A obj = new A() {
    @Override
    public void print() {
      System.out.println("Hello!");
    }
  };
}
