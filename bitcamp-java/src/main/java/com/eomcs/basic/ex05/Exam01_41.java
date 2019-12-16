package com.eomcs.basic.ex05;

//# 산술 연산자 : 연산의 결과 타입
 
public class Exam01_41 {
  public static void main(String[] args) {
    int i = 5;
    int j = 2;
    float r = i / j; // int와 int의 연산 결과는 항상 int이다.
    // 따라서 r 변수에 넣기 전에 
    // 이미 결과는 정수 2가 된다.
    // 정수 2를 float 변수에 넣으면 
    // 출력할 때 2.0이 된다.
    System.out.println(r);

    // 해결책!
    // - 변수에 들어 있는 값을 다른 타입으로 바꿔라.(계산을 하기 전에 명시적 형변을 하라) 
    //    ★ 변수의 데이터타입은 프로그램 실행 중엔 바뀌지 않는다.!!!
    //     "형변환(type conversion=type casting)"하라!
    r = (float)i / (float)j; // float / float = float
    // i / j의 값은 2.5가 되고
    // r에 저장되는 것은 2.5이다.
    //     ★ int가 float으로 변수의 데이터타입이 바뀌는 게 아니라, float 이라는 임시메모리를 만들어 복사해 넣는 것이다!!!

    System.out.println(r);
  }
}

