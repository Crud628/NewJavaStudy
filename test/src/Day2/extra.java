package Day2;
import java.util.Arrays;
import java.util.Scanner;
public class extra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入人数");
		int count = sc.nextInt();
		int[] arr = new int[count];
		int i = 0;
		int flag = 0;
		int m =arr.length;
		while(m!=1) {
			if(arr[flag]!=1) {
				if((i+1)%3==0) {
					arr[flag]=1;
					m--;
					System.out.println("第"+(flag+1)+"个人淘汰"+Arrays.toString(arr));
				}
				i++;
				i%=3;
			}
			flag++;
			flag%=arr.length;
		}
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]==0) {
				System.out.println(j+1);
			}
		}

	}

}
