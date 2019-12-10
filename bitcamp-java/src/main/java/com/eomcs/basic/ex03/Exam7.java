package com.eomcs.basic.ex03;

// 이스케이프 문자 (escape character)

public class Exam7 {
  public static void main(String[] args) {
    // 이스케이프 문자
    // - 문자를 제어하는 기능을 가진 문자 
    // - 문법
    //   \ [ n | r | f | t | b | ' | " | \ ]
    //   (역슬래시 + n , r , f ...)
    System.out.println("Hello,World!");
    System.out.println("Hello,\nWorld!"); // \n : new line 줄바꿈 문자
    System.out.println("Hello,\rabc");    // \r : return 커서(cursor)를 처음으로 돌리게 하는 문자. 덮어쓴다. 
    // (cursor란 문자를 출력할 위치를 가리키는 것.)
    System.out.println("Hello,\b\b\bworld!"); // \b : backspace 커서를 이전으로 한 칸 이동시키는 문자. /b 한 만큼만 앞으로 간다. 
    System.out.println("Hello,\tworld!");     // \t : tab 탭 공간을 추가시키는 문자. (탭은 2칸; 운영 체제마다 기본값이 다른듯..)
    System.out.println("Hello,\fworld!");     // \f : formfeed 추가시키는 문자. (프린터에 보내면 연속용지가 다음 페이지의 시작 부분으로 넘겨진다.도트프린터)
    System.out.println("Hello,\"w\"orld!");   // \" : 더블 쿼테이션 추가하는 명령어 
    System.out.println("Hello,'w'orld!");     // "" 안에서 ' 문자는 그냥 써도 문자로 인식한다. 
    System.out.println('\'');                 // '' 안에서 ' 문자를 출력시키는 문자
    System.out.println('"');                  // '' 안에서 " 문자는 그냥 적는다.   
    System.out.println("c:\\users\\user\\git"); // \ 문자를 출력시키는 문자는? 앞에 하나 더 적으면 된다. 더블로 적으면 \가 하나만 출력된다는 것.
    
// 줄바꿈 코드
// Carrage Return(CR) : 0d (타자기가 끝까지 갔다가 캐리지가 처음으로 이동하는 것과 같은..)
// Line Feed(LF) : 0a
// 
// - Windows OS 에서는 줄바꿈을 표시하기 위해
//   CRLF 2바이트 코드를 삽입한다.
// - Unix OS 에서는 줄바꿈을 표시하기 위해
//   LF 1바이트 코드를 삽입한다.





  }
}
