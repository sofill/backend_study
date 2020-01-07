package com.eomcs.oop.ex08.test;

public class I extends Object {
  private int a;
  private int b;
  public int getA() {
    return a;
  }
  public void setA(int a) {
    this.a = a;
  }
  public int getB() {
    return b;
  }
  public void setB(int b) {
    this.b = b;
  }
  // getter/setter를 통칭하여 'property(프로퍼티)'라 부른다. 
}

class TestI {
  public void main(String[] args) {
    I obj = new I();
    //obj.a = 100;
    //obj.b = 100;

    obj.setA(100);
    obj.setB(100);

    // 캡슐화 : 추상화를 무너지지 않게 도와주는 문법.
    
    System.out.println(obj.getA());
    System.out.println(obj.getB());
  }
}

