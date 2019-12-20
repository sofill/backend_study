package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    
    class Lesson { 
      int no;
      String title;
      String description;
      Date startDate;
      Date endDate;
      int totalHours;
      int dayHours;      
    }

    final int SIZE = 100;

    Lesson[] lessons = new Lesson[SIZE];
    int count = 0;  
    
    String command;
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":
          Lesson lesson = new Lesson();
            //  (레퍼런스)
          System.out.print("번호? ");
          lesson.no = keyboard.nextInt();

          keyboard.nextLine(); // nextInt() 후에 남아 있는 줄바꿈 기호를 제거한다.

          System.out.print("수업명? ");
          lesson.title = keyboard.nextLine();

          System.out.print("설명? ");
          lesson.description = keyboard.nextLine();

          System.out.print("시작일? ");
          // "yyyy-MM-dd" 형태로 입력된 문자열을 날짜 정보로 바꾼다.
          lesson.startDate = Date.valueOf(keyboard.next());

          System.out.print("종료일? ");
          lesson.endDate = Date.valueOf(keyboard.next());

          System.out.print("총수업시간? ");
          lesson.totalHours = keyboard.nextInt();

          System.out.print("일수업시간? ");
          lesson.dayHours = keyboard.nextInt();
          keyboard.nextLine();// 일수업시간 입력값 다음에 남아있는 줄바꿈 값 제거

          // 수업 정보를 담고 있는 인스턴스의 주소를 나중에 사용할 수 있도록
          // 레퍼런스 배열에 보관해 둔다.
          lessons[count++] = lesson;
          System.out.println("저장하였습니다.");
          
          break;
        case "/lesson/list":
          for (int i = 0; i < count; i++) {
            Lesson l = lessons[i];
            System.out.printf("%d. %s / %s / %s ~ %s / %d / %d\n", 
                l.no, l.title, 
                l.description, l.startDate, 
                l.endDate, l.totalHours, 
                l.dayHours);      
          }
          break;
        default:
          if (!command.equalsIgnoreCase("quit")) {
          System.out.println("실행할 수 없는 명령입니다.");
          }
      }
      
    } while (!command.equalsIgnoreCase("quit"));

    System.out.println("안녕!!");

    keyboard.close();
  }
}



