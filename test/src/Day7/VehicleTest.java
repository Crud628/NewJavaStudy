package Day7;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vehicle v = new Vehicle("Vehicle",100);
//		v.show();
//		v.run();
//		System.out.println("-----------------上转型----------------------");
//		Vehicle v2 = new Car("Car1",200);
//		v2.show();
//		v2.run();
//		System.out.println("-----------------下转型----------------------");
//		Car v3 = (Car)v2;
//		v3.show();
//		v3.run();
//		System.out.println("-----------------批量操作----------------------");
//		Vehicle c1 = new Vehicle();
//		Vehicle c2 = new Car();
//		Vehicle c3 = new Bike();
//		Vehicle c4 = new Vehicle();
//		Vehicle c5 = new Car();
//		Vehicle c6 = new Bike();
//		Vehicle[] vehs = {c1,c2,c3,c4,c5,c6};
//		for (Vehicle vehicle : vehs) {
//			vehicle.run();
//		}
//		
//		for (Vehicle vehicle : vehs) {
//			if(vehicle instanceof Car) {
//				Car c = (Car)vehicle;
//				c.talk();
//			}
//			if (vehicle instanceof Bike) {
//				Bike b = (Bike)vehicle;
//				b.speak();
//			}
//		}
		Vehicle v = new Vehicle("Vehicle",100);
		System.out.println(v);
		
	}

}
