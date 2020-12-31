package Day18;

public class Outer_2 {
	String out_value = "outValue";
	String same = "outSame";
	
	public void outer_func() {
//		方法内部类： 内部类 被封装在外部类的方法中
		class Inner{
			String inner_value = "innerValue";
			String same = "innerSame";
			
			public void print() {
				System.out.println(out_value);
				System.out.println(inner_value);
				System.out.println(Outer_2.this.same);  
				System.out.println(Inner.this.same);
			}
		}
		
//		调用方法内部类对象 唯一方法：
//		在该方法中 实例化内部类，并调用相关方法
		Inner in=new Inner();
		in.print();
	}
	public static void main(String[] args) {
		Outer_2 out=new Outer_2();  //1.实例化外部对象
//		!!!!!不行 Outer_2.Inner in=out.new Inner();   //2.  外部类.内部类  XXX= 外部对象.new 内部类()
		out.outer_func();
	}

}

