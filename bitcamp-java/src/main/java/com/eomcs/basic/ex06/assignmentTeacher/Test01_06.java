package com.eomcs.basic.ex06.assignmentTeacher;

import java.util.Scanner;

public class Test01_06 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("밑변 길이? ");
    int width = keyScan.nextInt();
    
    int line = 0; 
    while (line++ < width) {
      int x = 0;
      while (x++ < line) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    keyScan.close();
  }

}
