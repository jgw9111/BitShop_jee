SELECT * FROM member;
--사용자 계정 추가 --
system/password  -> 디폴트 계정 Id / pw
>CREATE USER oracle IDENTIFIED BY password; 
        id oracle
        pw password
        
-- 권한 부여 --
GRANT RESOURCE, CONNECT, DBA TO oracle;

--현재 사용자 정보--
SHOW USER;

--테이블 생성--
CREATE TABLE member( id VARCHAR2(10),name VARCHAR2(10),pass VARCHAR2(10),ssn VARCHAR2(14));

--테이블 삭제-- 
DROP TABLE member;

--인스턴스 생성--
INSERT INTO member( id,name,pass,ssn )
VALUES( 'hong' , '홍길동' , '1' , '900101-1234567' ) 

--id로 찾기--
SELECT *FROM member where id LIKE 'jeong';

--테이블 row 삭제--
DELETE FROM member where pass LIKE '1';