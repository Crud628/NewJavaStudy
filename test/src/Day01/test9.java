package Day01;

public class test9 {
	public static void main(String[] args) {
		for(int i = 0;i <= 36;i++) {
			for(int j = 0;j <= 36;j++) {
				for(int k =0;k <= 36;k++) {
					if((i+j+k)==36&&(i*4+j*3+k/2)==36&&(k&1)==0) {
						System.out.println(i+"  "+j+"   "+k);
					}
				}
			}
		}
	}
}