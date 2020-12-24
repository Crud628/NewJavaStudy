package Day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java异常体系
//		异常：虚拟机运行终止   文件找不到   非法参数
//		java.lang.Throwable  所有异常的父类
//		Error：  错误、程序无法处理
		
//		Exception：异常  程序本身可以捕获  处理的异常
//		运行时异常： RuntimeException   nullPoint  OutofBound
//		编译异常：系统有一些异常类，如果程序出现此异常必须对该异常进行处理
		
//		还可以分为
//		可查异常:系统要求必须处理的异常
//		不不可查异常：
		
//		java中异常处理机制：捕获  抛出
//		捕获  try  catch  finally
//		抛出  throws  throw
//		
////		try  catch  finally  语法规则
//		try {
////			System.out.println(5/0);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}finally {
//			
//		}
//		
//		try {
//			Date date = new SimpleDateFormat("xxx").parse("xx");
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3a");
		list.add("4");
		list.add("xxx");
		list.add("6");
		for (String string : list) {
			System.out.println(fun(string));
		}
//		 抛出异常： throws throw :一个程序的异常处理动作，不在当前处理异常，将产生的异常对象交由调用该方法的方法处理
//	throws： 抛出异常的声明
//	throw： 抛出异常的动作指令
		
		
//			try {
//				exception_test();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				System.out.println("捕获该异常");
//			}
			
//	使用场景：
//			1. 系统函数 抛出异常的处理
//			Date date=new SimpleDateFormat("XX").parse("XXX");
//			2.自定义异常
			Person p1=new Person();
			try {					
				p1.setName("张三");
				p1.setAge(180);
			} catch (AgeOutofBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(p1);
			
//			case:
//				创建Student类
//				private String name;
//				private Integer age;
//				实例化Student类对象，给该对象成员变量赋值，如该对象名字中包含数字，则报姓名格式异常
//				如  张三   没问题
//				      张3  则输出 名字格式有误
//			    NameFormatException  名字格式异常
			
		
}

public static int test(int a) {
//	运行try（如果try中有return 确定返回值）   运行finally   返回函数
	try {
		a=10;
		return a;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		a=1;
		System.out.println(a);
	}
	return a;
}

public static void exception_test() throws Exception{
     Scanner scan=new Scanner(System.in);
     String str=scan.next();
     if(str.equals("abc")) {  //如果输入的字符串 是abc
   	  Exception e=new Exception();  //实例化异常对象
   	  throw e;  //抛出该异常对象
     }		

	}
	public static int fun(String s) {
		try {
			return Integer.parseInt(s);
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
		
		
	}

}
