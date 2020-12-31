package Day09;
/*
 * case 3： 设计一个方法 参数为任意字符串  方法中 判断该字符串是否对称
 */
public class case3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcba";
		String str2 = "abccba";
		System.out.println(isPalindrome(str));
		System.out.println(isPalindrome(str2));
	}
	
	public static boolean isPalindrome(String str) {
		if(str.length()==1||str.length()==0) {
			return true;
		}
		char[] c = str.toCharArray();
		int m = c.length;
		for (int i = 0; i < m/2; i++) {
			if(c[i] != c[m-i-1]) {
				return false;
			}
		}
		return true;
	}

}
