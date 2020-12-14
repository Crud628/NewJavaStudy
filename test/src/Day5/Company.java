package Day5;

import java.util.Arrays;

public class Company {
	String id;
	String name;
//	Member[] members;
	Member[] members = {null,null,null,null,null};
	public Company(String id, String name, Member[] members) {
		super();
		this.id = id;
		this.name = name;
		this.members = members;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "公司信息[公司ID=" + id + ", 公司名称：" + name + ", 下属员工" + Arrays.toString(members) + "]";
	}
	
	
}
