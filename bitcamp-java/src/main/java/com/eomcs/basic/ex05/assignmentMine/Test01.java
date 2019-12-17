package com.eomcs.basic.ex05.assignmentMine;

import java.util.Scanner;

public class Test01 {
  public static void main(String[] args) {
    // 변수 선언하기
    int sum = 0;
    Scanner keyboard = new Scanner(System.in);

    System.out.printf("시작하는 숫자를 입력해 주세요: ");
    int num1 = keyboard.nextInt();

    System.out.printf("끝나는 숫자를 입력해 주세요: ");
    int num2 = keyboard.nextInt();

    for (int i = num1; i <= num2; i++) {
      sum = sum + i;
      System.out.printf("숫자 %d부터 %d까지 더한 값은 %d입니다.", num1, num2, sum);
    }

    // 입력받기

    // (예시)3, 7
    // 3에서 7까지의 합 3+4+5+6+7=00입니다.


    // System.out.println("이름: %s\n", sum);
    // 출력하기
  }
}

