package com.eomcs.oop.ex08.d;

public class Sedan extends Car {
  @Override
  public void run() {
      System.out.println("쌩쌩 달린다.");
  }
    
    public void doSunroof(boolean open) {
        if (open) {
            System.out.println("썬루프를 연다.");
        } else {
            System.out.println("썬루프를 닫는다.");
        }
    }
}
// 추상메서드에 상속 받았을 때 서브클래스는 무조건 메서드를 구현해야 한다.
// 반대로 내가 추상메서드를 만들 때는 서브클래스에 무조건 메서드를 구현하도록 해야 한다. 
// 일반클래스는 추상메서드를 가질 수 없다.
