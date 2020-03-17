// 클래스 정보 추출 - 클래스 이름 알아내기
package com.eomcs.reflect.ex02;

public class Exam01 {

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("java.lang.String");

    // 클래스의 타입 객체를 통해 클래스 정보를 추출할 수 있다.
    System.out.println(clazz.getSimpleName()); // String              // 클래스명만
    System.out.println(clazz.getName()); // java.lang.String          // 패키지명을 포함한 이름
    System.out.println(clazz.getCanonicalName()); // java.lang.String // 패키지명을 포함한 이름
    System.out.println(clazz.getTypeName()); // java.lang.String      // 패키지명을 포함한 이름


  }

}
