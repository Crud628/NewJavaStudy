drop table if exists subject;
drop table if exists stu;
drop table if exists score;

create table subject(
id int primary key,
name varchar(50)
);
create table stu(
id int primary key,
name varchar(50)
);
create table score(
id int primary key,
sid int,
sbjid int,
score int
);

insert into subject values (1,'国学1');
insert into subject values (2,'高数1');
insert into subject values (3,'大物');
insert into subject values (4,'编译原理');
insert into subject values (5,'数据结构');
insert into subject values (6,'C语言');
insert into subject values (7,'Java语言');
insert into subject values (8,'数据库原理');
insert into subject values (9,'VB');

insert into stu values(1,'张三');
insert into stu values(2,'李四');
insert into stu values(3,'王五');
insert into stu values(4,'赵六');
insert into stu values(5,'钱七');
insert into stu values(6,'孙八');
insert into stu values(7,'周九');

insert into score values(1,1,1,95);
insert into score values(2,1,2,96);
insert into score values(3,1,3,97);
insert into score values(4,1,4,98);
insert into score values(5,1,5,99);
insert into score values(6,1,6,85);
insert into score values(7,2,7,86);
insert into score values(8,2,8,87);
insert into score values(9,2,2,88);
insert into score values(10,2,3,89);
insert into score values(11,3,3,75);
insert into score values(12,3,4,76);
insert into score values(13,3,8,77);
insert into score values(14,3,5,78);
insert into score values(15,3,6,79);
insert into score values(16,4,2,65);
insert into score values(17,4,1,66);
insert into score values(18,5,8,67);