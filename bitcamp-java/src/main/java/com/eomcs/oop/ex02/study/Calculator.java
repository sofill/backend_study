package com.eomcs.oop.ex02.study;
//Exam0210의 예
public class Calculator {

  // 계산 결과를 개별적으로 관리하고 싶다면 인스턴스 필드로 선언해야 한다. (논스태틱 필드)
  int result;   // static을 빼고 인스턴스 필드로 만들라. 그러나 인스턴스 필드는 자동으로 생성되지 않는다. 
  // new를 붙여줘야 한다. 


  // 개별적으로 관링되는 인스턴스 변수  result를 사용하고 싶다면,
  // 파라미터로 인스턴스의 주소를 받아야 한다.
  // 스태틱 메서드에서 인스턴스의 필드나 메서드를 사용할 수 엇ㅂ다.
  // 인스턴스 필드나 인스턴스 메서드를 사용하려면
  // 파라미터로 인스턴스 주소를 받아야  한다. reserved keyword(확보된 키워드,미리 찜해놓은 키워드★)
  // that? 기존에 미리 쓰지 않은 것을 사용해야 함. that은 

  void plus(int value) {
    this.result += value; // result = result + value
  }

  void minus(int value) {
    this.result -= value; // result = result - value
  }

  void multiple(int value) {
    this.result *= value; // result = result * value
  }

  void divide(int value) {
    this.result /= value; // result = result / value
  }
}


//기존것3
// 계산 결과를 개별적으로 관리하고 싶다면 인스턴스 필드로 선언해야 한다. (논스태틱 필드)
//int result;   // static을 빼고 인스턴스 필드로 만들라. 그러나 인스턴스 필드는 자동으로 생성되지 않는다. 
//// new를 붙여줘야 한다. 
//
//
//// 개별적으로 관링되는 인스턴스 변수  result를 사용하고 싶다면,
//// 파라미터로 인스턴스의 주소를 받아야 한다.
//// 스태틱 메서드에서 인스턴스의 필드나 메서드를 사용할 수 엇ㅂ다.
//// 인스턴스 필드나 인스턴스 메서드를 사용하려면
//// 파라미터로 인스턴스 주소를 받아야  한다. reserved keyword(확보된 키워드,미리 찜해놓은 키워드★)
//// that? 기존에 미리 쓰지 않은 것을 사용해야 함. that은 
//
//static void plus(Calculator that, int value) {
//  that.result += value; // result = result + value
//}
//
//static void minus(Calculator that, int value) {
//  that.result -= value;
//}
//
//static void multiple(Calculator that, int value) {
//  that.result *= value;
//}
//
//static void divide(Calculator that, int value) {
//  that.result /= value;
//}
//}

//기존것 2
//메서드가 작업한 결과를 보관하기 위해 필드 문법을 도입!★
//static int result;
//
//static void plus(int value) {
//  result += value; // result = result + value
//}
//
//static void minus(int value) {
//  result -= value;
//}
//
//static void multiple(int value) {
//  result *= value;
//}
//
//static void divide(int value) {
//  result /= value;
//}
//}




// 기존 것1
//static int plus(int p1, int p2) {
//return p1 + p2;
//
//static int minus(int p1, int p2) {
//  return p1 - p2;
//}
//
//static int multiple(int p1, int p2) {
//  return p1 * p2;
//}
//
//static int divide(int p1, int p2) {
//  return p1 / p2;
//}