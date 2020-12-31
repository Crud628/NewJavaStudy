package Day01;

import java.util.Scanner;

public class test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i==1) {
			System.out.println(i);
		}else {
			fun(i);
		}
	}
	public static void fun(int i) {
		while(i!=1) {
			if(i%2==0) {
				i/=2;
			}else {
				i=i*3+1;
			}
			System.out.println(i);
		}
	}
}
