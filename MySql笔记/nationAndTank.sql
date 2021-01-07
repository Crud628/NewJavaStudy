drop table if exists nation;

create table nation(
ID varchar(10) primary key,
NAME varchar(40));

-- 插值语句 
insert into nation values ('1','中国');
insert into nation values ('2','美国');
insert into nation values ('3','苏联');
insert into nation values ('4','德国');
insert into nation values ('5','日本');
insert into nation values ('6','英国');
insert into nation values ('7','法国');
insert into nation values ('8','印度');

drop table if exists tank;

create table tank(
ID varchar(10) primary key,
NAME varchar(20),
nid varchar(10));


-- 插值语句 
insert into tank values ('01','ZTZ98','1');
insert into tank values ('02','ZTZ2000','1');
insert into tank values ('03','ShellMan','2');
insert into tank values ('04','M1A2SEP2','2');
insert into tank values ('05','T34','3');
insert into tank values ('06','T72','3');
insert into tank values ('07','T90','3');
insert into tank values ('08','虎','4');
insert into tank values ('09','豹','4');
insert into tank values ('10','豹2','4');
insert into tank values ('11','90式','5');
insert into tank values ('12','水柜','6');
insert into tank values ('13','挑战者','6');
insert into tank values ('14','酋长','6');
insert into tank values ('15','勒克耐尔','7');
insert into tank values ('17','阿琼','9');
insert into tank values('18','梅卡瓦','10');