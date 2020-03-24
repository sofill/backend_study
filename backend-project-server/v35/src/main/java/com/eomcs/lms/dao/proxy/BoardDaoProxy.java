package com.eomcs.lms.dao.proxy;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.domain.Board;

// 프록시 객체는 항상 작업 객체와 동일한 인터페이스를 구현해야 한다. (implements BoardDao)
// => 마치 자기가 작업 객체인 양 보이기 위함이다.
// Board 작업 객체를 대행할 프록시를 정의한다.


public class BoardDaoProxy implements BoardDao {

  ObjectInputStream in;
  ObjectOutputStream out;

  public BoardDaoProxy (ObjectInputStream in, ObjectOutputStream out) {
    this.in = in;
    this.out = out;
  }


  @Override
  public int insert(Board board) throws Exception {
    out.writeUTF("/board/add");
    out.writeObject(board);
    out.flush();
    String response = in.readUTF();
    if (response.equals("FAIL")) {
      throw new Exception(in.readUTF());
    }
    return 1;
  }


  @Override
  public List<Board> findAll() throws Exception {
    String response = in.readUTF();
    if (response.equals("FAIL")) {
      throw new Exception(in.readUTF());
    }
    return null;
  }


  @Override
  public Board findByNo(int no) throws Exception {
    out.writeUTF("/board/detail");
    out.writeInt(no);
    out.flush();

    String response = in.readUTF();
    if (response.equals("FAIL")) {
      throw new Exception(in.readUTF());
    }
    return (Board) in.readObject();
  }


  @Override
  public int update(Board board) throws Exception {
    out.writeUTF("/board/update");
    out.writeObject(board);
    out.flush();

    String response = in.readUTF();
    if (response.equals("FAIL")) {
      throw new Exception(in.readUTF());
    }
    return 1;
  }


  @Override
  public int delete(int no) throws Exception {
    out.writeUTF("/board/delete");
    out.writeInt(no);
    out.flush();

    String response = in.readUTF();

    if (response.equals("FAIL")) {
      throw new Exception(in.readUTF());
    }
    return 1;
  }

}
