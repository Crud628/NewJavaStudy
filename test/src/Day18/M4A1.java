package Day18;

public class M4A1 implements Gun{
	private String name;
	private Integer clipNum;
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
	public M4A1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public M4A1(String name, Integer clipNum) {
		super();
		this.name = name;
		this.clipNum = clipNum;
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("m4a1 attack");
	}
	
}
