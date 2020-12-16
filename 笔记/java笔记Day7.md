# java笔记Day7



### 多态

```java
package com.test.OopDay03;

public class OopDay0302 {
	public static void main(String[] args) {
//		类的 类型转换
//         Animal ani_01=new Animal();
//         ani_01.ani_color;
//         ani_01.run();
//		Dog d_01=new Dog();
//		d_01.dog_age;
//		d_01.eat();
//		d_01.ani_color;
//		d_01.play();
		
		
//		上转型
//		Animal ani_01=new Dog();  //父类引用（父类类型） 指向 子类对象（子类构造方法）
//		ani_01.ani_color;  //可以调用父类 成员变量
//		ani_01.play();   //可以调用父类方法
//		ani_01.dog_age; //无法调用 子类 成员变量
//		ani_01.eat();  //无法调用 子类方法
//		ani_01.run();   //可以调用  子类 重写过的父类方法
		
//		动态绑定： 根据业务的实际需要，父类类型 指向 不同子类对象，实现不同功能
		Animal ani_01=new Dog();  
		Animal ani_02=new Dog();  
		Animal ani_03=new Cat();  
		Animal ani_04=new Cat();  
		Animal ani_05=new Dog();  
		
//	    Animal[] anis= {ani_01,ani_02,ani_03,ani_04,ani_05};
////		Dog d_01=new Dog()
////	    Cat c_01=new Cat()   d_01  c_01 无法批量操作
//	    for(Animal each:anis) {
//	    	each.run();
//	    }
	    
	    
//	    下转型 ： 父类引用 赋值给 子类引用 
//	    ！！！原本是哪一个子类对象 下转型只能强转为该子类类型
//	    Dog d_01=(Dog)ani_01;  //对的
//	    Cat c_01=(Cat)ani_01;   //false
	    
	    Animal[] anis= {ani_01,ani_02,ani_03,ani_04,ani_05};
	    for(Animal each:anis) {
	    	each.run();
	    	if(each instanceof Dog) {
	    		Dog dog=(Dog)each;
	    		dog.guard();
	    	}
	    	if(each instanceof Cat) {
	    		Cat cat=(Cat)each;
	    		cat.sleep();
	    	}
	    }
	    
//	    a instanceof B  判断对象a是否为 B类对象
//	    System.out.println(ani_01 instanceof Dog);
//	    System.out.println(ani_03 instanceof Dog);
	    
//	    Animal demo=new Dog(); //上转
//	    Dog demo_d=(Dog)demo;  //下转
//	    Dog demo_d=new Dog();  //上转+下转=====直接实例化子类对象
	    
//	    多态：同一事件，在不同对象上，出现不同效果。
//	     动态绑定 ：多态的技术之一
//	   1.类内部多态   2.继承式多态
//	    类内部多态：方法重载 --- 方法同名不同参
//	    继承式多态：必要条件  ---   要有继承关系   要有上转型   要有方法重写
	    
//	    case: 设计一组类（1父2子） 实现多态效果
	}
}


```



### 抽象

> 关键字   ：  abstract
>
> 可以修饰类  方法/函数
>
> 
>
> ​		
>
> ​	修饰类：抽象类
>
> ​	Vehicle v_01=new Vehicle(); 1.不能实例化 
>
> ​		2.抽象类中 既可以有抽象方法  也可以有 普通动态方法/实例方法
>
> ​		3.抽象类中 可以有 成员变量 /构造方法
>
> ​		
>
> ​		
>
> //		修饰方法：抽象方法
>
> //		public abstract void XXXX();  1.没有方法体
>
> //		2. 抽象方法 必须写在抽象类中
>
> //		3.需要被 非抽象子类 重写



### 3  接口

> 关键字   interface   是抽象方法的容器
>
> 实现   implements









