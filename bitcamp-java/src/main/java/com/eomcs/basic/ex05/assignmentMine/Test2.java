package com.eomcs.basic.ex05.assignmentMine;

import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
    // 변수 선언하기 
    int sum = 0;
    Scanner keyboard = new Scanner(System.in);
    
    System.out.printf("시작하는 숫자를 입력해 주세요: ");
    int num1 = keyboard.nextInt();
    
    System.out.printf("끝나는 숫자를 입력해 주세요: ");
    int num2 = keyboard.nextInt();
    
     for (int i = num1; i <= num2 ; i++) {
         sum = 1+(num1-1);
           System.out.println(num1+num2);;         
       }

    keyboard.nextLine();
    Scanner start = new Scanner(System.in);
    Scanner end = new Scanner(System.in);
    System.out.println();
  
    
    keyboard.close();    
    System.out.println();
    
    
    // 입력받기

    // (예시)3, 7
    // 3에서 7까지의 합 3+4+5+6+7=00입니다.
    
    
   //System.out.println("이름: %s\n", sum);
    // 출력하기
  }
}

