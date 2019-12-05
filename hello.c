#include <stdio.h>

int main() {
  printf("Hello!\n");
  int a = 100;

  if (a > 0) {
    printf("양수입니다!\n");
  } else {
    prentf("음수입니다.\n");
  }
}

// 컴파일 방식은 문법검사를 하기 때문에 
//단 하나의 문법적 오류가 있어도 컴파일이 안된다. 
