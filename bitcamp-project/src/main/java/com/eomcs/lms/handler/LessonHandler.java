package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;

public class LessonHandler {

  ArrayList lessonList;

  public Scanner input;

  
  public LessonHandler(Scanner input) {
    this.input = input;
    this.lessonList = new ArrayList();
  }

  public LessonHandler(Scanner input, int capacity) {
    this.input = input;
    lessonList = new ArrayList(capacity);
  }
  
  public void addLesson() {
    Lesson lesson = new Lesson(); //  (레퍼런스)

    System.out.print("번호? ");
    lesson.setNo(input.nextInt());
    input.nextLine(); // nextInt() 후에 남아 있는 줄바꿈 기호를 제거한다.

    System.out.print("수업명? ");
    lesson.setTitle(input.nextLine());

    System.out.print("설명? ");
    lesson.setDescription(input.nextLine());

    System.out.print("시작일? ");
    // "yyyy-MM-dd" 형태로 입력된 문자열을 날짜 정보로 바꾼다.
    lesson.setStartDate(Date.valueOf(input.next()));

    System.out.print("종료일? ");
    lesson.setEndDate(Date.valueOf(input.next()));

    System.out.print("총수업시간? ");
    lesson.setTotalHours(input.nextInt());

    System.out.print("일수업시간? ");
    lesson.setDayHours(input.nextInt());
    input.nextLine();// 일수업시간 입력값 다음에 남아있는 줄바꿈 값 제거

    // 수업 정보를 담고 있는 인스턴스의 주소를 나중에 사용할 수 있도록
    // 레퍼런스 배열에 보관해 둔다.
    lessonList.add(lesson);
    System.out.println("저장하였습니다.");
  }


  public void listLesson() {
    Object[] arr = this.lessonList.toArray();
    for (Object obj : arr) {
      Lesson l = (Lesson) obj; //형변환 하기 위해 넣은 내용
      System.out.printf("%d. %s / %s / %s ~ %s / %d / %d\n", 
          l.getNo(), l.getTitle(), 
          l.getDescription(), l.getStartDate(), 
          l.getEndDate(), l.getTotalHours(), 
          l.getDayHours());      
    }
  }
}
