// HTTP 서버 만들기
package com.eomcs.net.ex06;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// HTTP 응답 프로토콜
//--------------------------------
// HTTP/1.1 200 OK(CRLF)
// Content-Type: text/html; charset=UTF-8(CRLF)
// (CRLF)
// 보낼 데이터
//--------------------------------
public class HttpServer {
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("서버 실행~!");

    while (true) {
      Socket socket = ss.accept();
      Scanner in = new Scanner(socket.getInputStream());
      PrintStream out = new PrintStream(socket.getOutputStream());

      // 클라이언트가 보낸 데이터를 HTTP 요청 프로토콜에 맞춰 읽는다.
      while (true) {
        String str = in.nextLine();
        System.out.println(str);
        if (str.equals("")) // 빈 줄 만나면 stop
          break;
      }

      // HTTP 응답 프로토콜에 따라 클라이언트에게 데이터를 보낸다.
      out.print("HTTP/1.1 200 OK\r\n");
      out.print("Content-Type: text/html; charset=UTF-8\r\n");
      out.print("\r\n");
      out.print("<html><body><h1>안녕!-신애야</h1></body></html>\r\n");

      out.close();
      in.close();
      socket.close();
    }
  }

}







