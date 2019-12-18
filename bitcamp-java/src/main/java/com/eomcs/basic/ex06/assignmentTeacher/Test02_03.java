package com.eomcs.basic.ex06.assignmentTeacher;

import java.util.Scanner;

public class Test02_03 {

  public static void main(String[] args) {
    
    int width = inputInt();
    
    int line = 0;
    while (line++ < width) {
      drawLine(line);
      System.out.println();
    }
    line--;
    
    while (--line > 0) {
      drawLine(line);
      System.out.println();
    }
  }
  
  static int inputInt() {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변 길이? ");
    int width = keyScan.nextInt();
    keyScan.close();
    return width;
  }
  
  static void drawLine(int length) {
    int x = 0;
    while (x++ < length) {
      System.out.print("*");
    }
  }

}
