package com.eomcs.basic.ex06.assignmentTeacher;

public class Test01_09 {

  public static void main(String[] args) {
    
    int width = Console.inputInt();
    int line = 0; 
    while (line++ < width) {
      Graphic.drawLine(line);
      System.out.println();
    }
  }
}








