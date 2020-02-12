// 클라이언트와 입출력 테스트 - character stream
package com.eomcs.net.ex03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0210 {
  public static void main(String[] args) {
    try (Scanner keyboard = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888)) {

      System.out.println("클라이언트의 연결을 기다리고 있음.");

      try (Socket socket = serverSocket.accept(); // 여기서 일단 멈춤. 대기열에 클라이언트가 들어올 때까지!

          BufferedReader in = new BufferedReader( //BufferedReader는 캐릭터스트림
              new InputStreamReader(socket.getInputStream())); //inputStream은 바이트스트림
          // 그래서 InputS treaReader라는 데코레이터를 붙임. 중간에 얘가 필요
          PrintStream out = new PrintStream(socket.getOutputStream())) {

        System.out.println("클라이언트와가 보낼 한 줄의 문자열을 기다리고 있음");

        String str = in.readLine(); // 버퍼드는 readLine()
        System.out.println(str);

        // 서버가 데이터를 보내지 않으면 클라이언트의 read()는 리턴하지 않는다.
        // 이를 확인하기 위해 잠시 실행을 멈춘다.
        System.out.print("> ");
        keyboard.nextLine();

        out.println(str);
        //out.flush();
        // character stream 클래스의 경우
        // 출력 데이터를 내부 버퍼에 보관하고 있다가
        // flush() 가 호출되면 비로소 출력을 수행한다.
        // 따라서 위 출력 문자열은 클라이언트에 보내지 않는다.
        // 주의!
        // => 단 close() 를 호출하면 close() 내부에서 flush() 를 실행한다.!
        // 그러나 이것에 현혹되지 말고 캐릭터 스트림에서는 flush()를 꼭 호출해줘라.
        // byte 스트림이든 캐릭터든 상관없이 출력한 다음에는 반드시 flush()를 호출하라(초보)
        System.out.println("클라인트에게 데이터를 보냈음.");

        System.out.print("> ");
        keyboard.nextLine();


      }
      System.out.println("클라이언트와의 연결을 끊었음.");

    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("서버 종료!");
  }

}

