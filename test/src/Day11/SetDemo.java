package Day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set的实现类   HashSet   TreeSet
		
		
		
		
		Set set_1 = new HashSet();
		set_1.add(5);
		set_1.add(5);
		set_1.add(5);
		set_1.add(5);
		set_1.add(10);
		set_1.add(10);
		set_1.add(20);
		set_1.add(20);
		System.out.println(set_1);//[20, 5, 10]
		//set特点去重，不支持下标  插入无序
		
		Set set_test = new HashSet();
		Test_obj to_1 = new Test_obj("张三","ok");
		Test_obj to_2 = new Test_obj("张三","ok");
		set_test.add(to_1);
		set_test.add(to_2);
		System.out.println(set_test);//[Test_obj [foo=张三, bar=ok]]
		//如果类没重写hashcode和equals  会有两个对象，写了就会出现如上结果
		//set去重  先判断hashcode  再判断equals
		
		Set<String> set_2 = new TreeSet<String>();
		set_2.add("20");
		set_2.add("20");
		set_2.add("3");
		set_2.add("1");
		set_2.add("abc");
		System.out.println(set_2);//[1, 20, 3, abc]
		//TreeSet按照首字符的ascii码值排序
		
//		Set<Test_obj> set_tree = new TreeSet<Test_obj>();
//		set_tree.add(new Test_obj("123","456"));
//		set_tree.add(new Test_obj("222","456"));
//		set_tree.add(new Test_obj("888","456"));
//		System.out.println(set_test);//报错     无法直接给对象排序
		
		//不支持下标   遍历只有下面两种方式
		for (String string : set_2) {
			System.out.println(string);
		}
		
		Iterator<String> it = set_2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
