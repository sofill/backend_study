package com.eomcs.lms.handler;

import java.sql.Date;
import com.eomcs.lms.dao.proxy.BoardDaoProxy;
import com.eomcs.lms.domain.Board;
import com.eomcs.util.Prompt;

// "/board/add" 명령어 처리
public class BoardAddCommand implements Command {

  Prompt prompt;
  BoardDaoProxy boardDao;

  public BoardAddCommand(BoardDaoProxy boardDao, Prompt prompt) {
    this.boardDao = boardDao;
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
      boardDao.insert(board); // boardDao가 서버에 요청할 것이고 마치 프록시가 직접 하는 것처럼
      System.out.println("저장하였습니다.");

    } catch (Exception e) {
      System.out.println("저장 실패!");
    }
  }

}


