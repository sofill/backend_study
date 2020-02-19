package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;

public class MemberHandler {

  // 인스턴스 필드 = 논-스태틱 필드
  // => 개별적으로 관리해야 하는 변수
  // => new 명령을 통해 생성된다.
  //
  Member[] members;
  int memberCount = 0;

  // 이전까지 게시물 데이터를 입력 받을 때 키보드에서 입력 받았지만
  // 향후 네트워크로부터도 입력 받을 수도 있다.
  // 이런 경우를 대비하여 입력 데이터를 읽는 것을 keyboard로 한정하지 말자!
  // 또한 각 게시판마다 입력 받는 방식을 다르게 할 수 있도록 인스턴스 변수로 선언하자.
  //
  public Scanner input;

  // 클래스 필드
  // => Method Area에 클래스 코드가 로딩될 때 자동 생성된다.
  // => 공통으로 사용할 값일 경우 클래스 필드로 선언한다.
  //
  static final int MEMBER_SIZE = 100;

  public MemberHandler(Scanner input) {
    this.input = input;
    this.members = new Member[MEMBER_SIZE];
  }

  public void addMember() {

    Member member = new Member();

    System.out.print("번호? ");
    member.no = input.nextInt();
    input.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("이름? ");
    member.name = input.nextLine();

    System.out.print("이메일? ");
    member.email = input.nextLine();

    System.out.print("암호? ");
    member.password = input.nextLine();

    System.out.print("사진? ");
    member.photo = input.nextLine();

    System.out.print("전화? ");
    member.tel = input.nextLine();

    member.registeredDate = new Date(System.currentTimeMillis());

    this.members[this.memberCount++] = member;
    System.out.println("저장하였습니다.");

  }

  public void listMember() {
    for (int i = 0; i < this.memberCount; i++) {
      Member m = this.members[i];
      System.out.printf("%d. %s / %s / %s / %s\n",
          m.no, m.name, m.email, m.tel,
          m.registeredDate);
    }
  }
}


