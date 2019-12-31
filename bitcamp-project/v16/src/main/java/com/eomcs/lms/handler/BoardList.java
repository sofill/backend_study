package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Board;

public class BoardList {
  ///필드///
  private static final int DEFAULT_CAPACITY = 3;

  private Board[] list;
  private int size; //보드 핸들러에 있던 변수 2개 뜯어냄

  ///생성자///
  public BoardList() {
    this.list = new Board[DEFAULT_CAPACITY]; 
  }

  public BoardList(int capacity) {
    if (capacity > DEFAULT_CAPACITY && capacity < 10000) {
      this.list = new Board[capacity];
    } else {
      this.list = new Board[DEFAULT_CAPACITY];
    }
  }


  ///메서드//
  public Board[] toArray() {
    /*
    Board[] arr = new Board[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }
    return arr;
     */
    return Arrays.copyOf(this.list, this.size);
  }

  public void add(Board board) {
    if (this.size == this.list.length) {
      // 현재 배열에 게시글 객체가 꽉 찼으면 배열을 늘려 준다. 
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1); // 나누기보다 속도가 빨라서 >> 로 쓴다. 2진수라 1/2로 떨어짐.
      /*
      Board [] arr = new Board[newCapacity];
      for (int i = 0; i < this.list.length; i++) {
        arr[i] = this.list[i];
      }
      this.list = arr;
       */
      this.list = Arrays.copyOf(this.list, newCapacity);
      System.out.printf("새 배열을 %d 개 생성하였음!", newCapacity);
    }
    this.list[this.size++] = board; //board인스턴스를 레퍼런스 배열에 저장

  }

  public Board get(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i].getNo() == no) {
        return this.list[i];
      }
    }
    return null;    
  }
}

