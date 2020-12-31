package Day18;

public class Outer_3 {
	static String out_value = "outValue";
	static String same = "outSame";

	// 静态内部类
	static class Inner {
		String inner_value = "innerValue";
		String same = "innerSame";

		public void print() {
			System.out.println(out_value);  //
			System.out.println(inner_value);
			System.out.println(Outer_3.same);  //直接类名.XXX  XXX为外部 类变量名
			System.out.println(Inner.this.same);
//			1.内部类方法 无法调用外部成员变量
//			2.可以调用 外部 类变量（静态）
		}
	}
	
	public static void main(String[] args) {
		Outer_3 out=new Outer_3();  //1.实例化外部对象
		Outer_3.Inner in=new Outer_3.Inner();  //外部类.静态内部类  XXX= new 外部类.静态内部类()
		in.print();
		
	}

}

