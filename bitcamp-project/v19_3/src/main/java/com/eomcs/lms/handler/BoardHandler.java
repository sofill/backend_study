// 게시글 번호로 객체를 찾는 코드를 관리하기 쉽게 별도의 메서드로 분리한다 .
// => indexOfBoard(int) 메서드 추가
package com.eomcs.lms.handler;

import java.sql.Date;
import com.eomcs.lms.domain.Board;
import com.eomcs.util.ArrayList;
import com.eomcs.util.Prompt;

public class BoardHandler {

  ArrayList<Board> boardList;

  Prompt prompt;

  public BoardHandler(Prompt prompt) {
    this.prompt = prompt;
    this.boardList = new ArrayList<>();
  }
  
  public BoardHandler(Prompt prompt, int capacity) {
    this.prompt = prompt;
    this.boardList = new ArrayList<>(capacity);
  }
 
  public void listBoard() {
    // BoardList의 보관된 값을 받을 배열을 준비한다. 
    Board[] arr = new Board[this.boardList.size()];
    this.boardList.toArray(arr);
    for (Board b : arr) {
      System.out.printf("%d, %s, %s, %d\n", 
          b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
    }
  }
  
  public void addBoard() {
    Board board = new Board();

    board.setNo(prompt.inputInt("번호? "));
    board.setTitle(prompt.inputString("내용? "));
    board.setDate(new Date(System.currentTimeMillis()));
    board.setViewCount(0);
    
    this.boardList.add(board);

    System.out.println("저장하였습니다.");
  }

  public void detailBoard() {
    int index = indexOfBoard(prompt.inputInt("게시글 번호? "));

    if (index == -1) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    Board board = this.boardList.get(index);

    System.out.printf("번호: %d\n", board.getNo());
    System.out.printf("제목: %s\n", board.getTitle());
    System.out.printf("등록일: %s\n", board.getDate());
    System.out.printf("조회수: %d\n", board.getViewCount());
  }

  public void updateBoard() {
    int index = indexOfBoard(prompt.inputInt("번호? "));

    if (index == -1) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    Board oldBoard = this.boardList.get(index);
    Board newBoard = new Board();

    newBoard.setNo(oldBoard.getNo());

    newBoard.setTitle(prompt.inputString(
        String.format("수업명(%s)? ", oldBoard.getTitle()), 
        oldBoard.getTitle()));

    newBoard.setDate(prompt.inputDate
        (String.format("등록일? ", oldBoard.getDate()),
            oldBoard.getDate()));

    newBoard.setViewCount(prompt.inputInt(
        String.format("조회수(%d)? ", oldBoard.getViewCount()), 
        oldBoard.getViewCount()));

    /*
   int oldValue = oldBoard.getViewCount();
   String label = "조회수(" + oldValue + ")? ";
   int newValue = inputInt(label, oldValue);
   newBoard.setViewCount(newValue);
     */

    if (oldBoard.equals(newBoard)) {
      System.out.println("변경을 취소하였습니다.");
      return;
    }

    this.boardList.set(index, newBoard);
    System.out.println("변경했습니다.");
  }

  public void deleteBoard() {
    int index = indexOfBoard(prompt.inputInt("번호? "));

    if (index == -1) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    this.boardList.remove(index);

    System.out.println("게시글을 삭제했습니다.");
  }

  //게시글 번호로 객체를 찾는 코드를 관리하기 쉽게 별도의 메서드로 분리한다 .
  //=> indexOfBoard(int) 메서드 추가
  
  private int indexOfBoard(int no) {
    for (int i = 0; i < this.boardList.size(); i++) {
      if (this.boardList.get(i).getNo() == no) {
        return i;
      }
    }
    return -1;
  }
}










