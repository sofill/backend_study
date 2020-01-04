// 다형성 - 다형적 변수와 instanceof 연산자
package com.eomcs.oop.ex06.a;

public class Exam0511 {

  public static void main(String[] args) {
    Vehicle v = new Sedan();

    // instanceof 연산자란?
    // => 레퍼런스에 들어있는 주소가 특정 클래스의 인스턴스인지 검사한다.
    // => super 클래스인 경우도 검사한다.
    //    하위 클래스의 인스턴스인지도 검사한다. 
    System.out.println(v instanceof Sedan); // true!!
    System.out.println(v instanceof Car); // true
    System.out.println(v instanceof Vehicle); // ture
    System.out.println(v instanceof Object); // true

    System.out.println(v instanceof Truck); // false!
    System.out.println(v instanceof Bike); // false!




  }

}




