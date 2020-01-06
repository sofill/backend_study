//# 캡슐화 문법 사용 후 - 개발자가 특정 필드를 직접 접근하지 못하게 막기 
//               (조회용 메서드(getter메서드) 제공 )
package com.eomcs.oop.ex07.a;

class Score2 {
  String name;
  int kor;
  int eng;
  int math;

  // sum 이나 aver 필드는  kor, eng, math 값을 연산한 결과를 보관하기 때문에
  // 직접 접근하여 값을 변경하는 것을 허용해서는 안 된다.
  // 허용하는 순간 개발자의 잘못된 명령으로
  // 국,영,수  점수와  함계,평균이 서로 맞지 않는 문제가 발생할 수 있다.
  // 그래서 자바는 필드나 메서드의 외부 접근 범위를 조정하는 문법을 제공한다. 
  // 그 문법을 '캡슐화(encapsulation)'라고 부른다. 
  //
  private int sum;
  private float aver;

  // sum 과 aver 의 값을 직접 변경하지는 못하더라도
  // 외부에서 이 값들을 조회할 수 있는 방법/수단(method)은 제공해야 한다.
  // => 보통 이렇게 필드 값을 조회하는 용도로 사용하는 메서드의 경우
  //    메서드의 용도를 이해하기 쉽도록  getXxx() 의 형태로 이름을 짓는다.
  //        get필드명() {...}
  // => 메서드의 이름이  get으로 시작한다고 해서 "게터(getter)"라고 부른다.
  // => 그리고 이런  getter는 공개모드로 설정한다.
  //
  public int getSum() {
    return this.sum;
  }

  public float getAver() {
    return this.aver;
  }

  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}

public class Exam0210 {
  public static void main(String[] args) {

    Score2 s1 = new Score2();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;

    s1.compute();

    // 계산을 한 후에 임의적으로 합계를 변경한다면?
    // => sum 과 aver 필드는 private 접근만 허용한다.
    // => 즉 클래스의 멤버만 접근할 수 있고 클래스 외부에서는 접근할 수 없다.
    // => 그래서 다음과 같이 임의로 접근하여 값을 변경할 수 없다.
    //
    //s1.sum = 300; // 컴파일 오류!
    //s1.aver = 100f; // 컴파일 오류!

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s1.name, s1.kor, s1.eng, s1.math, s1.getSum(), s1.getAver());
    //변수가 private으로 막혔지만 그 값을 꺼내서 쓸 수 있는 메서드를 만들게 되는데 그게 get필드명() 이다. (공개로 만든다.)
    //단 값을 바꾸는 용이 아닌 조회용이다. -> 그걸 getter게터라고 한다. 
  }
}
