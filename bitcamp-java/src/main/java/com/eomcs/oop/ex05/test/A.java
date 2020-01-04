package com.eomcs.oop.ex05.test;

public class A {

  int v1;
  
  A() {
    this(100); 
    //└ 다른 사용자를 가리킬 때의 this : 반드시 문장의 첫 째 줄에 와야 한다!!
    System.out.println("A()");
    //└ this.v1 = 100; // this라는 인스턴스
  }
  A(int v1) {
    this.v1 = v1;
    System.out.println("A(int)");
  }

}
