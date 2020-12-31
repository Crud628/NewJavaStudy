package Day18;

public class OuterDemo {

	public static void main(String[] args) {
//		内部类： 类中 嵌套另一个类，外层的类 叫做外部类，里层的 叫 内部类
//		分类：
//		1.非静态内部类
//		    1.1  成员内部类   Outer_1
//		    1.2  方法内部类   Outer_2
//		    1.3  匿名类
//		        1.3.1 接口式匿名类
		
		Car c1 = new Car() {

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("BYD 启动");
			}
			
		};
		c1.start();

		
//		        1.3.2 继承式匿名类
		Audi audi = new Audi() {
			@Override
			public void start() {
				System.out.println("A6 start");
			}
		};
		audi.start();
//		        1.3.3 参数匿名类
		ParamTest.test(new Audi() {
			@Override
			public void start() {
				System.out.println("A6 start");
			}
		});
		
//		2.静态内部类    Outer_3
		
//		内部类：1.内部/外部 成员变量的调用  2.调用内部类的 成员变量/方法
//		       3.静态内部类/非静内部类 的差异

	}

}
