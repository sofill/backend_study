# 37_3 - Application Server 구조로 변경: 규칙 2에 따라 통신하는 클라이언트 만들기
(클라이언트꺼)
  
## 학습목표

- Application Server 아키텍처의 구성과 특징을 이해한다.
- 통신 프로토콜 규칙에 따라 동작하는 클라이언트를 만들 수 있다.  

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/ClientApp.java 변경
- src/main/java/com/eomcs/lms/handler/BoardXxxCommand.java 삭제
- src/main/java/com/eomcs/lms/dao/mariadb/BoardDaoImpl.java 삭제
- src/main/java/com/eomcs/lms/dao/proxy/BoardDaoProxy.java 삭제
- src/main/java/com/eomcs/lms/dao/BoardDao.java 삭제
- src/main/java/com/eomcs/lms/domain/Board.java 삭제
 

## 실습  

### 훈련1: 서버의 추가 데이터 입력 요구에 응답할 수 있도록 통신 규칙을 정의하라.

- 요청과 응답은 `Stateful` 방식으로 처리한다. 
- 클라이언트가 요청할 때 서버와 연결하고, 서버로부터 응답을 받으면 연결을 끊는다. 

규칙1) 단순한 명령어 전송과 실행 결과 수신

```
[클라이언트]                                        [서버]
서버에 연결 요청        -------------->           연결 승인
명령(CRLF)              -------------->           명령처리
화면 출력               <--------------           응답(CRLF)
화면 출력               <--------------           응답(CRLF)
명령어 실행 완료        <--------------           !end!(CRLF)
서버와 연결 끊기
```

### 훈련2: '통신 규칙1' 에 따라 클라이언트의 요청에 응답하라. 

- com.eomcs.lms.ClientApp 변경
 - 서버의 사용자가 입력한 명령을 분석하여 서버주소, 포트번호, 요청자원의 경로를 추출한다.
 - 추출한 정보를 가지고 서버에 연결한다.
 - 서버에 요청 자원의 경로를 전송한다. 
 - 서버의 응답 결과를 출력한다. 
  