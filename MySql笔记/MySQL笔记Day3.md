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

```



### 3.思考：得到各公司的人数

```mysql

```



### 4.思考：得到各公司的销售总额

```mysql

```



### 5.思考：找出销售业绩最高的个人及所在的公司
两种方法：

```mysql

```



### 6.思考：薪水比andy高的人员名单（emptest）

```mysql

```



### 7.思考：哪个部门的平均薪水最高（emptest）

````mysql

````



### 8.思考：各个部门中工资大于5000的员工人数

```mysql

```

