package Day16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		写入磁盘文件，txt，log，excel（csv,单元格 英文逗号分割）
		
		Student stu1=new Student("张一",21);
		stu1.addScore("语文", 58);
		stu1.addScore("数学", 90);
		stu1.addScore("英语", 87);
		Student stu2=new Student("张二",22);
		stu2.addScore("语文", 30);
		stu2.addScore("数学", 90);
		stu2.addScore("英语", 45);
		Student stu3=new Student("张三",23);
		stu3.addScore("语文", 80);
		stu3.addScore("数学", 90);
		stu3.addScore("英语", 88);
		Student stu4=new Student("张四",24);
		stu4.addScore("语文", 80);
		stu4.addScore("数学", 49);
		stu4.addScore("英语", 75);
		
		List<Student> list_stu=new ArrayList<Student>();
		list_stu.add(stu1);
		list_stu.add(stu2);
		list_stu.add(stu3);
		list_stu.add(stu4);
	
		try {
			BufferedWriter buff_w=new BufferedWriter(new FileWriter("F:\\成绩单.csv"));
			for (Student each : list_stu) {
				buff_w.write(each.toString());
			}
			buff_w.flush();
			buff_w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
