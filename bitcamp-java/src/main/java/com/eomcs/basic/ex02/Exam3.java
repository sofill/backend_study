package com.eomcs.basic.ex02;

// 애노테이션(annotation)
// - 
public class Exam3 {
  public static void main(String[] args) {
    // multi-line comments
    System.out.println("애노테이션");
  }    
    
  @Override // <-- 컴파일러나 자바버츄얼머신에게 지시하는 특별한 명령어. 
            //     컴파일러에게 메소드를 재정의함을 알리는 명령어다. 
  public String toString() {
    return "okok";
  }
}