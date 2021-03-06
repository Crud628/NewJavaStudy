package Day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class case2_shuffle {
	public static void main(String[] args) {
		Random random=new Random();
		int temp=random.nextInt(53)+1;//1-54
		String[] pokes = 
				{"红桃A","红桃2","红桃3","红桃4","红桃5","红桃6","红桃7","红桃8","红桃9","红桃10","红桃J","红桃Q","红桃K",
				"黑桃A","黑桃2","黑桃3","黑桃4","黑桃5","黑桃6","黑桃7","黑桃8","黑桃9","黑桃10","黑桃J","黑桃Q","黑桃K",
				"梅花A","梅花2","梅花3","梅花4","梅花5","梅花6","梅花7","梅花8","梅花9","梅花10","梅花J","梅花Q","梅花K",
				"方块A","方块2","方块3","方块4","方块5","方块6","方块7","方块8","方块9","方块10","方块J","方块Q","方块K",
				"大王","小王"};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		shuffle(pokes);
		System.out.println(Arrays.toString(pokes));
		for(int i = 0;i <= n; i++) {
			System.out.print(pokes[i]+" ");
		}

	}
	private static String[] shuffle(String[] pokes) {
	    for (int i=pokes.length-1; i>=0; i--) {
	    	int rIndex = (int)(Math.random()*(i+1));
	        String temp = pokes[rIndex];
	        pokes[rIndex] = pokes[i];
	        pokes[i] = temp;
	    }
	    return pokes;
	}
}
