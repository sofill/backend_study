package com.eomcs.basic.ex03;

// 부동소수점 리터럴 (literal) - 메모리 크기
public class Exam32 {
  public static void main(String[] args) {
    // 부동소수점 : 4바이트, 8바이트(기본) //부동 (고정소수점도 e0을 하면 부동소수점)
    System.out.println(3.141592653589793); // 
    
    // 8바이트 부동소수점
    System.out.println(3.141592653589793D); // Double (2배로 정밀하다. 4바이트에 비해서..)
    System.out.println(3.141592653589793d); // d도 됨

    // 4바이트 부동소수점
    // - 부동소수점의 경우 큰 값을 작은 메모리에 넣더라도
    //   컴파일 오류가 발생하지 않는다.
    // - 그냥 값이 짤려서 들어갈 뿐이다.
    //   개발자가 잘못된 값을 넣었다는 것을 인지하지 못한다.!!! 중요
    System.out.println(3.141592653589793f); // f, F 둘 다 됨
    
    
  }
}
