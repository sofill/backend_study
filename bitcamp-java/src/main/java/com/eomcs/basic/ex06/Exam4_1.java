package com.eomcs.basic.ex06;

//# 흐름 제어문 - for 반복문
//
public class Exam4_1 {
  public static void main(String[] args) {
    // for (변수선언 및 초기화; 조건; 증감문) 문장;
    // for (변수선언 및 초기화; 조건; 증감문) {문장1; 문장2; ...}

    // for 문의 전형적인 예
    for (int i = 1; i <= 5; i++) 
      System.out.println(i);

    // for 문에서 선언한 변수는 그 for 문 안에서만 사용할 수 있다.
    //System.out.println(i); // 컴파일 오류!!
    
    System.out.println("----------------------");
    
    for (int i = 1; i <= 5;) {
      System.out.println(i);
      i++; // 여기 뺴 놔도 된다. 단, 위의 5 뒤에 ; 를 빼지 말아야 함.
    }

    System.out.println("----------------------");
    int i = 1; // 여기다 뺄 수도 있다. 바깥에서도 계속 써야할 상황이라면.
    for (; i <= 5;) { // 그래서 여기에 ; 라는 앞부분 생략
      System.out.println(i);
      i++; 
    }

    System.out.println("----------------------");
    i = 1;
    for (;;) { // 이렇게 for 문 쓰는 건 별로다. while 써!
      if (i > 5)
        break;
      System.out.println(i);
      i++; 
    }

  }
}
