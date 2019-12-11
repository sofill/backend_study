package com.eomcs.basic.ex04;

public class Exam151 {
  public static void main(String[] args) {
    // 변수 사용
    int i;
    i = 100;

    System.out.println(i);
    int j;
    j = i; // 한 변수에 다른 변수의 값을 저장할 때도 이렇게 할 수 있다.
           // i변수에 들어있는 값을 j 변수에 넣으라는 뜻!!!
    
    // 용어정리
    // 할당연산자 '='
    // - 변수에 값을 넣는 일을 한다. 
    // - 문법
    //   l-value = r-value;
    //   l-value : 변수가 와야 한다. 값이 올 수 없다. 
    //   r-value : 값이나 변수, 표현식이 올 수 있다. 
    i = 100;
    // 200 = 300 ; // 오류 
    // 200 = i // 오류

    j = 300; // 값
    j = i; // 변수
    j = i * 3; // 표현식 (expression)
    j = Math.abs(-200); // 표현식 (뭔진 몰라도...)
    j = (i > 100) ? 1 : -1; // 표현식
    // j = System.out.println(100); // 표현식이 아니다.. 그냥 문장이다. 콘솔창으로 값을 출력할 뿐이다. ★☆★

    // 문장(statement)
    // - 자바 언어로 작성한 명령어 
    // 
    // 표현식(expression)
    // - 문장 중에 값을 리턴하는 문장. 실행한 후 값이 나오는 것. 값이 없으면 표현식이 아니다. 

    }
}