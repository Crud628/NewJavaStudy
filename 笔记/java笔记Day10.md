# java笔记Day10



## String扩展

```JAVA
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

```



## 常用API

#### Collection

```java
//		API ： Application Programming Interface   应用程序（编程）接口
//		系统写的接口  xxx=new 系统写的实现类();  xxx.很多系统写好的方法() 
		
//		java的集合体系
//		集合： 可以存储不同数据类型的容器
//		Collection 接口
		Collection col=new ArrayList(); //接口回调  ArrayList 实现类  col接口回调对象   col 是一个collection集合
		col.add(12);
		col.add("abc");
		col.add("abc");
		col.add("abc");
		col.add(new Integer(25));
		col.add(new int[]{1,2,3,4});
		col.add(false);
		System.out.println(col);		
		
//		！！！ 集合可以存储不同类型数据
//		！！！集合中 都重写了toString()方法，输出集合名，可查看集合中元素
		
		Collection<Integer> col_2=new ArrayList<Integer>();   //<> 泛型 指定集合中存储的元素数据类型
//		        !!! 泛型 只能为 引用数据类型
//		!!!col_2.add("abc");
		col_2.add(12);
		col_2.add(24);
		col_2.add(24);
		col_2.add(36);
		
		Collection<Integer> col_3=new ArrayList<Integer>();
		col_3.add(new Integer(24));
		
//		col.add(e)    
//		集合.add(元素)   添加一个元素至集合中   返回值：添加成功与否
		
//		col.addAll(c)
//		集合.addAll(集合)  将一个集合中的元素 添加至另一个集合中   返回值：添加成功与否
//		col_2.addAll(col);
//		System.out.println(col_2.addAll(col));
		
//		col.contains(o) 
//		System.out.println(col.contains("abc"));
//		col.containsAll(c)  判断一个集合中 所有元素 是否在另一个集合中
//		System.out.println(col_2.containsAll(col_3));
		
//		col.isEmpty()  判断 集合中元素个数是否为0
//		System.out.println(col_3.isEmpty());
		
//		col.remove(o) 
		col.remove("abc");  //移除首次出现的元素  返回值： 是否删除成功
		System.out.println(col);
//		col.removeAll(c)   //移除另一个集中中 在本集合出现的所有元素
		col_2.removeAll(col_3);
		System.out.println(col_2);		
		
//		col.size() 集合的长度  集合的元素个数
//		col.clear(); 清空集合 

```





### List

```java
//		List接口 ： Collection接口的子接口 拓展了父接口的方法 提供了 对指定元素位置的操作（支持下标）
		
//		实现类： ArrayList(动态数组)
				//LinkedList(动态链表)
				//vector  线程安全的动态数组
        List<String> list_1=new ArrayList<String>();
        list_1.add(0, "张一");
        list_1.add(1, "张二");
        list_1.add(2, "张三");
        list_1.add(3, "张四");
        list_1.add(4, "张五");
        list_1.add(4, "张五五");
        list_1.add(6, "张六");   //两个参的add() 没有返回值
        
//        ！！！！！！list_1.add(7, "张六");  //下标越界
        System.out.println(list_1);
        
        System.out.println(list_1.indexOf("张三三"));  //查询元素首次出现下标值 / -1
        System.out.println(list_1.remove(2));//根据下标值删除元素
        System.out.println(list_1.get(5));
        System.out.println(list_1);
        
//        关于remove(下标)/ remove(元素)
//        List<Integer> list_demo=new ArrayList<Integer>();
//        list_demo.add(5);
//        list_demo.add(6);
//        list_demo.add(7);
//        list_demo.add(8);
//        list_demo.add(9);
//        list_demo.add(10);
////        list_demo.remove(5); //删除下标5对应元素
//        list_demo.remove(new Integer(5)); //删除 元素 5 （Integer对象）
//        System.out.println(list_demo);

```



### 遍历+case

```java
//       list集合的遍历
//        1.下标遍历
//       for(int index=0;index<=list_1.size()-1;index++) {
////    	   list_1.get(index)
//    	   System.out.println(list_1.get(index));
//       }
		
//       集合长度     size()      集合.get(下标)
//       数组长度     length      数组名[下标]
//       字符串长度   length()    字符串.charAt(下标)
       
//       2.foreach 遍历
//       for(String each:list_1) {
//    	   System.out.println(each);
//       }
       
//       3.迭代器 遍历 Iterator
         Iterator<String> ite=list_1.iterator(); //实例化迭代器对象
//         Iterator<泛型>  迭代器名=待遍历的集合.iterator();   泛型 和 待遍历的集合一致
         while(ite.hasNext()) {
        	 String str=ite.next();
        	 System.out.println(ite.next());
         }
//	           迭代器.hasNext()  判断下一位置是否有元素
//	           迭代器.next()  移动至下一位置 并获取元素
         
//         case 1: 生成10个 1~100之间 不重复的整数 存储在一个list集合中
//         将该list集合中元素从小至大排序
//         使用迭代器！！ 输出该集合中元素
         
//         case 2: 创建一个类Book 成员变量 name书名 price书价格 press出版社 author作者
//         创建5个Book对象 放入 list集合中， 并按照price从小至大排序
//         循环集合输出每本书的详细信息
         
//         case 3:创建一个封装类！！ Member
//         成员变量   String name员工姓名 张一~张五
//                   Integer age 员工年龄 21~25
//                   创建一个List接口 ArrayList实现类的集合  泛型为Member
//                   创建5个Member对象放入集合中
//                   
//                  1）使用index（下标遍历） 改变张三年龄为28  （已知信息为张三这个名字）
//                  2）使用foreach遍历 删除年龄为25的员工 
//                  3）使用迭代器，输出所有Member信息
         
//         extra: 
//        	 一个国家的海关给每个进入该国的人一个编号，该编号从1开始依次自增。
//        	 定期组织抽奖活动，编号为 只有 3，5，7的倍数 就能获奖
//        	 前10个获奖编号为 
//        	 3,5,7,9,15,21,25,27,35,45        	 
//        	 有一个中奖号码为 59084709587505 计算 该中奖号码为 第几个中奖号码

```

