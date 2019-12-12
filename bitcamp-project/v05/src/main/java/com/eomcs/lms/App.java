package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
   
    Scanner keyboard = new java.util.Scanner(System.in);
    // Scanner : 키보드에서 사용자가 입력한 값을 읽어 
    // 문자열이나 정수, 부동소수점 등으로 리턴하는 역할

    System.out.print("번호: " );
    int number = keyboard.nextInt();
    // = 는 assignment operator 할당연산자
    // 오른쪽 keyboard.nextLine();이 리턴한 결과값을 no에 저장한다는 의미

    keyboard.nextLine(); // nextInt() 후에 남아있는 줄바꿈 기호를 제거하는 용도로..
    
    System.out.print("수업명: ");
    String title = keyboard.nextLine();
      
    System.out.print("설명: " );
    String explain = keyboard.nextLine(); // nextLine을 쓸 때 조심해야 함.
    
    System.out.print("시작일: " ); //"yyyy-mm-dd" 형태로 입력된 문자열을 날짜 정보로 바꾼다.
    Date startDate = Date.valueOf(keyboard.next());
    
    System.out.print("종료일: " );
    Date endDate = Date.valueOf(keyboard.next());
    
    System.out.print("총수업시간: " );
    int totalHours = keyboard.nextInt();
     
    System.out.print("일수업시간: " );
    int dayHours = keyboard.nextInt();

    System.out.println();
    
    System.out.printf("==내용확인== \n");
    System.out.printf("번호: %s\n", number);    
    System.out.printf("수업명: %s\n", title);   
    System.out.printf("설명: %s\n", explain);   
    System.out.printf("기간: %s ~ %s\n", startDate, endDate);
    System.out.printf("총수업시간: %s 시간\n", totalHours);
    System.out.printf("일수업시간: %s 시간\n", dayHours);
    System.out.printf("==입력하신 내용이 맞습니까?==\n" );
    System.out.printf("1. 네    2. 아니요");

    keyboard.close();
    
    }
  }
