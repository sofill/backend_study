package com.eomcs.basic.ex03;

// 정수 리터럴 (literal) - 메모리크기와 유효값 범위
// 
public class Exam23 {
  public static void main(String[] args) {
    // 리터럴 : 4바이트(기본), 8바이트
    // 리터럴에 아무런 표시를 안하면 기본이 '4바이트 정수'를 의미한다. 
    System.out.println(100); // jvm에서 4바이트메모리에 저장한다.
    System.out.println(-2147483648); // -2**31 : 4바이트 최소 음수값
    System.out.println(2147483647); // +2**31 - 1 : 4바이트 최대 양수값
  
    //System.out.println(2147483648); // 4바이트 메모리 크기 초과
    //System.out.println(-2147483649); // 4바이트 메모리 크기 초과

    // 8바이트(64bit) 정수 리터럴 (잘 안쓴다.)
    // 숫자 뒤에 접미사 L, l 을 붙인다. 
    // 접미사L의 유무를 통해 4byte인지 8byte인지 구분하면 된다. 
    System.out.println(-9_223_372_036_854_775_808L);
    System.out.println(9_223_372_036_854_775_807L);
    
    
  System.out.println(100); // 4바이트 정수 리터럴
  System.out.println(100L); // 8바이트 정수 리터럴

  System.out.println(Integer.MIN_VALUE);  // 4바이트 최소 정수값
  System.out.println(Integer.MAX_VALUE);  // 4바이트 최대 정수값
  System.out.println(Long.MIN_VALUE); // 8바이트 최소 정수값
  System.out.println(Long.MAX_VALUE); // 8바이트 최대 정수값
  }
}
