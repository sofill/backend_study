// 통신 방식 - stateful
package com.eomcs.net.ex04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0110 {
  public static void main(String[] args) {
    try (Scanner keyboard = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888)) {

      System.out.println("서버 실행!");

      while (true) { // 한 클라이언트의 작업이 끝나면 다음 클라이언트와 대화를 한다.
        try (Socket socket = serverSocket.accept(); // 여기서 일단 멈춤. 대기열에 클라이언트가 들어올 때까지!

            BufferedReader in = new BufferedReader( //BufferedReader는 캐릭터스트림
                new InputStreamReader(socket.getInputStream())); //inputStream은 바이트스트림
            PrintStream out = new PrintStream(socket.getOutputStream())) {

          System.out.println("클라이언트가 연결되었음!");

          while (true) {
            String name = in.readLine(); // 버퍼드는 readLine()
            if (name.equalsIgnoreCase("quit")) {
              out.println("goodbyte");
              out.flush();
              break;
            }
            System.out.printf("%s님 반갑습니다! \n", name);
            out.flush();
          }
        } catch (Exception e) {
          System.out.println("클라이언트와 통신 도중 오류 발생!");
        }
        System.out.println("클라이언트와의 연결 끊었음");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("서버 종료!");
  }
}
