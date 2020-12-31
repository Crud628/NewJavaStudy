package Day03;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =(int)(Math.random()*9+1);
		}
		System.out.println(Arrays.toString(arr));
		int flag = arr[0];
		for (int i = 0; i < arr.length - 1; i++) { 
			// 最小值在哪个位置上
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) { 
				minIndex = arr[j] < arr[minIndex] ? j : minIndex;
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("最后结果为");
		System.out.println(Arrays.toString(arr));
	}

}
