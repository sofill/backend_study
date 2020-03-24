package com.eomcs.lms;

import java.io.File;

public class Test {

  public static void main(String[] args) throws Exception {
    File f = new File("C:/");
    File[] files = f.listFiles();
    for (File file : files) {
      System.out.println(file.getName());
    }

  }

}
