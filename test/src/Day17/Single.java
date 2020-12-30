package Day17;

//单例模式
public class Single {
  //SingleHungry  饿汉式 单例模式 ：加载类时，实例化对象
	// 该类中 设计一个 私有化的 类变量 数据类型为该类本身
	private static Single instance = new Single(); // 加载类时，实例化对象

	// 静态 get方法 获得该类的 类变量（该类的对象）
	public static Single getInstance() {
		return instance;
	}

	// 私有化 无参构造方法
	private Single() {

	}

	public void test() {
		System.out.println("logic A(A功能)");
	}

}

class Single_2 {
	//SingleLazy 懒汉式 单例模式 ： 调用获取对象的方法时，再实例化
	private static Single_2 instance;  //加载类时，不实例化

	public static Single_2 getInstance() {
		if (instance == null) {  //调用get方法时，判断是否为null 再实例化
			instance = new Single_2();
		}
		return instance;
	}

	private Single_2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void test() {
		System.out.println("logic B(B功能)");
	}
}
