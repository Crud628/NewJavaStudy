package Day11;

public class Person{
	private String name;
	private Integer age;
	private String hire_time;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, Integer age, String hire_time) {
		super();
		this.name = name;
		this.age = age;
		this.hire_time = hire_time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getHire_time() {
		return hire_time;
	}
	public void setHire_time(String hire_time) {
		this.hire_time = hire_time;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", hire_time=" + hire_time + "]";
	}

	
}
