package com.eomcs.oop.ex05.test;

public class Car {
  
  public String model;
  public String maker;
  public int capacity; // 부모의 변수가 바뀌어도 자식은 오류가 나지 않는다. 

  public Car() {}

  public Car(String model, String maker, int capacity) {
    this.model = model;
    this.maker = maker;
    this.capacity = capacity;

  }
}


