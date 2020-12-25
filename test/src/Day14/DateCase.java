package Day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//case 1: 
//计算指定日期距离现在多少天
//String target_str="1949年10月1日";
//case 2:
//显示下个月的倒数第3天
//case 3:
//显示距离下个感恩节还有多少天 （每年11月的最后一个星期四/11月的第四个星期四）

public class DateCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str_date="2022-12-25 13:36:10";
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date dateX=new Date();
//		try {
//			dateX=sdf.parse(str_date);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("文本日期格式有误");
//		}
//		System.out.println(dateX);
		
		//case1
		String target_str="1949-10-1";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date dateX=new Date();
		try {
			dateX=sdf.parse(target_str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long t = new Date().getTime()-dateX.getTime();
		long days = t/(24*60*60*1000); 
		System.out.println(days>0?days:-days);
		
		
		//case2
		Date date = new Date();
		Date newDate = new Date(date.getYear(),date.getMonth()+2,-5);
		System.out.println(newDate);
		
		//case3
		Date n = new Date(2021-1900,10,30);
		for (int i = 0; i < 6; i++) {
			if(n.getDay() == 3) {
				break;
			}else {
				n.setDate(30-i);
			}
		}
		System.out.println(n);
		long t2 = n.getTime() - date.getTime();
		long days2 = t2/(24*60*60*1000); 
		System.out.println(days2+"天");
		
		
		
		
		
		
		
		
		
		
		
	}

}
