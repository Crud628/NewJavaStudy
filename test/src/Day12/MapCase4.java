package Day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
//case 4：
//已有List集合 集合中有原始数据如下
//List<String> list=new ArrayList<String>();
//list.add("张一,中山区");
//list.add("张二,甘井子区");
//list.add("张三,西岗区");
//list.add("张四,甘井子区");
//list.add("张五,甘井子区");
//list.add("张六,中山区");
//将原始数据转存为map集合 ，并输出
//输出格式为：  区,人数，人名
//例如：  中山区,2人：张一,张六
//         甘井子区,3人：张二,张四，张五
public class MapCase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("张一,中山区");
		list.add("张二,甘井子区");
		list.add("张三,西岗区");
		list.add("张四,甘井子区");
		list.add("张五,甘井子区");
		list.add("张六,中山区");
		Map<String,String> map = new HashMap<String,String>();
		for (String string : list) {
			if(map.containsKey(string.split(",")[1])) {
				map.put(string.split(",")[1], map.get(string.split(",")[1])+" "+string.split(",")[0]);
			}else {
				map.put(string.split(",")[1], string.split(",")[0]);
			}
		}
		
//		System.out.println(map);//{中山区=张一 张六, 甘井子区=张二 张四 张五, 西岗区=张三}
		Set<Entry<String,String>> map_entry=map.entrySet(); //把map集合 变为 泛型为 双列模式的 Set集合
		for(Entry<String,String> each:map_entry) {
			System.out.println(each.getKey()+","+each.getValue().split(" ").length+"人:"+each.getValue());
		}
		
	}

}
