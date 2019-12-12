package com.eomcs.basic.ex04;

public class Exam16 {
  public static void main(String[] args) {
    // 변수의 종류

    // 1) primitive data type (자바 원시 데이터 타입)
    byte b;   // 1바이트 크기를 갖는 메모리. 그 안에서 정수값을 담을 수 있다. 
    short s;  // 2
    int i;    // 4
    long l;   // 8

    float f;  // 4 부동소수점
    double d; // 8    "
    
    boolean bool; // jvm에서 int로 취급★

    char c; // 2

    // 2) reference : 위의 변수 외에는 전부 다른 메모리의 '주소'를 저장하는 변수이다. 
    String str; // 문자열에 있는 메모리의 주소를 저장
    Thread t;   // 쓰레드에 있는 메모리의 주소를 저장
    java.sql.Date date; // 날짜가 있는 메모리의 주소를 저장
    java.net.Socket socket; // 네트워크 연결 정보를 저장하고 있는 그 메모리의 주소 
    int[] p; // 이것도 레퍼런스 타입이다! []이 들어가있으므로 1)의 int 와 다르다. 

    // 아파트 a; 아파트의 주소를 저장
    // 공장 b;   공장의 주소를 저장... 하듯이 위의 주소도 그렇게 이해하면 된다. 
    // 사무실 c;
    // 차고 d;
    }
}