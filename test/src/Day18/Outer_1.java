package Day18;

public class Outer_1 {
	String out_value = "outValue";
	String same = "outSame";

	// 成员内部类 类直接写在外部类中
	class Inner {
		String inner_value = "innerValue";
		String same = "innerSame";

		public void print() {  //看内部类中 如何调用 内部/外部资源
			System.out.println(out_value);
			System.out.println(inner_value);
//			System.out.println(same);  //内部/外部 同名成员变量  取内部  因为近
			System.out.println(Outer_1.this.same);  //指定获取同名成员变量 需要 类名.this.XXX 加以区分
			System.out.println(Inner.this.same);
		}
	}
	
	public static void main(String[] args) {
//		Inner in=new Inner();  不支持 正常实例化
		Outer_1 out=new Outer_1();  //1.实例化外部对象
		Outer_1.Inner in=out.new Inner();   //2.  外部类.内部类  XXX= 外部对象.new 内部类()
		in.print();
	}

}
