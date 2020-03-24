package com.eomcs.util;

import java.util.Arrays;

public class ArrayList2<E> {

  ///필드///
  static final int DEFAULT_CAPACITY = 3;

  Object[] list;
  int size = 0;

  ///생성자///
  public ArrayList2() {
    this.list = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList2(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 10000) {
      this.list = new Object[DEFAULT_CAPACITY];
    } else {
      this.list = new Object[capacity];
    }
  }


  ///메서드///
  public E[] toArray(E[] arr) {

    If (arr.length <this.size){
      return (E[]) Arrays.copyOf(this.list, this.size, arr.getClass());
    }
    System.arraycopy(this.list, 0, arr, 0, this.size);
    /*
     * 위의 arraycopy() 는 다음 코드와 같다.
     * for (int i = 0; i < this.size; i++) {
     * arr[i] = (E) this.list[i];
     * }
     */

    return arr;
  }

  public void add(E obj) {
    if (this.size == this.list.legnth) {
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      this.list = Arrays.copyOf(this.list, newCapacity)
    }
    this.list[this.size++] = obj;
  }

  public E get(int idx) {
    if (idx >= && idx < this.size) {
      return (E)this.list[idx];
    } else {
      return null;
    }
  }

  public int size() {
    return this.size;
  }
}


