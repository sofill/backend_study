package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    // 게시글 데이터를 저장할 메모리를 설계한다.
    class Board {
      int no;
      String title;
      Date date;
      int viewCount;
    } // 식판만든 것. 이 변수들을 직접 쓸 순 없고 설계도일 뿐이다. 
      // 데이터를 넣으려면 인스턴스 필요함. 100개.
    
    final int SIZE = 100;
    
    // Board 인스턴스의 주소를 담을 레퍼런스 배열을 준비한다. 
    Board[] boards = new Board[SIZE];

    String response;
    int count = 0;
    
    for (int i = 0; i < 100; i++) {
      
      // 사용자가 입력한 게시물 데이터를 저장할 메모리를 Board 설계도에 따라 만든다. 
      Board board = new Board();
      
      System.out.print("번호? ");
      board.no = keyboard.nextInt();
      keyboard.nextLine(); // 줄바꿈 기호 제거용

      System.out.print("내용? ");
      board.title = keyboard.nextLine();

      board.date = new Date(System.currentTimeMillis());
      board.viewCount = 0;
      
      // 게시물 데이터가 보관된 Board 인스턴스의 주소를 레퍼런스 배열에 저장한다. 
      boards[i] = board; //쓸데없이인스턴스를 100개 만들 필요가 없다.!!
                         // 대신 꺼낼 때도 사용자가 입력한 만큼만 꺼내게 한다. 
      count++;
      
      System.out.println();

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }

    keyboard.close();

    System.out.println();

    for (int i = 0; i < count; i++) {
      Board board = boards[i];
      System.out.printf("%d, %s, %s, %d\n", 
          board.no, board.title, board.date, board.viewCount);
    }
  }
}








