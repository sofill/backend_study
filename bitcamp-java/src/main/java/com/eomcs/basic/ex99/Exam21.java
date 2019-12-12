package com.eomcs.basic.ex99;

public class Exam21 {
  public static void main(String[] args) {
   // 키보드 정보를 가져온다. 
   // 키보드란?
   java.io.InputStream keyboard = System.in; // in, out 이라는 변수 위에 커서를 갖다놓으면 무슨 변수인지 알 수 있다. 
   java.io.PrintStream console = System.out; /// java.io패키지 안에 있는 것들... keyboard와 console이라고 내가 변수를 선언.
   
   // keyboard 객체에 정수, 부동소수점, 논리값, 문자열을 끊어서 읽어 주는 도우미 객체를 붙인다. 객체=도구
   java.util.Scanner scanner = new java.util.Scanner(keyboard); // Scanner로 키보드를 감싼다.
   // new는 도구를 생산하는 명령어이다. (즉 메모리를 생산하는)
   // 지금은 Scanner라는 도구를 생산. 그 Scanner로 keyboard를 감쌈.
   // Scanner는 샤워기헤드 라고 생각하면 된다. 수도에 연결 안하면 이 자체로 아무일도 못하듯.. Scanner만으로는 아무것도 못한다.
   // Scanner에다가 keyboard를 넘겨주고, Scanner가 작업할 때 keyboard를 사용.

   // 키보드로부터 들어온 바이트 계열을 분석하여 
   // 줄바꿈 기호를 만나면 그 앞에 입력한 바이트 배열을
   // 문자열로 변환하여 리턴한다.
   // 키보드로부터 줄바꿈 값이 들어오지 않으면 영원히 리턴하지 않는다. 
   String s1 = scanner.nextLine();
   
   System.out.println("잘가!"); // 리턴하지 않는다. 왜냐면? 줄바꿈 기호가 없기 때문이다. 
   //PowerShell에서 내가 엔터를 치면 그제서야 잘가!를 출력한다. 

   String s2 = scanner.nextLine();
   String s3 = scanner.nextLine();
   String s4 = scanner.nextLine();
   System.out.println("================================"); //  
   System.out.println(s2);
   System.out.println(s3);
   System.out.println(s4);

  

    

  }
}