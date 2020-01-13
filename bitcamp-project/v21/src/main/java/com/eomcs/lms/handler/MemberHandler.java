package com.eomcs.lms.handler;

import java.sql.Date;
import com.eomcs.lms.domain.Member;
import com.eomcs.util.LinkedList;
import com.eomcs.util.Prompt;

public class MemberHandler {

  LinkedList<Member> memberList;

  Prompt prompt;

  public MemberHandler(Prompt prompt) {
    this.prompt = prompt;
    this.memberList = new LinkedList<>();
  }

  public void addMember() {
    Member member = new Member();

    member.setNo(prompt.inputInt("번호? "));
    member.setName(prompt.inputString("이름? "));
    member.setEmail(prompt.inputString("이메일? "));
    member.setPassword(prompt.inputString("패스워드? "));
    member.setPhoto(prompt.inputString("사진? "));
    member.setTel(prompt.inputString("전화? "));
    member.setRegisteredDate(new Date(System.currentTimeMillis()));

    memberList.add(member);

    System.out.println("저장하였습니다.");
  }

  public void listMember() {
    // 멤버 객체 목록을 복사 받을 배열을 준비하고, toArray()를 실행한다.
    // toArray()의 리턴 값은 파라미터로 넘겨준 배열의 주소이다.
    Member[] arr = this.memberList.toArray(new Member[this.memberList.size()]);
    for (Member m : arr) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          m.getNo(), m.getName(), m.getEmail(), 
          m.getTel(), m.getRegisteredDate());
    }
  }

  public void detailMember() {
    int index = indexOfMember(prompt.inputInt("번호? "));

    if (index == -1) {
      System.out.println("해당 번호의 회원이 없습니다.");
      return;
    }

    Member member = this.memberList.get(index);

    System.out.printf("번호: %d\n", member.getNo());
    System.out.printf("이름: %s\n", member.getName());
    System.out.printf("이메일: %s\n", member.getEmail());
    System.out.printf("암호: %s\n", member.getPassword());
    System.out.printf("사진: %s\n", member.getPhoto());
    System.out.printf("전화: %s\n", member.getTel());
  }

  public void updateMember() {
    int index = indexOfMember(prompt.inputInt("번호?" ));

    if (index == -1) {
      System.out.println("해당 번호의 회원이 없습니다.");
      return;
    }

    Member oldMember = this.memberList.get(index);
    Member newMember = new Member();

    newMember.setNo(oldMember.getNo());

    newMember.setName(prompt.inputString(
        String.format("이름(%S)? ", oldMember.getName()),
        oldMember.getName()));

    newMember.setEmail(prompt.inputString(
        String.format("이메일(%S)? ", oldMember.getEmail()),
        oldMember.getEmail()));

    newMember.setPassword(prompt.inputString(
        String.format("암호(%S)? ", oldMember.getPassword()),
        oldMember.getPassword()));

    newMember.setPhoto(prompt.inputString(
        String.format("사진(%S)? ", oldMember.getPhoto()),
        oldMember.getPhoto()));

    newMember.setTel(prompt.inputString(
        String.format("전화(%S)? ", oldMember.getTel()),
        oldMember.getTel()));

    /*
    int oldValue = oldMember.getTel();
    String label = "전화(" + oldValue + ")? ";
    int newValue = inputString(label, oldValue);
    newMember.setTel(newValue);
     */

    if (oldMember.equals(newMember)) {
      System.out.println("회원 변경을 취소하였습니다.");
      return;
    } 
    this.memberList.set(index, newMember);
    System.out.println("회원을 변경하였습니다.");
  }

  public void deleteMember() {
    int index = indexOfMember(prompt.inputInt("번호? "));

    if (index == -1) {
      System.out.println("해당 번호의 회원이 없습니다.");
      return;
    }

    this.memberList.remove(index);

    System.out.println("회원을 삭제했습니다.");
  }

  private int indexOfMember(int no) {
    for (int i = 0; i < this.memberList.size(); i++) {
      if (this.memberList.get(i).getNo() == no) {
        return i;
      }
    }
    return -1;
  }
}
