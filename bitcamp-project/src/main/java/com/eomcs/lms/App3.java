package com.eomcs.lms;

import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    
    Scanner keyboard = new java.util.Scanner(System.in); 
    System.out.print("번호: ");
    String number = keyboard.nextLine();
    
    System.out.print("내용: ");
    String contents = keyboard.nextLine();
    
    System.out.println(); 
    System.out.println(); 
   
    
    System.out.printf("번호: %s \n", number);
    System.out.printf("내용: %s \n", contents);
    System.out.println("작성일: 2019-12-11");
    System.out.println("조회수: 0");
    System.out.println("*** 감사합니다.^^ ***");

  } 
}
