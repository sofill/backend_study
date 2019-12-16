package com.eomcs.basic.ex05;

//# 관계 연산자 : <, <=, >, >=, ==, !=  
 
public class Exam02_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        // 비교의 결과는 true 또는 false이다.
        // 즉 boolean 값이다.
        boolean r1 = a < b; // true
        
        //int r2 = a < b; // 컴파일 오류! ★C에서는 되는데 자바에서는 안되는..

        System.out.println(a < b); // true
        System.out.println(a <= b); // true
        System.out.println(a > b); // false
        System.out.println(a >= b); // false
        System.out.println(a == b); // false // =라고만 해도 에러는 안 뜨는데, b값을 a에 집어넣는 어처구니 없는...
        System.out.println(a = b); // 결과값이 20 이 나오는;;;
        System.out.println(a != b); // true

    }
}
