package Day03;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =(int)(Math.random()*9+1);
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 1; i < arr.length; i++) { // 0 ~ i 做到有序
			for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("最后结果为");
		System.out.println(Arrays.toString(arr));
	}
}
