package com.eomcs.oop.ex02.study;
//주유소 Test04.java
public class GasStation {
 
  String name;
  int type;
  
  int refuel(Car c) {
    if (c.type != this.type) // this사용
      return 0; //타입 같지 않으면 리턴 0
    
    int amount = 100 - c.energy; //잔류량
    c.energy = 100;
    return amount; //채운 양
  }
  
  static void clean(Car c) { //static 떼는 경우는 그 메서드가 인스턴스 변수 사용할 때.. 얘는 안뗀다. 왜냐면 주유소의 종류 상관없이 세차 하니까
    c.cleanLevel = 0;
  }
}
