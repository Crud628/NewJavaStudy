package Day04;

import java.util.Random;

public class case1_shuffle {

	public static void main(String[] args) {
		
		Random random=new Random();
		int temp=random.nextInt(53)+1;//1-54
		int temp2 = random.nextInt(53)+1;
		while(temp2==temp) {
			temp2 = random.nextInt(53)+1;
		}
//		System.out.println(52/13);
		System.out.println(temp);
		System.out.println(temp2);
		System.out.println(temp/13);
		System.out.println(temp2/13);
		System.out.println(temp%13);
		System.out.println(temp2%13);
		shuffle(temp);
		shuffle(temp2);
		
	}
	private static void shuffle(int num) {
		// TODO Auto-generated method stub
		switch(num/13) {
			case 0://红桃
				ran((num%13)+1,"红桃");
				break;
			case 1://黑桃
				ran((num%13)+1,"黑桃");
				break;
			case 2://梅花
				ran((num%13)+1,"梅花");
				break;
			case 3://方块
				ran((num%13)+1,"方块");
				break;
			case 4://方块K   大王  小王
				if(num%13==0) {
					System.out.println("方块K");
				}else if(num%13==1) {
					System.out.println("小王");
				}else {
					System.out.println("大王");
				}
				break;
		}
	}
	public static void ran(int m,String str) {
		// TODO Auto-generated method stub
		if(m<=10) {
			System.out.println(str+m);
		}else if(m==11) {
			System.out.println(str+"J");
		}else if(m==12) {
			System.out.println(str+"Q");
		}else {
			System.out.println(str+"K");
		}
	}

}
