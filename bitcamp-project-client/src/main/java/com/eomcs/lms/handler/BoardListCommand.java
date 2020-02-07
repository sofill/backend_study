package com.eomcs.lms.handler;

import java.util.List;
import com.eomcs.lms.dao.proxy.BoardDaoProxy;
import com.eomcs.lms.domain.Board;

// "/board/list" 명령어 처리
public class BoardListCommand implements Command {

  BoardDaoProxy boardDao;

  public BoardListCommand(BoardDaoProxy boardDao) {
    this.boardDao = boardDao;
  }

  @Override
  public void execute() {
    try {
      List<Board> boards = boardDao.findAll();
      for (Board b : boards) {
        System.out.printf("%d, %s, %s, %d\n", b.getNo(), b.getTitle(), b.getDate(),
            b.getViewCount());
      }

    } catch (Exception e) {
      System.out.println("목록 조회 실패!");
    }
  }


}


