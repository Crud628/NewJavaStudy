package Day17;

public class FoxBoss {
	private String name;
	private Integer blood;
	
	private static FoxBoss instance;
	
	
	private FoxBoss() {
		super();
	}

	private FoxBoss(String name, Integer blood) {
		super();
		this.name = name;
		this.blood = blood;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBlood() {
		return blood;
	}

	public void setBlood(Integer blood) {
		this.blood = blood;
	}

	public static FoxBoss getInstance() {
		if (instance == null) {
			instance = new FoxBoss("令狐冲", 999);
		}
		return instance;
	}

	public static void setInstance(FoxBoss instance) {
		FoxBoss.instance = instance;
	}
	
	public void underAttack() {
		this.blood--;
	}
}
