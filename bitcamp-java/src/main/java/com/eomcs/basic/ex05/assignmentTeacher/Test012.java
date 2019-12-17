package com.eomcs.basic.ex05.assignmentTeacher;

import java.util.Scanner;

//# 과제1: 입력 받은 두 정수 사이의 합계를 구하라.
// 실행 예)
// 입력? 2 5
// 2에서 5까지의 합은 14입니다.
//(선생님 하는 스타일 단계별로)
public class Test012 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    //                리모콘         ------ 객체 -------   도구함  도구 

    System.out.print("입력? ");
    int no1 = keyScan.nextInt();
    int no2 = keyScan.nextInt();
    //                             ------------메소드

    System.out.printf("%d에서 %d까지의 합은 %d입니다.\n", no1, no2, 0);
    
    keyScan.close();
  }
}

