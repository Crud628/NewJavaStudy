package Day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

//case 3：
//年份         冠军         第二名              第三名        第四名
//1930	乌拉圭	阿根廷		无             无
//1934	意大利	捷克斯洛伐克	德国	        奥地利
//1938	意大利	匈牙利	         巴西	         瑞典
//1950	乌拉圭	巴西	                  瑞典	西班牙
//1954	德国	    匈牙利	         奥地利	乌拉圭
//1958	巴西	        瑞典	                  法国	德国
//1962	巴西	        捷克斯洛伐克	智利	         南斯拉夫
//1966	英格兰	德国	                  葡萄牙	苏联
//1970	巴西	        意大利	        德国	         乌拉圭
//1974	德国	        荷兰	                 波兰	         巴西
//1978	阿根廷	荷兰	                 巴西	         意大利
//1982	意大利	德国	                 波兰	          法国
//1986	阿根廷	德国	                 法国	          比利时
//1990	德国	        阿根廷	        意大利	英格兰
//1994	巴西	        意大利	         瑞典	         保加利亚
//1998	法国	        巴西	                克罗地亚	荷兰
//2002	巴西	        德国	                土耳其	韩国
//2006	意大利	法国      	       德国	         葡萄牙
//2010	西班牙	荷兰	                德国	         乌拉圭
//2014	德国	        阿根廷	        荷兰	          巴西
//2018	法国	        克罗地亚	         比利时	英格兰
//2022    中国    法国        阿根廷   英格兰
//
//以上为原始数据，利用容器保存。
//控制台输入国家名，显示该国获得冠军的年份
//如 输入   中国 
//  显示     2020
  
//extra: 
//	控制台输入国家名，显示该国历年来世界杯前四名的数据
//如 输入 法国
//显示   冠军 1998 2018   第二名 2006 2022  第三名 1958 1986 第四名 1982
public class MapCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,ContryM> map = new HashMap<Integer,ContryM>();
		map.put(1930, new ContryM("乌拉圭","阿根廷","",""));
		map.put(1934, new ContryM("意大利","捷克斯洛伐克","德国","奥地利"));
		map.put(1938, new ContryM("意大利","匈牙利","巴西","瑞典"));
		map.put(1950, new ContryM("乌拉圭","巴西","",""));
		map.put(1954, new ContryM("德国","","",""));
		map.put(1958, new ContryM("巴西","","",""));
		map.put(1962, new ContryM("巴西","","",""));
		map.put(1966, new ContryM("英格兰","德国","",""));
		map.put(1970, new ContryM("巴西","","",""));
		map.put(1974, new ContryM("德国","","",""));
		map.put(1978, new ContryM("阿根廷","荷兰","",""));
		map.put(1982, new ContryM("意大利","德国","",""));
		map.put(1986, new ContryM("阿根廷","德国","",""));
		map.put(1990, new ContryM("德国","","",""));
		map.put(1994, new ContryM("巴西","","",""));
		map.put(1998, new ContryM("法国","","",""));
		map.put(2002, new ContryM("巴西","","",""));
		map.put(2006, new ContryM("意大利","法国","",""));
		map.put(2010, new ContryM("西班牙","荷兰","",""));
		map.put(2014, new ContryM("德国","","",""));
		map.put(2018, new ContryM("法国","","",""));
		map.put(2022, new ContryM("中国","","",""));
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		Set<Entry<Integer,ContryM>> map_entry=map.entrySet(); //把map集合 变为 泛型为 双列模式的 Set集合
		for(Entry<Integer,ContryM> each:map_entry) {
			if(each.getValue().getNum1().equals(s)) {
				System.out.println(each.getKey());
			}
		}
		
		Map<String,String> m = new HashMap<String, String>();
		m.put("冠军", "");
		m.put("亚军", "");
		m.put("季军", "");
		m.put("第四名", "");
		String s2 = sc.next();
		Set<Entry<Integer,ContryM>> map_entry2=map.entrySet(); //把map集合 变为 泛型为 双列模式的 Set集合
		for(Entry<Integer,ContryM> each:map_entry2) {
			if(each.getValue().getNum1().equals(s2)) {
				m.put("冠军", m.get("冠军")+each.getKey()+" ");
			}
			if(each.getValue().getNum2().equals(s2)) {
				m.put("亚军", m.get("亚军")+each.getKey()+" ");
			}
			if(each.getValue().getNum3().equals(s2)) {
				m.put("季军", m.get("季军")+each.getKey()+" ");
			}
			if(each.getValue().getNum4().equals(s2)) {
				m.put("第四名", m.get("第四名")+each.getKey()+" ");
			}
		}
		
		Set<Entry<String,String>> map_entry3=m.entrySet(); //把map集合 变为 泛型为 双列模式的 Set集合
		for(Entry<String,String> each:map_entry3) {
			System.out.println(each.getKey()+":"+each.getValue());
		}
	}

}
