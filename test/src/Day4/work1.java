package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		play(sc,r);
	}

	public static void play(Scanner sc,Random r) {
		int[] red_boll = new int[33];
		for (int i = 0; i < red_boll.length; i++) {
			red_boll[i] = i;
		}
		int blue_boll = r.nextInt(16)+1;
		
		
		int[] my_red_boll = new int[6];
		int my_blue_boll = r.nextInt(16);
		
		int red_bingo = 0;
//		boolean blue 
		while(true) {
			shuffle(red_boll);//随机
			
			System.out.println("是否开始游戏（Y/N）");
			String flag = sc.next();
			if(flag.equalsIgnoreCase("N")) {
				System.out.println("游戏结束");
				return;
			}
			
			System.out.println("请输入依次输入六个红球号码（1-33）");
			for(int i = 0; i < my_red_boll.length; i++) {
				System.out.println("请输入第"+(i+1)+"个");
				my_red_boll[i] = sc.nextInt();
			}
			
			System.out.println("请输入篮球号码（1-16）");
			my_blue_boll = sc.nextInt();
			
//			for()
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
			System.out.println(Arrays.toString(arr));
		}
	}

}
