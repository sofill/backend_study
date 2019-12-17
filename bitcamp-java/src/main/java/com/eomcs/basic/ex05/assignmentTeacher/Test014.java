package com.eomcs.basic.ex05.assignmentTeacher;

import java.util.Scanner;

//# 과제1: 입력 받은 두 정수 사이의 합계를 구하라.
// 실행 예)
// 입력? 2 5
// 2에서 5까지의 합은 14입니다.
//(선생님 하는 스타일 단계별로)
public class Test014 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    System.out.printf("입력? ");
    int start = keyScan.nextInt();
    int end = keyScan.nextInt();

    int sum = 0; // 합한 값을 담을 메모리 설정.
    int no = start;
    while (no <= end) {
      sum = sum + no;
      no = no + 1;
    }
    
    System.out.printf("%d에서 %d까지의 합은 %d입니다.\n", start, end, sum);
    
    keyScan.close();
    // 결과 피드백을 바탕으로 코드 수정
    // -> 초기 입력 값이 변경되는 문제 있음
  }
}

