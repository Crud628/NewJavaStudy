package Day07;

public class Bike extends Vehicle{
	private String name;
	private double weight;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("bike run");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
	}

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(String name, double weight) {
		super(name, weight);
		// TODO Auto-generated constructor stub
	}
	
	public void speak() {
		System.out.println("叮铃叮铃");
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", weight=" + weight + "]";
	}
	
}
