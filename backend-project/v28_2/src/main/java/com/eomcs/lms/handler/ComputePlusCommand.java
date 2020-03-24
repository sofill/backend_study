// "/compute/plus" 명령 처리 (숙제)
package com.eomcs.lms.handler;

import com.eomcs.util.Prompt;

public class ComputePlusCommand implements Command {

  // List<Compute> computeList; // 배열은 안사용한다.

  Prompt prompt;

  public ComputePlusCommand(Prompt prompt) {
    this.prompt = prompt;
  }
  // this.computeList = list; // 배열은 안사용한다.

  @Override
  public void execute() {
    // Compute compute = new Compute(); // 이것도 안사용한다.

    int number1 = prompt.inputInt("수1? ");
    int number2 = prompt.inputInt("수2? ");
    System.out.printf("계산 결과는 %d입니다! \n", number1 + number2);
  }
}


