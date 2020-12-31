package Day05;

public class Member {
	String id;
	String name;
	String sex;
	String p_class;
	public Member(String id, String name, String sex, String p_class) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.p_class = p_class;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\n职员 [员工卡号：" + id + ", 员工姓名" + name + ", 员工性别" + sex + ", 员工级别=" + p_class + "]";
	}
	
}
