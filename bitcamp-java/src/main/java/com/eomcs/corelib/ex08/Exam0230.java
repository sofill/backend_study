// java.util.HashMap - value 목록만 꺼내기
package com.eomcs.corelib.ex08;

import java.util.Collection;
import java.util.HashMap;

public class Exam0230 {
  public static void main(String[] args) {
    Member v1 = new Member("홍길동", 20);
    Member v2 = new Member("임꺽정", 30);
    Member v3 = new Member("유관순", 16);
    Member v4 = new Member("안중근", 20);
    Member v5 = new Member("윤봉길", 25);

    HashMap map = new HashMap();
    map.put("s01", v1);
    map.put("s02", v2);
    map.put("s03", v3);
    map.put("s04", v4);
    map.put("s05", v5);

    // key 객체는 중복되어서는 안되기 때문에
    // key 객체 목록은 Set 에 담아서 리턴한다.
    // value 객체는 중복 젖아될 수 있기 때문에
    // value 객체 목록은 Collection에 담아서 리턴한다.

    Collection values = map.values(); // key가 필요 없으면 이거 사용하라.
    for (Object value : values) { // 다만 key가 없으면 태그 기능을 못쓰는 걸 염두에 둬라.
      System.out.println(value);
    }

  }

}


