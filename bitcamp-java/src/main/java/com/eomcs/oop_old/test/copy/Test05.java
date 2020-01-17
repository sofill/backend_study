package com.eomcs.oop_old.test.copy;

// gym 회원 정보를 입력 받아 출력
public class Test05 {
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
    m1 = new Member();
    m1.no = 100;

    System.out.println(m1); // @ 뒤는 고유번호,
    // 인스턴스에 부여된 고유번호와 클래스명이 출력된다.
    System.out.println(m1.no);

    // 다른 레퍼런스에 주소를 저장할 수 있다.
    Member m2 = m1;
    // m2는 m1과 같은 주소를 갖고 있다. 즉 같은 인스턴스를 가리킨다.
    System.out.println(m2.no);

    // 이 때, 인스턴스를 복사한 것이 아니다. 주소를 복사한 것이다.
    m1.no = 200; // 주소를 복사했으니 m1.no가 가리킨 주소값이 곧 m2.no의 주소값이 된다.(내 해석)
    System.out.println(m2.no); // m2.no는 200이 출력된다.


  }
}
