package Day7;

public abstract class Animal {
	private String name;
	private int a;
	public Animal(String name, int a) {
		super();
		this.name = name;
		this.a = a;
	}
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	};
	public abstract void talk();
	public abstract void sleep();
}
