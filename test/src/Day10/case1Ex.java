package Day10;


/**
 * 改写String练习题的第一题
 * @author Administrator
 *
 */
public class case1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "abbbccddddefa"; 
//		String str = "asdfaaaa";//边界条件
		StringBuilder str = new StringBuilder("assssssssssssssssssssssa");//数量边界
		StringBuilder str2 = stringCompress(str);
		System.out.println(str2);
		StringBuffer str3 = new StringBuffer(str2.toString());
		StringBuffer str4 = stringDecompression(str3);//a3b2c4defa
		System.out.println(str4);//abbbccddddefa
//		System.out.println(str4.equals(str));
	}
	
	public static StringBuilder stringCompress(StringBuilder str) {
		str.append(" ");
		char temp = str.charAt(0);
		int count = 0;
		StringBuilder result = new StringBuilder("");
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == temp) {
				count++;
			}else {
				result.append(count>1?count+""+temp:temp+"");
				count = 1;
				temp = str.charAt(i);
			}
		}
		
		return result;
	}
	
	
	public static StringBuffer stringDecompression(StringBuffer str) {
		StringBuffer result = new StringBuffer("");
		StringBuffer tempS = new StringBuffer("");
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				tempS.append(str.charAt(i)) ;
			}else {
				if(tempS.length()==0) {
					result.append(str.charAt(i));
				}else {
					int m = Integer.parseInt(tempS.toString());
					for (int j = 0; j < m; j++) {
						result.append(str.charAt(i));
					}
					tempS.delete(0, tempS.length());
				}
			}
		}
		return result;
	}

}
