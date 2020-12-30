# java笔记Day17



# 设计模式-单例

```java
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


```



```java
public class Player {
	// 成员变量
	private String name;
	private Integer level;
//	类变量
	private static Player instance;

//	私有化构造方法
	private Player() {
		super();
	}

	private Player(String name, Integer level) {
		super();
		this.name = name;
		this.level = level;
	}

	// 普通成员的变量的 set/get方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

//	对象 get方法
	public static Player getInstance() { // 获取对象
		if (instance == null) {
			instance = new Player("江湖小虾米", 1);
		}
		return instance;
	}

	// 动态方法/实例方法/行为
	public void fight() {
		System.out.println(this.name + "在练级");
	}

	public void levelUp() {
		instance.setLevel(instance.getLevel() + 1);
		System.out.println(this.name + "升到"+instance.getLevel()+"级啦！！！！！！");
	}
//	重写toString方法

	@Override
	public String toString() {
		return this.name + "现在" + level + "级了";

```



## 工厂模式

```java
public class Factory {  //工厂  
	
	//普通工厂模式
	public Car produce(String message) {  //参数为哪个实现类相关 就返回哪个类的对象
		if("audi".equalsIgnoreCase(message)||"a6".equalsIgnoreCase(message)||"a8".equalsIgnoreCase(message)) {
			return new Audi();   //Car xxx=new Audi()  //返回了一个 接口回调对象
		}
		if("benz".equals(message)) {
			return new Benz();
		}
		return null;		
	}
	
	//多方法工厂模式
	public Car produceAudi() {
		return new Audi();
	}
	public Car produceBenz() {
		return new Benz();
	}

	
	
	//静态方法工厂模式
	public static Car produceStaticAudi() {
		return new Audi();
	}
	public static Car produceStaticBenz() {
		return new Benz();
	}
}

```

