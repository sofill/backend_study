// "/compute/plus" 명령 처리
package com.eomcs.lms.handler;

import java.util.List;
import com.eomcs.lms.domain.Compute;
import com.eomcs.util.Prompt;

public class ComputePlusCommand implements Command {

  List<Compute> computeList;

  Prompt prompt;

  public ComputePlusCommand(Prompt prompt, List<Compute> list) {
    this.prompt = prompt;
    this.computeList = list;
  }

  @Override
  public void execute() {
    Compute compute = new Compute();

    int number1 = prompt.inputInt("수1?");
    int number2 = prompt.inputInt("수2?");
    System.out.printf("계산 결과는 %d입니다! \n", (number1 + number2));
  }
}


