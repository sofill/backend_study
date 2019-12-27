package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;

public class LessonHandler {

  // 인스턴스 필드 = 논스태틱 필드
  // 각 수업 목록을 개별적으로 관리
  Lesson[] lessons;
  int lessonCount = 0;

  public static Scanner input;

  // 클래스 필드 = 스태틱 필드
  // => 공유할 변수
  static final int LESSON_SIZE = 100;

  public LessonHandler(Scanner input) {
    this.input = input;
    this.lessons = new Lesson[LESSON_SIZE];
  }
  
  public void addLesson() {
    Lesson lesson = new Lesson();
    //  (레퍼런스)
    
    System.out.print("번호? ");
    lesson.no = input.nextInt();

    input.nextLine(); // nextInt() 후에 남아 있는 줄바꿈 기호를 제거한다.

    System.out.print("수업명? ");
    lesson.title = input.nextLine();

    System.out.print("설명? ");
    lesson.description = input.nextLine();

    System.out.print("시작일? ");
    // "yyyy-MM-dd" 형태로 입력된 문자열을 날짜 정보로 바꾼다.
    lesson.startDate = Date.valueOf(input.next());

    System.out.print("종료일? ");
    lesson.endDate = Date.valueOf(input.next());

    System.out.print("총수업시간? ");
    lesson.totalHours = input.nextInt();

    System.out.print("일수업시간? ");
    lesson.dayHours = input.nextInt();
    input.nextLine();// 일수업시간 입력값 다음에 남아있는 줄바꿈 값 제거

    // 수업 정보를 담고 있는 인스턴스의 주소를 나중에 사용할 수 있도록
    // 레퍼런스 배열에 보관해 둔다.
    this.lessons[this.lessonCount++] = lesson;
    System.out.println("저장하였습니다.");
  }


  public void listLesson() {

    for (int i = 0; i < this.lessonCount; i++) {
      Lesson l = this.lessons[i];
      System.out.printf("%d. %s / %s / %s ~ %s / %d / %d\n", 
          l.no, l.title, 
          l.description, l.startDate, 
          l.endDate, l.totalHours, 
          l.dayHours);      
    }
  }
}
