# MySQL笔记Day3



## 一.函数

### 1.1 decode函数： 

oracle独有

```sql
select id,name,decode(sex,'男','male','女','famale') 
from member
```



### 1.2 if函数：mysql

```mysql
select id,name,if(sex='男','male',sex) from member;
```





### 1.3 concat函数

```mysql
select * from member where name like concat('%','王','%')	--mysql

select * from member where name like concat("CONCAT"('%', '王'),'%')  --oracle
```





### 1.4 case when:

```mysql
select name,
	sum(case subject when '语文' then score else 0 end) 语文,
	sum(case subject when '数学' then score else 0 end) 数学,
	sum(case subject when '英语' then score else 0 end) 英语
from studentscore
group by name;
```






  ## 二.分页：

把查询结果集的部分记录显示出来

- mysql分页用的是limit
- limit[start], length
- 注意：start从0开始



```mysql
select * from member limit 8,4;
```



> 扩展
>
> oracle分页用 rownum
>
> select rownum, member.* from member where rownum=1
>
> select * from (select rownum no, member.* from member) 
> where no > 1

## 三.练习

### 1.思考：查询工资最低的3个员工信息（member）
要求：分页查询（mysql和oracle）

```mysql
select * from member order by salary  limit 3 

select * from (select rownum no, t1.* from
(select * from member order by salary) t1)
where no < 4

```

### 2.思考：查询各人员及所在公司信息

```mysql
select s.id,s.name,s.salesvolume,ifnull(m.`name`,'未知') companyname from sales s left join company m on s.companyid = m.id
```



### 3.思考：得到各公司的人数

```mysql
SELECT
	m.`name`,
	ifnull(cc.num,0)
FROM
	company m left join (
	SELECT
		c.NAME companyname,
		count(*) num 
	FROM
		sales s,
		company c 
	WHERE
		s.companyid = c.id 
	GROUP BY
	c.`name` 
	) cc ON cc.companyname = m.`name`
```



### 4.思考：得到各公司的销售总额

```mysql
SELECT
	m.`name`,
	ifnull(cc.num,0)
FROM
	company m left join (
	SELECT
		c.NAME companyname,
		sum(salesvolume) num 
	FROM
		sales s,
		company c 
	WHERE
		s.companyid = c.id 
	GROUP BY
	c.`name` 
	) cc ON cc.companyname = m.`name`
```



### 5.思考：找出销售业绩最高的个人及所在的公司
两种方法：

```mysql
SELECT
	c.id,
	c.NAME,
	c.salesvolume,
	c.companyname 
FROM
	(
	SELECT
		s.id,
		s.NAME,
		s.salesvolume,
		ifnull( m.`name`, '未知' ) companyname 
	FROM
		sales s
		LEFT JOIN company m ON s.companyid = m.id 
		) c,(
	SELECT
		max( salesvolume ) max 
	FROM
		sales 
	) cc 
WHERE
	c.salesvolume = cc.max
```



```mysql
SELECT
	s.id,
	s.NAME,
	s.salesvolume,
	ifnull( m.`name`, '未知' ) companyname 
FROM
	sales s
	LEFT JOIN company m ON s.companyid = m.id
order by salesvolume desc
LIMIT 1
```



### 6.思考：薪水比andy高的人员名单（emptest）

```mysql
SELECT
	e.id,
	e.NAME,
	e.salary,
	e.mgrname,
	e.deptno,
	e.depyname 
FROM
	emptest e
WHERE
	salary >(
	SELECT
		t.salary 
	FROM
		emptest t
WHERE
	t.NAME = 'andy')
```



### 7.思考：哪个部门的平均薪水最高（emptest）

````mysql
SELECT
	c.avg,
	c.depyname
FROM
	( SELECT depyname, avg( salary ) avg FROM emptest GROUP BY depyname ) c
	ORDER BY c.avg
	limit 1
````



### 8.思考：各个部门中工资大于5000的员工人数

```mysql
SELECT
	c.depyname,
	count(*) 
FROM
	( SELECT id, NAME, salary, mgrname, deptno, depyname FROM emptest WHERE salary > 5000 ) c 
GROUP BY
	c.depyname
```

