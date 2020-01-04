package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;

public class BoardHandler {

  ArrayList boardList;

  Scanner input;


  public BoardHandler(Scanner input) { 
    this.input = input;
    boardList = new ArrayList();
  }

  public BoardHandler(Scanner input, int capacity) {
    this.input = input;
    boardList = new ArrayList(capacity);
  }

  public void addBoard() {
    Board board = new Board(); 

    System.out.print("번호? ");
    board.setNo(input.nextInt());
    input.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("내용? ");
    board.setTitle(input.nextLine());

    board.setDate(new Date(System.currentTimeMillis()));
    board.setViewCount(0);

    boardList.add(board); //값을 넣은 객체를 레퍼런스 배열에 저장

    System.out.println("저장하였습니다.");
  }

  public void listBoard() {
    Object[] arr = this.boardList.toArray();
    for (Object obj : arr) {
      Board b = (Board)obj;
      System.out.printf("%d, %s, %s, %d\n", 
          b.getNo(), b.getTitle(), b.getDate(), 
          b.getViewCount());
    }
  }

  public void detailBoard() {
    System.out.print("게시물 인덱스? ");
    int index = input.nextInt();
    input.nextLine(); // 숫자 뒤의 남은 공백 제거

    Board board = (Board) this.boardList.get(index);

    if (board == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }

    System.out.printf("번호: %d\n", board.getNo());
    System.out.printf("제목: %s\n", board.getTitle());
    System.out.printf("등록일: %s\n", board.getDate());
    System.out.printf("조회수: %d\n", board.getViewCount());
  }

}









