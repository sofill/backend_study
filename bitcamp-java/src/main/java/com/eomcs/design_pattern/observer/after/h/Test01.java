package com.eomcs.design_pattern.observer.after.h;

// Car 옵저버 구현체를 만들 때는 반드시
// - 인터페이스에 선언된 모든 메서드를 구현해야 한다.
// - 관심 없는 메서드라도 구현해야 한다.
//   예)
//   SafeBeltCarObserver는 시동을 걸 때 작업을 수행하는 아이이다.
//   그래서 carStarted() 메서드에 코드를 삽입하였다.
//   그런데 인터페이스를 구현하려면 모든 메서드를 정의해야 하기 때문에
//   관심이 없는데도 불구하고 carStopped() 메서드도 같이 구현하였다.
//   물론 이건 코드가 없는 빈 메서드!
//
// 인터페이스를 좀 더 쉽게 구현하는 방법:
// - 위와 같은 경우에,
//   (여러 개의 메서드 중에서 주로 일부 메서드만 구현하는 경우)
//   추상 클래스를 사용하여 메서드를 미리 구현해 놓으면
//   인터페이스 구현체를 정의하기 편하다!
//
// 그래서, 이번 실습은
// - CarObserver를 미리 구현한 AbstractCarObserver를 만들고,
//  구현체는 이 추상 클래스를 상속 받도록 만든다.
//
public class Test01 {

  public static void main(String[] args) {

    Car car = new Car();

    car.addCarObserver(new SafeBeltCarObserver());
    car.addCarObserver(new EngineOilCarObserver());
    car.addCarObserver(new BreakOilCarObserver());
    car.addCarObserver(new LightOffCarObserver());

    // 썬루프를 닫는 옵저버를 추가한다.
    // - 기존 구조에서는 Car 클래스에 코드를 추가하였다!
    // - 옵저버 패턴으로 구조를 바꾼 후에는 이렇게 새 클래스를 정의하여 등록한다.
    car.addCarObserver(new SunRoofCloseCarObserver());

    car.start();

    car.run();

    car.stop();

    // 업그레이드를 수행한 다음 시간이 지난 후
    // 5) 시동 끌 때 썬루프를 자동으로 닫기
    // => 썬루프를 자동으로 닫는 옵저버(SunRoofCloseCarObserver)를 정의한다.
    // => Car 객체에 등록한다.
  }
}








