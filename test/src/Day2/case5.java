package Day2;

public class case5 {
	public static void main(String[] args) {
		int[][] arr = {{22,66,44},
						{77,33,88},
						{25,45,65},
						{80}};
		int sum = 0;
		int temp = 0;
		int max = 0;
		int max_p = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				temp+=arr[i][j];
			}
			System.out.println("第"+(i+1)+"季度销售总额为"+temp);
			if(max<temp) {
				max=temp;
			}
			if((temp/arr[i].length)>max_p) {
				max_p=temp/arr[i].length;
			}
			sum+=temp;
			temp=0;
		}
		System.out.println("最高季度销售额为"+max);
		System.out.println("最高平均季度销售额为"+max_p);
	}
}
