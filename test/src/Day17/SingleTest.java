package Day17;

public class SingleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoxBoss f1 = FoxBoss.getInstance();
		FoxBoss f2 = FoxBoss.getInstance();
		FoxBoss f3 = FoxBoss.getInstance();
		f1.underAttack();
		f2.underAttack();
		f3.underAttack();
		System.out.println(f1.getBlood());
	}

}
