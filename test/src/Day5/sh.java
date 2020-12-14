package Day5;

import java.util.Arrays;

public class sh {
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		int count[] = {0,0,0,0,0,0,0,0,0,0};
		for(int i = 0;i<100000000;i++) {
			shuffle(num);
			count[num[0]-1]++;
			count[num[1]-1]++;
			bubbleSort(num);
			
		}
		System.out.println(Arrays.toString(count));
	}
	
	private static int[] shuffle(int[] pokes) {
	    for (int i=pokes.length-1; i>=0; i--) {
	    	int rIndex = (int)(Math.random()*(i+1));
	        int temp = pokes[rIndex];
	        pokes[rIndex] = pokes[i];
	        pokes[i] = temp;
	    }
	    return pokes;
	}
	
	/**
	 * 冒泡排序
	 * @param arr  
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
//			System.out.println(Arrays.toString(arr));
		}
	}
}
