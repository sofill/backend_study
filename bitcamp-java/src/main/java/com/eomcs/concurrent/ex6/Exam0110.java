// 스레드 재사용 - 1단계) 재사용 전 .. 죽은 스레드는 다시 실행할 수 없다.
package com.eomcs.concurrent.ex6;

import java.util.Scanner;

public class Exam0110 {

  public static void main(String[] args) {

    class MyThread extends Thread {
      int count;

      public void setCount(int count) {
        this.count = count;
      }

      @Override
      public void run() {
        try {
          for (int i = count; i > 0; i--) {
            System.out.println("==>" + i); // 거꾸로 카운트
            Thread.sleep(1000); // 이걸로 에러가 뜰 수 있어서 try/catch 만듬.
          }
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }

    MyThread t = new MyThread();

    Scanner keyScan = new Scanner(System.in); //스캐너는 헬퍼클래스이지만 암튼 데코레이터를 붙인다. 붙이고자 하는 애오 ㅏ같은 조상이어야 함

    while (true) { // 스레드를
      System.out.print("카운트? ");
      String str = keyScan.nextLine();
      if(str.equals("quit")) {
        break;
      }

      int count = Integer.parseInt(str); // 숫자 입력했다고 가정하고.. 카운트를 숫자로 바꿔서
      t.setCount(count);
      t.start(); // 스레드 스타트!

      // <정리>
      // 만약 Dead 상태의 스레드를 다시 시작하려 하면 예외가 발생한다.
      // run() 메서드 호출이 끝나, Dead 상태가 된 스레드는
      // 다시 시작시킬 수 없다!!!
      //
      // -- 주의 ---
      // 이미 실행 중인 스레드 객체에 대해 start()를 또 호출하면 예외가 발생한다.
      //
    }

    System.out.println("main 스레드 종료!");
  }
}


