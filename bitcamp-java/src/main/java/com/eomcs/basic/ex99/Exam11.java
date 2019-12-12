package com.eomcs.basic.ex99;

public class Exam11 {
  public static void main(String[] args) {
    // 값 출력하기
   
    // println() 사용법
    // => 출력 + 줄바꿈
    System.out.println(100); // 시스템이라는 상자에 아웃이라는 도구가 들어 있는데 println은 그 중 한 기능이다. 
    System.out.println(3.14);
    System.out.println(true);
    System.out.println('가');
    System.out.println("안녕!");
    
    System.out.println();

    // print() 사용법
    // => 출력
    System.out.print(100); 
    System.out.print(3.14);
    System.out.print(true);
    System.out.print('가');
    System.out.print("안녕!");

    System.out.print('\n'); // 이스케이프 문자

    System.out.print("OK! \n"); // 이스케이프 문자를 문자열 안에도 삽입할 수 있다. 
    System.out.print("NO!");

    // printf() 사용법
    // => printf("형식", 값1, 값2, ...); 
    System.out.printf("\n이름:", "홍길동"); // 홍길동과 20이 출력이 안됨... 
    System.out.printf("\n나이:", 20); // 아래 참고
    System.out.printf("\n이름: %s", "홍길동"); // 문자열에는 %s, 숫자에는 %d 적용해야 나옴
    System.out.printf("\n나이: %d", 20);
    System.out.printf("\n이름(나이): %s(%d)", "홍길동", 20);

    // 정수 삽입
    // %d : decimal
    // %x : hexadecimal
    // %c : character
    System.out.printf("\n %d, %x, %c", 65, 65, 65);

    // 삽입될 값 지정하기
    // => %값위치$d
    // 순서는 1부터 증가한다. 
    System.out.printf("\n %1$d, %1$x, %1$c", 65);

    // 논리 값 삽입
    System.out.printf("\n재직자: %s, %b", true, true);
    System.out.printf("\n나이: %s, %d", 20, 20); 

    // 출력할 공간 확보
    System.out.printf("\n이름: [%s]", "홍길동");
    System.out.printf("\n이름: [%20s]", "홍길동"); // 공간확보/ 오른쪽 정렬 
    System.out.printf("\n이름: [%-20s]", "홍길동"); // 왼쪽 정렬 

    System.out.printf("\n숫자: [%d]", 12345);
    System.out.printf("\n숫자: [%10d]", 12345);
    System.out.printf("\n숫자: [%-10d]", 12345);    
    System.out.printf("\n숫자: [%010d]", 12345); // 빈자리가 0으로 채워진다. 
    System.out.printf("\n숫자: [%+010d],[%+010d]", 12345, -12345); // 출력하면 앞의 12345에도 +가 붙는다. 

    // 일시 다루기
    java.util.Date today = new java.util.Date();
    //today.setDate(9); // 오늘 날짜를 다른 날짜로 변경하는 설정

    System.out.printf("\n%s", today); // 외국식으로 나온다. 

    //날짜 객체에서 년,월,일,시,분,초,요일 추출하기
    System.out.printf("\n%tY", today); // 위의 값에서 Y를 넣음으로써 연도만 추출한 것.
    System.out.printf("\n%tY, %ty",today, today); // 소문자 y를 넣음으로써 19만 추출한 것. 
    System.out.printf("\n%tB, %tb",today, today); // 월 추출. 12월 12월 나왔는데 영어의 경우 December와 Dec으로 나옴
    System.out.printf("\n%tm",today); // 월 추출.
    System.out.printf("\n%td, %te",today, today); // 일 추출 => 09, 9 
    System.out.printf("\n%tA, %ta",today, today); // 요일 추출 => 월요일, 월 
    System.out.printf("\n%tH, %tI",today, today); // 시각 추출 => 13시, 1시 
    System.out.printf("\n%tM", today); // 분 추출 M이라 월 로 볼 수 있겠으나 분이다.
    System.out.printf("\n%tS, %tL, %tN", today, today, today); // 초 추출 => 56초, 877초(밀리초), 877000000초(나노초)
    System.out.printf("\n%tp, %Tp",today, today); // 오전 오후 추출 // 오후 오후 나오는데 영어면 pm PM으로 나옴

    // Mon Dec 09 12:35:09 KST 2019
    
    // 2019
    // 2019, 19
    // December, Dec
    // 12
    // 09, 9
    // Monday, Mon
    // 12, 12
    // 35
    // 09, 134, 134000000
    // pm, PM

    // 2019-12-12 12:37:45 출력해보시오

    System.out.printf("\n%tY-%tm-%td %tH:%tM:%tS", today, today, today, today, today, today);
    System.out.printf("\n%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", today);

    String str;
    str = String.format("\n%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", today);
    System.out.println(str); // 위의 두가지와 비교해보라. String 사용법이 가미됨.
    

  }
}