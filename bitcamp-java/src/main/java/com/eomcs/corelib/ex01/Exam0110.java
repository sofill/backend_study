// String - "Hello" vs new String("Hello")
package com.eomcs.corelib.ex01;

public class Exam0110 {
  public static void main(String[] args) {
    // Heap 메모리 영역에 String 인스턴스를 생성하는 방법
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    // => 내용물의 동일 여부를 검사하지 않고 무조건 인스턴스를 생성한다.
    // => 가비지가 되면 가비지 컬렉터에 의해 제거된다.
      System.out.println(s1 == s2);

    // string constant pool 메모리 영역에 String 인스턴스를 생성하는 방법
    String x1 = "Hello"; // String 인스턴스의 주소를 리턴한다. 
    String x2 = "Hello"; // 기존의 String 인스턴스 주소를 리턴한다. 

    // 문자열 리터럴은 내부적으로 new String() 을 실행한다. 
    // 다만 인스턴스를 Heap 이 아닌 String 상수풀(상수 모아놓는 곳)에 생성한다.
    // => 내용물이 같으면 기존 인스턴스의 주소를 리턴한다.
    //    즉 메모리 절약을 위해 중복 데이터를 갖는 인스턴스를 생성하지 않는다.
    // => JVM이 끝날 때까지 메모리에 유지된다.
      System.out.println(x1 == x2);
  }
}
// 즉 new 사용하면 Heap에 만들어지고
// 문자열 리터럴은 String 상수풀에 들어감. 문자열은 주소변수다. 레퍼런스.




