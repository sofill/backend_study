package com.eomcs.basic.ex03;

// 정수 리터럴 (literal) - _
// 
public class Exam22 {
  public static void main(String[] args) { //상수값 -> 고정값 -> 언더바로 자리수 표시할 수 있다.
    // 10진수 리터럴
    System.out.println(2_3500_0000);
    System.out.println(235_000_000);  // 언더바는 마음대로 가능 
                                      //맨 앞자리나 맨 뒷자리에는 안됨!

    //8진수 리터럴
    System.out.println(01_44);
    System.out.println(0_144); //이건 01이 특수인데도 된다...희한

    //2진수
    System.out.println(0b0110_0100);
    //System.out.println(0b_0110_0100); 이건 숫자 맨 앞은 안되고 
    //System.out.println(0b_0110_0100_); 이것도 숫자 맨 뒤는 안된다. 
    System.out.println(0B01100100);

    //16진수
    System.out.println(0x00_64);
    //System.out.println(0X_0064); 주석 한거 다 안됨
    //System.out.println(0X0064_);
    //System.out.println(_0X0064);

  }
}
