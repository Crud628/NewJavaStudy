package Day02;

import java.util.Arrays;
import java.util.Scanner;

public class case7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输出矩阵大小");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*10);
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i==j) {
					sum1+=arr[i][j];
				}
				if(i==(n-j-1)) {
					sum2+=arr[i][j];
				}
			}
			
		}
		System.out.println(sum1+" "+sum2);
		
	}
}
