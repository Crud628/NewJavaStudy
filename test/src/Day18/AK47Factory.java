package Day18;

public class AK47Factory implements GunFactory{

	@Override
	public Gun produce() {
		// TODO Auto-generated method stub
		return new Ak47();
	}
	
}
