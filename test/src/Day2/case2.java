package Day2;

public class case2 {
	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6,3};
		int[] brr = {4,5,6,7,9,8};
		int count=0;
		System.out.print("差集为[");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < brr.length; j++) {
				if(arr[i]!=brr[j]) {
					count++;
				}
			}
			
			if(count==brr.length) {
				System.out.print(arr[i]+" ");
			}
			count=0;
		}
		System.out.print("]");
	}
}
