

### 1. 找出高于公司所有员工的平均工资的男员工数和女员工数

#### SQL文

```mysql
SELECT
	sex 性别,
	count( salary ) 超过平均工资人数
FROM
	member 
WHERE
	salary > ( SELECT avg( salary ) FROM member ) 
GROUP BY
	sex

-- 针对女生为空的补0写法
select s.sex 性别,ifnull(num,0) 超过平均工资的人数 
from (select sex from member group by sex) s 
left join (
SELECT sex, count( salary ) num  FROM member where salary > (select avg(salary) from member) GROUP BY sex ) m 
on s.sex = m.sex
```



#### 结果

| 性别 | 超过平均工资人数 |
| ---- | ---------------- |
| 男   | 4                |



| 性别 | 超过平均工资的人数 |
| ---- | ------------------ |
| 男   | 4                  |
| 女   | 0                  |

------



### 2.得到每个部门最高工资对应的员工

#### SQL文

```mysql
SELECT member.NAME,mm.department,mm.`工资` 
FROM member,
(SELECT department,max( salary ) 工资 FROM member GROUP BY department ) mm 
WHERE
	member.department = mm.department 
	AND member.salary = mm.`工资`
```

#### 结果

| NAME         | department | 工资  |
| ------------ | ---------- | ----- |
| 小王         | 市场部     | 3500  |
| 小李         | 销售部     | 1800  |
| 小赵视图修改 | 财务部     | 2000  |
| 大黄         | 市场部     | 3500  |
| 吴工         | 生产部     | 4500  |
| 老胡         | 人力部     | 7500  |
| 张41         | 法务部     | 6800  |
| 阿斌         | 总务部     | 20000 |



------



### 3.列举出考试成绩在60份-80分之间的人名及成绩

#### SQL文

~~~mysql
select
	name,
	score.score
from
	stu,
	score
where
	stu.id = score.sid
	and score.score between 60 and 80
~~~



#### 结果

| name | score |
| ---- | ----- |
| 王五 | 75    |
| 王五 | 76    |
| 王五 | 77    |
| 王五 | 78    |
| 王五 | 79    |
| 赵六 | 65    |
| 赵六 | 66    |
| 钱七 | 67    |

------



### 4.查询高于各科平均分的学生考试成绩查询结果集中，显示的字段有：学号，名字，科目，分数，该科目平均分

#### SQL文

```mysql
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
```

#### 结果

| 学号 | 姓名 | 科目       | 分数 | 该科目平均分 |
| ---- | ---- | ---------- | ---- | ------------ |
| 1    | 张三 | 国学1      | 95   | 80.5000      |
| 1    | 张三 | 高数1      | 96   | 83.0000      |
| 1    | 张三 | 大物       | 97   | 87.0000      |
| 1    | 张三 | 编译原理   | 98   | 87.0000      |
| 1    | 张三 | 数据结构   | 99   | 88.5000      |
| 1    | 张三 | C语言      | 85   | 82.0000      |
| 2    | 李四 | 数据库原理 | 87   | 77.0000      |
| 2    | 李四 | 高数1      | 88   | 83.0000      |
| 2    | 李四 | 大物       | 89   | 87.0000      |

------



### 5.统计每个部门最低工资者信息

#### SQL文

```mysql
SELECT member.* 
FROM member,
(SELECT department,min( salary ) 工资 FROM member GROUP BY department ) mm 
WHERE
	member.department = mm.department 
	AND member.salary = mm.`工资`
```

#### 结果

| id   | name         | sex  | salary | department | age  |
| ---- | ------------ | ---- | ------ | ---------- | ---- |
| 1    | 小王         | 男   | 3500   | 市场部     | 23   |
| 2    | 小李         | 女   | 1800   | 销售部     | 21   |
| 3    | 小刘         | 男   | 2300   | 生产部     | 24   |
| 4    | 小赵视图修改 | 女   | 2000   | 财务部     | 45   |
| 5    | 大黄         | 男   | 3500   | 市场部     | 26   |
| 7    | 小孙         | 男   | 3600   | 法务部     | 27   |
| 8    | 老胡         | 男   | 7500   | 人力部     | 28   |
| 9    | 温哥         | 男   | 10000  | 总务部     | 23   |

### 6.统计高于各部门平均工资的员工信息

#### SQL文

```mysql
select * from member where salary > (select avg(salary) from member)
```

#### 结果

| id   | name | sex  | salary | department | age  |
| ---- | ---- | ---- | ------ | ---------- | ---- |
| 8    | 老胡 | 男   | 7500   | 人力部     | 28   |
| 9    | 温哥 | 男   | 10000  | 总务部     | 23   |
| 41   | 张41 | 男   | 6800   | 法务部     | 44   |
| 55   | 阿斌 | 男   | 20000  | 总务部     | 20   |

