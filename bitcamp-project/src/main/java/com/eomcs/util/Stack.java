package com.eomcs.util;

import java.util.Arrays;

public class Stack {

  private static final int DEFAULT_CAPACITY = 10;

  Object[] elementData;
  int size;

  public Stack( ) {
    this.elementData = new Object[DEFAULT_CAPACITY];
    this.size = 0;
  }

  public void push(Object value) {
    if (this.size == elementData.length) {
      grow();
    }
    this.elementData[size++] = value; 
  }

  private void grow() {
    this.elementData = Arrays.copyOf(elementData,  newCapacity());
  }

  private int newCapacity() {
    int oldCapacity = elementData.length;
    return oldCapacity + (oldCapacity >> 1);
  }

  public Object pop() {
    if (this.empty()) // <== 아래 empty() 만들었으니 이것도 리팩토링함.
      return null;
    return this.elementData[--this.size];
  }

  public boolean empty() { //비어있는지 여부를 검사
    return this.size == 0;
  }
}
