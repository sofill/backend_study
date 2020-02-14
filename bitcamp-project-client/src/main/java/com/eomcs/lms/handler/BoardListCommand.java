package com.eomcs.lms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.eomcs.lms.dao.proxy.BoardDaoProxy;

// "/board/list" 명령어 처리
public class BoardListCommand implements Command {

  BoardDaoProxy boardDao;

  public BoardListCommand(BoardDaoProxy boardDao) {
    this.boardDao = boardDao;
  }

  @Override
  public void execute() {
    try {
      //      List<Board> boards = boardDao.findAll();   //<변경>
      // <추가>
      // JDBC Driver(MariaDB 프록시)를 로딩한다.
      Class.forName("org.mariadb.jdbc.Driver");

      // <추가> JDBC Driver(즉 프록시) 를 이용하여 MariaDB에 접속한다.
      Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb", "study", "1111");
      // 그다음 java.sql.Connection 을 임포트한다.

      // <추가> MariaDB에 명령을 전달할 객체를 준비한다.
      Statement stmt = con.createStatement();
      // 그다음 java.sql.Statement 을 임포트한다.

      // <추가> <추가> MariaDB 의 lms_board 테이블에 있는 데이터를 가져올 도구 준비
      ResultSet rs = stmt.executeQuery("select board_id, conts, cdt, vw_cnt from lms_board");

      // <추가> ResultSet 도구를 사용하여 데이터를 하나씩 가져온다.
      while (rs.next()) { // 데이터를 가져왔으면 true 를 리턴한다.
        System.out.printf("%d, %s, %s, %d\n", rs.getInt("board_id"),
            rs.getString("conts"),
            rs.getDate("cdt"),
            rs.getInt("vw_cnt")
            );
      }

      rs.close();
      stmt.close();
      con.close();

    } catch (Exception e) {
      System.out.println("목록 조회 실패!");
    }
  }
}


