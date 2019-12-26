package com.eomcs.oop.ex01;

//# 클래스 - 사용 전
//
public class Exam0110 {
  public static void main(String[] args) {
    // 낱개의 변수를 사용하여 한 사람의 성적 정보를 저장하라!
    // => 식탁에 밥, 국, 반찬1, 반찬2, 반찬3 을 각각 따로 가져오는 상황.
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    name = "홍길동";
    kor = 100;
    eng = 90;
    math = 80;
    sum = kor + eng + math;
    aver = (float)sum / 3; //3이라는 리터럴 값이 암시적 형변환/ 부동소수점으로
    //8byte long값이 플롯으로 바뀌면서 이상한 값이 되어버리므로 조심. 
    //sum은 int이다. 변수의 데이터타입은 중간에 바뀌지 않는다. 
    //type conversion이 아니라 type casting으로 생각하는 게 더 직관적이다. 
    //=> sum까지 형변환 => 명시적 형변환
    //=> 3에서 (float)을 빼도 둘 다 형변환이 된다. 

    System.out.printf("이름: %s\n", name);
    System.out.printf("국어: %d\n", kor);
    System.out.printf("영어: %d\n", eng);
    System.out.printf("수학: %d\n", math);
    System.out.printf("합계: %d\n", sum);
    System.out.printf("평균: %.1f\n", aver);
  }
}




