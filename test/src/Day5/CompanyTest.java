package Day5;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member d1 = new Member("001","黄忠","男","PL");
		Member d2 = new Member("002","张飞","男","PG");
		Member d3 = new Member("003","马超","男","PM");
		Member d4 = new Member("004","赵云","男","PL");
		Member d5 = new Member("005","关羽","男","PL");
		Member[] members = {d1,d2,d3,d4,d5};
//		Company DHC = new Company("001","DHC",members);
//		System.out.println(DHC);
//		System.out.println();
//		
//		Company IBM = new Company("002", "IBM", members);
//		System.out.println(IBM);
		Company DHC = new Company();
		DHC.id = "001";
		DHC.name = "DHC";
		
		DHC.members[0] = d1;

		System.out.println(DHC);
	}

}
