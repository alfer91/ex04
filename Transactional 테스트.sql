-- 트랜잭션 실습을 위한 테이블 생성, 한 번에 두개의 테이블에 insert 해야하는 상황을 재현, 글자 수 크기로 에러 발생

create table tbl_sample1( col1 varchar2(500));

create table tbl_sample2( col2 varchar2(50));

delete from tbl_sample1;