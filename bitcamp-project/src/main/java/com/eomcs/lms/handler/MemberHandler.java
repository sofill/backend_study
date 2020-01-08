package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;
import com.eomcs.util.ArrayList;

public class MemberHandler {
  
  ArrayList<Member> memberList;

  Scanner input;

  public MemberHandler(Scanner input) {
    this.input = input;
    this.memberList = new ArrayList<>();
  }
  public MemberHandler(Scanner input, int capacity){
    this.input = input;
    this.memberList = new ArrayList<>(capacity);
  }
  
  public void addMember() {
    Member member = new Member();

      System.out.print("번호? ");
      member.setNo(input.nextInt());
      input.nextLine(); // 줄바꿈 기호 제거용

      System.out.print("이름? ");
      member.setName(input.nextLine());

      System.out.print("이메일? ");
      member.setEmail(input.nextLine());

      System.out.print("암호? ");
      member.setPassword(input.nextLine());

      System.out.print("사진? ");
      member.setPhoto(input.nextLine());

      System.out.print("전화? ");
      member.setTel(input.nextLine());

      member.setRegisteredDate(new Date(System.currentTimeMillis()));
      
      this.memberList.add(member);
      
      System.out.println("저장하였습니다.");
    }

  
  public void listMember() {
    // MemberList의 보관된 값을 받을 배열을 준비한다.
    Member[] arr = new Member[this.memberList.size()];
    
    // toArray()에게 빈 배열을 넘겨서 복사 받는다. 
    this.memberList.toArray(arr);

  for (Member m : arr) {
     System.out.printf("%d, %s, %s, %s, %s\n", 
          m.getNo(), m.getName(), m.getEmail(), 
          m.getTel(), m.getRegisteredDate());
    }
  }

  public void detailMember() {
    System.out.print("회원 인덱스? ");
    int index = input.nextInt();
    input.nextLine();

    Member member = this.memberList.get(index);

    if(member == null) {
      System.out.println("회원 정보가 유효하지 않습니다.");
      return;
    }
    
    System.out.printf("번호: %d\n", member.getNo());
    System.out.printf("이름: %s\n", member.getName());
    System.out.printf("이메일: %s\n", member.getEmail());
    System.out.printf("암호: %s\n", member.getPassword());
    System.out.printf("사진: %s\n", member.getPhoto());
    System.out.printf("전화: %s\n", member.getTel());
  }

  public void updateMember() {
    System.out.print("회원 정보? ");
    int index = input.nextInt();
    input.nextLine(); 

    Member oldMember = this.memberList.get(index);
    
    if (oldMember == null) {
      System.out.println("회원 정보가 유효하지 않습니다.");
      return;
    }

    System.out.printf("이름(%s)? ", oldMember.getName());
    String name = input.nextLine();

    if (name.length() == 0) {
      System.out.println("회원 정보 변경을 취소했습니다.");
      return;
    }
    
    System.out.printf("이메일(%s)? ", oldMember.getEmail());
    String email = input.nextLine();

    if (email.length() == 0) {
      System.out.println("회원 정보 변경을 취소했습니다.");
      return;
    }
    
    System.out.printf("암호(%s)? ", oldMember.getPassword());
    String password = input.nextLine();

    if (password.length() == 0) {
      System.out.println("회원 정보 변경을 취소했습니다.");
      return;
    }
    
    System.out.printf("사진(%s)? ", oldMember.getPhoto());
    String photo = input.nextLine();

    if (photo.length() == 0) {
      System.out.println("회원 정보 변경을 취소했습니다.");
      return;
    }
    
    System.out.printf("전화(%s)? ", oldMember.getTel());
    String tel = input.nextLine();

    if (name.length() == 0) {
      System.out.println("회원 정보 변경을 취소했습니다.");
      return;
    }
    
    Member newMember = new Member();
    newMember.setNo(oldMember.getNo());
    newMember.setName(name);
    newMember.setEmail(email);
    newMember.setPassword(password);
    newMember.setPhoto(photo);
    newMember.setTel(tel);

    this.memberList.set(index, newMember);

    System.out.println("회원 정보를 변경했습니다.");
  }
  
  public void deleteMember() {
    System.out.print("회원 번호? ");
    int no = input.nextInt();
    input.nextLine();  

    // 게시글 번호로 객체를 찾는다. 
    int index = indexOfBoard(no);
    
    if (index == -1) {
      
       System.out.println("해당 번호의 게시글이 없습니다.");
       return;
     }

     this.memberList.remove(index);

     System.out.println("게시글을 삭제했습니다.");
   }
   
 //게시글 번호로 객체를 찾는 코드를 관리하기 쉽게 별도의 메서드로 분리한다 .
 //=> indexOfBoard(int) 메서드 추가
   private int indexOfBoard(int no) {
     for (int i = 0; i < this.memberList.size(); i++) {
       Member temp = this.memberList.get(i);
       if (temp.getNo() == no) {
         return i;
       }
     }
     return -1;

   }

 }