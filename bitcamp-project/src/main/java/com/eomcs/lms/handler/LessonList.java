package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Lesson;

public class LessonList {

  private static final int LESSON_SIZE = 100;

  private Lesson[] list;
  private int size;

  public LessonList() {
    this.list = new Lesson[LESSON_SIZE];
  }

  public LessonList(int capacity) {
    if (capacity > LESSON_SIZE && capacity < 10000) {
      this.list = new Lesson[capacity];
    } else {
      this.list = new Lesson[LESSON_SIZE];
    }
  }

  public Lesson[] toArray() {
    /*
    Lesson[] arr = new Lesson[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }
    return arr;
     */
    return Arrays.copyOf(this.list,  this.size);
  }

  public void add(Lesson lesson) {//lesson handler 참고
    if (this.size == this.list.length) {
      // 현재 배열에 게시글 객체가 꽉 찼으면 배열을 늘려 준다.
      int oldCapacity = this.size;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      this.list = Arrays.copyOf(this.list, newCapacity);
    }
    this.list[this.size++] = lesson;
  }

  public Lesson get(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i].getNo() == no) {
        return this.list[i]; //조회용ㅋㅋ
      }
    }
    return null;
  }
}
