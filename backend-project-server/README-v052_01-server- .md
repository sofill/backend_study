# 52_1 -  
- 서버꺼

## 학습목표

- 

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/AppConfig.java 변경
- src/main/java/com/eomcs/lms/DatabaseConfig.java 추가
- src/main/java/com/eomcs/lms/MybatisConfig.java 추가
- src/main/java/com/eomcs/lms/ContextLoaderListener.java 변경

## 실습  

### 훈련1: 애노테이션으로 트랜잭션을 제어할 수 있도록 해당 기능을 활성화시킨다.

- com.eomcs.lms.DatabaseConfig 변경
  
  
### 훈련2: @Transactional 애노테이션을 ?????????????

- com.eomcs.lms.MybatisConfig 추가
  - AppConfig에서 Mybatis 관련 객체 생성 코드를 가져온다.
- com.eomcs.lms.AppConfig 변경

### 훈련3: Spring IoC 컨테이너를 생성할 때 Java Config를 모두 지정한다.

- com.eomcs.lms.ContextLoaderListener 변경
  - Spring IoC 컨테이너 생성 코드를 변경한다.
  
### 훈련4: @Configuration 애노테이션을 사용하여 Java Config 를 설정한다.

- com.eomcs.lms.DatabaseConfig 변경
  - @Configuration 애노테이션을 붙인다.
- com.eomcs.lms.MybatisConfig 변경
  - @Configuration 애노테이션을 붙인다.
- com.eomcs.lms.ContextLoaderListener 변경
  - Spring IoC 컨테이너를 생성할 때 Java Config로 AppConfig 만 지정한다.# 51_2 - 관리하기 쉽게 SPRING IOC 설정 파일(JAVA CONFIG)을 분리하기
- 서버꺼

## 학습목표

- SPRING JAVA CONFIG 파일을 다룰 수 있다.

## 실습 소스 및 결과

- SRC/MAIN/JAVA/COM/EOMCS/LMS/APPCONFIG.JAVA 변경
- SRC/MAIN/JAVA/COM/EOMCS/LMS/DATABASECONFIG.JAVA 추가
- SRC/MAIN/JAVA/COM/EOMCS/LMS/MYBATISCONFIG.JAVA 추가
- SRC/MAIN/JAVA/COM/EOMCS/LMS/CONTEXTLOADERLISTENER.JAVA 변경

## 실습  

### 훈련1: 데이터베이스 관련 설정을 분리하기

- COM.EOMCS.LMS.DATABASECONFIG 추가
  - APPCONFIG에서 데이터베이스 관련 객체 생성 코드를 가져온다.
- COM.EOMCS.LMS.APPCONFIG 변경
  
### 훈련2: MYBATIS 관련 설정을 분리하기

- COM.EOMCS.LMS.MYBATISCONFIG 추가
  - APPCONFIG에서 MYBATIS 관련 객체 생성 코드를 가져온다.
- COM.EOMCS.LMS.APPCONFIG 변경

### 훈련3: SPRING IOC 컨테이너를 생성할 때 JAVA CONFIG를 모두 지정한다.

- COM.EOMCS.LMS.CONTEXTLOADERLISTENER 변경
  - SPRING IOC 컨테이너 생성 코드를 변경한다.
  
### 훈련4: @CONFIGURATION 애노테이션을 사용하여 JAVA CONFIG 를 설정한다.

- COM.EOMCS.LMS.DATABASECONFIG 변경
  - @CONFIGURATION 애노테이션을 붙인다.
- COM.EOMCS.LMS.MYBATISCONFIG 변경
  - @CONFIGURATION 애노테이션을 붙인다.
- COM.EOMCS.LMS.CONTEXTLOADERLISTENER 변경
  - SPRING IOC 컨테이너를 생성할 때 JAVA CONFIG로 APPCONFIG 만 지정한다.