package com.entity;

public class Member {
	private int id;
	private String name;
	private String sex;
	private int salary;
	private String department;
	private int age;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(int id, String name, String sex, int salary, String department, int age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.salary = salary;
		this.department = department;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", sex=" + sex + ", salary=" + salary + ", department="
				+ department + ", age=" + age + "]";
	}
	
}
