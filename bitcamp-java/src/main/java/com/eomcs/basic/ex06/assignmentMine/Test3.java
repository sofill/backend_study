package com.eomcs.basic.ex06.assignmentMine;
//# 과제(2019-12-17)
//사용자로부터 정삼각형 밑변의 길이를 숫자를 입력 받아 '*' 문자로 그려라.
// 
//## 구현 조건
//반복문을 사용할 때는 while 또는 do ~ while 문만을 사용하라!
//
//## 실행 결과
//```
//> java -classpath bin step05.assignment.Test03
//밑변 길이? 5
//    *
//   ***
//  *****
// *******
//*********
import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    System.out.printf("홀수를 고르세요: ");
    int a = keyboard.nextInt();
    int i = 0;
    
    while (i< a) {
      int j = 0;
      int k = (a-i)/2;
      int t = 0;
      while (k >= t) {
        System.out.print(" ");
        t++; 
        }               
      while (j <= i) {
        System.out.print("*");
        j++;
        }
      System.out.println("");
       i += 2 ;       
    }     
  }
}

