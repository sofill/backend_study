package com.eomcs.basic.ex06.assignmentMine;

import java.util.Scanner;

//# 과제(2019-12-17)
//사용자로부터 마름모의 가로 길이를 숫자를 입력 받아 '*' 문자로 그려라. 단 마름모의 절반만 그린다.
// 
//
//## 구현 조건
//반복문을 사용할 때는 while 또는 do ~ while 문만을 사용하라!
//
//## 실행 결과
//```
//> java -classpath bin step05.assignment.Test02
//밑변 길이? 5
//*
//**
//***
//****
//*****
//****
//***
//**
//*
public class Test2_1 {
  public static void main(String[] args) {

    System.out.println("밑변 숫자를 입력하세요: ");
    Scanner keyScan = new Scanner(System.in);
    int num1 = keyScan.nextInt();
    int i = 0;

    while (i< num1) {
      int j = 0;
      while (j <= i) {
        System.out.print("*");
        j++;
      }
      System.out.println("");
      i++;         
    } 

      i = i-1;
    while (i > 0) {
      int j = 0; 
      while (j < i) {
        System.out.print("*");
        j++;
      }
      System.out.println("");
      i--;    
   
    }
  } 
}


//
//    int under = keyScan.nextInt();
//    String star = "*";
//    String not = " ";
//    int x = 0;
//    int sum;
//
//    while (x <= under) {
//      x = under + (under - x);
//      System.out.printf("%s%s",star, not); 
//      if ()
//        x++;
//    }
//    keyScan.close();

