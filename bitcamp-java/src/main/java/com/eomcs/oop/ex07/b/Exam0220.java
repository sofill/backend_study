// 캡슐화(encapsulation) - 응용
package com.eomcs.oop.ex07.b;

import java.util.Calendar;
import com.eomcs.oop.ex07.b.sub.C;

public class Exam0220 extends C {

  public static void main(String[] args) {
    //Car c1 = new Car(); // 컴파일 오류!
    // 생성자가 private이기 때문에 다른 클래스에서 호출할 수 없다.
    // 따라서 인스턴스를 생성할 수 없다.
    // 
    // 그럼 왜 생성자를 private으로 만들었는가?
    // => 개발자가 직접 인스턴스를 생성하면 너무 복잡하니,
    //    다른 메서드를 통해 인스턴스를 생성하라는 의미다!
    Car c2 = Car.create("티코");
    System.out.printf("%s,%s,%d,%d\n", 
        c2.model, c2.maker, c2.cc, c2.valve);


    //Calendar obj = new Calendar(); // 에러!
    // Calendar 생성자는 protected다 : 자식 클래스까지만 접근 가능
    // protected : 클래스 내부 + 같은 패키지 + 자식클래스

    Calendar obj = Calendar.getInstance();
    // 이렇게 한 것을 보면 아래와 같이 이해를 해야 한다. 
    // 생성자가 private 이나 protected 로 막혀 있으면 
    // 이걸 짠 개발자가 복잡하게 하는것을 피하기 위해
    // 다른 사용자에게 new라는 명령어로 만들지 말고 
    // 자기가 만든 메서드를 이용하라는 의미다. 


  }
}







