package Day02;

public class case3 {
	public static void main(String[] args) {
		int[] arr_demo= {1,2,2,3,3,3,4,4,4,2,2,2};
		int max=arr_demo[0];
		int count = 0;
		int maxCount_k = arr_demo[0];
		int maxCount_v = 0;
		int temp = 0;
		for (int i = 0; i < arr_demo.length; i++) {
			if(max<arr_demo[i]) {
				max=arr_demo[i];
			}
		}
		System.out.println("数组最大值为："+max);
		
		for (int i = 0; i < arr_demo.length; i++) {
			if(arr_demo[i]==3) {
				count++;
			}
		}
		System.out.println("3出现的次数为："+count);
		
		for (int i = 0; i < arr_demo.length; i++) {
			for (int j = 0; j < arr_demo.length; j++) {
				if(arr_demo[i]==arr_demo[j]) {
					temp++;
				}
			}
			if(temp>maxCount_v) {
				maxCount_v=temp;
				maxCount_k=arr_demo[i];
			}
			temp=0;
			
		}
		System.out.println("出现最多次的元素为："+maxCount_k+"次数为:"+maxCount_v);
	}
}
