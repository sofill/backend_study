// 파일 보내기
package com.eomcs.net.ex01;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender4 {

  public static void main(String[] args) throws Exception {
    File file = new File("temp/jls11_2.pdf");

    FileInputStream fileIn = new FileInputStream(file);

    System.out.println("서버에 연결 중...");
    Socket socket = new Socket("192.168.1.24", 8888);
    System.out.println("서버에 연결 완료!");

    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());

    System.out.println("서버에 데이터 송신 중...");

    long startTime = System.currentTimeMillis();

    //1) 파일 크기 보내기
    out.writeLong(file.length()); // 롱값 (서버가 그렇게 하니까)

    //2) 파일 이름 보내기
    out.writeUTF(file.getName());

    //3) 파일 데이터 보내기
    int b;
    while ((b = fileIn.read()) != -1) { // -1이 아니라는 뜻은 읽었다는 뜻=>서버에 1바이트 전송
      // b와 = 다음의 식을 먼저 대입하고 그다음 !=으로
      out.write(b); // -1이라는 것은 더이상 읽을 것이 없다는 뜻이므로 아웃
    }

    long endTime = System.currentTimeMillis();

    System.out.printf("서버에 데이터 송신 완료!(%d밀리초)\n", endTime - startTime);

    //4) 서버의 응답받기
    String response = in.nextLine();
    System.out.println(response);

    in.close();
    out.close();
    socket.close();
    fileIn.close();
  }

}





