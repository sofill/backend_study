package com.eomcs.lms.servlet;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.lms.dao.BoardFileDao;
import com.eomcs.lms.domain.Board;

public class BoardAddServlet implements Servlet {

  BoardFileDao boardDao;

  public BoardAddServlet(BoardFileDao boardDao) {
    this.boardDao = boardDao;
  }

  @Override
  public void service(ObjectInputStream in, ObjectOutputStream out) throws Exception {
    Board board = (Board) in.readObject();

    if (boardDao.insert(board) > 0) { // 1개가 됐든 2개가 됐든 insert 했다면
      out.writeUTF("OK");

    } else {
      out.writeUTF("FAIL");
      out.writeUTF("같은 번호의 게시물이 있습니다.");
    }
  }
}
