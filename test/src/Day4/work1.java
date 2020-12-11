package Day4;

import java.util.Random;
import java.util.Scanner;

public class work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		play(sc);
	}

	public static void play(Scanner sc,Random r) {
		int[] red_boll = new int[33];
		for (int i = 0; i < red_boll.length; i++) {
			red_boll[i] = i;
		}
		int blue = r.nextInt();
		int[] my_red_boll = new int[6];
		int my_blue_boll = r.nextInt();
		while(true) {
			shuffle(red_boll);
			System.out.println("是否开始游戏（Y/N）");
			String flag = sc.next();
			if(flag.equalsIgnoreCase("N")) {
				System.out.println("游戏结束");
				return;
			}
			
			
		}
		
	}
	private static int[] shuffle(int[] pokes) {
	    for (int i=pokes.length-1; i>=0; i--) {
	    	int rIndex = (int)(Math.random()*(i+1));
	        int temp = pokes[rIndex];
	        pokes[rIndex] = pokes[i];
	        pokes[i] = temp;
	    }
	    return pokes;
	}

}
