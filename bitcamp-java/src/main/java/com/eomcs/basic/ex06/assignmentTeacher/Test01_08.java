package com.eomcs.basic.ex06.assignmentTeacher;

import java.util.Scanner;

public class Test01_08 {

  public static void main(String[] args) {
    
    int width = inputInt();
    int line = 0; 
    while (line++ < width) {
      drawLine(line);
      System.out.println();
    }
  }
  
  static int inputInt() { // 입력받는 애
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변 길이? ");
    int width = keyScan.nextInt();
    keyScan.close();
    return width;
  }
  
  static void drawLine(int length) { // 별 찍는 애
    int x = 0;
    while (x++ < length) {
      System.out.print("*");
    }
  }

}








