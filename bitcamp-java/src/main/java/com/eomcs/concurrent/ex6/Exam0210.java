// 멀티 스레드 재사용 - pooling 기법을 이용하여 생성된 객체를 재사용하기!
package com.eomcs.concurrent.ex6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam0210 {
  // 변경 아래 클래스를 메인 바깥으로 꺼냄.

  static class MyThread extends Thread {
    ThreadPool pool; //<추가> 인터페이스
    int count;

    public MyThread(String name, ThreadPool pool) {   // <변경> 스레드 네임 설정
      super(name);
      this.pool = pool;
    }

    public void setCount(int count) {
      this.count = count;

      synchronized (this) {
        notify();
      }
    }

    @Override
    public void run() {
      synchronized(this) { // <변경> 동기화모드
        try {
          while (true) {
            // 작업하라는 알림이 올 때까지 기다린다.
            wait();

            // 알림이 오면 작업을 실행한다.
            for (int i = count; i > 0; i--) {
              System.out.printf("%s %d\n", getName(), i); //<추가> 상속받은것 getName
              Thread.sleep(2000);
            }
            // <추가> 스레드의 작업이 끝났으면 스레드풀로 돌아가야 한다.
            // 어떻게? 스레드 풀의 주소를 알아야지 되는데?
            // (문제 : 상호참조가 되면 안된다 ....)

            // 작업이 끝났으면 스레드풀로 돌아간다.
            pool.add(this); // <추가>
          }
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }
  // <추가>
  interface ThreadPool{
    Thread get();
    void add(Thread obj);  // E를 애드하는
  }

  // <추가> 스레드 목록 관리하는 객체 생성
  static class MyThreadPool implements ThreadPool {  //<변경> implements 추가
    ArrayList<MyThread> list = new ArrayList<>();

    public MyThreadPool() {
      MyThread t1 = new MyThread("신나는 음악!", this); // <추가> this
      t1.start(); // 생성하자마자 시작시킴
      list.add(t1); // 리스트에 더함

      MyThread t2 = new MyThread("                 카페 음악~~~~~~", this); // <추가> this
      t2.start(); // 생성하자마자 시작시킴
      list.add(t2); // 리스트에 더함

      MyThread t3 = new MyThread("                               슬픈 음악...", this); // <추가> this
      t3.start(); // 생성하자마자 시작시킴
      list.add(t3); // 리스트에 더함
    }

    // <추가> 스레드 풀에서 한 개의 스레드를 꺼낸다. 스레드를 꺼내주는 메서드
    @Override
    public MyThread get() {
      if (list.size() > 0) {
        return list.remove(0);
      }
      return null;
    }

    // <추가> 스레드를 다 쓴 후에는 다시 스레드 풀에 돌려준다. 리스트에 애드 시키는 것
    @Override
    public void add(Thread t) {  // <변경>
      list.add((MyThread)t);   // <변경>
    }
  }

  public static void main(String[] args) {




    // <추가>스레드 풀 준비
    MyThreadPool threadPool = new MyThreadPool();

    Scanner keyScan = new Scanner(System.in);

    while (true) {
      System.out.print("카운트?\n");
      String str = keyScan.nextLine();
      if(str.equals("quit")) {
        break;
      }
      int count = Integer.parseInt(str);

      // <추가> 스레드 풀에서 스레드를 한 개 꺼낸다.
      MyThread t = threadPool.get();
      if (t == null) {
        System.out.println("남는 스레드가 없습니다.");
        continue;
      }

      // 스레드 풀에서 스레드를 받았다면 카운트를 시작시킨다.
      // 스레드의 카운트를 설정한다. 그러면 카운트를 시작할 것이다.
      t.setCount(count);
    }

    System.out.println("main 스레드 종료!");
    keyScan.close();
  }
}




