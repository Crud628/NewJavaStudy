package com.test.exam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FangKai03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String src = "F:\\result.txt";
		fibonacci(src, n);
	}
	public static void fibonacci(String src,int n) {
		int sum = 0;
		int a = 1;
		try {
			BufferedWriter w = new BufferedWriter(new FileWriter(src));
			w.write("----------------------------------------------------------------");
			w.newLine();
			for (int i = 1; i <= n; i++) {
				w.write("Fibonacci数列第"+i+"项："+i);
				w.newLine();
			}
			
			w.write("----------------------------------------------------------------");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
