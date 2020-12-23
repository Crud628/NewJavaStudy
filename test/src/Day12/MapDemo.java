package Day12;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map_test = new HashMap();
		//双列集合  Map  以键值对形式存储    key：value
//		map_test.put(key,value);
		map_test.put("今天", "吃包子");
		map_test.put("昨天", "吃饺子");
		map_test.put("明天", "吃火锅");
		map_test.put("明天", "吃烧烤");//key不可重复    有重复就替换
//		System.out.println(map_test);//{今天=吃包子, 明天=吃烧烤, 昨天=吃饺子}  乱序
		
		
		Map<Integer,String> map_test2 = new HashMap<Integer,String>();
		map_test2.put(100, "吃包子");
		map_test2.put(30, "吃饺子");
		map_test2.put(50, "吃火锅");
		map_test2.put(70, "吃烧烤");//key不可重复    有重复就替换
//		System.out.println(map_test2);
		
		//TreeMap()  功能
		
//		 map集合常用方法
//		 map_test.put(key, value)   map_test.putAll(m);		 
//		 map_test.remove(key)  map_test.remove(key, value)
//		 map_test.get(key)
//		 map_test.containsKey(key)  map_test.containsValue(value)
//		 map_test.size()   map_test.clear()   map_test.isEmpty()   
		
//		map_test2.put(1,"aa");
//		map_test2.putAll(map_test);
//		
//		map_test2.remove(1);//返回被删除的元素
//		map_test2.remove(30,"吃饺子");//同上       输入正确才会删除
//		
//		map_test2.containsKey(100);//boolean
//		map_test2.containsValue("吃饺子");//boolean
		
		
		Map<Integer,String> map = new TreeMap<Integer,String>();
//		map.
		System.out.println(map_test2);
		
	}

}
