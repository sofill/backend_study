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
import com.eomcs.lms.domain.Board;

public class BoardObjectFileDao {

  String filename;
  List<Board> list;

  public BoardObjectFileDao(String filename) {
    this.filename = filename;
    list = new ArrayList<>();
    loadData();
  }

  @SuppressWarnings("unchecked")
  private void loadData() {
    File file = new File(filename);

    try (ObjectInputStream in =
        new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
      list = (List<Board>) in.readObject();
      System.out.printf("총 %d 개의 게시물 데이터를 로딩했습니다.\n", list.size());

    } catch (Exception e) {
      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());
    }
  }

  private void saveData() {
    File file = new File(filename);

    try (ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
      out.reset(); // 기존에 직렬화 수행 중에 캐시(임시보관)된 데이터를 초기화시킨다.
      out.writeObject(list);
      System.out.printf("총 %d 개의 게시물 데이터를 저장했습니다.\n", list.size());

    } catch (IOException e) {
      System.out.println("파일 쓰기 중 오류 발생! - " + e.getMessage());
    }
  }

  // 서블릿 객체들이 데이터를 다룰 때 사용할 메서드를 정의한다.
  public int insert(Board board) throws Exception { // 실무에서 insert의 리턴 타입이 int이다.

    if (indexOf(board.getNo()) > -1) { // 같은 번호의 게시물이 있다면!
      return 0; // 0개를 저장했습니다.
    }
    //그게 아니라면
    list.add(board); // 새 게시물을 등록한다.
    saveData();
    return 1; //1개를 저장했습니다.
  } // BoardAdd

  public List<Board> findAll() throws Exception {
    return list;
  } // BoardList

  public Board findByNo(int no) throws Exception {
    int index = indexOf(no);
    if (index == -1) {
      return null;
    }
    return list.get(index);
  } // BoardDetail

  public int update(Board board) throws Exception {
    int index = indexOf(board.getNo());
    if (index == -1) {
      return 0;
    }

    list.set(index, board); // 기존 객체를 파라미터로 받은 객체로 바꾼다.
    saveData();
    return 1;
  }  // BoardUpdate

  public int delete(int no) throws Exception {
    int index = indexOf(no);
    if (index == -1) {
      return 0;
    }
    list.remove(index);
    saveData();
    return 1;
  } // BoardDelete

  private int indexOf(int no) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getNo() == no) {
        return i;
      }
    }
    return -1;
  }
}
