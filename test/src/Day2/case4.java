package Day2;

import java.util.Scanner;

public class case4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		double sum = 0;
		double p = 0;
		for (int i = 0; i < 10; i++) {
			arr[i]=sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
			sum+=arr[i];
		}
		sum=sum-max-min;
		p=sum/(arr.length-2);
		System.out.println("去掉一个最高分："+max+"分,去掉一个最低分："+min+"分，最后平均数为："+p+"分");
	}
}
