package com.eomcs.lms;

public class Test2 {
  public static void main(String[] args) {
    try {
      System.out.println(2 / 0);
    } catch (ArithmeticException e) {
      System.out.println("입력 오류 : " + e.getMessage());
    }
  }
}
