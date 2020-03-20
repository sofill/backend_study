// 팩토리 메서드 호출 - static 메서드 호출 응용
package com.eomcs.spring.ioc.ex06.b;

import java.sql.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01 {

  public static void main(String[] args) {
    // 자바 코드로 스태틱 메서드를
    Date tody = Date.valueOf("2020-03-20");

    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "com/eomcs/spring/ioc/ex06/b/application-context.xml");

    Date date = (Date) iocContainer.getBean("d1");
    System.out.println(date);
  }

}





