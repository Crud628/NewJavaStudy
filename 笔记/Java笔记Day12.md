# Java笔记Day12



## Map

```java
		// TODO Auto-generated method stub
//       双列集合  Map   以键值对形式存储   XXX(key 键值)=XXXXX(value  value值)
//		key值： 不能重复  如果有重复 覆盖原键值对
//		value值： 可以重复
		 Map<Integer,String> map_test=new HashMap<Integer,String>();
		 map_test.put(100, "吃包子");
		 map_test.put(30, "吃日料");
		 map_test.put(50, "吃韩餐");
		 map_test.put(70, "吃火锅");
		 System.out.println(map_test);
		 
//		 TreeMap()  功能   根据key值 自然排序
		 Map<Integer,String> map_test_2=new TreeMap<Integer,String>();
		 map_test_2.put(10, "吃包子");
		 map_test_2.put(3, "吃日料");
		 map_test_2.put(5, "吃韩餐");
		 map_test_2.put(7, "吃火锅");
		 System.out.println(map_test_2);
//		 map集合常用方法
//		 map_test.put(key, value)   map_test.putAll(m);		
		 map_test.put(200, "吃烤肉");   //添加一组键值对元素    add()   put()  
		 System.out.println(map_test);
		 map_test.putAll(map_test_2); //将另一个map集合中元素 添加至当前集合中
		 System.out.println(map_test);

//		 map_test.remove(key)  map_test.remove(key, value)		 
		 System.out.println(map_test.remove(30));  //根据key值 删除 整个键值对   返回值为 value值
		 System.out.println(map_test);
		 System.out.println(map_test.remove(20, "吃包子")); //根据key值和value值 删除整个键值对  返回值为boolean
		 System.out.println(map_test);
		 
//		 ！！！map_test.get(key)  根据key值 获取value值
		 System.out.println(map_test.get(200));
		 
//		 map_test.containsKey(key)  map_test.containsValue(value)
		 System.out.println(map_test.containsKey(100));  //判断map集合的key中 是否包含某元素 返回boolean
		 System.out.println(map_test.containsValue("吃火锅"));  //判断value
		 
//		 map_test.size()   map_test.clear()   map_test.isEmpty()   
		 System.out.println(map_test.size());  //map集合长度/元素个数
		 map_test.clear(); //清空该集合
		 System.out.println(map_test);
		 System.out.println(map_test.isEmpty()); //判断集合中元素个数是否为0   

```



## 练习

```java
//		 case: 
//			1.公司类 Company
//			属性  公司ID   公司名    			
//			2.职员类 Member
//			属性  员工卡号  员工姓名   员工性别   员工级别（PL PM  PG）
//			
//			main中：

//			创建公司对象   DHC  自定义5个员工  
//			创建公司对象   IBM  再自定义5个员工  
//		    利用一个map集合，保存两个公司，以及10个员工的信息，同时，能体现出 员工和公司的从属关系
//		System.out.println(map);
```

[答案](../test/src/Day12)



## 练习讲解

```java
//		 case: 
//			1.公司类 Company
//			属性  公司ID   公司名    			
//			2.职员类 Member
//			属性  员工卡号  员工姓名   员工性别   员工级别（PL PM  PG）
//			
//			main中：

//			创建公司对象   DHC  自定义5个员工  
//			创建公司对象   IBM  再自定义5个员工  
//		    利用一个map集合，保存两个公司，以及10个员工的信息，同时，能体现出 员工和公司的从属关系
//		System.out.println(map);
		
//		Map<Company,Member>  DHC,m1     DHC,m2 覆盖 m1
//		Map<Member,Company>  m1,DHC   m2,DHC  m3,DHC  共存
		
		Map<Member,Company> map_com_mem=new HashMap<Member,Company>();
		Company com_1=new Company("01","DHC");
		Member m1=new Member("001","张三1","男","PG");
		Member m2=new Member("002","张三2","男","PG");
		Member m3=new Member("003","张三3","男","PG");
		Member m4=new Member("004","张三4","男","PG");
		Member m5=new Member("005","张三5","男","PG");
		map_com_mem.put(m1, com_1);
		map_com_mem.put(m2, com_1);
		map_com_mem.put(m3, com_1);
		map_com_mem.put(m4, com_1);
		map_com_mem.put(m5, com_1);		
		
		Company com_2=new Company("02","IBM");
		map_com_mem.put(new Member("006","张三6","男","PG"), com_2);
		map_com_mem.put(new Member("007","张三7","男","PG"), com_2);
		map_com_mem.put(new Member("008","张三8","男","PG"), com_2);
		map_com_mem.put(new Member("009","张三9","男","PG"), com_2);
		map_com_mem.put(new Member("010","张三10","男","PG"), com_2);
		
		System.out.println(map_com_mem);
//		{
//			Member [mem_id=003, mem_name=张三3, mem_sex=男, mem_level=PG]=Company [com_id=01, com_name=DHC], 
//			Member [mem_id=006, mem_name=张三6, mem_sex=男, mem_level=PG]=Company [com_id=02, com_name=IBM], 
//			Member [mem_id=007, mem_name=张三7, mem_sex=男, mem_level=PG]=Company [com_id=02, com_name=IBM], 
//			Member [mem_id=005, mem_name=张三5, mem_sex=男, mem_level=PG]=Company [com_id=01, com_name=DHC], 
//			Member [mem_id=010, mem_name=张三10, mem_sex=男, mem_level=PG]=Company [com_id=02, com_name=IBM], 
//			Member [mem_id=009, mem_name=张三9, mem_sex=男, mem_level=PG]=Company [com_id=02, com_name=IBM], 
//			Member [mem_id=001, mem_name=张三1, mem_sex=男, mem_level=PG]=Company [com_id=01, com_name=DHC], 
//			Member [mem_id=002, mem_name=张三2, mem_sex=男, mem_level=PG]=Company [com_id=01, com_name=DHC], 
//			Member [mem_id=004, mem_name=张三4, mem_sex=男, mem_level=PG]=Company [com_id=01, com_name=DHC], 
//			Member [mem_id=008, mem_name=张三8, mem_sex=男, mem_level=PG]=Company [com_id=02, com_name=IBM]
//			}
		
		
		
		
		Map<Company,List<Member>> map_com_memList=new HashMap<Company,List<Member>>();
		List<Member> list_mem_com_1=new ArrayList<Member>();
		list_mem_com_1.add(m1);
		list_mem_com_1.add(m2);
		list_mem_com_1.add(m3);
		list_mem_com_1.add(m4);
		list_mem_com_1.add(m5);
		map_com_memList.put(com_1, list_mem_com_1);  //[com_1={m1,m2,m3,m4,m5}]
//		System.out.println(map_com_memList);
		map_com_memList.put(com_2, new ArrayList<Member>());  //[com_1={m1,m2,m3,m4,m5},com_2={}]
		map_com_memList.get(com_2).add(new Member("006","张三6","男","PG")); //[com_1={m1,m2,m3,m4,m5},com_2={张三6}]
		map_com_memList.get(com_2).add(new Member("007","张三7","男","PG"));
		map_com_memList.get(com_2).add(new Member("008","张三8","男","PG"));
		map_com_memList.get(com_2).add(new Member("009","张三9","男","PG"));
		map_com_memList.get(com_2).add(new Member("010","张三10","男","PG"));
		System.out.println(map_com_memList);
		
//		{
//			Company [com_id=02, com_name=IBM]=[Member [mem_id=006, mem_name=张三6, mem_sex=男, mem_level=PG], 
//			                                   Member [mem_id=007, mem_name=张三7, mem_sex=男, mem_level=PG], 
//			                                   Member [mem_id=008, mem_name=张三8, mem_sex=男, mem_level=PG], 
//			                                   Member [mem_id=009, mem_name=张三9, mem_sex=男, mem_level=PG], 
//			                                   Member [mem_id=010, mem_name=张三10, mem_sex=男, mem_level=PG]], 
//			Company [com_id=01, com_name=DHC]=[Member [mem_id=001, mem_name=张三1, mem_sex=男, mem_level=PG], 
//			                                   Member [mem_id=002, mem_name=张三2, mem_sex=男, mem_level=PG], 
//			                                   Member [mem_id=003, mem_name=张三3, mem_sex=男, mem_level=PG], 
//			                                   Member [mem_id=004, mem_name=张三4, mem_sex=男, mem_level=PG], 
//			                                   Member [mem_id=005, mem_name=张三5, mem_sex=男, mem_level=PG]]

```



## Map的遍历

```java
		
//		map集合的循环遍历
//		遍历所有key   keySet()
		Set<Integer> map_key=map.keySet();  //把map集合的key值 单独提取 成为一个单列的set集合
//		Iterator<Integer> ite=map_key.iterator();
//		while(ite.hasNext()) {
//			System.out.println(ite.next());
//		}
		for(Integer each:map_key) {
			System.out.println(each);
//			System.out.println(map.get(each)); //获得value值
		}
		
//		遍历所有value   values()
		Collection<String> map_val=map.values();  //把map集合的value值 单独提取 成为一个单列的Collection集合
		Iterator<String> ite=map_val.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}		
		
//		遍历key和value   Entry<XXX,XXX>   entrySet()
		Set<Entry<Integer,String>> map_entry=map.entrySet(); //把map集合 变为 泛型为 双列模式的 Set集合
		for(Entry<Integer,String> each:map_entry) {
			System.out.println(each.getKey()+","+each.getValue());

```



## 应用

```java
//		case 1: 
//			输入一个字符串，显示字符串中每个字符出现的次数。 （利用map集合）
//			例如： 请输入字符串
//			abcdebdeacaad
//			控制台显示
//			a出现4次
//			b出现2次
//			。。。
			
		
//		case 2: 
//			有数组 arr {2,2,3,3,3,4,4,4,4,5,5,2,2,2}
//			找出出现次数最多的元素 和出现次数 （利用map集合）
		
//		case 3：
//		年份         冠军         第二名              第三名        第四名
//		1930	乌拉圭	阿根廷		无             无
//		1934	意大利	捷克斯洛伐克	德国	        奥地利
//		1938	意大利	匈牙利	         巴西	         瑞典
//		1950	乌拉圭	巴西	                  瑞典	西班牙
//		1954	德国	        匈牙利	         奥地利	乌拉圭
//		1958	巴西	        瑞典	                  法国	德国
//		1962	巴西	        捷克斯洛伐克	智利	         南斯拉夫
//		1966	英格兰	德国	                  葡萄牙	苏联
//		1970	巴西	        意大利	        德国	         乌拉圭
//		1974	德国	        荷兰	                 波兰	         巴西
//		1978	阿根廷	荷兰	                 巴西	         意大利
//		1982	意大利	德国	                 波兰	          法国
//		1986	阿根廷	德国	                 法国	          比利时
//		1990	德国	        阿根廷	        意大利	英格兰
//		1994	巴西	        意大利	         瑞典	         保加利亚
//		1998	法国	        巴西	                克罗地亚	荷兰
//		2002	巴西	        德国	                土耳其	韩国
//		2006	意大利	法国      	       德国	         葡萄牙
//		2010	西班牙	荷兰	                德国	         乌拉圭
//		2014	德国	        阿根廷	        荷兰	          巴西
//		2018	法国	        克罗地亚	         比利时	英格兰
//      2022    中国    法国        阿根廷   英格兰
//		
//		以上为原始数据，利用容器保存。
//		控制台输入国家名，显示该国获得冠军的年份
//		如 输入   中国 
//		  显示     2020
		  
//		extra: 
//			控制台输入国家名，显示该国历年来世界杯前四名的数据
//		如 输入 法国
//		显示   冠军 1998 2018   第二名 2006 2022  第三名 1958 1986 第四名 1982
//			
//		case 4：
//		    已有List集合 集合中有原始数据如下
//		    List<String> list=new ArrayList<String>();
//			list.add("张一,中山区");
//			list.add("张二,甘井子区");
//			list.add("张三,西岗区");
//			list.add("张四,甘井子区");
//			list.add("张五,甘井子区");
//			list.add("张六,中山区");
//		将原始数据转存为map集合 ，并输出
//		输出格式为：  区,人数，人名
//		例如：  中山区,2人：张一,张六
//		             甘井子区,3人：张二,张四，张五
//		             。。。

```



## 讲解

```java
	public static void case_4(List<String> list) {
		// TODO Auto-generated method stub
		Map<String,List<String>> map=new HashMap<String,List<String>>();
		for(String each:list) {
//			each====="张一,中山区"
			String[] each_strs=each.split(",");  //[张一,中山区]   
//			each_strs[0]    人名   张一
//			each_strs[1]    区域  中山区
			if(map.containsKey(each_strs[1])) {
				map.get(each_strs[1]).add(each_strs[0]);//中山区={张一，张六}
			}else {
				map.put(each_strs[1], new ArrayList<String>());   //中山区={}
				map.get(each_strs[1]).add(each_strs[0]);  //中山区={张一}
			}
		}
//		System.out.println(map);
		
		Set<Entry<String,List<String>>> map_set=map.entrySet();
		for(Entry<String,List<String>> each:map_set) {
//			each  =====  中山区=[张一, 张六]     =====  String, List<String>
//			each.getKey()   中山区
//			each.getValue()   {张一, 张六}  (List<String>)
			System.out.print(each.getKey()+",");   //输出区域
			System.out.print(each.getValue().size()+"人：");   //输入人数
			for(String each_person:each.getValue()) {   //输入具体每个人名
				System.out.print(each_person+"  ");
			}
			System.out.println();   //换行
		}
	}

	public static void case_3(String nation) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1930, "乌拉圭");
		map.put(1934, "意大利");
		map.put(1938, "意大利");
		map.put(1950, "乌拉圭");
		map.put(1954, "德国");
		Set<Entry<Integer,String>> map_set=map.entrySet();
		
		StringBuilder strB=new StringBuilder(nation);
		for(Entry<Integer,String> each:map_set) {
			if(each.getValue().equals(nation)) {
				strB.append("   "+each.getKey());
			}
		}
		System.out.println(strB);
	}

	public static void case_2(int[] arr) {
		// TODO Auto-generated method stub
//		{2,2,3,3,3,4,4,4,4,5,5,2,2,2};   Map<元素，出现次数>
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int max_times=0;   //代表最大次数
		int max_times_value=arr[0];   //最大次数对应的元素
		for(int each:arr) {
			if(map.containsKey(each)) {
				map.put(each, map.get(each)+1);
			}else {
				map.put(each, 1);
			}
			if(max_times<map.get(each)) {
				max_times=map.get(each);
				max_times_value=each;
			}
			
		}
//		System.out.pri2ntln(map);
		System.out.println("最大次数"+max_times+",最大次数元素为"+max_times_value);
	}

	public static void case_1(String str) {
		// TODO Auto-generated method stub
//		a b c a a
//		a,3
//		b,1
//		c,1
        
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int index=0;index<=str.length()-1;index++) {
			char temp=str.charAt(index);
			if(map.containsKey(temp)) {
				map.put(temp, map.get(temp)+1);
			}else {
				map.put(temp, 1);
			}
		}
		Set<Entry<Character,Integer>> map_entry=map.entrySet();
		for(Entry<Character,Integer> each:map_entry) {
			System.out.println(each.getKey()+"出现"+each.getValue()+"次");
		}
	}

```

