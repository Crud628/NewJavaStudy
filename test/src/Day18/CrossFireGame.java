package Day18;

public class CrossFireGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GunFactory m1 = new AK47Factory();
		Gun myWeapons = m1.produce();
		myWeapons.attack();
	}

}
