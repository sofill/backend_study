package com.eomcs.oop.ex03.test;

//import com.eomcs.oop.ex03.test.sub.A;

class Score { // 패키지멤버클래스. 퍼블릭이 될 수 없다. 퍼블릭 시키려면 별도 소스파일로 분리시켜야 한다. 
  static int count; //클래스 변수로 만들어야 한다. 공통으로 사용해야 하고, 한 개만 만들어야 하므로.

  //아래는 새로운 값을 정할 수 있는 메모리름 만든 것 = 새로운 데이 터타입 만든것.
  //그 메모리를 다룰 수 있는 연산자가 필요 = 메소드 문법 => static void compute()
  String name; //인스턴스 변수로 만들어야 한다. 각각 만들어져야 하는 것이므로 (사람별로)
  int kor;
  int eng;
  int math;
  int sum;
  float aver;

  //**생성자 : 강제적으로 호출하게 하는 것 
  //void Score() { // 컴파일 오류! 실행 안된다. 
//  Score() { 
//    System.out.println("Score()");
//    Score.increase();
//  }

  Score(String name, int kor, int eng, int math){
    System.out.println("Score() - 2");
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.compute();
    Score.increase();
    //이렇게 생성자 안에서 미리 계산을 해놓게 하면 편리하다!
  }

  //**개발자가 위에 생성자를 안만들어도 자바가 자동으로 이렇게 만든다.  
  //public Score() {
  //}



  //static void compute(Score s) { 
  //연산자. 스태틱 메소드로 만든 연산자다.
  void compute() { //인스턴스 메소드로 만든 연산자로 바꿈.
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f; //암시적 형변환시킴
    //스태틱 메소드보다 편한 게 인스턴스 메소드이다. 파라미터를 통해 주소를 받을 필요가 없다.
  }
  static void increase() { //다른 예시 : 아래에 인스턴스 변수를 쓰지 않기 때문에  static으로 만들어라!
    Score.count++; 
  }
}

public class Test01 {
  public static void main(String[] args) { 
    //클래스가 로딩될 때 한 번 만들어짐.
    Score s1 = new Score("홍길동", 100, 90, 80); 
    // ():default생성자다.파라미터가 없는. 
    //new로 만들어지는 것은 heap에 만들어짐
    // s1은 스택영역에 만들어짐(로컬변수) -> 메소드호출 끝나면 사라짐
    System.out.println("--------");
//    Score.count = 1;
//    s1.name = "홍길동";
//    s1.kor = 100;
//    s1.eng = 90;
//    s1.math = 80;
//    s1.compute();
//    Score.increase(); //이건 스태틱 메소드다.(인스턴스 변수 쓰지 않으면 스태틱메소드로 만들어야 한다.)
    //    Score.compute(s1);;
    //    s1.aver = s1.sum / 3f; //암시적 형변환시킴
    //    //s1이라는 레퍼런스 주소의 ~~로 찾아가라

    Score s2 = new Score("임꺽정", 90, 80, 70); // new로 만들어지는 것은 heap에 만들어짐// s1은 스택영역에 만들어짐(로컬변수)->메소드호출 끝나면 사라짐
    System.out.println("--------");
//    s2.name = "임꺽정";
//    s2.kor = 90;
//    s2.eng = 80;
//    s2.math = 70;
//    s2.compute(); 
//    Score.increase(); //이건 스태틱 메소드다.(인스턴스 변수 쓰지 않으면 스태틱메소드로 만들어야 한다.)
    //    Score.compute(s2);
    //    s2.aver = s2.sum / 3f; //암시적 형변환시킴
    //    //s2이라는 레퍼런스 주소의 ~~로 찾아가라
  }
}