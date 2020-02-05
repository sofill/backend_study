package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.util.Prompt;

public class LessonListCommand implements Command {

  ObjectOutputStream out;
  ObjectInputStream in;

  Prompt prompt;

  public LessonListCommand(ObjectOutputStream out, ObjectInputStream in, Prompt prompt) {
    this.out = out;
    this.in = in;
    this.prompt = prompt;
  }
  public LessonListCommand(List<Lesson> list) {
    this.lessonList = list;
  }

  @Override
  public void execute() {
    Iterator<Lesson> iterator = lessonList.iterator();
    while (iterator.hasNext()) {
      Lesson l = iterator.next();
      System.out.printf("%d, %s, %s ~ %s, %d\n", l.getNo(), l.getTitle(), l.getStartDate(),
          l.getEndDate(), l.getTotalHours());
    }
  }
}


