package com.eomcs.lms.servlet;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.lms.dao.LessonObjectFileDao;
import com.eomcs.lms.domain.Lesson;

public class LessonDetailServlet implements Servlet {

  LessonObjectFileDao lessonDao;

  public LessonDetailServlet(LessonObjectFileDao lessonDao) {
    this.lessonDao = lessonDao;
  }

  @Override
  public void service(ObjectInputStream in, ObjectOutputStream out) throws Exception {
    int no = in.readInt();

    Lesson lesson = lessonDao.findByNo(no); //이건 그냥 찾았으면 리턴하면 됨.

    if (lesson != null) {
      out.writeUTF("OK");
      out.writeObject(lesson);

    } else {
      out.writeUTF("FAIL");
      out.writeUTF("해당 번호의 수업이 없습니다.");
    }
  }
}
