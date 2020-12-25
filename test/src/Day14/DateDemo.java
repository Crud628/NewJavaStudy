package Day14;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		//时间  日期   Date  Calender
//		Date类
		
		//实例化无参Date对象  系统当前时间
		Date date1 = new Date();
		System.out.println(date1);//Fri Dec 25 09:48:20 CST 2020
		
		//实例化有参Date对象  指定日期
		Date date2 = new Date(2019,10,1);//正确写法（2019-1900，10-1，1）
		System.out.println(date2);//Sat Nov 01 00:00:00 CST 3919

		Date date3 = new Date(2019-1900,10-1,1,10,18,58);
		System.out.println(date3);//Tue Oct 01 10:18:58 CST 2019
		
		//常用方法
		date1.setDate(30);  //设置日期
		System.out.println(date1);
		System.out.println(date1.getDate());//获取日期  30
//		date_1.getYear()
//		date_1.setYear(year);
//		date_1.getMonth()
//		date_1.setMonth(month);
//		*date_1.getDay()
//		date_1.getHours()
//		date_1.setHours(hours);
//		date_1.getMinutes()
//		date_1.setMinutes(minutes);
//		date_1.getSeconds()
//		date_1.setSeconds(seconds);
//		*date_1.getTime()
//		*date_1.setTime(time);
//		*date_1.before(when) date_1.after(when) 
//		*date_1.equals(obj) 
//		*date_1.compareTo(anotherDate)

		System.out.println("------------");
		System.out.println(date1.getYear());//120
		date1.setYear(2077);//3977
		System.out.println(date1);//Fri Dec 30 10:14:34 CST 3977
		System.out.println(date1.getMonth());//11
		date1.setMonth(13);
		System.out.println(date1);//Thu Mar 02 10:15:31 CST 3978
		System.out.println(date1.getDay());//4    星期-1
		System.out.println(date1.getHours());//10
		date1.setHours(11);
		System.out.println(date1);//Thu Mar 02 11:15:31 CST 3978
		System.out.println(date1.getMinutes());//15
		date1.setMinutes(61);
		System.out.println(date1);//Thu Mar 02 12:01:31 CST 3978
		System.out.println(date1.getSeconds());//31
		date1.setSeconds(61);
		System.out.println(date1);//Thu Mar 02 12:02:01 CST 3978
		System.out.println(date1.getTime());//63371563321533   每次不固定  根据1970-1-1 0：00：00差值确定
		date1.setTime(3123123);
		System.out.println(date1);//Thu Jan 01 08:52:03 CST 1970
		System.out.println(date1.before(date2));//true
		System.out.println(date1.after(date2));//false
		System.out.println(date1.equals(date2));//false
		System.out.println(date1.compareTo(date3));//-1

		
	}
}
