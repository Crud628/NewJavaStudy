package Day01;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		
	}
	public void fun(int y,int m) {
		int flag = 0;
		if(y%4==0) {
			flag=1;
		}
		if(m==2) {
			if(flag==1) {
				System.out.println(y+"年"+m+"月有29天");
			}else {
				System.out.println(y+"年"+m+"月有28天");
			}
		}else if(m==2||m==4||m==6||m==9||m==11) {
			System.out.println(y+"年"+m+"月有30天");
		}else {
			System.out.println(y+"年"+m+"月有31天");
		}
	}
	
	public void fun2(int y,int m) {
		int flag = 0;
		if(y%4==0) {
			flag=1;
		}
		switch(m) {
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				System.out.println(y+"年"+m+"月有31天");
				break;
			case 2:case 4:case 6:case 9:case 11:
				System.out.println(y+"年"+m+"月有30天");
				break;
			default:
				if(flag==1) {
					System.out.println(y+"年"+m+"月有29天");
				}else {
					System.out.println(y+"年"+m+"月有28天");
				}
		}
	}
	
}
