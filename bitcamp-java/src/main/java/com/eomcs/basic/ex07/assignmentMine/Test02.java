package com.eomcs.basic.ex07.assignmentMine;

public class Test02 {
  public static void main(String[] args) throws Exception {

    int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};

    // 문제2 : 배열에 들어 있는 값을 오름차순으로 정렬하라.
    // 출력결과 : -22, -3, 0, 4, 12, 22, 34, 45, 78

    sort(values); 

    System.out.println("============================");

    printValues(values);

  }

  static void sort(int[] values) throws Exception { //배열의 주소를 받을 변수 준비함 : (int[] values)
    // 크기 비교를 위해 현재 위치의 값과앞 쪽의 값을 비교해야 한다.
    // 따라서 배열 개수만큼 반복하지 말고 한 번 적게 반복해야 한다. 
    // 다음 반복문을 한 번 돌면 가장 큰 수가 맨 오른쪽에 놓인다. 
    // 이 반복문을 여러 번 반복하면 된다. 
    for (int x = (values.length -1); x > 0; x--) {

      int temp = 0;

      for (int i = 0; i < x; i++) {
        Thread.currentThread().sleep(1000);
        printValues(values, i);

        if (values[i] >  values[i + 1]) {
          temp = values[i];
          values[i] = values[i + 1];
          values[i + 1] = temp;

          Thread.currentThread().sleep(1000);
          printValues(values, i);
        }
      }
    }
  }

  static void printValues(int[] values) { // 프린트 하기 위해 배열의 주소를 받음 
    for (int i = 0; i < values.length; i++) {
      System.out.printf("%3d ", values[i]); // 배열의 값을 세 자리씩 출력하는 것
    }
    System.out.println();
  }

  static void printValues(int[] values, int currPos) { // 현재 뭐와 비교하는지 둠 :int currPos
    for (int i = 0; i < values.length; i++) {
      if (i == currPos) {
        System.out.printf("%3d* ", values[i]);  
      } else {
        System.out.printf("%3d  ", values[i]);  
      }
    }
    System.out.println();
  }
}
