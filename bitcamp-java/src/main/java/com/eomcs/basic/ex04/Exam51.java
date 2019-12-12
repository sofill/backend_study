package com.eomcs.basic.ex04;

public class Exam51 {
  public static void main(String[] args) {
    // 논리 변수 
    boolean b1, b2;

    b1 = true;
    b2 = false;

    System.out.println(b1);
    System.out.println(b2);

    // b1 = 1; // 컴파일 오류!
    // b2 = 0; // 컴파일 오류!
    // int i = b1; // 컴파일 오류! true가 내부적으로 값이 1이라 착각하기 쉬우나 절대 안된다. 

  }
}