package Day01;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
	}
	public void fun(int year) {
		if(year%4==0&&year%400!=0) {
			System.out.println(year+"年是闰年");
		}else {
			System.out.println(year+"年不是闰年");
		}
	}
}