package com.eomcs.oop.ex02.study;
//카트라이더 게임 car.java
public class Test03 {
  public static void main(String[] args) {
    Car c1 = new Car(); // Heap 에 만들어짐
    Car c2 = new Car();
    
    c1.name = "봉봉";
    c1.type = 1;
    c1.color = "빨강";
    c1.speed = 0;
    c1.energy = 100;
    c1.power = 200;
    
    c2.name = "호호";
    c2.type = 2;
    c2.color = "검정";
    c2.speed = 0;
    c2.energy = 100;
    c2.power = 300;
    
    c1.speedUp();
    c1.speedUp(); //c1은 스피드업을 두 번 함 speedUp이 연산자
    c2.speedUp(); //인스턴스 메서드에는 반드시 앞에다가 주소를 넣는다. 파라미터 넣을 수 없다. 
    
//    Car c3 = null;
//    c3.speedUp(); //주소가 없는채로 스피드업을 호출하면 : 자바가 머라고함. null이면 호출하나 마나 의미 없다.

    
    System.out.printf("c1의 속도: %d\n", c1.speed);
    System.out.printf("c1의 속도: %d\n", c2.speed);
    
    System.out.printf("c1 vs c2의 힘: %d\n", 
         c1.comparePower(c2)); //comparePower가 연산자
  }
}
