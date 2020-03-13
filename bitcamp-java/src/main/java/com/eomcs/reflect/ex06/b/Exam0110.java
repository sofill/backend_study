package com.eomcs.reflect.ex06.b;

import java.lang.reflect.Proxy;

// 호출되는 메서드를 알아내는 방법
public class Exam0110 {
  public static void main(String[] args) {

    MyInterface obj = (MyInterface) Proxy.newProxyInstance(
        Exam0110.class.getClassLoader(), //클래스를 메모리에 로딩하는 일을 할 객체
        new Class[] {MyInterface.class},  //자동 생성할 클래스가 구현해야 하는 인터페이스 목록
        new MyInvocationHandler());

    obj.m1();
    obj.m2();

  }
}



//    /*
//    String s1, s2, s3;
//    s1 = new String();
//    s2 = new String();
//    s3 = new String();
//
//    String[] strArray = new String[3];
//    strArray[0] = new String();
//    strArray[1] = new String();
//    strArray[2] = new String();
//     */ //레퍼런스 주소 저장
//
//    String s = new String();
//
//    // 클래스 정보를 갖고 있는 그 메모리의 주소를 저장(?)
//    // 클래스 정보를 저장한 것. 클래스 정보를 알아낼 수 있따!
//    Class c1, c2, c3;
//    c1 = s.getClass();
//    c2 = Class.forName("java.lang.String");
//    c3 = String.class;  // class 는 변수명임..!!!
//
//    Class[] classArray = new Class[3];
//    classArray[0] = s.getClass();
//    classArray[1] = Class.forName("java.lang.String");
//    classArray[2] = ;
//
//    Class[] classArray2 = new Classp[ {
//      ]
//    }
