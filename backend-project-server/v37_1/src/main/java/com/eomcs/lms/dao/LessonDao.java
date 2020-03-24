package com.eomcs.lms.dao;

import java.util.List;
import com.eomcs.lms.domain.Lesson;

public interface LessonDao {

  // 데이터를 저장하고 꺼내는 방식( 파일, 클라우드저장소, DB 등)에 관계 없이
  // DAO 사용법을 통일하기 위해
  // 메서드 호출 규칙을 정의한다.
  //

  public int insert(Lesson lesson) throws Exception;
  public List<Lesson> findAll() throws Exception;
  public Lesson findByNo(int no) throws Exception;
  public int update(Lesson lesson) throws Exception;
  public int delete(int no) throws Exception;
}


