package com.bitcamp;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    //스캐너를 만들어서 스캐너를 담아놓은 변수 : keyboard
    
    System.out.print("번호: ");
    int number = keyboard.nextInt();
    keyboard.nextLine(); // 줄바꿈 기호 제거용
    
    System.out.print("내용: ");
    String contents = keyboard.nextLine();
    
    // 현재 일시
    // currentTimeMillis()
    // => 1970년 1월 1일 0시 0분 0초부터 현재까지 경과된 시간을 밀리초로 리턴한다.
    //  new Date(밀리초)
    // => 넘겨 받은 밀리초를 가지고 년, 월, 일, 시, 분, 초를 계산한다.
    Date today = new Date(System.currentTimeMillis());
    int count = 0;
    
    keyboard.close();
    
    System.out.println(); 
       
    System.out.printf("번호: %s\n", number);
    System.out.printf("내용: %s\n", contents);
    System.out.printf("작성일: %s\n", today);
    System.out.printf("조회수: %d\n", count);
    System.out.printf("*** 감사합니다.^^ ***");

  } 
}
