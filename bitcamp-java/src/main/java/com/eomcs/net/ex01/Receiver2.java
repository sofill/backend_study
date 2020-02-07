// 서버 + 키보드 입력
package com.eomcs.net.ex01;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Receiver2 {

  public static void main(String[] args) throws Exception {
    System.out.println("서버 실행~~★★★★★");

    Scanner keyScan = new Scanner(System.in); // 헬퍼클래스

    ServerSocket serverSocket = new ServerSocket(8888);
    Socket socket = serverSocket.accept();
    // accept : 대기실에 클라이언트가 단 한명이라도 도달할때까지 기다리고
    // 도달하면 연결을 수행

    PrintStream out = new PrintStream(socket.getOutputStream()); // 프린트스트림이라는 데코레이터를 붙이고
    Scanner in = new Scanner(socket.getInputStream()); // 스캐너라는 헬퍼를 붙여서 읽을 수 있는 도구를 리턴

    // 클라이언트가 보낸 문자열을 수신한다.
    String str = in.nextLine(); // 클라이언트가 문자를 보내면 리턴
    System.out.println(str);

    // 키보드 입력을 받아서 클라이언트로 송신한다.
    System.out.print("입력> ");
    str = keyScan.nextLine(); // 키보드로부터 한 줄을 입력받으면
    out.println(str);

    in.close();
    out.close();
    socket.close();
    serverSocket.close();
    keyScan.close();
  }

}





