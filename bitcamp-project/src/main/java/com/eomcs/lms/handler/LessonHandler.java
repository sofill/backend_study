package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.util.ArrayList;

public class LessonHandler {
  
  ArrayList<Lesson> lessonList;
  
  Scanner input;
  
  public LessonHandler(Scanner input) {
    this.input = input;
    this.lessonList = new ArrayList<>();
  }
  
  public LessonHandler(Scanner input, int capacity) {
    this.input = input;
    this.lessonList = new ArrayList<>(capacity);
  }

  public void listLesson() {
    // LessonList의 보관된 값을 받을 배열을 준비한다. 
    Lesson[] arr = new Lesson[this.lessonList.size()];
    
    // toArray()에게 빈 배열을 넘겨서 복사 받는다.
    this.lessonList.toArray(arr);
    
    for(Lesson l : arr) {
      System.out.printf("%d, %s, %s ~ %s\n",
          l.getNo(), l.getTitle(), l.getStartDate(), l.getEndDate());
    }
  }
  
  public void addLesson() {
    Lesson lesson = new Lesson();
    
    System.out.print("번호? ");
    lesson.setNo(input.nextInt());

    input.nextLine(); 

    System.out.print("수업명? ");
    lesson.setTitle(input.nextLine());

    System.out.print("설명? ");
    lesson.setDescription(input.nextLine());

    System.out.print("시작일? ");
    lesson.setStartDate(Date.valueOf(input.next()));

    System.out.print("종료일? ");
    lesson.setEndDate(Date.valueOf(input.next()));

    System.out.print("총수업시간? ");
    lesson.setTotalHours(input.nextInt());

    System.out.print("일수업시간? ");
    lesson.setDayHours(input.nextInt());
    input.nextLine(); 
    
    lessonList.add(lesson);
    
    System.out.println("저장하였습니다.");
  }
  
 
  
}
