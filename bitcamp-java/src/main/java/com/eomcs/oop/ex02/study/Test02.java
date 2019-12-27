package com.eomcs.oop.ex02.study;
//Exam0210의 예 - 불편하다는 예 -> 수정함
public class Test02 {
  public static void main(String[] args) {
    // 식1 : 2 + 3 - 1 * 7 / 3 = ?
    // 식2 : 3 * 2 + 7 / 4 - 5 = ?
    
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();
    
    
    // 메서드를 호출할 때 어떤 result 변수에 그 계산 결과를 저장할 것인지,
    // 파라미터로 인스턴스 주소를 넘겨야 한다.
       

    c1.plus(2); // 식1
    c2.plus(3); // 식2
    
    c1.plus(3); // 식1
    c2.multiple(2); // 식2
    
    c1.minus(1); // 식1
    c2.plus(7); // 식2
    
    c1.multiple(7); // 식1
    c2.divide(4); // 식2
    
    c1.divide(3); // 식1
    c2.minus(5); // 식2

    System.out.printf("결과: %d\n", c1.result);  
    System.out.printf("결과: %d\n", c2.result);   
    
  }
}
//기존것4
// 식1 : 2 + 3 - 1 * 7 / 3 = ?
//// 식2 : 3 * 2 + 7 / 4 - 5 = ?
//
//Calculator c1 = new Calculator();
//Calculator c2 = new Calculator();
//
//
//// 메서드를 호출할 때 어떤 result 변수에 그 계산 결과를 저장할 것인지,
//// 파라미터로 인스턴스 주소를 넘겨야 한다.
//   
//
//Calculator.plus(c1, 2); // 식1
//Calculator.plus(c2, 3); // 식2
//
//Calculator.plus(c1, 3); // 식1
//Calculator.multiple(c2, 2); // 식2
//
//Calculator.minus(c1, 1); // 식1
//Calculator.plus(c2, 7); // 식2
//
//Calculator.multiple(c1, 7); // 식1
//Calculator.divide(c2, 4); // 식2
//
//Calculator.divide(c1, 3); // 식1
//Calculator.minus(c2, 5); // 식2
//
//System.out.printf("결과: %d\n", c1.result);  
//System.out.printf("결과: %d\n", c2.result);  




//기존것3
// 식1 : 2 + 3 - 1 * 7 / 3 = ?
//// 식2 : 3 * 2 + 7 / 4 - 5 = ?
//
//// Calculator의  result 변수는 static 이라서
//// 클래스에 한 개만 존재한다.
//// 따라서 다음과 같이 여러 개의 결과를 동시에 관리할 수 없다.
//// 오직 한 번에 한 개의 결과만 관리할 수 있다.
//// 그래서 한 개의 식을 끝낸 다음에 다른 식을 계산해야 한다.
//// 결과를 개별적으로 관리하고 싶다면 non-static 필드로 선언하면 된다!!
//// 즉, 인스턴스 마다 따로 생성되게 하라!!
//// 인스턴스 필드로 만들면 된다!
//
//
//Calculator.plus(2); // 식1
//Calculator.plus(3); // 식2
//
//Calculator.plus(3); // 식1
//Calculator.multiple(2); // 식2
//
//Calculator.minus(1); // 식1
//Calculator.plus(7); // 식2
//
//Calculator.multiple(7); // 식1
//Calculator.divide(4); // 식2
//
//Calculator.divide(3); // 식1
//Calculator.minus(5); // 식2
//
//System.out.printf("결과: %d\n", Calculator.result); //식1 ?/???
//System.out.printf("결과: %d\n", Calculator.result); //식2? ????





//기존것2
// 2 + 3 - 1 * 7 / 3 = ?
//// 일단 연산자 우선순위는 고려하지 않고 순서대로 하게끔 한다. 
//
//
//Calculator.plus(2);
//Calculator.plus(3);
//Calculator.minus(1);
//Calculator.multiple(7);
//Calculator.divide(3);
//
//
//System.out.printf("결과: %d\n", Calculator.result);
//}
//}







// 기존것1
//    int result = 0;
//
//result = Calculator.plus(2, 3);
//result = Calculator.minus(result, 1);
//result = Calculator.multiple(result, 7);
//result = Calculator.divide(result, 3);
//
//
//System.out.printf("결과: %d\n", result);