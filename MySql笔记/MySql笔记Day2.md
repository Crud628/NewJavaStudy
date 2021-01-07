# MySql笔记Day2



```mysql
-- 补充数据
create table company(
		id int(2) zerofill primary key,
		name varchar(50)
);
INSERT INTO `company` VALUES (01, '蜀国分公司');
INSERT INTO `company` VALUES (02, '吴国分公司');
INSERT INTO `company` VALUES (03, '魏国分公司');
INSERT INTO `company` VALUES (04, '西南夷分公司');


-- 1. 得到公司所有的部门
select department from member GROUP BY department
select distinct department from member 
-- 2.得到每个部门及其人数
SELECT
	department,
	count(*) 
FROM
	member 
GROUP BY
	department
-- 3. 得到每个部门的最高工资
select department,max(salary) from member
-- 4. 得到公司中男员工以及女员工的人数
select sex,count(*) from member group by sex;
-- 5. 取得公司男员工和女员工的平均工资 
select sex,avg(salary) from member group by sex;



-- 1. 统计每个部门的最低工资
select department,min(salary) from member group by department;
-- 2. 统计各个部门女员工的最高工资
select department,max(salary) from member where sex = '女' group by department;
-- 3. 统计各部门年龄大于23岁的员工平均工资
select department,avg(salary) from member where age > 23 group by department;
-- 4. 统计各个部门年龄大于23岁的男员工的平均工资
select department,avg(salary) from member where age > 23 and sex = '男' group by department;
```



## 多表查询

~~~mysql
/*
笛卡尔积
	设A、B为集合，用A中的元素作x为第一元素，
	B中的元素y作用第二元素，构成有序对，
	对所有这样的有序对组成的集合叫做A和B的笛卡尔积   记作AxB
	{a,b}   {1,2,3}  {a1,a2,a3,b2,b2,b3,c1,c2,c3}
注意：
	a.两个表关联查询，如果不公开列，查询的结果就是笛卡尔积
	b.笛卡尔积里很多记录都是没有意义的
	c.两个表关联查询，无体检加上公共列，避免笛卡尔积
*/
-- 两表关联
select * from nation,tank where nation.ID = tank.nid

-- 统计各个国家的坦克数量
select nation.name,count(*) from nation,tank where nation.ID = tank.nid group by nation.name

-- 能产生2种以上的坦克是哪些国家
SELECT
	nation.NAME,
	count(*) a
FROM
	nation,
	tank 
WHERE
	nation.ID = tank.nid
GROUP BY
	nation.NAME
HAVING 
	a > 2
	
-- 哪些国家只能生产一种坦克
select nation.name,count(*) from nation,tank where nation.ID = tank.nid group by nation.name having count(*) = 1
	
# 1.  表连接
# 1.1  交叉链接
-- from 表1 cross join 表2;  交叉链接
-- 注意：查询结果是笛卡尔积，基本不用
select * from nation cross join tank

# 1.2  内连接
-- select * from 表1[inner] join 表2 on 表1和表2的公共列
-- 注意：查询结果是两个表的共同部分
select * from nation join tank on nation.id = tank.nid

# 1.3  外连接
-- 1.3.1 左连接
-- from表1 left join 表2 on 表1和表2的公共列
-- 注意：以左边的表为基础，去链接右边的表。左边表的数据会全部显示，右边表没有的以null代替
select * from nation left join tank on nation.id = tank.id

# 1.3.2 右链接
-- from 表1 right join 表2 on 表1和表2的公共列
-- 注意：以右边表位基础，去除左边的表。右边的表里数据全部显示，左边表没有的以null代替

# 1.3.3 全连接  oracle好用，mysql不好用
-- from table1 full join table2 on ...
select * from nation full join tank on nation.id = tank.nid

# 1.4  自链接
-- 链接的两个表，其实是一个表。为了区分每一次的使用，给表取不同的别名
-- 查询员工和直属经理的工资差距
select emp.name,emp.salary,mg.name,mg.salary - emp.salary from emptest emp left join emptest mg on emp.name = mg.name

#2 交集、并集、差集
--2.1 利用union/union all 得到并集
-- union：会自动去除重复的数据
-- union all：会允许重复的数据
-- 查询中国、美国生产的坦克
select nation.name,tank.name from nation,tank
where nation.id = tank.nid
and nation.name in ('中国','美国')
union
select nation.name,tank.name from nation,tank
where nation.id = tank.nid and nation.name in('中国','德国')

--2.2 利用minus得到差集  oracle好用！mysql不好用！
select nation.name,tank.name
from nation,tank where nation.id = tank.nid
and nation.name in ('中国','美国')
minus
select nation.name,tank.name
from nation,tank where nation.id = tank.nid
and nation.name in ('中国','德国')

--2.3 利用intersect得到交集  oracle好用！mysql不好用！
select nation.name,tank.name
from nation,tank where nation.id = tank.nid
and nation.name in ('中国','美国')
intersect
select nation.name,tank.name
from nation,tank where nation.id = tank.nid
and nation.name in ('中国','德国')
~~~



~~~mysql
-- 思考：大物的最高分和最低分
SELECT
	subject.`name`,
	max(score),
	min(score) 
FROM
	subject,
	score 
WHERE
	subject.id = score.sbjid
	AND subject.name = '大物' 
GROUP BY
	subject.name
	
#1.1 select子查询：把结果查询当作一个字段来使用
-- 思考：大物的最高分和最低分
-- 子查询：查询大物最高分
select max(score) from score where sbjid = '3'
-- 子查询：查询大物最低分
select min(score) from score where sbjid = '3'
-- 最终效果
select name,子查询,子查询 from subject where name = '大物'

#1.2 where 子查询：
-- 例子1：查询结果当成一个数据来使用
-- 思考：高于平均分的记录
-- 子查询：查询平均分
select stu.name,subject.name,score
from stu,subject,score
where stu.id = score.sid
	and subject.id = score.sbjid
	and score >= (select avg(score) from score)


-- 例子2：查询结果当作一个集合来使用
-- 思考：列举出有考试成绩的科目
-- 方法1：
select distinct subject.name from subject left jion score on
subject.id = score.sbjid where score.id is not null

-- 方法2：
-- 子查询：查询有考试成绩的科目编号
select name from subject where id in(select distinct sbjid from score)

# 1.3 from 子查询
-- 查询结果当作一个表来使用
-- 找到男员工中工资最低者和女员工中工资最低者
-- 子查询：查询男女员工的最低工资
select sex,min(salary) from member group by sex
-- 最低查询
SELECT member.* FROM member,( SELECT sex, min( salary ) 最低工资 FROM member GROUP BY sex ) mm 
WHERE
	member.sex = mm.sex 
	AND member.salary = mm.最低工资;


~~~





## 练习题

~~~mysql
-- 思考：找出高于公司所有员工的平均工资的男员工数和女员工数
SELECT sex, count( salary )  FROM member where salary > (select avg(salary) from member) GROUP BY sex 

-- 针对女生为空的补0写法
select s.sex 性别,ifnull(num,0) 超过平均工资的人数 
from (select sex from member group by sex) s 
left join (
SELECT sex, count( salary ) num  FROM member where salary > (select avg(salary) from member) GROUP BY sex ) m 
on s.sex = m.sex

-- 思考：得到每个部门最高工资对应的员工
SELECT member.NAME,mm.department,mm.`工资` 
FROM member,
(SELECT department,max( salary ) 工资 FROM member GROUP BY department ) mm 
WHERE
	member.department = mm.department 
	AND member.salary = mm.`工资`
	
-- 思考：列举出考试成绩在60份-80分之间的人名及成绩
select name,score.score from stu,score where stu.id = score.sid and score.score between 60 and 80


-- 思考：查询高于各科平均分的学生考试成绩查询结果集中，显示的字段有：学号，名字，科目，分数，该科目平均分
-- 各课平均分
select sbjid,avg(score) avg from score group by sbjid
-- 所有学生的所有成绩
SELECT
	stu.id,
	stu.NAME,
	SUBJECT.NAME,
	score.score
FROM
	stu,
	SUBJECT,
	score
WHERE
	stu.id = score.sid 
	AND SUBJECT.id = score.sbjid
-- 最终结果
SELECT
	s.id 学号,
	s.`NAME` 姓名,
	s.cname 科目,
	s.score 分数,
	m.avg 该科目平均分 
FROM
	(
	SELECT
		stu.id,
		stu.NAME,
		SUBJECT.id cid,
		SUBJECT.NAME cname,
		score.score 
	FROM
		stu,
		SUBJECT,
		score 
	WHERE
		stu.id = score.sid 
		AND SUBJECT.id = score.sbjid 
	) s,
	( SELECT sbjid, avg( score ) avg FROM score GROUP BY sbjid ) m 
WHERE
	s.cid = m.sbjid 
	AND s.score > m.avg


-- 思考：统计每个部门最低工资者信息
SELECT member.* 
FROM member,
(SELECT department,min( salary ) 工资 FROM member GROUP BY department ) mm 
WHERE
	member.department = mm.department 
	AND member.salary = mm.`工资`
	

-- 思考：统计高于各部门平均工资的员工信息
select * from member where salary > (select avg(salary) from member)
~~~

