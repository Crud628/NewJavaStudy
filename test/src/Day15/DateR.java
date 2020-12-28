package Day15;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Calendar cal=new GregorianCalendar();
		 for(int i=1999;;i+=100){
			 cal.setTime(new Date(i-1900,11,31));
			 if(cal.get(Calendar.DAY_OF_WEEK)==1){
				 System.out.println(i);
				 break;
			 }
		 }

	}

}
