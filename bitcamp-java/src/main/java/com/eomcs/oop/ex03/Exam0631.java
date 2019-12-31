// 인스턴스 초기화 블록과 필드 초기화, 생성자의 실행 순서
package com.eomcs.oop.ex03;

public class Exam0631 {

  static class A { //번호 순서대로 실행한다는!
    A() {
      // 자바 컴파일러는
      // 인스턴스 초기화 블록이나 필드 초기화 문장이 있다면
      // 종류의 구분 없이 선언된 순서대로 그대로 모든 생성자 처음 부분에 복사한다.
      // 즉 다음과 같다. 
      // a = 200;
      // System.out.println("초기화 블록");
      // int a = 100;
      
      System.out.println("A()");
      // this.a = 300;
    }
    
    A(int a) {
      // a = 200;
      // System.out.println("초기화 블록");
      // a = 100;
      
      System.out.println("A(int)");
      this.a = a;
    }
    
    // 인스턴스  초기화 블록 (initializer block) 
    {
      a = 200;
      System.out.println("초기화 블록");
    }

    // 필드 초기화 문장 (variable initializer) (=변수 초기화라고도 한다.)
    int a = 100;
  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.println(obj1.a);
    
    System.out.println("=-----------------=");
    
    A obj2 = new A(1111);
    System.out.println(obj2.a);
    
  }
}





