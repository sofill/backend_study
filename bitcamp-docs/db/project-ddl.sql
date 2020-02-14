-- 수업 테이블 삭제 
drop table if exists lms_lesson;

-- 회원 테이블 삭제
drop table if exists lms_member;

-- 게시판 테이블 삭제 
drop table if exists lms_board;

-- 사진 게시판 테이블 삭제
drop table if exists lms_photo;

-- 사진 게시물 첨부 파일 테이블 삭제
drop table if exists lms_photo_file;


-----------------------------아래 문장 전체 복붙-------------------------
-- 수업 테이블 생성
create table lms_lesson (
  lesson_id int not null auto_increment primary key comment '수업 데이터 식별 번호', 
  sdt datetime not null comment '수업 시작일',
  edt datetime not null comment '수업 종료일',
  tot_hr int not null comment '총 수업 시간',
  day_hr int not null comment '일 수업 시간',
  titl varchar(255) not null comment '수업명',
  conts text not null comment '수업 내용'               
) comment '수업'; 

위에 -- 한글 한 자당 3 byte 이니까 255 % 3 = 허용 글자수!
오라클, mySQL 마다 허용되는 글자수 같은 게 다 다르다. 
그래서 각각의 개발자가 필요한 것임.


( ) <- 이 안이 회원 데이터를 설계하는 설계도
--  <- 주석
-----------------------------아래 문장 전체 복붙-------------------------
-- 회원 테이블 생성                                
create table lms_member (
  member_id int not null auto_increment primary key comment '회원 데이터 식별 번호',
  name varchar(30) not null comment '이름',
  email varchar(50) not null comment '이메일',
  pwd varchar(255) not null comment '암호',
  cdt datetime default now() comment '등록일', 
  tel varchar(20) comment '전화',
  photo varchar(255) comment '사진'
) comment '회원';

create unique index UIX_lms_member_email
  on lms_member ( -- 회원
    email asc    -- 이메일
  );

-----------------------------아래 문장 전체 복붙-------------------------
-- 게시물 테이블 생성
create table lms_board (
  board_id int not null auto_increment primary key comment '게시물 식별 번호',
  conts text not null comment '내용',
  cdt datetime default now() comment '생성일',
  vw_cnt int default 0 comment '조회수' 
) comment '게시물';

-- 사진 게시물 테이블 생성
create table lms_photo (
  photo_id int not null auto_increment primary key comment '사진 게시물 식별 번호',
  lesson_id int not null comment '수업 번호',
  titl varchar(255) not null comment '제목',
  cdt datetime default now() comment '생성일',
  vw_cnt int default 0 comment '조회수',
  -- lesson_id에 저장되는 값은 lms_lesson 테이블의 lesson_id 값으로 제한하는 조건을 추가한다.
  constraint fk_photo_to_lesson foreign key (lesson_id)
    references lms_lesson (lesson_id)
) comment '사진게시물';

-- 사진 게시물에 첨부하는 사진 파일 테이블 생성
create table lms_photo_file (
  photo_file_id int not null auto_increment primary key comment '사진 파일 식별 번호',
  photo_id int not null,
  file_path varchar(255) not null,
  constraint fk_photo_file_to_photo foreign key (photo_id)
    references lms_photo (photo_id)
) comment '사진 게시물 첨부파일 테이블'; 






