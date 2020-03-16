package com.eomcs.lms.servlet;


import java.io.PrintStream;
import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;

public class LessonAddServlet implements Servlet {

  //DAO 클래스를 구체적으로 지정하기 보다는
  // 인터페이스를 지정함으로써
  // 향후 다른 구현체로 교체하기 쉽도록 한다.
  //
  LessonDao lessonDao;

  public LessonAddServlet(LessonDao lessonDao) {
    this.lessonDao = lessonDao;
  }

  @Override
  public void service(Scanner in, PrintStream out) throws Exception {

    Lesson lesson = new Lesson();

    out.println("수업명? \n!{}!");
    lesson.setTitle(in.nextLine());
    out.println("설명? \n!{}!");
    lesson.setDescription(in.nextLine());
    out.println("시작일? \n!{}!");
    lesson.setStartDate(Date.valueOf(in.nextLine()));
    out.println("종료일? \n!{}!");
    lesson.setEndDate(Date.valueOf(in.nextLine()));
    out.println("총 수업 시간? \n!{}!");
    lesson.setTotalHours(Integer.parseInt(in.nextLine()));
    out.println("일 수업 시간? \n!{}!");
    lesson.setDayHours(Integer.parseInt(in.nextLine()));

    if (lessonDao.insert(lesson) > 0) {
      out.println("수업 정보를 저장하였습니다.");

    } else {
      out.println("수업 정보 저장에 실패하였습니다.");
    }
  }
}
