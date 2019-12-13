package com.bitcamp;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    
    Scanner keyboard = new java.util.Scanner(System.in);
    
    System.out.printf("번호: ");
    int number = keyboard.nextInt();
    System.out.printf("이름: ");
    String name = keyboard.nextLine();
    keyboard.nextLine();
    System.out.printf("이메일: ");
    String email = keyboard.nextLine();
    System.out.printf("암호(4자리숫자): ");
    int password = keyboard.nextInt();
    keyboard.nextLine();    
    System.out.printf("전화: ");
    String phone = keyboard.nextLine();
    
    System.out.println();   
    System.out.printf("==내용확인== \n");
    System.out.printf("번호: %d\n", number);   
    System.out.printf("이름: %s\n", name);       
    System.out.printf("이메일: %s\n", email);   
    System.out.printf("암호: %d\n", password);   
    System.out.printf("전화: %s\n", phone);
    System.out.println();  
    System.out.printf("==입력하신 내용이 맞습니까?==\n" );
    System.out.printf("1. 네    2. 아니요");
    System.out.println();  
    int yesno = keyboard.nextInt();
      if (yesno == 1) {
        System.out.printf("==가입이 완료되었습니다.^^== \n");
        Date today = new Date(System.currentTimeMillis());
        System.out.printf("===가입일: %s\n===", today);
      }
      else {
        System.out.printf("==수정하시겠습니까?==\n" );
      }
      keyboard.close();
  }
}
