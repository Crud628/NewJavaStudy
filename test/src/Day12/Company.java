package Day12;

public class Company {
	private String id;
	private String name;
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + "]";
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
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
