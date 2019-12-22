package com.eomcs.oop.test;

// gym 회원 정보를 입력 받아 출력
public class Test21 {
  // 회원 정보를 담을 수 있는 메모리의 설계도
  static class Member {
    int no;
    String name;
    int birthYear;
    char gender;
    float height;
    float weight;
    boolean personalTraining;
    // <=여러 메서드가 사용할 클래스는 main 밖으로 꺼내고 static을 붙인다.
  }

  public static void main(String[] agrs) {

    // 1. 인스턴스 주소 주고 받기
    // 1) 인스턴스 주소 받기
    Member m1; // 레퍼런스 선언
    m1 = createMember(); // 인스턴스 생성

    // 2) 인스턴스의 주소 넘기기 (????)
    setMemberValues(m1);
    printMember(m1);
  }

  static Member createMember() { // void -> Member로
    Member m = new Member(); // 인스턴스 생성(객체 생성)
    return m; // 주소를 넘긴 것임.
    // Call by reference 에서 넘기고 받는 것은 "주소"다.
  }

  static void setMemberValues(Member m) { // ()에 2)의 주소 넣음
    m.no = 100;
    m.name = "홍길동";
    m.birthYear = 2000;ㅗ
  }

  static void printMember(Member m) { // ()에 2)의 주소 넣음
    // ------로컬변수, 파라미터!
    System.out.println(m.no);
    System.out.println(m.name);
    System.out.println(m.birthYear);

    // 주소만 알면 해당 인스턴스의 각각 그 항목에 값을 넣거나 꺼낼 수가 있다.

  }
}
