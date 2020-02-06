package com.eomcs.lms.servlet;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.lms.dao.LessonObjectFileDao;

public class LessonListServlet implements Servlet {

  LessonObjectFileDao lessonDao;

  public LessonListServlet(LessonObjectFileDao lessonDao) {
    this.lessonDao = lessonDao;
  }

  @Override
  public void service(ObjectInputStream in, ObjectOutputStream out) throws Exception {
    out.writeUTF("OK");
    out.reset();
    out.writeObject(lessonDao.findAll()); // lessonDao야. 다 꺼내서 클라이언트한테 줘!
  }
}
