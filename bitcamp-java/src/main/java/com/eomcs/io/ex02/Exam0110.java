// Byte Stream - 바이트 단위로 출력하기
package com.eomcs.io.ex02;

import java.io.FileOutputStream;

public class Exam0110 {

  public static void main(String[] args) throws Exception {

    // 1) 파일로 데이터를 출력하는 객체를 준비한다.
    // - new FileOutputStream(파일경로)
    // - 지정된 경로에 해당 파일을 자동으로 생성한다.
    // - 기존에 같은 이름의 파일이 있으면 덮어쓴다.
    // - 주의!!! 기존 파일이 삭제된다.!!!!
    // - 파일 경로가 절대 경로가 아니면
    //   - 리눅스, 유닉스 : /로 시작하지 않으면,
    //   - 윈도우 : c:\, d:\ 로 시작하지 않으면,
    //     현재 디렉토리가 기준이 된다.
    FileOutputStream out = new FileOutputStream("temp/test1.data");

    // 2) 1바이트를 출력한다.
    // => int 값을 아규먼트로 넘기더라도 맨 마지막 1바이트만 출력한다.
    out.write(0x7a6b5c4d); // 출력하는 값은 0x4d 이다.

    // 3) 출력 도구를 닫는다.
    // - OS에서 관리하는 자원 중에서 한정된 개수를 갖는 자원에 대해
    //   여러 프로그램이 공유하는 경우: 자원은 항상 사용 후 OS 에 반납해야 한다.
    // - 그래야 다른 프로그램이 해당 자원을 사용할 수 있다.
    //   예) 파일, 메모리, 네트워크 연결 등의 자원들..
    // - 이런 자원을 사용하는 클래스에는 자원을 해제시키는 close()라는 메서드가 있다.
    //   이번 예제에서 다루는 FileOutputStream 클래스에도 close()가 있다.
    // - 따라서 FileOutputStream 객체를 사용한 후에는  close() 를 호출하여
    //   사용한 자원을 해제시켜야 한다.
    // - close()를 호출하면
    //   - FileOutputStream 이 작업하는 동안 사용했던 버퍼(임시메모리)를 비운다.
    //   - OS 에서 제공한 파일과의 연결을 끊는다.
    //
    out.close();

    // 믈런. JVM 을 종료하면 JVM 을 실행하는 동안 사용했던 모든 자원은
    // 자동으로 해제된다.
    // 이런 예제처럼 짧은 시간동안 실행되는 경우,
    // close()를 호출하지 않아도 자원을 해제시키는 데 문제가 없다.
    // 문제는! 24시간 365일 멈추지 않고 실행하는 서버 프로그램인 경우
    // 사용한 자원을 즉시 해제시키지 않으면
    // 자원 부족 문제가 발생한다.
    // 결론!
    //  -  간단한 코드를 작성하더라도 close() 를 호출하는 것을 게을리 하지 말라!
    System.out.println("데이터 출력 완료!");

  }

}

// 파일 입출력 API 주요 클래스 (java.io 패키지)
// 1) 데이터 읽기
//    java.io.InputStream (추상 클래스)
//      +-- java.io.FileinputStream : 바이트 단위로 읽기 (binary stream)
//    java.io.Reader (추상 클래스)
//      +-- java.io.FileReader : 문자 단위로 읽기 (character stream)
// 2) 데이터 쓰기
//    java.io.OutputStream (추상 클래스)
//      +-- java.io.FileOutputStream : 바이트 단위로 쓰기 (binary stream)
//    java.io.writer (추상 클래스)
//      +-- java.io.FileWriter : 문자 단위로 쓰기 (character stream)

// ## 바이너리 파일 vs 텍스트 파일
// 1) 바이너리 파일
// - 기본 텍스트 편집기 (메모장, vi 에디터 등) 로 편집할 수 없는 파일을 말한다.
// - 만약 텍스트 편집기로 변경한 후 저장하면, 파일 포맷이 달라 파일이 깨지기 때문에 손상된다.
// - 예) .pdf, .ppt, .xls, .gif, .mp3, .jpg, .hwp, .mov, .avi, .exe, .lib 등
// - 바이너리 파일을 편집하려면 해당 파일 포맷을 이용함는 전용 프로그램이 필요하다.
//
// 2) 텍스트 파일
// - 기본 텍스트 편집기(메모장, vi 에디터 등)로 편집할 수 있는 파일을 말한다.
// - 예) .txt, .csv, .html, .js, .xml, .bat, .c, .py, .php, .docx, .pptx, .xlsx
// - 텍스트 파일은 전용 에디터가 필요 없다.
// - 텍스트를 편집할 수 있는 에디터라면 텍스트 파일 편집 후 저장해도 유효하다.

// ## 바이너리 데이터 읽고, 쓰기
// - 읽고 쓸 때 중간에서 변환하는 것 없이 그대로 바이트를 읽고 써야 한다.
// - inputStream/OutputStream 계열의 클래스를 사용하라.
//
// ## 텍스트 데이터 읽고, 쓰기
// - 읽고 쓸 때 중간에서 문자 코드표에 따라 변환하는 것이 필요하다.
// - Reader/Wrter 계열의 클래스를 사용하라.     ㅇㅇ

