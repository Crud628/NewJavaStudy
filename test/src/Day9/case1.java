package Day9;

/*	case 1: 设计一个压缩字符串的方法  参数为纯英文字母字符串  返回压缩后字符串
 * 	abbbccddddefa    a3b2c4defa
 * 	再将case 1方法 逆向工程
 */
public class case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "abbbccddddefa"; 
//		String str = "asdfaaaa";//边界条件
		String str = "assssssssssssssssssssssa";//数量边界
		String str2 = stringCompress(str);
		System.out.println(str2);
		String str3 = stringDecompression(str2);//a3b2c4defa
		System.out.println(str3);//abbbccddddefa
		System.out.println(str3.equals(str));
		
	}
	
	public static String stringCompress(String str) {
		str+=" ";
		char[] str_c = str.toCharArray();
		char temp = str_c[0];
		int count = 0;
		String result = "";
		for (int i = 0; i < str_c.length; i++) {
			if(str_c[i] == temp) {
				count++;
			}else {
				result+=count>1?count+""+temp:temp+"";
				count = 1;
				temp = str_c[i];
			}
		}
		return result;
	}

	public static String stringDecompression(String str) {
		char[] str_c = str.toCharArray();
		String result = "";
		String tempS = ""; 
		for (int i = 0; i < str_c.length; i++) {
			if(Character.isDigit(str_c[i])) {
				tempS += str_c[i]+"";
			}else {
				if(tempS.length()==0) {
					result+=str_c[i];
				}else {
					int m = Integer.parseInt(tempS);
					for (int j = 0; j < m; j++) {
						result+=str_c[i];
					}
					tempS = "";
				}
			}
		}
		return result;
	}
	
}
