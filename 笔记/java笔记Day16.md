# java笔记Day16



## IO  字符流

```java
		// TODO Auto-generated method stub
//		字符输入流 FileReader
//		字符输出流 FileWriter
//		缓冲字符输入流  BufferedReader
//		缓冲字符输出流 BufferedWriter
		
//		编码格式：
//		java      GBK====》 windows体现为 ANSI     
//		windows   UTF-8
		
//		InputStreamReader/OutputStreamWriter   字节/字符转换  字节流和字符流的桥接器
//		！！！字符流无法更改编码格式 字节流可以
		
//		extra:判断编码格式
		
//		try {
////			读取ANSI/GBK编码格式 文本类型 文件
////			BufferedReader buff_r=new BufferedReader(new FileReader("D:\\IO_test\\ANSI_a.txt"));
//			
////			读取UTF编码格式 文本类型 文件
//			InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\IO_test\\UTF_a.txt"),"utf-8");
//			BufferedReader buff_r=new BufferedReader(isr);
//			
////			以ANSI/GBK编码格式 写入文件
//			BufferedWriter buff_w=new BufferedWriter(new FileWriter("D:\\IO_test\\ANSI_b.txt"));
//			
////			以UTF-8编码格式 写入文件
////			OutputStreamWriter osr=new OutputStreamWriter(new FileOutputStream("D:\\IO_test\\UTF_b.txt"),"utf-8");
////			BufferedWriter buff_w=new BufferedWriter(osr);
//			
//			
////			int temp=0;
////			while((temp=buff_r.read())!=-1) {
////				buff_w.write(temp);
////			}
//			
////			缓冲字符流独有功能 ： 读整行  readLine()
//			String temp="";
//			while((temp=buff_r.readLine())!=null) {  //读取整行
//				buff_w.write(temp);    //写入整行
////				buff_w.write("\r\n");  换行
//				buff_w.newLine();   //换行
//			}
//			
//			buff_r.close();
//			buff_w.flush();
//			buff_w.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

```



## CSV

```java
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
			BufferedWriter buff_w=new BufferedWriter(new FileWriter("D:\\IO_test\\成绩单.csv"));
			for (Student each : list_stu) {
				buff_w.write(each.toString());
			}
			buff_w.flush();
			buff_w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

```

