package Day07;

public class Vehicle {
	private String name;
	private double weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Vehicle(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		System.out.println("vehicle  run");
	}
	
	public void show() {
		System.out.println(this.name);
		System.out.println(this.weight);
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", weight=" + weight + "]";
	}
	
}
