package Day9;
/*
 * case 2: 设计一个字符串加密方法 参数为任意字符串  
 * 	返回加密后字符串已有字符串 "abc"   
 * 	作为密钥"hello"       h的ascii码+a的ascii码    
 * 	再将case2 逆向工程
 */
public class case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
//		char a = 'h';
//		char b = 'a';
//		System.out.println((char)(a+b));
		String str2 = stringEncryption(str);
		System.out.println(str2);
		String str3 = stringDecrypt(str2);
		System.out.println(str3);
	}
	
	public static String stringEncryption(String str) {
		String result = "";
		char[] c = str.toCharArray();
		char[] key = {'a','b','c'};
		int m = key.length;
		int n = str.length();
		int index = 0;
		for (int i = 0; i < c.length; i++) {
			result+=(char)(c[i]+key[index]);
			index++;
			index%=3;
		}
		return result;
	}
	
	public static String stringDecrypt(String str) {
		String result = "";
		char[] c = str.toCharArray();
		char[] key = {'a','b','c'};
		int m = key.length;
		int n = str.length();
		int index = 0;
		for (int i = 0; i < c.length; i++) {
			result+=(char)(c[i]-key[index]);
			index++;
			index%=3;
		}
		return result;
	}
}
