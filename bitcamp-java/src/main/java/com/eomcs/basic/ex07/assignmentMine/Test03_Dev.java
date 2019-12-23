package com.eomcs.basic.ex07.assignmentMine;

public class Test03_Dev {
  public static void main(String[] args) {

    int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};

    // 문제3 : 배열에 들어 있는 값의 순서를 거꾸로 바꿔라.
    // 출력결과 : -22, 0, 45, 22, 12, 78, -3, 4, 34

    reverse(values); 

    printValues(values);

  }

  static void reverse(int[] values) { //인트배열주소를 받는 파라미터 설정
    int count = values.length >> 1; //1비트만 자리 이동하면 나누기 2가 된다.이걸 활용하자.
    int temp = 0;
    int endPos = values.length - 1;
    for (int i = 0; i < count; i++) { // 개발자들의 방식★
      temp = values[i];
      values[i] = values[endPos - i];
      values[endPos - i] = temp;
    }
  }

  static void printValues(int[] values) { // 프린트 하기 위해 배열의 주소를 받음 
    for (int i = 0; i < values.length; i++) {
      System.out.printf("%3d ", values[i]); // 배열의 값을 세 자리씩 출력하는 것
    }
    System.out.println();
  }
}
