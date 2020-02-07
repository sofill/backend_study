// 상대편에 연결을 요청하기 - 클라이언트(client)
package com.eomcs.net.ex01;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender {

  public static void main(String[] args) throws Exception {
    System.out.println("클라이언트 실행♡♡♡");
    // 1) 다른 컴퓨터와 네트워크로 연결한다.
    // => 서버와 연결되면 Socket 객체가 생성된다.
    // => 서버와 연결될 때까지 리턴하지 않는다. (Socket  안만들고 기다린다.)
    // => 서버와 연결할 수 없으면 예외가 발생한다.
    //내 자신을 가리키는 ip주소. 127.0.0.1 =localhost // 8888은 서버의 포트 번호
    Socket socket = new Socket("192.168.1.24", 8888);
    // 스캐너 = 헬퍼(단지 헬퍼다. 도우미 클래스)
    // 버퍼드 = 데코레이터(포장하는 역할, 대상이 같은 조상을 가져야 한다.)

    // 2) 소켓 객체를 통해 읽고 쓸 수 있도록 입출력 스트림을 얻는다.
    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());

    // 3) 상대편으로 문자열을 한 줄 보낸다.
    out.println("이신애입니다. 안녕하세요!");

    // 4) 상대편에서 보낸 문자열을 한 줄 읽는다.
    // => 상대편이 한 줄 데이터를 보낼 때까지 리턴하지 않는다.
    // => 이런 메서드를 블로킹 메서드라 부른다.
    String str = in.nextLine(); // 상대편이 한 줄 보낼 때까지 여기서 기다림..
    System.out.println(str);

    // 5) 항상 입출력 도구는 사용 후 닫아야 한다.
    in.close();
    out.close();

    // 6) 네트워크 연결도 닫는다.
    socket.close();

  }

}





