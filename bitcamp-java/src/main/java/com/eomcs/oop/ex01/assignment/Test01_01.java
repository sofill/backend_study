package com.eomcs.oop.ex01.assignment;

import java.util.Scanner;

public class Test01_01 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("입력: ");
    String name = keyScan.next();
    int kor = keyScan.nextInt();
    int eng = keyScan.nextInt();
    int math = keyScan.nextInt();
    
    keyScan.close();
   
    System.out.println(name);
    System.out.println(kor);
    System.out.println(eng);
    System.out.println(math);
  }
}
