package com.eomcs.basic.ex05.assignmentTeacher;

import java.util.Scanner;

//# 과제 2 : 다섯 개의 정수 값을 입력 받고 최소, 최대 값을 구하라.
// 실행 예)
// 입력? 4 17 -1 6 9
// 최소값 : -1
// 최대값 : 17

public class Test022 {
//컨트롤 쉬프트 O : 
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in)
        ;
    System.out.println("입력: ");
    int no1 = keyScan.nextInt();
    int no2 = keyScan.nextInt();
    int no3 = keyScan.nextInt();
    int no4 = keyScan.nextInt();
    int no5 = keyScan.nextInt();
    
    System.out.printf("%d, %d, %d, %d, %d, \n", no1, no2, no3, no4, no5);
    
    
    System.out.println("최소값?:  ");
    System.out.println("최대값?:  ");
    
    keyScan.close();
    
  }
}

