package com.eomcs.basic.ex07.assignmentTeacher;

public class Test02_02 {
  public static void main(String[] args) {
    int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};
    
    // 배열에 들어 있는 값을 오름차순으로 정렬하라.
    sort(values); 
    
    System.out.println("--------------------");
    
    for (int value : values) {
      System.out.print(value + " ,");
    }
    System.out.println();
    // 출력결과:
    // -22, -3, 0, 4, 12, 22, 34, 45, 78
  }
  
  static void sort(int[] values) {
    for (int i = 0; i < values.length; i++) {
      System.out.print(values[i] + " ,");
    }
    System.out.println();
  }
  
  
  
}




