package Day06;

public class Parrot extends Bird {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Parrot  speak");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Parrot eat");
	}

	public Parrot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parrot(String name, int age, String sex) {
		super(name, age, sex);
		// TODO Auto-generated constructor stub
	}

}
