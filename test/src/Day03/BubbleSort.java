package Day03;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =(int)(Math.random()*9+1);
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("最后结果为");
		System.out.println(Arrays.toString(arr));
	}

}
