package Day11;

import java.util.HashSet;
import java.util.Set;

//case 1: 随机生成一组双色球红球号码（添0 去重 排序）  6个1~33随机整数
//建议使用set集合
public class SetCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		while(set.size()<6) {
			int m = (int)(Math.random()*33+1);
			set.add(m<10?("0"+m):m+"");
		}
		System.out.println(set);
	}

}
