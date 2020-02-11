// URL(Uniform Resource Locator) - URL을 다루는 클래스
package com.eomcs.net.ex07;

import java.net.URL;

public class Exam01 {

  public static void main(String[] args) throws Exception {
    // 웹 상에서 자원의 위치를 표현하는 방법
    // => [프로토콜]://서버주소:포트번호/자원의 경로
    //   - 프로토콜: http, https, ftp 등
    //   - 서버주소: IP 주소(192.168.0.1), 도메인명(www.bitcamp.co.kr)
    //   - 포트번호: 80 (생략 가능), 8080(proxy서버) 등
    //   - 자원의 경로: /index.html, /board/list.jsp
    //
    URL url = new URL("http://bitcamp.co.kr/index.php?main_page=home");

    // URL 분석
    System.out.printf("프로토콜: %s\n", url.getProtocol());
    System.out.printf("서버주소: %s\n", url.getHost());
    System.out.printf("포트번호: %d\n", url.getPort()); // 지정하지 않으면 -1 리턴
    System.out.printf("자원경로: %s\n", url.getPath());
  }

}






