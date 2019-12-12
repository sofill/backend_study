package com.eomcs.basic.ex04;

public class Exam41 {
  public static void main(String[] args) {
    // 문자 변수
    short s;
    char c;

    s = -32768;
    s = 32767;

    c = 0;
    c = 65535;
    
    char c1 = 65;
    char c2 = 0x41;
    char c3 = 0b0100_0001; // char에는 문자코드값이 저장된다.
    char c4 = 'A'; // A문자에 저장된 문자코드값이 c4에 저장된다. A가 c4에 저장된다고 생각하면 틀림. 싱글''안에 담긴 문자코드값을 리턴한다.
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);

    int i1 = 'A';  // 당연히 'A'의 리턴값이 정수이니까 int로 출력해도 나온다. 다만 65라는 정수가 출력된다. 
    System.out.println(i1); // 
    i1 = i1 + 10; 
    System.out.println((char)i1); // 형변환. type casting 문자코드로 판단해서 그거에 해당하는 문자로 출력하라고 하는것. 그러기 전엔 정수값이 나온다.
    
    for (int i = 65; i < 'A' + 26; i++) {
      System.out.print((char)i);

    // 문자는 내부적으로 문자코드로 다뤄진다. 


    }

    
    
  }
}