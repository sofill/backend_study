package com.eomcs.lms.handler;

import java.sql.Date;
import com.eomcs.lms.domain.Board;
import com.eomcs.util.List;
import com.eomcs.util.Prompt;

public class BoardHandler {

  // ArrayList나 LinkedList 중 마음대로 사용할 수 있도록 
  // 게시물 목록을 관리하는 필드를 선언할 때 
  // 이들 클래스의 수퍼 클래스로 선언한다.
  // => 대신 이 필드에 들어갈 객체는 생성자에서 파라미터로 받는다. 
  // => 이렇게 하면 ArrayList도 사용할 수 있고, LinkedList 도 사용할 수 있어
  //    유지보수에 좋다. 

  List<Board> boardList; // List로 변경(수퍼클래스)

  Prompt prompt;

  public BoardHandler(Prompt prompt, List<Board> list) {
    this.prompt = prompt;
    this.boardList = list;
    // Handler가 사용할 List 객체(의존 객체 dependency)를 생성자에서 직접 만들지 않고
    // 이렇게 생성자가 호출될 때 파라미터로 받으면, 
    // 필요에 따라 List 객체를 다른 객체로 대체하기가 쉽다. 
    // 예) ArrayList를 사용하다가 LinkedList로 바꾸기 쉽다. 
    //     LinkedList를 사용하다가 다른 객체로 바꾸기도 쉽다.
    // 즉 다형적 변수의 법칙에 따라 List의 하위 객체라면 어떤 객체든지 가능하다.
    // 이런 식을 의존 객체를 외부에서 주입 받는 것을 
    // "Dependency Injection(DI; 의존성 주입)"이라 부른다.
    // => 의존 객체를 부품화하여 교체하기 쉽도록 만드는 방식이다.
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
  public void listBoard() {
    Board[] arr = new Board[this.boardList.size()];

    this.boardList.toArray(arr);
    for (Board b : arr) {
      System.out.printf("%d, %s, %s, %d\n", 
          b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
    }
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










