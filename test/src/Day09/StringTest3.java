package Day09;

public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123abcABC123abc  ";
		System.out.println(str.length());//17    字符串长度 
		System.out.println(str.charAt(2));//3  第i+1位置的字符
		System.out.println(str.toCharArray());//返回一个char类型数组
		char[] cs =  str.toCharArray();
		for (char c : cs) {
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println(str.toLowerCase());//全部转为小写
		System.out.println(str.toUpperCase());//全部转为大写
		System.out.println(str.substring(3));//截取
		System.out.println(str.substring(3, 4));//截取从一个位置到另外一个位置
		System.out.println(str.trim());//去除两边空格
		System.out.println(str.startsWith("1"));//是否以   开始
		System.out.println(str.endsWith(" "));//以  结束
		
		
		System.out.println(str.indexOf("2"));//找到第一个位置  字符串和int有区别
		System.out.println(str.indexOf("2", 0));//从哪个位置开始找
		/*
		 * compareTo()的返回值是整型，它是先比较对应字符的大小（ASCII码顺序），
		 * 如果第一个字符和参数的第一个字符不等，结束比较，返回他们之间的差值。
		 * 如果第一个字符和参数的第一个字符相等，则以第二个字符和参数的第二个字符作比较，
		 * 以此类推，直至比较的字符或被比较的字符有一方全比较完，这时就比较字符的长度。
		*/
		System.out.println(str.compareTo("123abcABC123abc  "));
		System.out.println(str.compareToIgnoreCase("Abc"));//不区别大小写
		
		
//		System.out.println(str.split("2"));//分割字符串
		String[] str1 =  str.split("2");
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]+" ");
		}
		System.out.println();
//		System.out.println(str.split("2", 6));//第二个参数  结果阈值
		String[] str2 =  str.split("2",6);
		for (String string : str2) {
			System.out.print(string+" ");
		}
		System.out.println();
		
		System.out.println(str.replace("2", "6"));//全部替换
		System.out.println(str.replaceAll("2", "3"));//全部替换    优先使用正则
		
		System.out.println(str.contains("ab") );//是否包含
		System.out.println(str.concat("m"));//将指定字符串连接到此字符串的结尾。
	}

}
