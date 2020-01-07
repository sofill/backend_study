package com.eomcs.oop.ex08.b;

public class Sedan extends Car {
    @Override
    public void run() { // Car의 달린다 -> 쌩쌩 달린다로 오버라이딩
        System.out.println("쌩쌩 달린다.");
    }
    
    public void doSunroof(boolean open) {
        if (open) {
            System.out.println("썬루프를 연다.");
        } else {
            System.out.println("썬루프를 닫는다.");
        }
    }
}
