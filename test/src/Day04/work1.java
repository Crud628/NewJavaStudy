package Day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * 项目一：双色球
 * 功能：
 * 控制台询问是否开始游戏（Y/N）
 * 生成随机双色球中奖号码（红球6个，1-33，无重复，蓝球1个，1-16）
 * 用户依次输入所选红球，蓝球
 * 与中奖号码比对，确认奖项（显示中奖号码，从小到大排序）
 * 本期中奖号码： XX XX XX X 2步中生成的
 * 用户所选号码: XX XX XX X 3步中输入的
 * 非常遗憾/恭喜您
 * 执行1操作
 * 一等奖 6+1
 * 二等奖 6+0
 * 三等奖 5+1
 * 四等奖5+0 4+1
 * 五等奖 4+0 3+1
 * 六等奖 2+1 1+1 0+1
 * 一阶段： 功能核心
 * 二阶段： 条件核心
 * 字符串.equals(“另一個字符串) 判断字符串是否相等
 * equalsIgnoreCase 忽略大小写判断相等
 * @author Asus
 *
 */
public class work1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		play(sc,r);
	}
	
	//核心玩法流程
	public static void play(Scanner sc,Random r) {
		//红球  篮球
		int[] red_boll = new int[33];
		int blue_boll = 0;
		
		//自己选的号码
		int[] my_red_boll = new int[6];
		int my_blue_boll = 0;
		
		//暂时没用上
		boolean flag = true;
		
		int temp = 0;
		while(true) {
			//初始化
			int red_bingo = 0;
			boolean blue_flag = false; 
			for (int i = 0; i < red_boll.length; i++) {
				red_boll[i] = i+1;
			}
			
			for (int i = 0; i < my_red_boll.length; i++) {
				my_red_boll[i] = 0;
			}
			
			//1.控制台询问是否开始游戏
			System.out.println("是否开始游戏（Y/N）");
			String s = sc.next();
			if(s.equalsIgnoreCase("N")) {
				System.out.println("游戏结束");
				return;
			}else {
				//2.生成随机双色球号码（红球取数组前六）
				shuffle(red_boll);
				int[] res = new int[6];
				for (int i = 0; i < res.length; i++) {
					res[i] = red_boll[i];
				}
				bubbleSort(res);//排序
				blue_boll = r.nextInt(16)+1;
				System.out.println(Arrays.toString(res) +"  "+blue_boll);
				
				
				//3.用户依次输入所选红球，篮球
				System.out.println("请输入依次输入六个红球号码（1-33）");
				for(int i = 0; i < my_red_boll.length; i++) {
					System.out.println("请输入第"+(i+1)+"个号码");
					temp = num_check(sc, 33);
					while(findKey(my_red_boll, temp) >= 0) {
						System.out.println("输入号码已存在，请再次输入");
						temp = num_check(sc, 33);
					}
					my_red_boll[i] = temp;
				}
				
				System.out.println("请输入篮球号码（1-16）");
				my_blue_boll = num_check(sc, 16);
				bubbleSort(my_red_boll);//排序
				
				
				/**	4.与中奖号码比对，确认奖项（显示中奖号码，从小到大排序）
				*	本期中奖号码： XX XX XX X 2步中生成的
				*	用户所选号码: XX XX XX X 3步中输入的
				*	非常遗憾/恭喜您
				*/
				//红球
				for (int i = 0; i < my_red_boll.length; i++) {
					if(findKey(res, my_red_boll[i]) > 0) {
						red_bingo++;
					}
				}
				//篮球
				if(my_blue_boll == blue_boll) {
					blue_flag = true;
				}
				
				System.out.print("本期中将号码：");
				for (int i = 0; i < res.length; i++) {
					System.out.print((res[i]<10?"0"+res[i]:res[i]) + "  ");
				}
				System.out.println("蓝球：" + (blue_boll<10?"0"+blue_boll:blue_boll));
				
				System.out.print("用户所选号码：");
				for (int i = 0; i < my_red_boll.length; i++) {
					System.out.print((my_red_boll[i]<10?"0"+my_red_boll[i]:my_red_boll[i]) + "  ");
				}
				System.out.println("蓝球：" + (my_blue_boll<10?"0"+my_blue_boll:my_blue_boll));
				System.out.println();
				
				
				
				/** 5.一等奖 6+1    7
				* 二等奖 6+0        6   6 false  5  true
				* 三等奖 5+1
				* 四等奖5+0 4+1     5
				* 五等奖 4+0 3+1    4
				* 六等奖 2+1 1+1 0+1   de
				*/
				switch(red_bingo) {
					case 6:
						if(blue_flag) {
							System.out.println("恭喜你中一等奖");//6+1
							break;
						}
						System.out.println("恭喜你中二等奖");//6+0
						break;
					case 5:
						if(blue_flag) {
							System.out.println("恭喜你中三等奖");//5+1
							break;
						}
						System.out.println("恭喜你中四等奖");//5+0
						break;
					case 4:
						if(blue_flag) {
							System.out.println("恭喜你中四等奖");//4+1
							break;
						}
						System.out.println("恭喜你中五等奖");//4+0
						break;
					case 3:
						if(blue_flag) {
							System.out.println("恭喜你中五等奖");
							break;
						}
						System.out.println("非常遗憾");
						break;
					default:
						if(blue_flag) {
							System.out.println("六等奖");
							break;
						}
						System.out.println("非常遗憾");
						break;
				}
				/**
				 * 执行1;
				 */
				System.out.println("是否继续游戏（Y/N）");
				s = sc.next();
				if(s.equalsIgnoreCase("N")) {
					System.out.println("游戏结束");
					return;
				}
			}
		}
		
	}
	/**
	 * 洗牌  乱序
	 * @param pokes
	 * @return
	 */
	private static int[] shuffle(int[] pokes) {
	    for (int i=pokes.length-1; i>=0; i--) {
	    	int rIndex = (int)(Math.random()*(i+1));
	        int temp = pokes[rIndex];
	        pokes[rIndex] = pokes[i];
	        pokes[i] = temp;
	    }
	    return pokes;
	}
	
	
	/**
	 * 冒泡排序
	 * @param arr  
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
//			System.out.println(Arrays.toString(arr));
		}
	}

	
	/**
	 * 数字验证
	 * @param sc   获取输入对象
	 * @param max  数字范围：默认最小为1，数字最大是max
	 * @return 
	 */
	public static int num_check(Scanner sc,int max) {
		int data;
		while (true) {
			try {
				data=sc.nextInt();
				if (data>=1&&data<=max) {
					return data;
				}
				else
					System.out.println("请录入1-"+max+"的整数");
			} catch (Exception e) {
				// TODO: handle exception
				//接收数据
				System.out.println("请检查格式");
				sc.next();
			}
		}
	}
	
	/**
	 * 普通查找
	 * @param arr  目标数组
	 * @param key  查找目标
	 * @return  找到返回1  未找到返回-1
	 */
	public static int findKey(int arr[],int key) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key) {
				return 1;
			}
		}
		return -1;
	}

}