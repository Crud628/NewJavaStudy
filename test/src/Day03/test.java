package Day03;

public class test {
	public static void main(String[] args) {
		System.out.println(fun1(1,2,3));
		System.out.println(fun2(1,2));
		System.out.println(fun3(100));
		System.out.println(fun4(10,3));
		System.out.println(fun5(6));
		System.out.println(fun6(4));
	}
	private static int fun1(int a,int b,int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}
	private static int fun2(int a,int b) {
		// TODO Auto-generated method stub
		return a>b?a:b;
	}
	private static int fun3(int a) {
		// TODO Auto-generated method stub
		int sum = 0;
		if(a<=1) {
			return a;
		}
		for (int i = 0; i < a; i++) {
			sum+=i;
		}
		return sum;
	}
	private static int fun4(int h,int n) {
		// TODO Auto-generated method stub
		while(n!=0) {
			h/=2;
			n--;
		}
		return h;
	}
	private static int fun5(int n) {
		// TODO Auto-generated method stub
		int sum = 1,temp = sum;
		for(int i = 1;i<n;i++) {
			if(n>=3) {
				sum += temp;
				temp = sum - temp;
			}
		}
		return n>=3?sum*2:2;

	}
	private static int fun6(int n) {
		// TODO Auto-generated method stub
		int s = 1;
		for(int i = n;i>0;i--) {
			s=(s+1)*2;
		}
		return s;
	}
	private double fun7(int[] nums1,int[] nums2) {
		// TODO Auto-generated method stub
		 int[] nums;
		    int m = nums1.length;
		    int n = nums2.length;
		    nums = new int[m + n];
		    if (m == 0) {
		        if (n % 2 == 0) {
		            return (nums2[n / 2 - 1] + nums2[n / 2]) / 2.0;
		        } else {

		            return nums2[n / 2];
		        }
		    }
		    if (n == 0) {
		        if (m % 2 == 0) {
		            return (nums1[m / 2 - 1] + nums1[m / 2]) / 2.0;
		        } else {
		            return nums1[m / 2];
		        }
		    }

		    int count = 0;
		    int i = 0, j = 0;
		    while (count != (m + n)) {
		        if (i == m) {
		            while (j != n) {
		                nums[count++] = nums2[j++];
		            }
		            break;
		        }
		        if (j == n) {
		            while (i != m) {
		                nums[count++] = nums1[i++];
		            }
		            break;
		        }

		        if (nums1[i] < nums2[j]) {
		            nums[count++] = nums1[i++];
		        } else {
		            nums[count++] = nums2[j++];
		        }
		    }

		    if (count % 2 == 0) {
		        return (nums[count / 2 - 1] + nums[count / 2]) / 2.0;
		    } else {
		        return nums[count / 2];
		    }


	}
}
