package Day14;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		calen_1.add(Calendar.MONTH, -10);
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
//		*calen_1.getTimeInMillis()
	}

}
