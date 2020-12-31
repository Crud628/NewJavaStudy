# java笔记Day18



## 内部类

```java
//		内部类： 类中 嵌套另一个类，外层的类 叫做外部类，里层的 叫 内部类
//		分类：
//		1.非静态内部类
//		    1.1  成员内部类   Outer_1
//		    1.2  方法内部类   Outer_2
//		    1.3  匿名类
//		        1.3.1 接口式匿名类
//		        1.3.2 继承式匿名类
//		        1.3.3 参数匿名类
//		2.静态内部类    Outer_3
		
//		内部类：1.内部/外部 成员变量的调用  2.调用内部类的 成员变量/方法
//		       3.静态内部类/非静内部类 的差异
```





Outer_1

```java
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
```



Outer_2

```java
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
```



Outer_3

```java
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
```

