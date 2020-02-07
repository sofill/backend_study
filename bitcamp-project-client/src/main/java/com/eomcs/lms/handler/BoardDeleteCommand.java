package com.eomcs.lms.handler;

import com.eomcs.lms.dao.proxy.BoardDaoProxy;
import com.eomcs.util.Prompt;

// "/board/delete" 명령 처리
public class BoardDeleteCommand implements Command {

  Prompt prompt;
  BoardDaoProxy boardDao;

  public BoardDeleteCommand(BoardDaoProxy boardDao, Prompt prompt) {
    this.boardDao = boardDao;
    this.prompt = prompt;
  }

  @Override
  public void execute() {
    try {
      int no = prompt.inputInt("번호? ");
      boardDao.delete(no);   // 이런 식으로 위임한다.
      System.out.println("게시글을 삭제했습니다.");

    } catch (Exception e) {
      System.out.println("삭제 실패!");
    }
  }
}


