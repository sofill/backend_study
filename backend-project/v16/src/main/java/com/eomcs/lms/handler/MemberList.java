package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.Member;

public class MemberList {

  static final int MEMBER_SIZE = 100;

  private Member[] list;
  private int size;

  
  ///생성자///
  public MemberList() {
    this.list = new Member[MEMBER_SIZE];
  }

  public MemberList(int capacity) {
    if (capacity < MEMBER_SIZE || capacity > 10000) {
      this.list = new Member[MEMBER_SIZE];
    } else {
      this.list = new Member[capacity];
    }
  }
 
 ///메소드;연산자(오퍼레이터)///
  
  public Member[] toArray() {
    /*
    Member[] arr = new Member[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }
    return arr;
     */
    return Arrays.copyOf(this.list, this.size);
  }
  
 public void add(Member member) {
 
 this.list[this.size++] = member;
 
 } 
  
 
 
 
 
}
  