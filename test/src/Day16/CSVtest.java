package Day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//以成绩单.csv文件作为数据来源
//case:
//	1.读取成绩单.csv文件，将读取的数据逐行输出至控制台
//	2.将所有不及格人员的名单 以及对应的不及格科目数据提取保存至一个map集合中
//	3.将map中数据 写入磁盘保存 文件为 不及格成绩.txt 格式如下
//	         张二 英语 语文
//	         张四 数学
public class CSVtest {

	public static void main(String[] args) {
//		以成绩单.csv文件作为数据来源
//		case:
//			1.读取成绩单.csv文件，将读取的数据逐行输出至控制台
//		    2.将所有不及格人员的名单 以及对应的不及格科目数据提取保存至一个map集合中 
//		          map<不及格的人名，不及格的科目>   =======   map<String,List<String>>
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		try {
			BufferedReader buff_r = new BufferedReader(new FileReader("F:\\成绩单.csv"));
			String temp = "";
			while ((temp = buff_r.readLine()) != null) {
//				张一,21,语文,58
				System.out.println(temp);
				String[] str_arr = temp.split(","); // 逗号分割该字符串 得到字符串数组
//				str_arr[0]===人名   str_arr[1]===年龄 str_arr[2]===科目 str_arr[3]===分数 
				if (Integer.parseInt(str_arr[3]) < 60) { // 判断是否及格
					if (map.containsKey(str_arr[0])) { // 判断该姓名是否在集合中
						map.get(str_arr[0]).add(str_arr[2]);
					} else {
						map.put(str_arr[0], new ArrayList<String>()); // 新建 键值对 人名，科目集合
						map.get(str_arr[0]).add(str_arr[2]);
					}
				}
			}
			buff_r.close();
//			System.out.println(map);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		3.将map中数据 写入磁盘保存 文件为 不及格成绩.txt 格式如下
//		         张二 英语 语文
//		         张四 数学
		try {
			BufferedWriter buff_w=new BufferedWriter(new FileWriter("F:\\不及格成绩.log"));
			Set<Entry<String,List<String>>> set=map.entrySet();
			for(Entry<String,List<String>> each:set) {
//				each.getKey()===人名   each.getValue()===List<String> 不及格科目
				buff_w.write(each.getKey()+"\t");  //写人名
				for(String each_subject:each.getValue()) {  //循环不及格科目的集合
					buff_w.write(each_subject+"\t");   //写科目
				}
				buff_w.newLine();  //换行
			}
			buff_w.flush();
			buff_w.close();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
