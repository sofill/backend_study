package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;
import java.util.Scanner;

// 고급
// 1) 배열의 개수를 변수에 저장하여 크기 변경을 쉽게 하기
// 2) 배열의 개수를 저장하고 있는 변수를 함부로 변경하지 못하도록 한다. 
//    -> final => 함부로 밑에서 못바꾸게 한다.
// 3) 코드를 관리하기 쉽도록 작은 기능 단위로 분리한다. 
//    -> 메서드
// 4) 메서드 사이에 공유하는 변수는 클래스 변수로 선언한다. (클래스 = 식판)
//    -> 스태틱 static 변수
// 5) 복합 데이터를 저장할 메모리를 설계한다. 
//    -> 클래스
//       1) 관련된 메소드를 분류해서 묶기위한 역할 (유지보수) 2) 메모리를 설계

public class App3 {

  static final int size = 5734; 

  static Board[] boards = new Board[size]; // 이 Board 에 번호, 제목, 날짜, 조회수가 다 들어갔다. 
  // 배식카  =            ----------배식대 ... 얘가 식판에 음식을 나른다. 
  
  static int[] no = new int[size];
  
  static String[] title = new String[size];
  
  static Date [] date = new Date[size];
  
  static int [] viewCount = new int[size];

  static int count = 0;

  public static void main(String[] args) {  

    inputBoards();

    System.out.println();

    printBoards();
  }

  static void inputBoards() {
    Scanner keyboard = new Scanner(System.in);
    String response; 


    for (int i = 0; i < size; i++) {
      Board b = new Board(); // Board 설계도에 따라 메모리 준비해서 리턴한다.
    //------- 얘가 식판 
      //int i = new int(); -> 이렇게는 왜 안하나? 자바가 정해놓은 건 안해도 되고
      // 그밖의 것들, 분자를 구성하는 원소를 준비하는 것들은 뭘하는건지 명시해야 한다.
      
      
      System.out.print("번호? ");
      b.no = keyboard.nextInt();
      keyboard.nextLine(); // 줄바꿈 기호 제거용

      System.out.print("내용? ");
      b.title = keyboard.nextLine();

      b.date = new Date(System.currentTimeMillis());
      b.viewCount = 0;
      count++;

      boards[i] = b;
      

      System.out.println();

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }
    keyboard.close();
  } 


  static void printBoards() {
    ///////////////////////////////////출  력//////////////////////////////////////
    for (int i = 0; i < count; i++) {
      Board b = boards[i];
      System.out.printf("%d, %s, %s, %d\n", b.no, b.title, b.date, b.viewCount);
      ///////////////////////////////////출  력//////////////////////////////////////
    }
  }
}









