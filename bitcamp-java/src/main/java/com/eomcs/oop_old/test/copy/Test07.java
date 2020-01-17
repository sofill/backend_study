package com.eomcs.oop_old.test.copy;

// gym 회원 정보를 입력 받아 출력
public class Test07 {
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

    Member m1; // 이게 레퍼런스 변수 선언한 것.
    m1 = new Member(); // 지금 인스턴스 생성했다는 뜻. 인스턴스 만들려면 반드시 () <=이게 있어야 하므로.
    m1.no = 100;

    Member m2 = m1;

    m1 = new Member();
    m1.no = 200;

    m2 = m1;

    // 이제 m2도 m1과 같은 인스턴스 주소를 갖고 있다.
    // 즉 같은 인스턴스를 가리킨다.
    // 처음에 만들었던 인스턴스는 주소를 잃어버려 사용할 수 없다.
    // 이렇게 주소를 잃어버려 사용할 수 없는 인스턴스를 "가비지(garbage)"라 부른다.

    // 인스턴스가 주소를 잃어버려 더이상 사용할 수 없게 되면 가비지가 된다. (내 해석)

  }
}
