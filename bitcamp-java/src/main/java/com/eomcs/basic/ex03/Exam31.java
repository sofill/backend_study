package com.eomcs.basic.ex03;

// 부동소수점 리터럴 (literal)
public class Exam31 {
  public static void main(String[] args) {
    // 고정소수점
    System.out.println(3.14159);
    
    // 부동소수점 (부=떠다닐부)
    System.out.println(0.0314159e2); // e2는 곱하기2를 하라는 뜻
    System.out.println(0.0314159E2); // 대문자 가능
    System.out.println(31.4159e-1);  // 10의 -1승
    System.out.println(314.159e-2);  // 10의 -2승
    System.out.println(3141.59e-3);  // 10의 -3승
  }
}
