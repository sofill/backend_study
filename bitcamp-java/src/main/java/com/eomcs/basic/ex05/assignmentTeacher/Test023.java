package com.eomcs.basic.ex05.assignmentTeacher;

import java.util.Scanner;

//# 과제 2 : 다섯 개의 정수 값을 입력 받고 최소, 최대 값을 구하라.
// 실행 예)
// 입력? 4 17 -1 6 9
// 최소값 : -1
// 최대값 : 17

public class Test023 {
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
    int min  = no1, max = no1; // 변수를 준비 // 최소, 최대 값을 no1으로 초기화시킨다
    
    if (no2 < min) {
      min = no2;      
    } else if (no2 > max) {
      max = no2;
    }
    
    if (no3 < min) {
      min = no3;      
    } else if (no3 > max) {
      max = no3;
    }
    
    if (no4 < min) {
      min = no4;      
    } else if (no4 > max) {
      max = no4;
    }
    
    if (no5 < min) {
      min = no5;      
    } else if (no5 > max) {
      max = no5;
    }
    
    System.out.printf("최소값?: %d\n", min);
    System.out.printf("최대값?: %d\n", max);
    
    keyScan.close();
    
  }
}

