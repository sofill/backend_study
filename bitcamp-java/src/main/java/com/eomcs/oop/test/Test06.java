package com.eomcs.oop.test;

// gym 회원 정보를 입력 받아 출력
public class Test06 {
  public static void main(String[] agrs) {

    // 회원 정보를 담을 수 있는 메모리의 설계도
    class Member {
      int no;
      String name;
      int birthYear;
      char gender;
      float height;
      float weight;
      boolean personalTraining;
    }

    Member m1;
    m1 = new Member(); // 인스턴스 만들려면 반드시 () <=이게 있어야 한다.
    m1.no = 100;

    Member m2 = m1; // m2가 m1의 주소값 복사

    // 기존 레퍼런스에 새 인스턴스의 주소를 저장한다.
    // 따라서 m1과 m2는 서로 다른 인스턴스의 주소를 갖고 있다.
    // 즉 m1과 m2가 가리키는 인스턴스가 다르다. 더이상 같은 주소가 아님.
    m1 = new Member(); // m1이 새로운 인스턴스 생성
    m1.no = 200; // m1이 새로운 주소값을 설정했으므로 m1과 m2는 이상 같은 주소가 아니게 된다.

    System.out.println(m1.no);
    System.out.println(m2.no);

  }
}
