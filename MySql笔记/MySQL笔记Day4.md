# MySQL笔记Day4



## 约束

保证数据的完整性



- not null：非空约束
- unique：唯一
- check：检查约束
- default：默认值
- primary key：主键
- foreign key：外键



### 1.1   创建表时指定约束


```mysql
create table tableTest1(
	id int primary key,
    name varchar(20) unique,
    sex varchar(6) default '男',
    age int check(age between 0 and 150),
    department varchar(30) not null
);
```



#### Test

```mysql
-- 添加数据  ok
insert into tableTest1 values(1,'张1','男',20,'计算机');

-- 添加失败 违反name的唯一性约束
insert into tableTest1 values(2,'张1','女',20,'计算机');

-- 添加数据  利用sex的默认值
insert into tableTest1(id,name,age,department) values (3,'张3',22,'计算机')

-- 在8.0版本才实现check约束，所以这里插入成功
insert into tableTest1 VALUES(4,'张4','男',160,'计算机');

-- 添加失败  因为department的非空约束
insert into tableTest1(id,name,age) values (5,'张5',25)
```



### 1.2   复合主键约束

```mysql
--创建表时指定主键
create table tableTest2(
id varchar(16),
name varchar(20),
score varchar(3) not null,
constraint aabb frimary key(id,name)   --复合主键
);
```

#### 创建表之后添加主键

```mysql
alter table tableTest3 add constraint
tableTest3_pri primary key(id,name);
```



#### 删除主键

```mysql
alter table tableTest2 drop primary key;
```



### 1.3  外键约束（Oracle环境）

```mysql
-- 创建表是时指定外键约束
create table nationTest(
	id number(10) primary key,
    name varchar2(20) not null
);

create table tankTest(
	id number(10) primary key,
    name varchar2(20) not null,
    nid number(10),
    forign key(nid) reference nationTest(id)
);
```



#### 创建表之后添加外键约束

```mysql
alter table tankTest1 add constraint foregin_nid
foregin key(nid) references nationTest(id);
```



#### 删除外键约束

 ```mysql
alter table tankTest1 drop constraint foregin_nid;   -- oracle
alter table tankTest1 drop foregin key foregin_nid   -- mysql
 ```



### 1.4  自增ID   

```mysql
create table tableTest3(
	id int primary key auto_increment,
    name varchar(20)
);
```





## 视图

一个sql语句的定义，本质是个虚表

> 与表的区别
>
> ​		表：实实在在存储数据的
>
> ​		视图：虚表，实际只是一个sql语句的定义
>
> ​		视图的作用：
>
> ​		a.安全性。可以创建视图，隐藏表的部分敏感字段
>
> ​		b.简化sql。可以给夺标联查的结果创建视图，进一步查询视图，简化查询sql



### 2.1  视图的创建

```mysql
create or replace view member_view as select id,name.sex.department from member;
```



### 2.2  视图的查询

就和查询单表是一样的，对视图的查询会转为对基本表的查询

```mysql
select * from member_view
```





### 2.3  视图的修改

和对基本表的修改一致

```mysql
-- 对视图的修改都会转为对基本表的修改
update member_view set name='小赵视图修改' where id='4';

create or replace view stuScore_view as
select stu.name student, subject.name subject,
score from stu,subject,score
where stu.id = score.sid and subject.id = score.sbjid;

select * from stuScore_view where student='张三';

insert into stuScore_view values('李四','国学1',98)	--错误，因为视图里是多表
insert into member_view values(11,'张11','男','生产部');--正确，因为视图里是单表
```





## 索引

索引是根据指定的数据库列表  建立起来的顺序



作用

- 提高效率，创建索引不是为了在sql语句中使用，而是可以大大提高系统的性能
- 监督数据，如唯一索引，使其索引指向的列中的数据不重复



### 3.1  创建索引

```mysql
create index index_member_name on member(name);
```





### 3.2  删除索引

```mysql
drop index index_member_name on member(name);
```



## 序列

概念：有规律的数值

###4.1  创建序列

```mysql
create sequence member_id_seq
start with 10
increment by 1 maxvalue 99999  --最大为27个9
nocyle;
```



### 4.2  使用序列

```mysql
-- 下一个序列的值
select member_id_seq.nextval from dual;

-- 查询当前序列的值
select member_id_seq.currval from dual;

insert into member values(member_id_seq.nextval,'张7','男',6500,'生产部');
```



### 4.3  删除序列

```mysql
drop sequence member_id_seq;
```

