package Day05;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p1 = new Person();
//		System.out.println(p1.hashCode());
		
		Dog aa = new Dog();
		aa.age=1;
		aa.height=22;
		aa.name = "白白";
		aa.weight = 10;
//		System.out.println(aa.toString());
		
		Dog bb = new Dog();
		bb.age=2;
		bb.height=22;
		bb.name = "黑黑";
		bb.weight = 9;
//		System.out.println(bb.toString());
		Dog[] dogs = {aa,bb};
		for (Dog dog : dogs) {
			System.out.println(dog.age+" "+dog.name);
		}
		
		aa.speak();
		bb.sleep();
	}

}
