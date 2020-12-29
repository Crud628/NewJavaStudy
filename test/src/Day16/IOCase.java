package Day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IOCase {

	public static void main(String[] args) {
		String src = "F:\\data\\20190820.log";
		String desc = "F:\\data\\20190820-副本.log";
		long start  = new Date().getTime();
		carScreen(src, desc);
		carErr(desc);//[冀B6705W, 晋B52799]
//		carErr2(src);//筛选和误报合并
		long end  = new Date().getTime();
		System.out.println(end-start);//1s多一点
		//正确答案  [冀B6705W, 晋A3983X, 晋B52799, 冀B5915C]
		//剩下的车牌号在其他的文件
		
		
		//中间测试数据
//		carScreen2(desc, "F:\\data\\20190820-副本2.log");
//		String car = "[2019/8/20 0:00:07]通道02:19019536,冀B8A720,01,192.168.33.211,2019-08-20 00:00:12";
//		String[] a = carInformation(car);
//		String car2 = "[2019/8/20 0:00:04]通道01:19018123,冀A156UN";
//		String[] b = carInformation(car2);
//		for (String string : m) {
//			System.out.println(string);
//		}
//		carCompare(a,b);
		
		
		
	}
	
	/**
	 * 初步赛选，挑出未识别出车牌号的数据
	 * @param src  目标文件路径
	 * @param desc 筛选后文件路径
	 */
	public static void carScreen(String src,String desc) {
		try {
			BufferedReader r = new BufferedReader(new FileReader(src));
			BufferedWriter w = new BufferedWriter(new FileWriter(desc));
			String str = "";
			while((str=r.readLine())!=null) {
				if(isTrue(str)) {
					w.write(str);
					w.newLine();
				}
			}
			r.close();
			w.flush();
			w.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	/**
	 * 筛选的核心
	 * @param str  要检测的字符串
	 * @return  是否合格
	 */
	public static boolean isTrue(String str) {
//		if(str.length()==40||str.length()==41) {
//			return true;
//		}
//		return false;
		if(str.split(",").length>1
				&&str.split("]").length>1
				&&!(str.split(",")[0].contains("-"))
				&&!(str.split(",")[1].contains(" "))
				&&!(str.contains("挂"))
				) {
			return true;
		}
		return false;
	}
	
	/**
	 * 遍历筛选 输出误报车辆
	 * @param src 检测日志  经过第一次筛选的文件
	 */
	public static void carErr(String src) {
		List<String[]> a = new ArrayList<String[]>();
		Set<String> x = new HashSet<String>();
		try {
			BufferedReader r = new BufferedReader(new FileReader(src));
			String str = "";
			while((str=r.readLine())!=null) {
				a.add(carInformation(str));
				for (int i = a.size()-1; i > 1; i--) {
					int flag = carCompare(a.get(a.size()-1), a.get(i));
					if(flag!=-1&&flag<=120) {
						x.add(carInformation(str)[4]);
					}else if(carCompare2(a.get(a.size()-1), a.get(i))>120) {
						break;
					}
					
				}
			}
			r.close();
			System.out.println(x);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 筛选和挑出误报合并
	 * @param src
	 */
	public static void carErr2(String src) {
		List<String[]> a = new ArrayList<String[]>();
		Set<String> x = new HashSet<String>();
		try {
			BufferedReader r = new BufferedReader(new FileReader(src));

			String str = "";
			while((str=r.readLine())!=null) {
				if(isTrue(str)) {
					a.add(carInformation(str));
					for (int i = a.size()-1; i > 1; i--) {
						int flag = carCompare(a.get(a.size()-1), a.get(i));
						if(flag!=-1&&flag<=120) {
							x.add(carInformation(str)[4]);
						}else if(carCompare2(a.get(a.size()-1), a.get(i))>120) {
							break;
						}
						
					}
				}
			}
			r.close();

			System.out.println(x);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 单条数据格式化
	 * @param str  一条筛选后的数据
	 * @return
	 */
	public static String[] carInformation(String str) {
		//日期xxxx/xx/xx   时间xx:xx:xx/x:xx:xx    通道xx     路号xxxxxxxx{8}      车牌  汉字+字母+数字{7}
		String[] ss = {null,null,null,null,null};
		String[] s = str.split(" ");
//		System.out.println(str);
		String c_date = s[0].substring(1);
//			System.out.println("日期："+c_date);
		ss[0] = c_date.trim();;
		String c_time = s[1].split("]")[0];
//			System.out.println("时间："+c_time);
		ss[1] = c_time.trim();
		String c_pass = str.split("]通道")[1].split(":")[0];
//			System.out.println("通道："+c_pass);
		ss[2] = c_pass.trim();;
		String c_l = str.split("]通道")[1].split(":")[1].split(",")[0];
//			System.out.println("路号："+c_l);
		ss[3] = c_l.trim();;
		String c_id = str.split("]通道")[1].split(":")[1].split(",")[1];
//			System.out.println("车牌："+c_id);
		ss[4] = c_id.trim();;
		return ss;
	}
	
	/**
	 * 两条信息比较，如果满足条件，返回相差毫秒数。否则返回-1
	 * @param a 较晚的时间
	 * @param b 较早的时间
	 * @return
	 */
	public static int carCompare(String[] a,String[] b) {
		int m = -1;
		if(a[4].equals(b[4])
				&&a[3].equals(b[3])
				&&!(a[2].equals(b[2]))) {
			LocalTime a1 = LocalTime.parse(a[1].length()==7?"0"+a[1]:a[1]);
			LocalTime b1 = LocalTime.parse(b[1].length()==7?"0"+b[1]:b[1]);
			m = a1.getHour()*3600 + a1.getMinute()*60 +a1.getSecond()-
					(b1.getHour()*3600 + b1.getMinute()*60 +b1.getSecond());
//			中间数据核对
//			if(m<=120) {
//				System.out.println(Arrays.toString(a));
//				System.out.println(Arrays.toString(b));
//			}
		}
		return m;
	}
	/**
	 * 单纯比较两个时间  缩短list遍历
	 * @param a 较晚的时间
	 * @param b 较早的时间
	 * @return
	 */
	public static int carCompare2(String[] a,String[] b) {
		int m = -1;
		LocalTime a1 = LocalTime.parse(a[1].length()==7?"0"+a[1]:a[1]);
		LocalTime b1 = LocalTime.parse(b[1].length()==7?"0"+b[1]:b[1]);
		m = a1.getHour()*3600 + a1.getMinute()*60 +a1.getSecond()-
				(b1.getHour()*3600 + b1.getMinute()*60 +b1.getSecond());
		return m;
	}
	
	
	/**
	 * 筛选后验证
	 * @param src  目标文件路径
	 * @param desc 筛选后文件路径
	 */
	public static void carScreen2(String src,String desc) {
		try {
			BufferedReader r = new BufferedReader(new FileReader(src));
			BufferedWriter w = new BufferedWriter(new FileWriter(desc));
			String str = "";
			while((str=r.readLine())!=null) {
					w.write(str.split(",")[1]);
					w.newLine();
			}
			r.close();
			w.flush();
			w.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
