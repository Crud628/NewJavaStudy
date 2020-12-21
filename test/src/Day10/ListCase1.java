package Day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * case 1: 生成10个 1~100之间 不重复的整数 存储在一个list集合中
 * 	将该list集合中元素从小至大排序
 * 	使用迭代器！！ 输出该集合中元素
 * @param args
 */
public class ListCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int temp = (int)(Math.random()*100+1);
			while(l.contains(temp)) {
				temp = (int)(Math.random()*100+1);
			}
			l.add(i,temp);
		}
		for (int i = 0; i < l.size() - 1; i++) {
			for (int j = i + 1; j < l.size(); j++) {
				if(l.get(i)>l.get(j)) {
					int temp = l.get(i);
					l.set(i, l.get(j));
					l.set(j, temp);
				}
			}

		}
		
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}
