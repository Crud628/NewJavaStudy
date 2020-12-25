# java笔记Day14



## Date类

```java

//	@SuppressWarnings("deprecation")   //检测代码中 是否有过期方法（未来可能会被取消）
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		时间/日期  Date  Calendar
//		Date类
		
//		实例化无参Date对象 系统当前时间
		Date date_1=new Date();
		System.out.println(date_1);

//		实例化有参Date对象(3参数) 指定日期
		Date date_2=new Date(2019-1900,10-1,1);  //年-1900 月-1
		System.out.println(date_2);
		
//		实例化有参Date对象(6参数) 指定日期/时间
		Date date_3=new Date(2019-1900,10-1,1,10,18,58);
		System.out.println(date_3);
		
//		常用方法
//		date_1.setDate(30);   //设置日期
//		System.out.println(date_1.getDate());  //获取日期
//		System.out.println(date_1);
		
		Date date_now=new Date();
		Date date_yesterday=new Date(2020-1900,12-1,24);
		Date date_tomorrow=new Date(2020-1900,12-1,26);
		Date date_day_after_tomorrow=new Date(2020-1900,12-1,27);
		
		
//		date_1.getYear()   获取年份 从1900开始计算
//		date_1.setYear(year);
		System.out.println(date_now.getYear()+1900);

//		date_1.getMonth()  月份 从0开始
//		date_1.setMonth(month);
		System.out.println(date_now.getMonth());

//		*date_1.getDay() 一周中的第几天  从0开始  星期日为一周中的第一天
		System.out.println(date_now.getDay());
		
//		date_1.getHours()  小时
//		date_1.setHours(hours);
//		System.out.println(date_now.getHours());
//		date_now.setHours(date_now.getHours()+18);
//		System.out.println(date_now);		
		
//		date_1.getMinutes()  分钟
//		date_1.setMinutes(minutes);
//		date_now.setMinutes(100);
//		System.out.println(date_now.getMinutes());
//		System.out.println(date_now);

//		date_1.getSeconds()  秒
//		date_1.setSeconds(seconds);		
		
//		*date_1.getTime()  1970.1.1 0:00:00 至现在的 毫秒数 1000毫秒(ms)=1秒(s)
		System.out.println(date_now.getTime());
//		*date_1.setTime(time);  //根据毫秒数获取时间
//		date_now.setTime(1200005243568L);
//		System.out.println(date_now);
		
//		*date_1.before(when) date_1.after(when)  
		System.out.println(date_now.before(date_tomorrow));  //a.before(b) a是否在b之前
//		a.after(b) a是否在b之后
		
		
//		*date_1.equals(obj)  被equals重写  判断日期和时间
//		Date test1=new Date(2019-1900,10-1,1);
//		Date test2=new Date(2019-1900,10-1,1);
//		System.out.println(test1.equals(test2));	
		
//		*date_1.compareTo(anotherDate)
		System.out.println(date_now.compareTo(date_tomorrow));
		System.out.println(date_now.compareTo(date_day_after_tomorrow));
//		a.compareTo(b) 
//		a早  b晚   -1
//		a晚   b早   1
//		日期和时间完全一致   0

```

## 固定格式日期

```java
//		文本日期  Date   格式转换
//		Date  =====》  自定义文本格式
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		//实例化 SimpleDateFormat 对象  同时确定文本格式
//		年  yyyy/y/yy
//		月  MM/M
//		日  dd/d
//	         时  HH/H
//	         分  mm/m
//	         秒  ss/s		
		String str_date=sdf.format(date_now);
		System.out.println(str_date);

```



## Case

```java
//		case 1: 
//			计算指定日期距离现在多少天
		String target_str = "1949年10月1日";
		System.out.println(case_1(target_str));

//		case 2:
//			显示下个月的倒数第3天
		System.out.println(case_2());
//		case 3:
//			显示距离下个感恩节还有多少天 （每年11月的最后一个星期四/11月的第四个星期四）
		System.out.println(case_3());

```

## Calendar

```java
//		Calendar 跟日期/时间 有关的 抽象类
//		非抽象子类  GregorianCalendar
		
//		实例化Calendar 无参 获取当前时间
		Calendar calen_1=new GregorianCalendar();  
		System.out.println(calen_1);  //包含了所有当前日期时间的数据
//		Date xxx=calen_1.getTime();  //Calendar对象.getTime()  =====>  对应的Date对象
//		System.out.println(xxx);
//		System.out.println(calen_1.getTime().getTime());
		
//		Calendar静态方法 获取当前时间
		Calendar calen_2=Calendar.getInstance();
		System.out.println(calen_2.getTime());

//		获取指定时间
//		Calendar calen_3=new GregorianCalendar(2020,12-1,25); 
//		Calendar calen_3=new GregorianCalendar(2020,12-1,25,16,47,58); 
		Calendar calen_3=new GregorianCalendar(2020,Calendar.DECEMBER,25,16,47,58); 
		System.out.println(calen_3.getTime());
		
//		Calendar常用方法  :  向获取/赋值 什么属性 就把哪个属性写为参数
//		add()   set()    get()
		
//		calen_1.set(Calendar.YEAR, 2035);
		calen_1.add(Calendar.YEAR, -10);
		System.out.println(calen_1.get(Calendar.YEAR));
		
//		Calendar.MONTH
//		Calendar.DATE
//		Calendar.HOUR
//		Calendar.MINUTE
//		Calendar.SECOND
//		Calendar.WEEK_OF_MONTH
//		Calendar.WEEK_OF_YEAR
//		Calendar.DAY_OF_WEEK
//		Calendar.DAY_OF_MONTH
//		Calendar.DAY_OF_YEAR
//		Calendar.AM_PM
		
//		calen_1.after(when)
//		calen_1.before(when)
//		calen_1.compareTo(anotherCalendar)
//		*calen_1.getTimeInMillis()  //毫秒数
		System.out.println(calen_1.getTimeInMillis());
		
//		isLeapYear()   判断是否为闰年  写在 GregorianCalendar 中（子类）
		GregorianCalendar g_calen=new GregorianCalendar();
		System.out.println(g_calen.isLeapYear(2021));
		
//		case:  JAVA8 : LocalDate  LocalTime  LocalDateTime   Instant


```

## case答案

```java
	public static int case_3() {
		int year = new Date().getYear();  //获取年
		int days = (int) ((thanks_giving(year).getTime() - new Date().getTime()) / 24 / 60 / 60 / 1000);
		if (days >= 0) {
			return days;
		} else {
			return (int) ((thanks_giving(year + 1).getTime() - new Date().getTime()) / 24 / 60 / 60 / 1000);
		}
	}

	public static Date thanks_giving(int year) { // 获取某一年的感恩节Date对象
		Date thank_giving = new Date(year, 10, 30); // 创建Date对象 当年11月30日
		while (thank_giving.getDay() != 4) { // 判断该日期是否位星期四
			thank_giving.setDate(thank_giving.getDate() - 1); // 依次往前挪1天
		}
		return thank_giving;
	}

	public static Date case_2() {
		Date now_date = new Date(); // 获取当前日期
		now_date.setMonth(now_date.getMonth() + 2); // 后一个月
		now_date.setDate(1); // 后一个月的1号
		now_date.setDate(now_date.getDate() - 3); // 往前数3天
		return now_date;
	}

	public static int case_1(String target_str) {
		// TODO Auto-generated method stub
//		求两个日期的 毫秒数的差====》相差多少天
//		1.将字符串日期 变为  Date对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日");
		Date target_date = new Date();
		try {
			target_date = sdf.parse(target_str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		2.求毫秒数差 ===》 天数差
		Date now_date = new Date();
		return (int) ((now_date.getTime() - target_date.getTime()) / 24 / 60 / 60 / 1000); // long==>int

```

