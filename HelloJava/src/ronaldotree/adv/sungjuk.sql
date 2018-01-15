-- 성적 테이블 생성
create table sungjuk(
	sjno		int				primary key,
	name		nvarchar2(6)	not null,
	kor			number(3),
	eng			number(3),
	math		number(3),
	tot			number(3),		
	avrg		number(4,1),		-- 전체 자리수 4자리 중 소숫점 1자리
	grd			nvarchar2(1),	
	regdate		timestamp		default sysdate
);

-- sequence 생성
create sequence sjno;

-- 성적 데이터 추가
insert into sungjuk (sjno, name, kor, eng, math, tot, avrg, grd) 
values (sjno.nextval, "수빈", 89, 87, 88, 264, 88, '가');

-- 성적 데이터 전체 조회
select sjno, name, kor, eng, math from sungjuk
order by sjno desc;

-- 성적 데이터 상세 조회
select * from sungjuk
where sjno = 1;