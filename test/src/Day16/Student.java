package Day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {
	private String name; // 姓名
	private Integer age; // 年龄
	private Map<String, Integer> scoreSheet; // 成绩单

	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Map<String, Integer> getScoreSheet() {
		return scoreSheet;
	}

	public void setScoreSheet(Map<String, Integer> scoreSheet) {
		this.scoreSheet = scoreSheet;
	}

	//添加一科成绩
	public void addScore(String subject,int score) {
		if(this.scoreSheet==null) {
			this.scoreSheet=new HashMap<String, Integer>();
		}
		this.scoreSheet.put(subject, score);
	}

	@Override
	public String toString() {
//		return "Student [name=" + name + ", age=" + age + ", scoreSheet=" + scoreSheet + "]";
		Set<Entry<String,Integer>> set=this.scoreSheet.entrySet();
		StringBuilder stb=new StringBuilder();
		for(Entry<String,Integer> each:set) {
			stb.append(this.name);
			stb.append(",");
			stb.append(this.age);
			stb.append(",");
			stb.append(each.getKey());
			stb.append(",");
			stb.append(each.getValue());
			stb.append("\r\n");
		}
		return stb.toString();
	}


}
