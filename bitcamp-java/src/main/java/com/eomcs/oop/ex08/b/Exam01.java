// 상속 - Generalization 수행 후
package com.eomcs.oop.ex08.b;

// Sedan과 Truck의 공통 기능인 
// start(), shutdown(), run() 메서드를 추출하여 
// Car 클래스를 만들어서 
// Sedan과 Truck은 이 클래스의 서브클래스가 되게 한다.
// 
// start()와 shutdown() 은 
// Sedan이나 Truck 모두 같은 작업을 수행하기 때문에 상속 받은 것을 그대로 사용하며 되지만,
// run()은 Sedan과 Truck이 서로 다르게 작업하기 때문에 "오버라이딩" 해야 한다.
public class Exam01 {

    public static void main(String[] args) {
      Sedan s = new Sedan();
      Truck t = new Truck();
      Car c = new Car(); // 재밌는 게 Car도 만들 수가 있다. 
      // Sedan과  Truck을 공통적으로 관리하기 위해 만든 클래스인데 ...
      
    }

}
