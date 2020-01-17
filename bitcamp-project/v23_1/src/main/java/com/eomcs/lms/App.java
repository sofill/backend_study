package com.eomcs.lms;

import java.util.Scanner;
import java.util.Stack;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.handler.BoardHandler;
import com.eomcs.lms.handler.LessonHandler;
import com.eomcs.lms.handler.MemberHandler;
import com.eomcs.util.ArrayList;
import com.eomcs.util.LinkedList;
import com.eomcs.util.Prompt;
import com.eomcs.util.Queue;

public class App {

  static Scanner keyboard = new Scanner(System.in);

  static Stack<String> commandStack = new Stack<>();
  static Queue<String> commandQueue = new Queue<>();

  public static void main(String[] args) {

    Prompt prompt = new Prompt(keyboard);

    LinkedList<Board> boardList = new LinkedList<>();
    BoardHandler boardHandler = new BoardHandler(prompt, boardList);
    
    ArrayList<Lesson> lessonList = new ArrayList<>();
    LessonHandler lessonHandler = new LessonHandler(prompt, lessonList);
    
    LinkedList<Member> memberList = new LinkedList<>();
    MemberHandler memberHandler = new MemberHandler(prompt, memberList);

    String command;

    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();

      if (command.length() == 0)
        continue;

      commandStack.push(command); // 사용자가 명령을 입력할 때마다 stack에 보관한다. 쌓는다.

      commandQueue.offer(command);

      switch (command) {
        case "/lesson/add":
          lessonHandler.addLesson();
          break;
        case "/lesson/list":
          lessonHandler.listLesson();
          break;
        case "/lesson/detail":
          lessonHandler.detailLesson();
          break;
        case "/lesson/update":
          lessonHandler.updateLesson();
          break;
        case "/lesson/delete":
          lessonHandler.deleteLesson();
          break;
        case "/member/add":
          memberHandler.addMember();
          break;
        case "/member/list":
          memberHandler.listMember();
          break;
        case "/member/detail":
          memberHandler.detailMember();
          break;
        case "/member/update":
          memberHandler.updateMember();
          break;
        case "/member/delete":
          memberHandler.deleteMember();
          break;
        case "/board/add":
          boardHandler.addBoard();
          break;
        case "/board/list":
          boardHandler.listBoard();
          break;
        case "/board/detail":
          boardHandler.detailBoard();
          break;  
        case "/board/update":
          boardHandler.updateBoard();
          break; 
        case "/board/delete":
          boardHandler.deleteBoard();
          break; 
        case "history":
          printCommandHistory();
          break;
        case "history2":
          printCommandHistory2();
          break;
        default:
          if (!command.equalsIgnoreCase("quit")) {
            System.out.println("실행할 수 없는 명령입니다.");
          }
      }

    } while (!command.equalsIgnoreCase("quit"));

    System.out.println("안녕!");

    keyboard.close();
  }

  private static void printCommandHistory2() {
    Queue<String> historyQueue = commandQueue.clone();
    int count = 0;
    // historyQueue에 있는 값을 출력
    while (historyQueue.size() > 0) {
      System.out.println(historyQueue.poll());
            
      if ((++count % 5) == 0) {                  // 5의 배수라면?
        System.out.println(":");               // 다음으로 갈 건지 묻는다.
        String str = keyboard.nextLine();      // 입력하게 한다.
        if (str.equalsIgnoreCase("q")) {       // q와 같다면 나가고, 그 밖엔 계속.
          break;
        }
      }
    }
  }

  private static void printCommandHistory() {
    Stack<String> historyStack = (Stack<String>) commandStack.clone();
    //5개씩 끊어서 출력하기 
    int count = 0; 
    while (!historyStack.empty()) {
      System.out.println(historyStack.pop());
      count++;
      // 몇 번째마다 뭘 하고 싶으면 아래의 조건을 활용한다.
      // 단 시작은 1,2,3,4로 시작해야한다. 0은 안됨. 나눠야하니까.
      if ((count % 5) == 0) {                  // 5의 배수라면?
        System.out.println(":");               // 다음으로 갈 건지 묻는다.
        String str = keyboard.nextLine();      // 입력하게 한다.
        if (str.equalsIgnoreCase("q")) {       // q와 같다면 나가고, 그 밖엔 계속.
          break;
        }
      }
    }
  }
}





