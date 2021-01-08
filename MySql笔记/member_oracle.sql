drop table member;

create table member(
id number(5,0) primary key,
name varchar2(30),
sex varchar2(6),
salary number(5,0),
department varchar2(30)
);

insert into member values(1,'小王','男',1500,'市场部');
insert into member values(2,'小李','女',1800,'销售部');
insert into member values(3,'小刘','男',2300,'生产部');
insert into member values(4,'小赵','女',2000,'财务部');
insert into member values(5,'大黄','男',3500,'市场部');
insert into member values(6,'吴工','女',4500,'生产部');
insert into member values(7,'小孙','男',2600,'生产部');
insert into member values(8,'老胡','男',7500,'人力部');
insert into member values(9,'温哥','男',10000,'总务部');