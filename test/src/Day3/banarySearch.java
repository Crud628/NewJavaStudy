package Day3;

public class banarySearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int L = 1;
		int R = arr.length;
		int key = 4;
		boolean flag = false;
		while(L < R) {
			int mid = L + ((R - L) >> 1);
			if(arr[mid]<key) {
				L = mid + 1;
			}else if(arr[mid]>key) {
				R = mid - 1;
			}else {
				System.out.println(mid);
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println(-(L + 1));
		}
	}
}
