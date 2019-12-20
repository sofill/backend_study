package com.bitcamp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App1 {
  public static void main(String[] args) throws Exception {


    class Word {
      int wordNum;
      String wordName;
      String wordMeaning;
      String wordExam;      
    }
    int arraySize = 100; // 100개의 단어를 저장 가능, 이후 더 많이 필요하면 이 변수의 크기를 늘리면 됨

    Word[] arr = new Word[arraySize];
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 대신 Scanner 사용 가능
    
    
    /*입력부*/
    for (int i = 0; i < arraySize; i++) {
      
      System.out.println("======단어 입력하기=====");
      System.out.printf("번호: ");
      wordNum = br.readLine();
      System.out.printf("단어: ");
      wordName = br.readLine();
      System.out.printf("의미: ");
      wordMeaning = br.readLine();
      System.out.printf("예문 입력: ");
      wordExam = br.readLine();
    }
//      System.out.printf("오늘 공부한 시간(h): ");
//      hoursPerDay[index] = Integer.parseInt(br.readLine());
      
      System.out.printf("계속 입력하시겠습니까? (y/n) : ");
      if(br.readLine().equals("n")) { //만약 n이 입력되면 break 문으로 반복문을 빠져나감. 마찬가지로 Scanner 사용 가능
        break;
      }
      index++; // index를 증가시키지 않으면 배열의 0번 인덱스에 계속하여 데이터를 저장시킴.
    }
    int count = 0;   
    for (int i = 0; i < count; i++) {
      Word a = arr[i];
      System.out.printf("%d. %s / %s / 예문) %s\n", 
          a.wordNum, a.wordName, 
          a.wordMeaning, a.wordExam
          );      
    }
  }
    
//    /*출력부*/
//    System.out.printf("------------------------------------------------------------------------------\n");
//    System.out.printf("번호",  "단어",         "의미");
//    for(int j=0; j<=index; j++) // j가 0 ~ 위에서 증가한 index까지 반복문 수행
//      System.out.printf("%5s%4s%-40s%4s%-20s%8s\n", wordNum[j], " ", wordName[j], wordMeaning[j], wordExam[j]);
  }
}
