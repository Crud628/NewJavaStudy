package Day04;

import java.util.Random;

public class Demo {
	public static void main(String[] args) {
//		方法重载：方法同名不同参
//		与参数名无关，与参数 数量 类型 有关
//		与返回值无关
		
		int a=1;
		demo(a);
		int[] arr= {1,1,1,1,1};
		demo(arr);
		System.out.println(a);
		System.out.println(arr[0]);
		System.out.println(arr);
//		值传递： 调用方法/函数
//		基本数据类型   传递的是值
//		引用数据类型   传递的是 地址
		
//		生成随机数   Random
		
		Random random=new Random();
		int temp=random.nextInt(100);  //生成[0,100) 的随机整数
		double temp_d=random.nextDouble();  //[0,1) 的随机浮点数
		System.out.println(temp);
		System.out.println(temp_d);
		
		if(temp>=0&&temp<=2) {
			System.out.println("SSR");
		}else {
			System.out.println("非");
		}
		
//		case: 模拟从一副扑克牌中，随机抽取两张牌
//		extra： 利用函数，模拟从一副牌中，随机抽取n张牌   n为参数
		String[] pokers = {"","红桃1", "红桃2", "红桃3", "红桃4", "红桃5", "红桃6", "红桃7", "红桃8", "红桃9", "红桃10", "红桃J", "红桃Q", "红桃K",
				"黑桃1", "黑桃2", "黑桃3", "黑桃4", "黑桃5", "黑桃6", "黑桃7", "黑桃8", "黑桃9", "黑桃10", "黑桃J", "黑桃Q", "黑桃K", "方片1",
				"方片2", "方片3", "方片4", "方片5", "方片6", "方片7", "方片8", "方片9", "方片10", "方片J", "方片Q", "方片K", "梅花1", "梅花2",
				"梅花3", "梅花4", "梅花5", "梅花6", "梅花7", "梅花8", "梅花9", "梅花10", "梅花J", "梅花Q", "梅花K", "大王", "小王" };
        for(int each:pickPokers(pokers,6)) {
        	System.out.println(pokers[each]);
        }
	}

	
	//抽牌函数
	public static int[] pickPokers(String[] pokers,int num) {
		
		int[] picked=new int[num];  //
		int length=0;  //已抽到牌的下标
		Random random=new Random();
		while(length<picked.length) { //循环条件 已抽牌的数量 没有达到要求的数量
			int random_poker=random.nextInt(pokers.length);  //产生随机数作为下标
			boolean flag=true;  //定义开关 默认该牌符合条件
			for(int each:picked) {  //判断该牌是否已抽到过
				if(each==random_poker) {   //和数组中每一张牌判断
					flag=false;  //开关关闭
				    break;  //离开  判断该牌是否已抽到过  的循环
				}
			}
			if(flag) {  //判断开关
				picked[length]=random_poker;  //将该下标赋值给已抽数组
				length++;  //已抽到牌的下标 +1
			}
		}
		return picked;		
	}
	
//	洗牌函数
	private static String[] shuffle(String[] pokes) {
	    for (int i=pokes.length-1; i>=0; i--) {
	    	int rIndex = (int)(Math.random()*(i+1));
	        String temp = pokes[rIndex];
	        pokes[rIndex] = pokes[i];
	        pokes[i] = temp;
	    }
	    return pokes;
	} 
	
	
	public static void demo(int num) {
		num = 10;
	}

	public static void demo(int[] num) {
		num[0] = 10;
	}

//	public static void func_demo() {
//		
//	}
//	
//    public static void func_demo(int num) {
//		
//	}
//    
//    public static int func_demo(int  x) {
//		return x;
//	}



	

	
	
	
	
//	public static void func_demo() {
//		
//	}
//	
//    public static void func_demo(int num) {
//		
//	}
//    
//    public static int func_demo(int  x) {
//		return x;
//	}

}
