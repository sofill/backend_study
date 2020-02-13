package com.eomcs.lms.dao.proxy;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// DaoProxyHelper가 작업을 수행할 때 일시적으로 사용하는 도구
// => 이런 관계를 UML에서는 "의존관계(Dependency)"라고 부른다.
// => UML class diagram 으로 표현하자면
//    [DaoProxyHelper] ············> [Worker]

public interface Worker {
  Object execute(ObjectInputStream in, ObjectOutputStream out) throws Exception;  //오브젝트인풋스트림,아웃풋스트림을 파라미터로 받는다.
}
