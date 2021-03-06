package Day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * 项目二：猜测数字验证码
 *	功能：
 *	询问是否开始游戏（Y/N）
 *	生成随机四位数字验证码（无重复数字 1-9）
 *	用户一次性输入四位数字验证码
 *	输入验证码（3）与生成的验证码（2）进行比较，显示结果（数字和位置都对为A 数字对位置不对为B）
 *	如果猜中数字验证码，显示OK，显示猜测次数
 *	执行1操作
 *	例子：系统生成验证码为6583；
 *	输入 4537 显示1A1B
 *	输入 4589 显示2A0B
 *	输入 8356 显示0A4B
 *	输入 1279 显示0A0B
 *	输入 6583 显示4A0B win 共猜测。。。次
 * 	@author Asus
 *
 */
public class work2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		play(sc,r);
	}

	public static void play(Scanner sc, Random r) {
		// TODO Auto-generated method stub
		
		//初始化
		int[] res = {0,1,2,3,4,5,6,7,8,9};
		int A = 0;
		int B = 0;
		int count = 0;
		while(true) {
			//初始化
			count = 0;
			//1.控制台询问是否开始游戏
			System.out.println("是否开始游戏（Y/N）");
			String s = sc.next();
			if(s.equalsIgnoreCase("N")) {
				System.out.println("游戏结束");
				return;
			}else {
				// *	生成随机四位数字验证码（无重复数字 1-9）
				shuffle(res);
				int[] res4 = new int[4];
				for (int i = 0; i < res4.length; i++) {
					res4[i] = res[i];
				}
				
				 //*	用户一次性输入四位数字验证码
				while(true) {
					A = 0;
					B = 0;
					System.out.println("请输入四位数字");
					int[] my_text = num_check(sc, 9876);
					System.out.println(Arrays.toString(res4));
					// *	输入验证码（3）与生成的验证码（2）进行比较，显示结果（数字和位置都对为A 数字对位置不对为B）
		
					for (int i = 0; i < res4.length; i++) {
						for (int j = 0; j < my_text.length; j++) {
							if(res4[i] == my_text[j]&&i==j) {
								A++;
							}else if(res4[i] == my_text[j]&&i!=j){
								B++;
							}
						}
					}
					
					System.out.println(A+"A"+B+"B");
					count++;
					if(A==4) {
						System.out.println("win   共猜"+count+"次");
						break;
					}
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
	 * 数字验证
	 * @param sc   获取输入对象
	 * @param max  数字范围：默认最小为1，数字最大是max
	 * @return 
	 */
	public static int[] num_check(Scanner sc,int max) {
		int data;
		while (true) {
			try {
				data=sc.nextInt();
				int[] temp = new int[4];
				boolean flag = true;
				temp[3] = data / 1 % 10;
				temp[2] = data / 10 % 10;
				temp[1] = data / 100 % 10;
				temp[0] = data / 1000 % 10;
				System.out.println(Arrays.toString(temp)+" 自己输入的 ");
				for (int i = 0; i < temp.length; i++) {
					int m = findKey(temp, temp[i]);
					if(m>=0&&m!=i) {
						flag = false;
					}
				}
//				String temp2 = 
				if(flag) {
					if (data<0123||data>max) {
						System.out.println("请录入0123-"+max+"的整数");
					}else {
						return temp;
					}
				}else {
					System.out.println("有重复数字，请重新输入");
				}
			} catch (Exception e) {
				// TODO: handle exception
				//接收数据
				System.out.println("请检查数据格式");
				sc.next();
			}
		}
	}
	
	/**
	 * 普通查找
	 * @param arr  目标数组
	 * @param key  查找目标
	 * @return  找到返回下标  未找到返回0
	 */
	public static int findKey(int arr[],int key) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
}
