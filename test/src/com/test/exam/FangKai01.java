package com.test.exam;

import java.util.Arrays;
import java.util.Scanner;

public class FangKai01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int sum = 0;
		int avg = 0;
		int[] scores = new int[10];
		System.out.println("请输入10个整数并以空格分割");
		for (int i = 0; i < scores.length; i++) {
			scores[i]=sc.nextInt();
			sum+=scores[i];
		}
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+" ");
		}
		max = scores[scores.length-1];
		min = scores[0];
		avg = sum/scores.length;
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
		System.out.println("平均值："+avg);
	}

}
