// "/board/add" 명령어 처리
package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import com.eomcs.lms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardAddCommand implements Command {

  ObjectOutputStream out;
  ObjectInputStream in;

  Prompt prompt;

  public BoardAddCommand(ObjectOutputStream out, ObjectInputStream in, Prompt prompt) {
    this.out = out;
    this.in = in;
    this.prompt = prompt;
  }

  @Override
  public void execute() {
    Board board = new Board();

    board.setNo(prompt.inputInt("번호? "));
    board.setTitle(prompt.inputString("내용? "));
    board.setDate(new Date(System.currentTimeMillis()));
    board.setViewCount(0);
    try {
      out.writeUTF("/board/add");
      out.writeObject(board); // flush()를 안하면 랜카드 안의 메모리에 머물고 있는다.
      out.flush(); // 읽고 출력했으면 flush로 밀어내줘야한다.

      String response = in.readUTF();
      if (response.equals("FAIL")) {
        System.out.println(in.readUTF());
        return;
      }
      System.out.println("저장하였습니다.");
    } catch (Exception e) {
      System.out.println("통신 오류 발생");
    }
  }
}


