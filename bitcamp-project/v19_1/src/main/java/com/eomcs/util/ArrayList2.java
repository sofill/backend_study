package com.eomcs.util;
/* 
 * 1. 최소 클래스 정의
 * 2. 객체 목록을 다룰 때 사용할 인스턴스 변수 준비
 * 3. 인스턴스 변수 초기화를 생성자로 옮긴다. 
 * 4. 배열의 초기 크기를 설정할 수 있는 생성자를 추가한다. (?)
 * 5. 생성자에 있는 수퍼 클래스의 기본 생성자 호출 문장을 생략한다. (원래 자동으로 호출되고 생략됨)
 * 6. 배열의 기본 크기를 직접 지정하지 않고 상수로 정의한 후 그 상수를 사용한다. 
 * 7. 생성자에서 배열을 만들 때 초기 크기가 기본 크기보다 작다면 기본 크기로 배열을 만든다. 
 * 8. 겍체를 목록에 저장하는  add() 메서드를 정의한다. (?)
 * 9. 객체를 목록에서 꺼내는  get() 메서드를 정의한다. 
 * 10. 목록에 저장된 특정 위치의 값을 변경하는 set() 메서드를 정의한다 .
 * 11. 목록에 저장된 특정 위치의 값을 삭제하는 remove() 메서드를 정의한다. 
 * 12. add() 변경 : 배열이 꽉 차면 50% 증가시킨다. 
 * 13. get() 변경 : 유효한 인덱스가 아니면 null을 린턴한다. 
 */

public class ArrayList2 {
  //6
  private static final int DEFAULT_CAPACITY = 10;

  Object[] elementData;
  int size;

  public ArrayList2() {
    this.elementData = new Object[DEFAULT_CAPACITY];
  }

  //7
  public ArrayList2(int initialCapacity) {
    if (initialCapacity < DEFAULT_CAPACITY) {
      this.elementData = new Object[DEFAULT_CAPACITY];
    } else {
      this.elementData = new Object[initialCapacity];
    }
  }

  //8   //12
  public void add(Object e) {
    if (this.size == this.elementData.length) {
      int oldSize = this.elementData.length;
      int newSize = oldSize + (oldSize >> 1);
      Object[] newArr = new Object[newSize];

      for (int i = 0; i < this.size; i++) {
        newArr[i] = this.elementData[i];
      }
      this.elementData = newArr; // ArrayList_practice.java.12새 배열의 주소를 넣음!
    }
    this.elementData[this.size++] = e;
  }

  //9  //13
  public Object get(int index) {
    if (index < 0 || index >= this.size) {
      return null;
    }
    return this.elementData[index];
  }

  //10
  public void set(int index, Object e) {
    this.elementData[index] = e;
  }

  //11
  public void remove(int index) {
    for (int i = index + 1; i < this.size; i++) {
      this.elementData[i-1] = this.elementData[i];
    }
    this.size--;
  }







}
