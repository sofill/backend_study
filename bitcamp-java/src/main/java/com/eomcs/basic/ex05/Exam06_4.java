package com.eomcs.basic.ex05;

//# 증감 연산자 : 후위(post-fix) 증감 연산자 응용 II

public class Exam06_4 {
    public static void main(String[] args) {
        int i = 2;
        int result = i++ + i++ * i++;  
        // 연산자 우선수위: 
        // 1) ++, --  ★//여기선 *,/보다 ++, -- 가 우선순위가  더 높다
        // 2) *, /, %
        // 3) +, -
        // 4) =
        // 
        // int result = 2 + 3 * 4;
        // int result = 2 + 12;
        // int result = 14;
        System.out.printf("%d, %d\n", i, result);

    }
}
