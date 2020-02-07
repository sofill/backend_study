# 32_11 - 서버에서 제공한 프록시 객체를 사용하여 데이터를 처리하기
(클라이언트꺼)

## 학습목표

- 프록시 패턴의 이점을 이해한다. 

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/ClientApp.java 변경

## 실습  

### 훈련 1: 서버 프로젝트에서(32_11)에서 DAO 프록시 클래스를 가져오라. 

- com.eomcs.lms.dao.XxxDao 인터페이스를 가져온다.
- com.eomcs.lms.dao.proxy 패키지와 그 하위 패키지를 모두 가져온다. 
 
### 훈련 2: BoardXxxCommand 객체가 BoardDaoProxy 객체를 사용하여 데이터를 처리하게 하라. 

- com.eomcs.lms.handler.BoardXxxCommand 클래스를 변경한다. 
	- 입출력 스트림 필드를 제거한다. 
	- 생성자에서 프록시 객체를 받는다. 
	- 프록시 객체를 사용하여 데이터를 처리한다. 
- com.eomcs.lms.ClientApp 변경한다. 
	- BoardDaoProxy 객체를 생성한다.
	- BoardXxxCommand 객체에 주입한다. 


	
### 훈련 3: Command 객체가 서버와 통신할 수 있도록 입출력 도구를 제공하라.

- ClientApp.java 변경
  - 서버와 연결하는 코드를 적용한다.
  - 서버와 통신할 수 있는 입출력 도구를 BoardXxxCommand 객체에 제공한다.
  
### 훈련 4: BoardListCommand 가 작업할 때 서버와 통신하도록 처리하라.

- BoardListCommand.java 변경
  - 서버의 입출력 도구를 받을 수 있도록 생성자를 변경한다.
  - 데이터를 읽고 쓸 때 서버에 요청하도록 execute()를 변경한다.

### 훈련 5: BoardAddCommand 가 작업할 때 서버와 통신하도록 처리하라.

- BoardAddCommand.java 변경
  - 서버의 입출력 도구를 받을 수 있도록 생성자를 변경한다.
  - 데이터를 읽고 쓸 때 서버에 요청하도록 execute()를 변경한다.

### 훈련 6: BoardDetailCommand 가 작업할 때 서버와 통신하도록 처리하라.

- BoardDetailCommand.java 변경
  - 서버의 입출력 도구를 받을 수 있도록 생성자를 변경한다.
  - 데이터를 읽고 쓸 때 서버에 요청하도록 execute()를 변경한다.
  
### 훈련 7: BoardUpdateCommand 가 작업할 때 서버와 통신하도록 처리하라.

- BoardUpdateCommand.java 변경
  - 서버의 입출력 도구를 받을 수 있도록 생성자를 변경한다.
  - 데이터를 읽고 쓸 때 서버에 요청하도록 execute()를 변경한다.
  
### 훈련 8: BoardDeleteCommand 가 작업할 때 서버와 통신하도록 처리하라.

- BoardDeleteCommand.java 변경
  - 서버의 입출력 도구를 받을 수 있도록 생성자를 변경한다.
  - 데이터를 읽고 쓸 때 서버에 요청하도록 execute()를 변경한다.
  
  ---
### 훈련 9: LessonXxxCommand 가 작업할 때 서버와 통신하도록 처리하라.

- LessonXxxCommand.java 변경
  - 서버의 입출력 도구를 받을 수 있도록 생성자를 변경한다.
  - 데이터를 읽고 쓸 때 서버에 요청하도록 execute()를 변경한다.
  
### 훈련 10: MemberXxxCommand 가 작업할 때 서버와 통신하도록 처리하라.

- BoardUpdateCommand.java 변경
  - 서버의 입출력 도구를 받을 수 있도록 생성자를 변경한다.
  - 데이터를 읽고 쓸 때 서버에 요청하도록 execute()를 변경한다.
  
  
  
