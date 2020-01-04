// 메서드 오버로딩(overloading) - 문법 사용 전
package com.eomcs.oop.ex06.b;

public class Exam0120 {

  static class Calculator {

    // 만약 같은 이름의 메서드를 여러 개 만들 수 없다면,
    // 다음과 같이 같은 일을 수행(두 수를 더하는 일)하는 메서드라도
    // 이름을 다르게 해야 한다.

    static int plusi(int a, int b) {
      return a + b;
    }

    static int plusi2(int a) {
      return a + a;
    }
    static float plusf(float a, float b) {
      return a + b;
    }
  }

  public static void main(String[] args) {

    // 두 개의 정수를 더할 때는 plusti()를 호출해야 한다.
    int r1 = Calculator.plusi(100, 200);
    // 한 개의 정수를 두 번 더할 때는 plusti2()를 호출해야 한다.
    int r2 = Calculator.plusi2(100);
    // 두 개의 부동소수점을 더할 때는 plusf()를 호출해야 한다. 
    float r3 = Calculator.plusf(35.7f, 22.2f);

    System.out.printf("%d, %d, %.1f\n", r1, r2, r3);


    // 오버로딩(overloading)?
    // => 파라미터의 형식은 다르지만 같은 기능을 수행하는 메서드에 대해 
    //     같은 이름을 부여함으로써 프로그래밍의 일관성을 제공하기 위한 문법이다.  





  }


}



