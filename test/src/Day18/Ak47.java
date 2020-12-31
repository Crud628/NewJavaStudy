package Day18;

public class Ak47 implements Gun{
	private String name;
	private Integer clipNum;
	public Ak47(String name, Integer clipNum) {
		super();
		this.name = name;
		this.clipNum = clipNum;
	}
	public Ak47() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getClipNum() {
		return clipNum;
	}
	public void setClipNum(Integer clipNum) {
		this.clipNum = clipNum;
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Ak47 attack");
	}
	
}
