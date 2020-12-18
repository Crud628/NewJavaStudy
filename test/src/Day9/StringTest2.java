package Day9;

public class StringTest2 {
	public static void main(String[] args) {
	//String是一个不可变对象，可以认为是特殊的常量，因此存在方法区的运行时常量池中，可以被共享使用，以提高效率。	
	String str1 = "eee";//1、在运行时常量池中创建新的对象"eee"，如果常量池中不存在的话；2、栈中创建对象的引用str1
	String str2 = "eee";//由于运行时常量池中已经存在该对象，直接在栈中创建对象的引用str2即可。
	String str3 = new String("eee");//1、通过new指令，在堆中创建新的对象，2、在栈中创建对象的引用str3。
	System.out.println("str1 == str2 is " + (str1 == str2));//str1 == str2 is true
	System.out.println("str1 == str3 is " + (str1 == str3));//str1 == str3 is false
	System.out.println("str1.equals(str2) is " + str1.equals(str2));//str1.equals(str2) is true
	System.out.println("str1.equals(str3) is " + str1.equals(str3));//str1.equals(str3) is true
	}
}
