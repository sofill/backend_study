package com.eomcs.lms.handler;

import java.util.ArrayList;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;

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
    lesson.setStartDate(input.nextLine());

    System.out.print("종료일? ");
    lesson.setEndDate(input.nextLine());

    System.out.print("총수업시간? ");
    lesson.setTotalHours(input.nextInt());

    System.out.print("일수업시간? ");
    lesson.setDayHours(input.nextInt());
    input.nextLine(); 

    lessonList.add(lesson);

    System.out.println("저장하였습니다.");
  }


  public void listLesson() {
    // LessonList의 보관된 값을 받을 배열을 준비한다. 
    Lesson[] arr = new Lesson[this.lessonList.size()];

    // toArray()에게 빈 배열을 넘겨서 복사 받는다.
    this.lessonList.toArray(arr);

    for(Lesson l : arr) {
      System.out.printf("%d, %s, %s ~ %s\n",
          l.getNo(), l.getTitle(), l.getStartDate(), 
          l.getEndDate());
    }
  }
  
  public void detailLesson() {
    System.out.print("수업 인덱스? ");
    int index = input.nextInt();
    input.nextLine();

    Lesson lesson = this.lessonList.get(index);

    if(lesson == null) {
      System.out.println("수업 정보가 유효하지 않습니다.");
      return;
    }
    
    System.out.printf("번호: %d\n", lesson.getNo());
    System.out.printf("수업명: %s\n", lesson.getTitle());
    System.out.printf("시작일: %s\n", lesson.getStartDate());
    System.out.printf("종료일: %s\n", lesson.getEndDate());
    System.out.printf("총수업시간: %s\n", lesson.getTotalHours());
    System.out.printf("일수업시간: %s\n", lesson.getDayHours());
  }

  public void updateLesson() {
    System.out.println("수업 정보");
    int index = input.nextInt();
    input.hasNextLine();

    Lesson oldLesson = this.lessonList.get(index);

    if (oldLesson == null) {
      System.out.println("수업 정보가 유효하지 않습니다.");
      return;
    }

    System.out.printf("수업명(%s)? ", oldLesson.getTitle());
    String title = input.nextLine();

    if (title.length() == 0) {
      System.out.println("수업 정보 변경을 취소했습니다.");
      return;
    }

    System.out.printf("설명(%s)? ", oldLesson.getDescription());
    String description = input.nextLine();

    if (description.length() == 0) {
      System.out.println("정보 변경을 취소했습니다."); 
      return;
    }

    System.out.printf("시작일(%s)? ", oldLesson.getStartDate());
    String startDate = input.nextLine();

    if (startDate.length() == 0) {
      System.out.println("날짜 변경을 취소했습니다.");
      return;
    }

    System.out.printf("종료일(%s)? ", oldLesson.getEndDate());
    String endDate = input.nextLine();

    if (endDate.length() == 0) {
      System.out.println("날짜 변경을 취소했습니다.");
      return;
    }

    System.out.printf("총수업시간(%s)? ", oldLesson.getTotalHours());
    String temp = input.nextLine();
    int totalHours = Integer.parseInt(temp);

    if (temp.length() == 0) {
      System.out.println("정보 변경을 취소했습니다.");
      return;
    }

    System.out.printf("일수업시간(%s)? ", oldLesson.getDayHours());
    String temp2 = input.nextLine();
    int dayHours = Integer.parseInt(temp2);

    if (temp2.length() == 0) {
      System.out.println("정보 변경을 취소했습니다.");
      return;
    }

    Lesson newLesson = new Lesson();
    newLesson.setNo(oldLesson.getNo());
    newLesson.setTitle(title);
    newLesson.setDescription(description);
    newLesson.setDayHours(dayHours);
    newLesson.setStartDate(startDate);
    newLesson.setEndDate(endDate);
    newLesson.setTotalHours(totalHours);
    newLesson.setDayHours(dayHours);

    this.lessonList.set(index, newLesson);

    System.out.println("수업 정보를 변경했습니다.");
  }


  public void deleteLesson() {
    System.out.print("수업 인덱스? ");
    int index = input.nextInt();
    input.nextLine(); // 숫자 뒤의 남은 공백 제거

    Lesson lesson = this.lessonList.get(index);

    if (lesson == null) {
      System.out.println("수업 인덱스가 유효하지 않습니다.");
      return;
    }

    this.lessonList.remove(index);

    System.out.println("수업을 삭제했습니다.");
  }
}



