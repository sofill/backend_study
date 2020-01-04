package com.eomcs.oop.ex05.test;

public class Sedan extends Car {
  
//  public String model;
//  public String maker;
//  public int capacity;
//  상속을 선언하니 필드를 선언할 필요가 없어짐
  
  public boolean sunroof;
  public boolean auto;

  public Sedan() {}

  public Sedan(String model, String maker, int capacity,
      boolean sunroof, boolean auto) {
    super(model, maker, capacity);
    this.sunroof = sunroof;
    this.auto = auto;
    

  }
}