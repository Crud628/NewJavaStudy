package test;

public class test5 {
	public static void main(String[] args) {
		int i =2;
		int sum = i;
		while(i<30000) {
			System.out.println(i);
			i=i*10+2;
			sum += i;
		}
		System.out.println(sum);
	}
}
