package Day01;

public class  test8 {
	public static void  main(String[] args) {
		for(int i = 0;i<10;i++) {
			for(int j = 1;j<=39;j++) {
				if(j<(2*i+2)||j>=(39-(2*i))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------------------");
		for(int m = 0;m<9;m++) {
			if(m<5) {
				for(int n = 1;n<=9;n++) {
					if(n<=(4-m)||n>(9-(4-m))){
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
			}else {
				for(int k = 0;k<9;k++) {
					if(k<(m-5+1)||k>(9-(m-5)-2)){
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}