package com.eomcs.oop.ex03.test;

public class Test02 {


  Test02(){
    this.x = 300;
    //  기본생성  
    //  this = 넘어온 객체(인스턴스) 주소
    //  super(); 수퍼클래스 호출
  }

  Test02(int a){
    this.x = 200;
    this.x = 300;
    //  기본생성  
    //  this = 넘어온 객체(인스턴스) 주소
    //  super(); 수퍼클래스 호출

    {
      this.x = 200;
    }

  }
  int x = 100;
}
