package com.eomcs.util;

public class E {
  public static void main(String[] args) {

  }
}
class Node {
  public Object element; // 노드가 가질 원소
  public Node next; // 다음 노드를 가리키는 링크

  public Node(Object element)

}

class Queue {
  public Node front; // 맨 앞의 노드를 가리킬 포인터
  public Nore rear;  // 맨 뒤의 노드를 가리킬 포인터
  
  public Queue() {
    this.front = null;
    this.rear = null;
  }
  
  public boolean isEmpty() {
    return this.front == null;
  }
  // enqueue  메소드 작성
  // 새로운 요소가 들어오면 front와 rear의 위치를 적절히 변경
  
}





