package com.eomcs.oop.ex02.study;
// 주유소 Car.java
public class Test04 {
  public static void main(String[] args) {

    Car c1 = new Car(); // Heap 에 만들어짐
    Car c2 = new Car();
    
    c1.name = "봉봉";
    c1.type = Car.OIL; // 숫자로 쓰면 이게 뭔지 나중에 모름.
    c1.color = "빨강";
    c1.speed = 0;
    c1.energy = 80;
    c1.power = 200;
    
    c2.name = "호호";
    c2.type = Car.GAS;
    c2.color = "검정";
    c2.speed = 0;
    c2.energy = 60;
    c2.power = 300;
  
    System.out.printf("c1의 잔류량: %d\n", c1.energy);
    System.out.printf("c2의 잔류량: %d\n", c2.energy);
    
    GasStation station1 = new GasStation();
    station1.type = c1.OIL;
    station1.name = "강남 주유소";
    
    GasStation station2 = new GasStation();
    station2.type = c2.GAS;
    station1.name = "서초 주유소";

    station1.refuel(c1);                          
    station2.refuel(c2);
    
    System.out.printf("c1의 잔류량: %d\n", c1.energy);
    System.out.printf("c2의 잔류량: %d\n", c2.energy);
    
    
  }
}
