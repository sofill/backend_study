package com.eomcs.oop.ex03.test;

public class Test03 {
  public static void main(String[] args) {

   String s = new String("okok");
   
   ///new를 통해 Heap에 자동차 정보를 담을 메모리가 만들어짐
   Car a = new Car();  
   Car b = new Car();
   
   a.start();
   b.stop();
   
   System.out.printf("a.on = %b\n", a.on);
   System.out.printf("b.on = %b\n", b.on);
  } 
}
