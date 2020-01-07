package com.eomcs.oop.ex08.test;
//F.java이게 다형적 변수다. 변수의 형질이 여러개라는 것이다. 
public class F extends Object {
  int a;
  void m1() {}
}

class F2 extends F {
  int b;
  void m2() {}
}

class F3 extends F2 {
  int c;
  void m3() {}
}

class TestF {
  public static void main(String[] args) {
    // 다형적 변수
    // => 참조 변수는 하위 클래스의 인스턴스 주소를 저장할 수 있다.
    // => 레퍼런스는 하위 (클래스의) 객체를 가리킬 수 있다.
    F obj1 = new F();
    obj1 = new F2();
    obj1 = new F3();
    
    F2 obj2 = new F2();
    obj2 = new F3();
    //obj2 = new F(); // 위를 가리킬 수는 없다. 
    // (모든 동물은 사람이 아니다. 그러나 사람은 동물이다.)

  }
}

