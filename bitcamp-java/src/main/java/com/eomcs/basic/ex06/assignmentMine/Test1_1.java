package com.eomcs.basic.ex06.assignmentMine;

import java.util.Scanner;

//# 과제(2019-12-17)
//사용자로부터 직삼각형의 밑변 숫자를 입력 받아 '*' 문자로 그려라. 
//
// ## 구현 조건
// 반복문을 사용할 때는 while 또는 do ~ while 문만을 사용하라!
// ## 실행 결과
// ```
// 밑변 길이? 5
// *
// **
// ***
// ****
// *****
// ``` 
public class Test1_1 {
  public static void main(String[] args) {
  
    System.out.println("밑변 숫자를 입력하세요: ");
    Scanner keyScan = new Scanner(System.in);
    int num1 = keyScan.nextInt();
    
    for (int i = 0; i < num1; i++) {
      for (int j=0; j<=i; j++) {
        System.out.print("*");
      }
      System.out.println();
      
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
 
