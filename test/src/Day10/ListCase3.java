package Day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//case 3:创建一个封装类！！ Member
//成员变量   String name员工姓名 张一~张五
//        Integer age 员工年龄 21~25
//        创建一个List接口 ArrayList实现类的集合  泛型为Member
//        创建5个Member对象放入集合中
//        
//       1）使用index（下标遍历） 改变张三年龄为28  （已知信息为张三这个名字）
//       2）使用foreach遍历 删除年龄为25的员工 
//       3）使用迭代器，输出所有Member信息
public class ListCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> members = new ArrayList<Member>();
		members.add(new Member("张一",21));
		members.add(new Member("张二",22));
		members.add(new Member("张三",23));
		members.add(new Member("张四",24));
		members.add(new Member("张五",25));
		
		for (int i = 0; i < members.size(); i++) {
			if(members.get(i).getName().equals("张三")) {
				members.get(i).setAge(28);
			}
		}
		
		System.out.println(members);
		
		int flag = 0;
		for (Member member : members) {
			if(member.getAge()==25) {
				flag = members.indexOf(member);
			}
		}
		members.remove(flag);
		System.out.println(members);
		
		Iterator<Member> it = members.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
