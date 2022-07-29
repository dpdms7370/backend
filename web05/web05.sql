

use myshop;

drop table member;

create table member ( cno int not null primary key AUTO_INCREMENT, 
cid varchar(30) ,
cpw varchar(100) not null,  
cpw2 varchar(100) not null, 
cname varchar(20) not null, 
cbirth date, 
ctel varchar(100) not null, 
cmail varchar(100), 
cadd1 varchar(100), 
cadd2 varchar(100),
grade int,
regdate date default(current_date));

insert into member values(cno,'aaa', '$2a$10$vCVUhu4vJNXzontK2eQ6A.luQAd6JKn/.mE7Exx2SlzaANAvcagAu','$2a$10$vCVUhu4vJNXzontK2eQ6A.luQAd6JKn/.mE7Exx2SlzaANAvcagAu', 'aaa', "20-01-01",'010-0000-0000','aaaa1234@naver.com','충청남도',' 전원주택',1,(current_date));
insert into member values(cno,'bbb', '$2a$10$YITjOHhGmxUCwmFn3SYl6eR62aVeoPT.jMx784FpIDs7.ThsrC9hG','$2a$10$YITjOHhGmxUCwmFn3SYl6eR62aVeoPT.jMx784FpIDs7.ThsrC9hG', 'bbb', "20-01-02",'010-1111-1111','bbbb1234@naver.com','서울특별시 하남구 동남쪽 어딘가','아파트에서 또는 전원주택',1,(current_date));
insert into member values(cno,'ccc', '$2a$10$NzSnedZaKD1e3PEGzKOejOSKoj9IcKSMoAX/PUgTiJ/sGJfysjAFy','$2a$10$NzSnedZaKD1e3PEGzKOejOSKoj9IcKSMoAX/PUgTiJ/sGJfysjAFy', 'ccc', "20-01-03",'010-2222-2222','cccc1234@naver.com','경기도 고양시 일산동구 북쪽 하늘아래','전원주택 1002',1,(current_date));
insert into member values(cno,'ddd', '$2a$10$bx4gifZelcx8Lx5gEZw/I.T7FJ4amIvtm8i6NyAMMCiKifEP9.ccW
','$2a$10$bx4gifZelcx8Lx5gEZw/I.T7FJ4amIvtm8i6NyAMMCiKifEP9.ccW
', 'ddd', "20-01-04",'010-3333-3333','dddd1234@naver.com','제주도 종달리 종달새가 우는 어딘가에서','가옥 1200-22',1,(current_date));
insert into member values(cno,'eee', '$2a$10$6HocWio9vme.2gahpVtEYOBo9JREYsXy7PV8pShlBDbIN87KnXtdu','$2a$10$6HocWio9vme.2gahpVtEYOBo9JREYsXy7PV8pShlBDbIN87KnXtdu', 'eee', "20-01-05",'010-4444-4444','eeee1234@naver.com','인천광역시 부평구 바닷소리가 우렁찬 어딘가','움집 320- 56',1,(current_date));
insert into member values(cno,'admin', '$2a$10$M1Gz5YOMf1LI9XW7L0YF0OrZH3msr5WBNitGhiPqqi.kAUW2IvCfS','$2a$10$M1Gz5YOMf1LI9XW7L0YF0OrZH3msr5WBNitGhiPqqi.kAUW2IvCfS', '관리자', "19-12-25",'010-1717-8282','admin1234@naver.com','부산광역시 해운대로 비싼 집 오션뷰인 어딘가','자이 아파트',9,(current_date));

delete from member where cno=1;


select * from member;


commit;

create table board (
bno int, 
btitle varchar(100), 
bcontent varchar(500), 
bwriter varchar(30), 
bdate date, 
bpw varchar(100),
bimg varchar(100));

insert into board values(1, '게시글1 제목입니다.','게시글1 상세 내용 입니다. 아주아주 많은 글들을 써보아요.','관리자','22-06-28','1111','img1.jpg');
insert into board values(2, '게시글2 제목입니다.','게시글2 상세 내용 입니다. 어느새 여기까지 왔다.','관리자','22-06-29','2222','img2.jpg');
insert into board values(3, '게시글3 제목입니다.','게시글3 상세 내용 입니다. 오늘 하루는 무슨 일들이 생길까?','관리자','22-06-30','3333','img3.jpg');
insert into board values(4, '게시글4 제목입니다.','게시글4 상세 내용 입니다. 가자! 미래로!.','관리자','22-07-01','4444','img4.jpg');
insert into board values(5, '게시글5 제목입니다.','게시글5 상세 내용 입니다. 많은 추억들이 생겼구나.','관리자','22-07-02','5555','img5.jpg');
insert into board values(6, '게시글6 제목입니다.','게시글6 상세 내용 입니다. 시간이 벌써 이렇게 되었어.','관리자','22-07-03','6666','img6.jpg');
insert into board values(7, '게시글7 제목입니다.','게시글7 상세 내용 입니다. 드디어 눈물의 종강.','관리자','22-08-19','7777','img7.jpg');

select * from board;

ALTER TABLE board add visited int;
ALTER TABLE board modify bdate date default(current_date);
ALTER TABLE board modify bno int not null primary key AUTO_INCREMENT;
ALTER TABLE board add regdate date default(current_date);

commit;

create table payment (
payno int primary key,
paytool varchar(50) not null, 
paycost varchar(100), 
paydate date,
paynum int, 
cid varchar(30) not null,
ctel varchar(100) not null, 
cmail varchar(100), 
cadd1 varchar(100), 
cadd2 varchar(100),
grade int);

insert into payment values(1, '카드','35,000','22-05-05',2,'aaa','010-0000-0000','aaaa1234@naver.com','서울특별시 하남구 동남쪽 어딘가','아파트에서 또는 전원주택',1);
insert into payment values(2, '무통장입금','9,000','22-05-05',2,'bbb','010-1111-1111','bbbb1234@naver.com','서울특별시 동서남구 동남쪽 어딘가','아파트에서 또는 전원주택',1);
insert into payment values(3, '계좌이체','100,000','22-07-05',1,'ccc','010-2222-2222','cccc1234@naver.com','경기도 고양시 일산동구 북쪽 하늘아래','전원주택 1002',1);
insert into payment values(4, '카드','49,000','22-06-15',3,'ddd','010-3333-3333','dddd1234@naver.com','제주도 종달리 종달새가 우는 어딘가에서','가옥 1200-22',1);
insert into payment values(5, '무통장입금','59,900','22-07-03',5,'eee','010-4444-4444','eeee1234@naver.com','인천광역시 부평구 바닷소리가 우렁찬 어딘가','움집 320- 56',1);
insert into payment values(6, '카드','79,800','22-04-16',2,'aaa','010-1231-4546','ffff1234@naver.com','강원도 강릉의 바닷소리가 사르르 들리는 단독주택','별장 322- 76',1);

select * from payment;
drop table payment;
commit;
------------------------------------------------------------------
create table product (
pcode varchar(30) primary key, 
pname varchar(50) not null, 
pcost varchar(20) not null, 
pcok varchar(200), 
pamunt int, 
pimg1 varchar(60), 
pimg2 varchar(100));

insert into product values('A1001', '도라에몰 주머니','30,000원','아이템 보관에 용이한 도라에몽 주머니입니다. 갖고싶으실 거에요.','2','bag1.png','bag1.jpg' );
insert into product values('G1001', '엘프족의 금발머리 피스','50,000원','당신도 엘프족과 같이 찰랑찰랑한 금발을 연출 할 수 있습니다. 품절임박!!','1','hair.png','hair.jpg' );
insert into product values('B1001', '고무고무열매','40,000원','이 열매를 먹으면 1시간 동안 몸이 고무고무처럼 늘어나 유연성이 높아집니다. 쭈~~욱 희귀템을 놓치지 마세요.','1','gomu1.png','gomu1.jpg' );
insert into product values('C1001', '해리의 투명망토','90,000원','이 망토를 쓰면 착한사람에게만 당신이 보여지게 될 것 입니다.','2','mangto1.png','mangto1.jpg' );
insert into product values('D1001', '코딱지 젤리와 꾀병주스','50,000원','긴급상황에 요긴하게 쓰일 것입니다. 단품구매 안됨.','1','set1.png','set1.jpg' );
insert into product values('E1001', '패트와 매트의 달과자 크래커','15,000원','패트와 매트와 함께 달사에 가서 직접 썰어 온 진품입니다. 가품에 속지 마세요.','5','moon1.png','moon1.jpg' );
insert into product values('F1001', '반지의 제왕의 이클립스 별빛','80,000원','어두울 때 손전등 대신 사용해 보세요. 아주 환하게 밝혀줄 것입니다.','3','light.png','light.jpg' );

select * from product;

use myshop;
desc product;

ALTER TABLE product add pno int primary key auto_increment;
alter table product modify pcode varchar(30) not null;
ALTER TABLE product MODIFY COLUMN pno int FIRST;
ALTER TABLE product add come date default(current_date);
alter table product drop primary key;
commit;
------------------------------
create table databank (seq int not null PRIMARY KEY AUTO_INCREMENT , title varchar(100), fileurl varchar(100), autor varchar(100) ); 

insert into databank(title, fileurl,autor) values('파일1','go.png','작성인1');
select * from databank;







create table category( cname varchar(100), ccode varchar(50), ccoderef varchar(100));
insert into category values('대분류1','A1001','소분류1');
insert into category values('대분류2','B1001','소분류2');
insert into category values('대분류3','C1001','소분류3');
insert into category values('대분류4','D1001','소분류4');

select * from category;
commit;


create table cart(
	cno int,		
	cid varchar(30) primary key,	
	pcode varchar(20),		
	pcolor varchar(30),	
	pamunt int not null,	
	getdate date); 
    
select * from cart;    
    
    insert into cart values(1,'aaa','A1001','babypink',2,sysdate());
    
    insert into cart values(2,'bbb','B1001','yellow',2,sysdate());
    insert into cart values(3,'ccc','C1001','black',5,sysdate());
    insert into cart values(4,'ddd','D1001','white',1,sysdate());
    insert into cart values(5,'eee','E1001','coral',7,sysdate());
    
	commit; 
    
    use myshop;
    
    drop table qna;
    
    create table qna(qno int not null PRIMARY KEY AUTO_INCREMENT,
	qtitle varchar(100),
	qcontent varchar(100),
    qwriter varchar(50),
    qwritedate date default(sysdate()),
    qreadcnt int,
    qroot int,
    qstep int,
    qindent int);
    
    select * from qna;
    
    insert into qna values(qno,'상품 문의 글 1번','상품 문의글 내용 1번','고객1',sysdate(),0,0,0,0);
	insert into qna values(qno,'상품 문의 글 2번','상품 문의글 내용 2번','고객2',sysdate(),0,0,0,0);
	insert into qna values(qno,'상품 문의 글 3번','상품 문의글 내용 3번','고객3',sysdate(),0,0,0,0);
	insert into qna values(qno,'상품 문의 글 4번','상품 문의글 내용 4번','고객4',sysdate(),0,0,0,0);
	insert into qna values(qno,'상품 문의 글 5번','상품 문의글 내용 5번','고객5',sysdate(),0,0,0,0);
	insert into qna values(qno,'상품 문의 글 6번','상품 문의글 내용 6번','고객6',sysdate(),0,0,0,0);
    
    commit;
    
	select * from search;
    
    create table search (search varchar(50), keyword varchar(50));
    
    insert into search values ('검색어1','키워드1');
    insert into search values ('검색어2','키워드2');
    insert into search values ('검색어3','키워드3');
    insert into search values ('검색어4','키워드4');
    
    commit;
        
                        
	

