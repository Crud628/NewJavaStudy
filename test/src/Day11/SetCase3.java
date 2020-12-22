package Day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//case 3: 创建类Person
//成员变量   String name
//Integer age
//String hire_time  入职时间
//创建集合 添加员工  建议使用  list  ArrayList
//张一  21  20200502001
//王二  22  20200502002
//李三  23  20191207001
//孙四  24  20191129001
//张五  25  20200502003
//赵六  26  20190105001
//小张一  27  20201001001
//
//1）找到入职时间最早的员工，并输出员工信息
//2）找到2020年5月2日入职的员工，并输出员工信息  已知条件  20200502
//3）删除名字中 含 “张”的员工（要求：使用迭代器）
public class SetCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("张一",21,"20200502001"));
		list.add(new Person("王二",22,"20200502002"));
		list.add(new Person("李三",23,"20191207001"));
		list.add(new Person("孙四",24,"20191129001"));
		list.add(new Person("张五",25,"20200502003"));
		list.add(new Person("赵六",26,"20190105001"));
		list.add(new Person("小张一",27,"20201001001"));
		
		Person min = list.get(0);
		for (Person person : list) {
			if(min.getHire_time().compareTo(person.getHire_time())>0) {
				min = person;
			}
		}
		System.out.println(min);
		
		for (Person person : list) {
			if(person.getHire_time().substring(0,8).equals("20200502")) {
				System.out.println(person);
			}
		}
		
		List<Person> l = new ArrayList<Person>();
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			if(p.getName().contains("张")) {
				l.add(p);
			}
		}
		list.removeAll(l);
		System.out.println(list);
		
	}

}
