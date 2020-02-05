package com.eomcs.lms.servlet;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.lms.dao.BoardFileDao;

public class BoardListServlet implements Servlet {

  BoardFileDao boardDao;

  public BoardListServlet(BoardFileDao boardDao) {
    this.boardDao = boardDao;
  }

  @Override
  public void service(ObjectInputStream in, ObjectOutputStream out) throws Exception {
    out.writeUTF("OK");
    out.reset();
    out.writeObject(boardDao.findAll()); // boardDao야 다 꺼내서 클라이언트한테 줘
  }
}
