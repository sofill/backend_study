package com.eomcs.lms.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.lms.domain.Lesson;

public class LessonFileDao {

  String filename;
  List<Lesson> list;

  public LessonFileDao(String filename) {
    this.filename = filename;
    list = new ArrayList<>();
    loadData();
  }

  @SuppressWarnings("unchecked")
  private void loadData()  {
    File file = new File(filename);

    try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
      list = (List<Lesson>) in.readObject();
      System.out.printf("총 %d 개의 수업 데이터를 로딩했습니다.\n", list.size());
    } catch (Exception e) { // 그냥 Exception 으로 타입 바꿔줌
      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());
    }
  }

  private void saveData() {
    File file = new File(filename);

    try (ObjectOutputStream out = new ObjectOutputStream (new BufferedOutputStream(new FileOutputStream(file)))) {
      out.reset(); // 기존에 직렬화 수행 중에 캐시(임시보관)된 데이터를 초기화시킨다.
      out.writeObject(list);
      System.out.printf("총 %d 개의 수업 데이터를 저장했습니다.\n", list.size());
    } catch (IOException e) {
      System.out.println("파일 쓰기 중 오류 발생!1 - " + e.getMessage());
    }
  }

  // 서블릿 객체들이 데이터를 다룰 때 사용할 메서드를 정의한다.
  public int insert(Lesson lesson) throws Exception {

    Lesson originLesson = findByNo(lesson.getNo());

    if (originLesson != null) { // 같은 번호의 수업이 있다면!
      return 0; // 0개를 저장했습니다.
    }
    // 그게 아니라면
    list.add(lesson); // 새 수업을 등록한다.
    saveData();
    return 1; // 1개를 저장했습니다.
  }

  public List<Lesson> findAll() throws Exception {
    return list;
  }

  public Lesson findByNo(int no) throws Exception {
    for (Lesson l : list) {
      if (l.getNo() == no) {
        return l;
      }
    }
    return null;
  }

  public int update(Lesson lesson) throws Exception {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getNo() == lesson.getNo()) {
        list.set(i, lesson); //기존 객체를 파라미터로 받은 객체로 바꾼다.
        saveData();
        return 1;
      }
    }
    return 0;
  }

  public int delete(int no) throws Exception {
    for (int i = 0; i < list.size(); i++) {
      if(list.get(i).getNo() == no) {
        list.remove(i);
        saveData();
        return 1;
      }
    }
    return 0;
  }
}
