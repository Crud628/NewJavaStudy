package Day10;

public class ApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
//		String 衍生的类  StringBuilder  StringBuffer
//		StringBuilder str_b=new StringBuilder("abc");
		StringBuilder str_b=new StringBuilder();
		str_b.append("abc");
//		System.out.println(str_b.toString())=======System.out.println(str_b);
		str_b.append("xxx");
		System.out.println(str_b);
//		str_b.delete(start, end)
		str_b.insert(3, "bbc");
		System.out.println(String.valueOf(str_b));
		
		
//		StringBuffer 和 StringBuilder 使用方法 完全相同
		StringBuffer str_buff=new StringBuffer("bufferabc");
//		str_buff.append(b)
//		str_buff.insert(offset, b)
//		str_buff.delete(start, end)
		
//		StringBuffer StringBuilder 区别
//		数据安全：   数据不准确 也是一种 数据不安全
//		StringBuffer 线程安全  ： 多个线程操作时，（因StringBuffer内部加锁机制），能保证数据安全
//		                            安全角度  StringBuffer > StringBuilder > String
//		StringBuilder 效率高，速度快
//		             系统运行效率角度 StringBuilder>StringBuffer>String

		
	}

}
