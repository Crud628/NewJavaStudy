# java笔记Day13



## Collections类扩展

```java
		List<String> list=new ArrayList<String>();
		list.add(0,"L");
		list.add(1,"O");
		list.add(2,"V");
		list.add(3,"E");
		System.out.println(list);
		
//		Collections:  操作集合的工具类  静态方法
//		Collections.addAll(list, "Y","O","U");  //指定集合中 添加指定元素（可以一次性添加多个）
//		System.out.println(list);
		
		Collections.sort(list);  //指定集合 自然排序
		System.out.println(list);
		
//		Collections.reverse(list);  //指定集合 反转
//		System.out.println(list);
		
		System.out.println(Collections.max(list));  //查找指定集合中 极值
		System.out.println(Collections.min(list));  //查找指定集合中 极值
		
		System.out.println(Collections.binarySearch(list, "A"));  //二分法查找指定元素  有序 去重
//		                   Arrays.binarySearch(arg0, arg1)

        
//		集合：动态长度 灵活   类型只能为 引用数据类型
//		数组：效率高 固定长度 统一数据类型  允许所有数据类型
		
//		转换  !!!功能不完善   慎用
		
//		数组 =====》 集合   非基本数据类型
		Integer[] arr= {1,2,3,4,5,6,7};
		List list_2=Arrays.asList(arr);
		System.out.println(list_2);
		
//		集合 =====》数组
//		Object[] arr_strs=list.toArray();
//	    System.out.println(Arrays.toString(arr_strs));
//	    for(Object each:arr_strs) {
//	    	System.out.println((String)each);
//	    }

```



## Math类

```java
//		System.out.println(Math.abs(-10));//绝对值
//		System.out.println(Math.ceil(3.2));
//		System.out.println(Math.floor(3.8));
//		System.out.println(Math.round(3.8));
//		System.out.println(Math.pow(2, 3));
//		System.out.println(Math.sqrt(4));
//		System.out.println(Math.PI);
//		System.out.println(Math.max(10, 20));
//		System.out.println(Math.min(10, 20));
//		System.out.println(Math.E);
//		System.out.println(Math.random());
```





## 异常体系

```java
		// TODO Auto-generated method stub
//         Java 异常体系
//		异常： 虚拟机运行终止/文件找不到/非法参数。。。。
//		java.lang.Throwable   所有异常的父类
//		Error： 错误 /程序无法处理
//		*Exception：异常 /程序本身可以捕获/处理的异常
		
//		Exception：
//		    运行时异常：RuntimeException :  nullPoint  OutofBounds
//		    *编译异常：系统有一些异常类，如果程序中出现此异常，必须对该异常进行处理
		
//		Exception：从另一个角度
//		  可查异常：  系统要求必须处理的异常  除RuntimeException 以及子类
//		  不可查异常：RuntimeException 以及子类  和 错误error
		
//		java中异常处理机制：              捕获异常                                                抛出异常
//		java中异常处理关键字： try  catch  finally            throws   throw       
		
//		捕获异常:一个程序的异常处理动作,当场处理异常，获取该异常对象的信息
//		try/catch/finally 语法规则
//		1.try中代码 无异常  catch不执行  finally执行
//		2.try中代码 出现异常 try中代码中止执行  然后执行catch   finally执行
//		格式：
//		try {
//			可能出现异常的代码
//		}catch(异常类型  异常对象) {
//			捕获异常
//		}finally {
//			最终执行
//		}
		
//		try {
//			System.out.println("try 1 run");
//			System.out.println(5/0);
//			System.out.println("try 2 run");
//		}catch(Exception exception) {
//			exception.printStackTrace();   //异常类型  以及  异常位置
//			System.out.println(exception.getMessage());     //异常内容
//			System.out.println("catch run");
//		}finally {
//			System.out.println("finally run");
//		}
		
//		自动生成 try/catch ： 选中 可能出现异常的代码 alt+shift+z
		
//		try {
//			int[] arr= {1,2,3,4,5};
//			System.out.println(arr[10]);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		
//		System.out.println(test(5));
		
//		case 1:
//			有字符串集合，将该集合中元素 转换为int类型并输出，如有转换异常，则捕获该异常
			List<String> list=new ArrayList<String>();
			list.add("1");
			list.add("2");
			list.add("3a");
			list.add("4");
			list.add("xxx");
			list.add("6");
			
			
//			 抛出异常： throws throw :一个程序的异常处理动作，不在当前处理异常，将产生的异常对象交由调用该方法的方法处理
//		throws： 抛出异常的声明
//		throw： 抛出异常的动作指令
			
			
//				try {
//					exception_test();
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//					System.out.println("捕获该异常");
//				}
				
//		使用场景：
//				1. 系统函数 抛出异常的处理
//				Date date=new SimpleDateFormat("XX").parse("XXX");
//				2.自定义异常
				Person p1=new Person();
				try {					
					p1.setName("张三");
					p1.setAge(180);
				} catch (AgeOutofBoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(p1);
				
//				case:
//					创建Student类
//					private String name;
//					private Integer age;
//					实例化Student类对象，给该对象成员变量赋值，如该对象名字中包含数字，则报姓名格式异常
//					如  张三   没问题
//					      张3  则输出 名字格式有误
//				    NameFormatException  名字格式异常
				
			
	}
	
	public static int test(int a) {
//		运行try（如果try中有return 确定返回值）   运行finally   返回函数
		try {
			a=10;
			return a;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			a=1;
			System.out.println(a);
		}
		return a;
	}
	
	public static void exception_test() throws Exception{
          Scanner scan=new Scanner(System.in);
          String str=scan.next();
          if(str.equals("abc")) {  //如果输入的字符串 是abc
        	  Exception e=new Exception();  //实例化异常对象
        	  throw e;  //抛出该异常对象
          }		
	}

```

