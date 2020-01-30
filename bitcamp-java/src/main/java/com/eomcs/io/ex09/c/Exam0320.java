// Java I/O API 사용하기 - ObjectInputStream으로 Serialize 데이터를 읽기
package com.eomcs.io.ex09.c;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam0320 {

  public static void main(String[] args) throws Exception {
    FileInputStream fileIn = new FileInputStream("temp/test10.data");
    BufferedInputStream bufIn = new BufferedInputStream(fileIn);
    ObjectInputStream in = new ObjectInputStream(bufIn);

    // Serialize로 출력된 데이터를 읽어 다시 원래의 객체로 만들기
    Member member = (Member) in.readObject();

    in.close();

    System.out.println(member);

    // 테스트1:
    // - Exam0310 에서 Member 객체를 출력한다.
    // - Exam0320 에서
    //

  }

}



