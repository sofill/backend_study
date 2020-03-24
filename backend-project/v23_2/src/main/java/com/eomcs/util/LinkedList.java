package com.eomcs.util;

import java.lang.reflect.Array;

public class LinkedList<E> extends AbstractList<E>{

  Node<E> first;

  Node<E> last;

  @Override
  public void add(E value) {
    Node<E> newNode = new Node<E>();
    newNode.value = value;

    if (first == null) {
      last = first = newNode;
    } else {
      last.next = newNode;
      last = newNode;
    }

    this.size++;
  }
  // 추상 메서드는 다음과 같이 @Override 애노테이션을 붙이지 않아도
  // 문법검사가 이루어지기 때문에 편하다. 
  //@Override 
  public E get(int index) {
    if (index < 0 || index >= size)
      return null;

    Node<E> cursor = first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }

    return cursor.value;
  }
  
  //@Override
  @Override
  public void add(int index, E value) {
    if (index < 0 || index >= size)
      return;

    Node<E> newNode = new Node<>();
    newNode.value = value;

    Node<E> cursor = first;
    for (int i = 0; i < index - 1; i++) {
      cursor = cursor.next;
    }

    if (index == 0) {
      newNode.next = first;
      first = newNode;
    } else {
      newNode.next = cursor.next;
      cursor.next = newNode;
    }

    this.size++;
  }

  //@Override
  @Override
  public E remove(int index) {
    if (index < 0 || index >= size)
      return null;

    Node<E> cursor = first;
    for (int i = 0; i < index - 1; i++) {
      cursor = cursor.next;
    }

    Node<E> deletedNode = null;
    if (index == 0) {
      deletedNode = first;
      first = deletedNode.next;
    } else {
      deletedNode = cursor.next;
      cursor.next = deletedNode.next;
    }

    deletedNode.next = null;
    size--;

    return deletedNode.value;
  }
  
  //@Override
  @Override
  public E set(int index, E value) {
    if (index < 0 || index >= size)
      return null;

    Node<E> cursor = first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }

    E oldValue = cursor.value;
    cursor.value = value;

    return oldValue;
  }

  public Object[] toArray() {
    Object[] arr = new Object[size];

    Node<E> cursor = first;
    for (int i = 0; i < size; i++) {
      arr[i] = cursor.value;
      cursor = cursor.next;
    }

    return arr;    
  }
  
  //@Override
  @Override
  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {

    if (arr.length < size) {
      arr = (E[]) Array.newInstance(arr.getClass().getComponentType(), size);
    }
    
    Node<E> cursor = first;
    for (int i = 0; i < size; i++) {
      arr[i] = cursor.value;
      cursor = cursor.next;
    }

    return arr;    
  }
  
  static class Node<T> {
    T value;
    Node<T> next;
  }
}
