package com.bitcamp.words;

import java.sql.Date;
import java.util.Scanner;


public class App1 {
  public static void main(String[] args) {
    Scanner keyboard = new java.util.Scanner(System.in);
    
    System.out.println("=====My Wordbook====");
    System.out.println("번호: 001");
    System.out.println("날짜: 2019.12.11.");
    System.out.println("언어명: 영어");
 
    Date createDate = new Date(System.currentTimeMillis());
    
    System.out.printf("날짜: %s \n", createDate);
    
   }
}
