package com.eomcs.oop.ex01;

//# 클래스 사용 - 사용 범위
//

// 패키지 멤버 클래스
// => 패키지에 직접 소속된 클래스이다.
// => 다른 클래스들도 A 클래스를 사용할 수 있다.
// => bin/main/com/eomcs/oop/ex01/A.class 여기에 이런 클래스파일이 생긴다. 
class A {} 
//지 이름만 사용한다. A.class 이렇게..


// => bin/main/com/eomcs/oop/ex01/Exam0420.class 여기에 이런 클래스파일이 생긴다. 
public class Exam0420 {
  // 중첩 클래스(nested class)
  // => 다른 클래스 안에 정의된 클래스
  // => 그 클래스 안에서만 사용된다.
  // => bin/main/com/eomcs/oop/ex01/Exam0420$B.class 여기에 이런 클래스파일이 생긴다.
  class B {} 
  //Exam0420$b.class => $ 뒤에 이름만 오면 이 클래스에 직접 소속됐다는 뜻. 

  public static void main(String[] args) {
    // 로컬 클래스(local class)
    // => 메서드 블록 안에 정의된 클래스
    // => 오직 그 메서드 블록 안에서만 사용된다.
    // => 중첩 클래스이기도 하다. 
    // => bin/main/com/eomcs/oop/ex01/Exam0420$1c  여기에 이런 클래스파일이 생긴다.
    class C {} 
    //Exam0420$1C => $ 뒤에 숫자 들어가면 로컬클래스라는 걸 알 수 있다. 
  }

  public void m1() {
    A ref1;
    B ref2;
    //C ref3; // 컴파일 오류! //오로지 해당 메소드 안에서만 쓰이기 때문에 오류가 난다. 
  }
}
