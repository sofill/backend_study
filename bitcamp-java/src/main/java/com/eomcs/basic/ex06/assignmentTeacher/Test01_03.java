package com.eomcs.basic.ex06.assignmentTeacher;

import java.util.Scanner;

public class Test01_03 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("밑변 길이? ");
    int width = keyScan.nextInt();
    
    System.out.println("*");
    System.out.println("**");
    System.out.println("***");
    System.out.println("****");
    System.out.println("*****");
    
    keyScan.close();
  }

}
