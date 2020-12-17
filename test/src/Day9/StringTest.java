package Day9;

public class StringTest {
	public static void main(String[] args) {
		String str = "123  abc  ABC  123  abc";
		System.out.println(str.length());//23    字符串长度
		System.out.println(str.charAt(2));//3  第i+1位置的字符
		System.out.println(str.toCharArray());//返回一个char类型数组
		System.out.println(str.toLowerCase());//
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 4));
		System.out.println(str.trim());
//		System.out.println(str.startsWith(2));
//		System.out.println(str.endsWith(3));
		System.out.println(str.indexOf(2));
		System.out.println(str.indexOf(2, 0));
		System.out.println(str.compareTo("456"));
		System.out.println(str.compareToIgnoreCase("Abc"));
		System.out.println(str.split("2"));
		System.out.println(str.split("2", 0));
		System.out.println(str.replace("2", "6"));
		System.out.println(str.replaceAll("2", "3"));
		System.out.println(str.contains("s") );
		System.out.println(str.concat("m"));
	}
}
