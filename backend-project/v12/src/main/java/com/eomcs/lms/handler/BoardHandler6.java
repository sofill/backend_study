package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;

public class BoardHandler6 {


  static final int BOARD_SIZE = 100;
  // Board 인스턴스의 주소를 담을 레퍼런스 배열을 준비한다. 
  static Board[] boards = new Board[BOARD_SIZE];
  static int boardCount = 0;  

  // 다른 패키지에 있는 클래스에서도 이 변수를 사용하게 하려면 공개해야 한다. 
  public static Scanner keyboard;

  public static void addBoard() {

    Board board = new Board();

    System.out.print("번호? ");
    board.no = keyboard.nextInt();
    keyboard.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("내용? ");
    board.title = keyboard.nextLine();

    board.date = new Date(System.currentTimeMillis());
    board.viewCount = 0;

    // 게시물 데이터가 보관된 Board 인스턴스의 주소를 레퍼런스 배열에 저장한다. 
    boards[boardCount++] = board; 
    System.out.println("저장하였습니다.");
  }

  public static void listBoard() {
    for (int i = 0; i < boardCount; i++) {
      Board b = boards[i];
      System.out.printf("%d. %s, %s, %d\n", 
          b.no, b.title, b.date, b.viewCount);
    }
  }
  public static void detailBoard() {
    System.out.print("게시물 번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine(); // 숫자 뒤에 남은 공백 제거
    
    Board board = null; // 게시물 인덱스번호 말고 게시물 번호로 출력할 수 있도록 바꾸는 것
    for (int i = 0; i < boardCount; i++) {
      if (boards[i].no == no) {
        board = boards[i];
        break;
      }
    }

    if (board == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }

      System.out.printf("번호: %d\n", board.no);
      System.out.printf("제목: %s\n", board.title);
      System.out.printf("등록일: %s\n", board.date);
      System.out.printf("조회수: %d\n", board.viewCount);

    }
  }
