package Day02;

public class case1 {
	public static void main(String[] args) {
		int[] arr = {4,3,5,9,8};
		int m =-1;
		int n =-1;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==3) {
				m = i;
				System.out.println("元素3的小标是"+m);
				continue;
			}
			if(arr[i]==9) {
				n = i;
				System.out.println("元素9的小标是"+n);
			}
		}
		System.out.println("原数组为");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		arr[m] = arr[m] ^ arr[n];
		arr[n] = arr[m] ^ arr[n];
		arr[m] = arr[m] ^ arr[n];
		System.out.println();
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
