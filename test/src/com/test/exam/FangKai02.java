package com.test.exam;

public class FangKai02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tel = 12345;
		int tel2 = telx(tel);
	}
	public static int telx(int tel) {
		int num1 = tel / 10000;
		int num2 = (tel / 1000) %10;
		int num3 = (tel / 100) % 10;
		int num4 = (tel / 10) % 10;
		int num5 = tel % 10;
		num1 = (num4 + 5)%10;
		num2 = (num3 + 5)%10;
		num3 = (num2 + 5)%10;
		num4 = (num1 + 5)%10;
		num5 = (num5 + 5)%10;
		return num1*10000+num2*1000+num3*100+num4*10+num5;
	}

}
