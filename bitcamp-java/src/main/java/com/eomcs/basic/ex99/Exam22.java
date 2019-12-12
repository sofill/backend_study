package com.eomcs.basic.ex99;

public class Exam22 {
  public static void main(String[] args) {
   // 키보드 정보를 가져온다. 
   // nextInt()란?
   java.io.InputStream keyboard = System.in; // in, out 이라는 변수 위에 커서를 갖다놓으면 무슨 변수인지 알 수 있다. 
   java.io.PrintStream console = System.out; /// java.io패키지 안에 있는 것들... keyboard와 console이라고 내가 변수를 선언.
   java.util.Scanner scanner = new java.util.Scanner(keyboard); 


   System.out.print("입력>");
   int i1 = scanner.nextInt();
   int i2 = scanner.nextInt();
   int i3 = scanner.nextInt();

   System.out.println(i1);
   System.out.println(i2);
   System.out.println(i3);
  
   // nextInt()
   // => space, tab, new line 을 만나면 그 앞까지 입력한 문자열을 int 값으로 바꿔 리턴한다. 
   // => 입력한 문자열이 숫자를 의미하는 문자열이 아니라면 int 값으로 바꿀 수 없기 때문에 실행 오류가 발생한다. 

   

  }
}