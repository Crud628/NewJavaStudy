package Day13;

public class Person {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) throws AgeOutofBoundException {
		if(age>=1&&age<=150) {
			this.age = age;
		}else {
			AgeOutofBoundException e=new AgeOutofBoundException(age);
			throw e;
		}		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

