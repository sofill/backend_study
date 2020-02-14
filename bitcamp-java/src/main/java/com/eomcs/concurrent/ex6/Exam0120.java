// 스레드 재사용 - 2단계) 재사용 - sleep()/timeout 활용한 스레드 재사용1 (문제점 유)
package com.eomcs.concurrent.ex6;

import java.util.Scanner;

public class Exam0120 {

  public static void main(String[] args) {

    class MyThread extends Thread {
      int count;

      public void setCount(int count) {
        this.count = count;
      }

      @Override
      public void run() {
        System.out.println("스레드 시작했음~!");
        try {

          // <변화> 스레드를 재사용하려면 다음과 같이 run() 메서드가 종료되지 않게 해야 한다.
          // <변화> 그래서 무한으로 돌림 (종료되지 않게)
          while (true) {

            // <변화> 카운트를 완료한 후 사용자가 다음 카운트 값을 입력할 시간 주기 위해
            // 10 초 정도 스레드를 멈춘다.
            Thread.sleep(10000);

            System.out.println("카운트 시작~!");
            for (int i = count; i > 0; i--) {
              System.out.println("==>" + i); // 거꾸로 카운트
              Thread.sleep(1000); // 이걸로 에러가 뜰 수 있어서 try/catch 만듬.
            }
          }
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }

    MyThread t = new MyThread();

    // <변화> 미리 스레드를 시작시켜 놓음.
    t.start();

    Scanner keyScan = new Scanner(System.in); //스캐너는 헬퍼클래스이지만 암튼 데코레이터를 붙인다. 붙이고자 하는 애오 ㅏ같은 조상이어야 함

    while (true) { // 스레드를
      System.out.print("카운트? ");
      String str = keyScan.nextLine();
      if(str.equals("quit")) {
        break;
      }

      int count = Integer.parseInt(str); // 숫자 입력했다고 가정하고.. 카운트를 숫자로 바꿔서
      t.setCount(count);
      // <변화> 스레드의 카운트 값을 변경함.

      // <정리>
      // sleep() 을 이용한 스레드 재활용 방식은
      // 일정 시간이 지난 후 스레드가 작업하게 만드는 방식이다.
      // 그 스레드가 잠든 사이에 작업할 내용을 설정해 두면,
      // 스레드가 깨어났을 때 변경 사항에 따라 작업을 수행한다.
      //
      // --- 문제는? ---
      // 1. 스레드에 지정된 시간이 종료될 때까지(timeout) 작업이 "바로" 실행되지 않는다.
      // 2. 작업을 시키고 싶지 않아도 깨어나면 다시 작업을 수행한다.


    }

    System.out.println("main 스레드 종료!");
  }
}


