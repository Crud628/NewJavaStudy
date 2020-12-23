package Day12;

public class Member {
	private String id;
	private String name;
	private String sex;
	private String p_class;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String id, String name, String sex, String p_class) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.p_class = p_class;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getP_class() {
		return p_class;
	}
	public void setP_class(String p_class) {
		this.p_class = p_class;
	}
	@Override
	public String toString() {
		return "\nMember [id=" + id + ", name=" + name + ", sex=" + sex + ", p_class=" + p_class + "]";
	}
	
}
