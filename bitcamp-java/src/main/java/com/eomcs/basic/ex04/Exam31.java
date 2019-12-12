package com.eomcs.basic.ex04;

public class Exam31 {
  public static void main(String[] args) {
    // 부동소수점 변수 - 메모리 크기

    float f; // 4바이트. 유효자리수 : 7자리

    f = 3.141592f;
    System.out.println(f);

    f = 3.1415929f; // 3.1415923 이 나오므로 8자리는 위험하다. 3.141592 까지만 하는 게 덜 위험.
    System.out.println(f);

    f = 0.0000003141592f; // 3.141592E-7 이 나오고 E-7은 10의7승 분의 1 -> 앞의 0은 자릿수에 영향 안끼친다.
    System.out.println(f);

    f = 0.00000031415929f; // 3.1415928E-7 => 이상하게 나옴. 2번째 예와 똑같은 상황이다. 소수점 이하인 경우 앞의 0은 유효자리수에 포함 안함
    System.out.println(f);
    
    f = 314159200000.0f; // 소수점 이상인 경우 뒤의 0을 포함해서 유효자리수로 계산. 안되는 경우.
    System.out.println(f);

    double d; // 8바이트.  유효자리수 : 15자리

    d = 9.87654321234567; 
    System.out.println(d);

    d = 98765432.1234567; 
    System.out.println(d);
    
    d = 98765432123456.74; // 값이 왜곡된다. 
    System.out.println(d);


    // 변수와 리터럴

    f = 99999.88f;
    System.out.println(f);

    f = 99999.88777f; // 값이 왜곡됨. 이미 리터럴이 4바이트 유효자릿수를 넘어갔기 때문.
    System.out.println(f);
  
    d = 99999.88f; // 99999.88125 가 나온다. 이상함. f를 붙혔기 때문.
    System.out.println(d);

    d = 99999.88;
    System.out.println(d); 

    // 4바이트 메모리에 넣을 때는 4바이트 리터럴을 사용하고, 8바이트 메모리에 넣을 때는 8바이트 리터럴을 사용하라.
    // 3번의 예처럼 f리터럴을 d에 넣더라도 99999.88125 처럼 값이 왜곡되어 나오는데 이걸 놓치는 경우가 많기 때문이다. 

    float f1 = 99988.88f;
    float f2 = 11.11111f;
    System.out.println(f1);
    System.out.println(f2);

    float f3 = f1 + f2; //이게 가장 많이 하는 실수!!
    System.out.println(f3);
    //  99988.88
    // +   11.11111
    // ============
    //  99999.99111 직접 더해보면 이게 정답인데 자바로 연산하면 99999.99 로 짤린다!
    
    double r = f1 + f2; // float + float = float 이다. 99999.9921875 가 나옴. 이미 결과에서 값이 왜곡된다. 
    System.out.println(r);

    double d1 = 99988.88;
    double d2 = 11.11111;
    System.out.println(d1);
    System.out.println(d2);

    double d3 = d1 + d2; 
    System.out.println(d3); // d1, d2, d3 연산 결과 다 제대로 잘 나옴. 실무에서는 부동소수점은 무조건 double(8바이트) 써라!
                            // 몸무게나 키 같은 정해진 짧은 것이라면 float 써도 상관 없지만.. 
                         
    f1 = 3.141592f;
    d1 = f1; // ok
    System.out.println(d1); // 컴파일은 OK. 그러나 값은 왜곡(될 수 있다.) 3.141592025756836 나옴.
    f1 = d1; 
    System.out.println(f1); // 컴파일 오류. 작은 거에 큰 거를 못 넣으니까. 

    



  }
}