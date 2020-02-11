// 서버와 입출력 테스트 - character stream
package com.eomcs.net.ex03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client0210 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    try (Socket socket = new Socket("localhost.", 8888);
        PrintWriter out = new PrintWriter(socket.getOutputStream()); // PrintWriter 요게 문제..
        BufferedReader in = new BufferedReader( //BufferedReader는 캐릭터스트림
            new InputStreamReader(socket.getInputStream()))) {  //inputStream은 바이트스트림
      // 그래서 InputStreaReader라는 데코레이터를 붙임. 중간에 얘가 필요

      System.out.println("서버와 연결되었음!");

      // 서버에 데이터를 보내기 전에 잠깐 멈춤!
      System.out.print(">");
      keyScan.nextLine();

      out.println("ABC가각간");
      //out.flush(); // 이걸 호출해야 비로소 서버에 보낸다.(문자열에서! 바이너리는 없어도 됨!!)
      // character stream 클래스의 경우
      // 출력 데이터를 내부 버퍼에 보관하고 있다가
      // flush() 가 호출되면 비로소 출력을 수행한다.
      // 따라서 위 출력 문자열은 서버에 보내지 않는다.
      System.out.println("서버에 데이터를 보냈음!");

      String str = in.readLine(); //buffered는 readLine()
      System.out.println(str);

    } catch (Exception e) {
      e.printStackTrace();
    }

    keyScan.close();
  }
}


