package Day07;

public class Car extends Vehicle{
	private String name;
	private double weight;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Car run");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String name, double weight) {
		super(name, weight);
		// TODO Auto-generated constructor stub
	}
	
	public void talk() {
		System.out.println("滴滴");
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", weight=" + weight + "]";
	}
	
}
