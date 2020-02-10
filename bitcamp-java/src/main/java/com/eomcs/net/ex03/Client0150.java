// 서버와 입출력 테스트 - byte stream
package com.eomcs.net.ex03;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client0150 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    try (Socket socket = new Socket("localhost.", 8888);

        PrintStream out = new PrintStream(socket.getOutputStream()); // outputstream에는 리턴할 수 있는 write가 없어서..
        Scanner in = new Scanner(socket.getInputStream())) {
      // 프린트스트림은 바이트스트림에 속한다/
      // 프린트라이터는 라이터를 상속받은 캐릭터스트림
      // 인풋, 아웃풋 상속받은 건 바이트스트림
      // 리더, 라이터 상속받은 건 캐릭터트스림
      // 그냥 다 flush() 해라.
      System.out.println("서버와 연결되었음!");

      // 서버에 데이터를 보내기 전에 잠깐 멈춤!
      System.out.println(">");
      keyScan.nextLine();

      out.println("ABC가각간");
      //out.flush(); // 이걸 호출해야 비로소 서버에 보낸다.(문자열에서! 바이너리는 없어도 됨!!)
      // byte stream 을 사용할 때는 바로 출력한다.
      // 따라서 flush()를 호출하지 않아도 된다.
      System.out.println("서버에 데이터를 보냈음!");
      String str = in.nextLine(); //스캐너는 nextLin, String
      System.out.println(str);

    } catch (Exception e) {
      e.printStackTrace();
    }

    keyScan.close();
  }
}


