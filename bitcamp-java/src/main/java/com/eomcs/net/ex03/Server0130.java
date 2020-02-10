// 클라이언트와 입출력 테스트 - byte stream : Data 주고 받기
package com.eomcs.net.ex03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0130 {
  public static void main(String[] args) {
    try (Scanner keyboard = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888)) {

      System.out.println("클라이언트의 연결을 기다리고 있음.");

      try (Socket socket = serverSocket.accept(); // 여기서 일단 멈춤. 대기열에 클라이언트가 들어올 때까지!

          DataOutputStream out = new DataOutputStream(socket.getOutputStream());
          DataInputStream in = new DataInputStream(socket.getInputStream())) {


        System.out.println("클라이언트가 보낸 int 값을를 기다리고 있음");
        int value = in.readInt();
        System.out.println(value);


        System.out.println("데이터를 보내기 전에 잠깐!");
        keyboard.nextLine();

        // 클라이언트에서 받은 int 값을 그대로 리턴한다.
        out.writeInt(value);
        System.out.println("클라인트에게 데이터를 보냈음.");

      }
      System.out.println("클라이언트와의 연결을 끊었음.");

    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("서버 종료!");
  }

}

