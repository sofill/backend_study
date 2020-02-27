package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Scanner;
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.dao.PhotoFileDao;
import com.eomcs.sql.PlatformTransactionManager;
import com.eomcs.sql.TransactionTemplate;
import com.eomcs.util.Prompt;

public class PhotoBoardDeleteServlet implements Servlet {

  // 트랜잭션 관리자를 이용하여 작업을 실행시켜 줄 도우미 객체
  TransactionTemplate transactionTemplate;
  PhotoBoardDao photoBoardDao;
  PhotoFileDao photoFileDao;

  public PhotoBoardDeleteServlet(
      PlatformTransactionManager txManager,
      PhotoBoardDao photoBoardDao,
      PhotoFileDao photoFileDao) {
    // 우리가 직접 트랜잭션 관리자를 사용하지 않고,
    // 도우미 객체를 이용하여 트랜잭션 작업을 처리할 것이다.
    this.transactionTemplate = new TransactionTemplate(txManager);
    this.photoBoardDao = photoBoardDao;
    this.photoFileDao = photoFileDao;
  }

  @Override
  public void service(Scanner in, PrintStream out) throws Exception {

    int no = Prompt.getInt(in, out, "번호? ");

    transactionTemplate.execute(() -> {
      photoFileDao.deleteAll(no);
      if (photoBoardDao.delete(no) == 0) {
        throw new Exception("해당 번호의 사진 게시글이 없습니다.");
      }
      out.println("사진 게시글을 삭제했습니다.");

      return null;
    });
  }
}
