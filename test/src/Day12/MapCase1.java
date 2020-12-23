package Day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//case 1: 
//输入一个字符串，显示字符串中每个字符出现的次数。 （利用map集合）
//例如： 请输入字符串
//abcdebdeacaad
//控制台显示
//a出现4次
//b出现2次
public class MapCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		Set<Entry<Character,Integer>> map_entry=map.entrySet(); //把map集合 变为 泛型为 双列模式的 Set集合
		for(Entry<Character,Integer> each:map_entry) {
			System.out.println(each.getKey()+"出现了"+each.getValue()+"次");
		}
	}

}
