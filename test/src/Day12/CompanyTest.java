package Day12;

import java.util.HashMap;
import java.util.Map;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member d1 = new Member("001","黄忠","男","PL");
		Member d2 = new Member("002","张飞","男","PG");
		Member d3 = new Member("003","马超","男","PM");
		Member d4 = new Member("004","赵云","男","PL");
		Member d5 = new Member("005","关羽","男","PL");
		Member[] members = {d1,d2,d3,d4,d5};
		Member d6 = new Member("001","黄忠","男","PL");
		Member d7 = new Member("002","张飞","男","PG");
		Member d8 = new Member("003","马超","男","PM");
		Member d9 = new Member("004","赵云","男","PL");
		Member d0 = new Member("005","关羽","男","PL");
		Member[] members2 = {d6,d7,d8,d9,d0};
//		Map<Company,Member[]> p = new HashMap<Company,Member[]>();
		Company DHC = new Company("001","DHC");
		Company IBM = new Company("002", "IBM");
//		p.put(DHC, members);
//		p.put(IBM, members2);
		Map<String,Member> p1 = new HashMap<String, Member>();
		p1.put("001", d1);
		p1.put("002", d2);
		p1.put("003", d3);
		p1.put("004", d4);
		p1.put("005", d5);
		
		Map<String,Member> p2 = new HashMap<String, Member>();
		p2.put("001", d6);
		p2.put("002", d7);
		p2.put("003", d8);
		p2.put("004", d9);
		p2.put("004", d0);
		
		Map<Company,Map> p = new HashMap<Company, Map>();
		p.put(DHC, p1);
		p.put(IBM, p2);
		System.out.println(p);


	}

}
