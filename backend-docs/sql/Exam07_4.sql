/* union 과 union all */
 -- 학생과 강사들이 이용하느 은행 이름을 가져오고 싶음.
 
/* select 결과 합치기 (합집합) 
   union : 중복 값 자동 제거*/
select distinct bank from stnt
union 
select distinct bank from tcher;

/* union all: 중복 값 제거 안함*/
select distinct bank from stnt
union all
select distinct bank from tcher;







