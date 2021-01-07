# MySql笔记Day1



```mysql
--Mysql的注释
#单行注释      或者--
/*
多行注释
*/

#1.对表的操作DDL（数据定义语言）
--1.1  创建表
/*
create table 表名（
字段1 类型  长度  约束,
字段2 类型  长度  约束，
...
字段n 类型  长度  约束
）*/
create table student(
    id varchar(20) primary key,
    name varchar(50),
    gender varchar(10),
    department varchar(50),
    age int(3)
);
--1.2  删除表（）drop table 表名
drop table student;
drop table if exists student;    --mysql独有
--1.3  desc/describe 表名;

--1.4  修改表结构之重命名
--  alter table 表名  rename to 新表名;
alter table emp rename to emp1;

--1.5  修改表结构之删除字段
alter table emp1 drop column id;--可以删除主键

--1.6  修改表结构之增加字段
alert table emp1 add age varchar(30);

--1.7  修改表结构之修改字段
alter  table emp1 change age age1 varchar(10)
--alter table 表名 rename column 原字段 to 新字段  Oracle的写法

--1.8  修改表结构之修改字段长度
--alter table 表名  modify 字段名  字段类型
alter table emp1  modify age1  VARCHAR(30)

#2.  对数的操作DML(数据控制语言)
--2.1  插入数据
insert into student values('1','张三','男','软件工程','18');
insert into student(name,id,department) values('李四','2','计算机');

--mysql可以批量添加数据，oracle不行
insert into student values('4','王五','女','信管',18),('5','赵四','男','信息化',18)

--2.2  删除数据
-- delete from 表名 where 条件
delete from student;--删除所有数据
delete from student where name=‘李四'

--2.3  修改数据
--update 表名 set 字段1=值，字段2=值[where 条件]
--把软件工程的女学生全部调到信管去
update student set department = '信管' where gender = '女' and department = '软件工程'
--把软件工程男生的年龄加一岁
update student set age = age+1 where gender = '男' and department = '软件工程'


#3.select查询（单表）***重点掌握***
/*
select 字段列表
form 表名
[where 过滤条件]
[group by 分组后过滤条件 having分组后过滤条件]
[order by 排序字段 asc|desc]

--3.1  select语句
/*
可以用以下方式指定地段列表，
* 字段列表位数据源的全部字段
字段列表;指定所需要显示的列
给字段指定别名用as（as可以省略）
*/
select * from member
select id,name,sex from member
select id as 学号,name 姓名,sex 性别 from member

--谓词distinct的使用，过滤结果集中的重复数据
--查询所有的专业
select distinct department from student;

--3.2  from语句
--3.3  where语句
--3.3.1  比较运算符（=，>,<,>=,<=,!=）
--3.3.2  逻辑运算符（and并且，or或者，not否定）
--注意，and的优先级高于or！！！
--思考：拆线呢计算机专业和软件工程专业里年龄大于18岁的信息

select name from student where department = ‘软件工程’ or ‘计算机’ and age>18

--3.3.3  其他运算符（in,between and,not in）
--in 后面接一个离散的数据集合
--between and 指定一个范围，包含边界
select * from student where department
in('计算机','软件工程') and age>18;

--3.3.4  利用like模糊查询
--% 匹配0个活多个任意字符
--  匹配一个任意字符
-- 查询名字是3个字符的，包含'王'的学生信息
select * from student where name like '王_'
or name like '_王' or name like '_王_';

--3.4  聚合函数
--累加求和  sum()
--平均值   avg（）
--求最大值 max()
--求最小值 min()
--求最小值 count()
--注意：数据的格式化输出用round 
select SUM(salary) 总工资 from member
select avg(salary) from member
SELECT ROUND(AVG(salary),2) from member;
--不用AVG函数求平均工资
select SUM(salary)/COUNT(salary) from member


--3.5 group by分组
--注意：分组后，select后面只能接分组字段和基于分组的聚合函数
--统计每个部门的最高的部员
select department,max(salary) from member group by deparment;

-- 思考：查询最高工资高于5000元的部门
select department from member group by department having max(salary)>5000;
-- 思考：统计男员工平均工资高于4000元的部门
select department from member where sex = '男' group by department having avg(salary)>5000;
-- 思考：由于小刘离职了，请删除小刘的数据
delete * from member where name = '小刘';
-- 思考：把全部员工的工资涨200块钱
update member set salary = salary +200;
-- 思考：把吴工调到市场部
update mamber set department = '市场部' where name = '吴工';
-- 思考：工资5000以上（包含5000）涨300元，5000以下涨500元
update member set salary =(case when salary>=500 then salary + 300 else salary + 500 end);
-- 思考：查询部门为‘市场部’，‘生产部’，‘人力部’，并且工资大于等于2000元以上的男同志的信息
-- 要求：2种写法完成
select * from member where department = '市场部' or '生产部' or '人力部' and salary >=2000 and sex = '男';
select * from member where department in ('市场部','生产部','人力部') and salary >=2000 and sex = '男';
-- 思考：查询名字里包含‘小’的员工信息
select * from member where name like '%小%'
select * from member where LOCATE('小',name) > 0
-- 思考：查询市场部工资在3000至5000元的员工信息 
select * from member where department = '市场部' and salary between 3000 and 5000;
select * from member where department = '市场部' and salary>3000 and salary <5000;
```



