package com.eomcs.lms.handler;

import java.util.Arrays;

public class ArrayList {
  
  ///필드///
  private static final int DEFAULT_CAPACITY = 3;

  Object[] list;// 모든 객체를 저장할 수 있는 다형적 변수. 하위 객체도 저장할 수 있다. 
  private int size; //핸들러에 있던 변수 2개 뜯어냄

  
  ///생성자///
  public ArrayList() {
    this.list = new Object[DEFAULT_CAPACITY]; 
  }

  public ArrayList(int capacity) { //사용자에게 입력받을 int값
    if (capacity > DEFAULT_CAPACITY && capacity < 10000) {
      this.list = new Object[capacity];
    } else {
      this.list = new Object[DEFAULT_CAPACITY];
    }
  }

  
  ///메서드//
  public Object[] toArray() { //목록을 배열로 만들어서 리턴해 주는 메서드
    return Arrays.copyOf(this.list, this.size); //original,newLength
  }

  public void add(Object obj) {
    if (this.size == this.list.length) { // 현재 배열에 게시글 객체가 꽉 찼으면 배열을 늘려 준다. 
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);  // 나누기보다 속도가 빨라서 >> 로 쓴다. 2진수라 1/2로 떨어짐.
      this.list = Arrays.copyOf(this.list, newCapacity);
      System.out.printf("새 배열을 %d 개 생성하였음!", newCapacity);
    }
    this.list[this.size++] = obj; //board인스턴스를 레퍼런스 배열에 저장

  }

  public Object get(int idx) {
    if (idx >= 0 && idx < this.size) {
      return this.list[idx];
    } else {
      return null;    //게시물 번호와 상관없이 인덱스(순번)으로 찾도록
    }
  }
}

