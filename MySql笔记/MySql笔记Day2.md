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



