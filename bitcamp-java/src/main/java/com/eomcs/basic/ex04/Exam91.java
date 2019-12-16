package com.eomcs.basic.ex04;

// 형변환 : 정수 변수 ==> 부동소수점 변수
public class Exam91 {

  public static void main(String[] args) {
    byte b = 100;
    short s = 200;
    int i = 18_3456_6789;
    long l = 9_876_543_219L;
    long k= 98_7654_3219L;
    long j = 344_9876_9998_7654_3219L;

    // 메모리 크기에 상관 없이 정수 변수의 값을 부동소수점 변수에 넣을 때 
    // 컴파일 오류가 발생하지 않는다.
    // 단 실행할 때 유효자릿수가 넘어가면 값이 짤릴 수 있다. -> 컴파일 오류가 안 떴다고안심하면 안된다는 의미..

    float f;
    f = b;
    System.out.println(f);
    f = s;
    System.out.println(f);
    f = i;
    System.out.println(f);
    f = l;
    System.out.println(f);
    f = k;
    System.out.println(f);
    f = j;
    System.out.println(f);


    double d; // double : 최대 15자리
    d= b;
    System.out.println(d);
    d = s;
    System.out.println(d);
    d = i;
    System.out.println(d);
    d = k;
    System.out.println(d);
 
  }
}