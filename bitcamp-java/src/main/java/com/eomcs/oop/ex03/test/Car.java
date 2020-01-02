package com.eomcs.oop.ex03.test;

public class Car {
  ///메모리 구성하는 설계도 부분 
  boolean on;
  int speed;
  String model;
  String maker;
    
  ///메모리 정보를 다루는 연산자 부분 - 인스턴스 메서드
  void start() {
    this.on = true; // 내장 히든 변수 this. 빌트인변수
  }
  
  void stop() {
    this.on = false;
  }
}
