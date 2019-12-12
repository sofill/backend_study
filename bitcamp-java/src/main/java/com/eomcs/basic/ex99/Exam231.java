package com.eomcs.basic.ex99;

public class Exam231 {
  public static void main(String[] args) {
   java.util.Scanner scanner = new java.util.Scanner(System.in); 
   // nextLine() 다음에 nextLine()을 호출할 때 공백 문자가 읽히는 문제 해결
   System.out.print("입력>");
   int i1 = scanner.nextInt();
   int i2 = scanner.nextInt();

   // 공백만 읽는다.
   // next()
   // => 한 개의 token을 읽는다.  // 한국말로는 token을 '단어'라고 생각하라.(앞뒤에 공백이 있음)
   // => 공백을 만날 때까지 읽는다.
   // => 앞 공백은 제거한다. 
   // => 물론 nextInt()와 달리 값을 읽은 후 뒤의 공백은 제거한다. 
   String s1 = scanner.next();

   String s2 = scanner.next();
   
   int i3 = scanner.nextInt();

   String s3 = scanner.next();


   System.out.println("====================================");

   System.out.println(i1);
   System.out.println(i2);
   System.out.println(i3);

   System.out.println(s1);
   System.out.println(s2);
   System.out.println(s3);
  }
}
