package Day13;

public class Student {
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) throws NameFormatExcption{
		boolean flag = true;
		for (int i = 0; i < name.length(); i++) {
			if(Character.isDigit(name.charAt(i))) {
				flag = false;
				break;
			}
		}
		if(flag) {
			this.name = name;
		}else {
			NameFormatExcption n = new NameFormatExcption(name);
			throw n;
		}
		
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
