package com.eomcs.oop.ex02.study;
//카트라이더 게임 Test03.java / 주유소 Test04.java

public class Car {
// final 변수는 주로  public static final 으로 한다.
  public static final int OIL = 1; //중간에 값을 바꾸면 안되니까..
  public static final int GAS = 2; //클래스가 로드됐을 때 만들어지는 메모리이고 
                                   //아래는  new 했을 때 만들어지는 메모리
  String name;
  int type; 
  String color;
  int speed;
  int energy;
  int power;
  int cleanLevel;

  void speedUp() { 
    //speedUp이라는 메소드의 c라는 자동차 
    //Car c:자동차 정보가 저장된 Car인스턴스의 주소를 받는다.
    //Car this = 메서드를 호출할 떄 넘겨준 인스턴스 주소; this라는 히든 변수가 있다.
    if (this.speed >= 100) 
      return;
      this.speed += 10;
    
  }
  int comparePower(Car c) {
    if (this.power > c.power) //this 는 생략 가능하다. 
      return -1;
    else if (this.power == c.power)
      return 0;
    else
      return 1;
  }

}

