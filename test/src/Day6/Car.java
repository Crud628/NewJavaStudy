package Day6;

public class Car {
	private String name;
	private String length;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String name) {
		super();
		this.name = name;
	}
	public Car(String name, String length) {
		this(name);
		this.length = length;
	}
	
//	public Car fun() {
//		// TODO Auto-generated method stub
//		return this("定制");
//	}

	
	
}
