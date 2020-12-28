# java笔记Day15







## I/O

```java
//          I/O体系  ：  java对于操作系统中，文件系统的支持    
//		File类 ：描述文件系统中 文件/目录的类
//		数据流I/O流： 数据的输入输出体系
//		      ！！！目录======文件夹
//		      ！！！I/O =====Input/Output
		
		
//		File: 可以获取文件/目录的 名称 大小 最后修改日期。。。    
//		     ！！！不能对文件内容进行访问
		File file_1=new File("D:\\IO_test");
//		1.java中 \\(双反斜杠) 表示从属关系
//		2.！不要复制粘贴 手敲/文本编辑器转格式
		if(file_1.exists()) {                      //文件是否存在
			System.out.println(file_1.getName());  //获取文件名称
			System.out.println(file_1.length());   //获取文件大小
			System.out.println(file_1.lastModified());  //该文件 最后修改日期
			System.out.println(file_1.getPath());  //获取文件完整路径
		}else {
			System.out.println("文件不存在");
		}
		

```



```java
		
//	    创建新文件
//		File file_2=new File("D:\\IO_test\\xxx\\b.txt");
//		try {
//			System.out.println(file_2.createNewFile()); //返回值 boolean 表示 文件是否被新建
//			System.out.println("文件创建成功");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("文件创建失败");
//		}
		
//		File对象.createNewFile()   
//		1.返回值boolean 文件创建 true  文件已有 false
//		2.该方法需要捕获异常，如果File对象路径中，有目录不存在，则报 IOexception
		
//		创建目录
//		File file_3=new File("D:\\IO_test\\a\\b");
//		System.out.println(file_3.mkdir() );  //mk   make   dir   directory
//		!!!mkdir() 只能创建最后一级目录
//		System.out.println(file_3.mkdirs() );   //创建完整目录
		
//		删除目录/文件
//		System.out.println(file_3.delete()); //删除 File对象路径 最后一级
		
//		isFile()/isDirectory()  判断File对象的路径 是 文件/目录
//		File file_4=new File("D:\\IO_test\\a");
//		System.out.println(file_4.isFile());
//		System.out.println(file_4.isDirectory());
		
		
//		获取目录的子项
		File file_5=new File("D:\\soft");
//		1.获取目录的子项，以子项名为元素，以字符串数组形式返回    list()
//		String[] str_arr=file_5.list();
//		for(String each:str_arr) {
//			System.out.println(each);
//		}
//		2.获取目录的子项，以file对象为元素，以file数组形式返回    listFiles()
		File[] file_arr=file_5.listFiles();
		for(File each:file_arr) {
			System.out.println(each);
		}

```



```java
//		I/O数据流：  数据的无结构化传递
//		字节流   字符流
//		区别： 处理数据的最小单位，一个是字节，一个是字符
//		使用场景：  
//		        字符： 纯文本文件
//		        字节： 非文本文件

//		字节流：  字节输入流   字节输出流
//		输入：  外部传输数据至jvm（java虚拟机）
//		输出： jvm传递数据至外部

//		 字节输入流： FileInputStream

//		try {
////			File file=new File("D:\\IO_test\\a.txt");
////			FileInputStream file_in=new FileInputStream(file);  //实例化FileInputStream对象
//			FileInputStream file_in=new FileInputStream("D:\\IO_test\\img12.jpg");  //构造方法 file对象/文件路径
//			//读取文件内容   字节输入流.read()   file_in.read()
////			该方法功能 获取当前字符的ascii码值 并指向下一个字符 直到字符为空 返回 -1
////			1234567890
////			          ^ 
//			int temp=0;
//			while((temp=file_in.read())!=-1) {
//				System.out.print((char)temp);
//			}
//			file_in.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		字节输出流  FileOutputStream
//		try {
//			FileOutputStream file_out=new FileOutputStream("D:\\IO_test\\b.txt"); //覆盖原文件
////			FileOutputStream file_out=new FileOutputStream("D:\\IO_test\\b.txt",true); //追加原文件
////			写入文件内容  字节输出流对象.write()
//			file_out.write(97);
//			file_out.write(112);
//			file_out.write(112);
//			file_out.write(108);
//			file_out.write(101);
//			
//			file_out.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		case: 复制一张图片至指定位置 （自己指定） 
//		long start=new Date().getTime();  //获取当前毫秒数
		long start = System.currentTimeMillis(); // 获取当前毫秒数
		try {
			FileInputStream case_file_in = new FileInputStream("D:\\IO_test\\普通流.jpg");
			FileOutputStream case_file_out = new FileOutputStream("D:\\IO_test\\普通流 副本.jpg");
			int temp = 0;
			while ((temp = case_file_in.read()) != -1) {
				case_file_out.write(temp);
			}

			case_file_in.close(); // 先关闭输入流
			case_file_out.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
//		缓冲/缓存(buffered) 字节流：  
//		缓冲字节输入流  BufferedInputStream
//		缓冲字节输出流  BufferedOutputStream
//		

//		区别：
//		普通：从磁盘读取  写入磁盘
//		缓冲/缓存：数据读取至内核空间的缓冲区中   从缓冲区写入磁盘

		start = System.currentTimeMillis();
		try {
			// 实例化缓冲流对象 ！！！缓冲流对象必须以普通流对象作为构造方法参数
//			FileInputStream case_file_in = new FileInputStream("D:\\IO_test\\缓冲流s.jpg");
//			BufferedInputStream buff_in=new BufferedInputStream(case_file_in);
			BufferedInputStream buff_in = new BufferedInputStream(new FileInputStream("D:\\IO_test\\缓冲流.jpg"));
			BufferedOutputStream buff_out = new BufferedOutputStream(new FileOutputStream("D:\\IO_test\\缓冲流 副本.jpg"));
			int temp = 0;
			while ((temp = buff_in.read()) != -1) {
				buff_out.write(temp);
			}

			buff_in.close(); // 关闭缓冲字符输入
			buff_out.flush(); // 清空缓冲区 将缓冲区内数据（如果有）写入磁盘
			buff_out.close(); // 关闭缓冲字符输出
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);

		
//		字符输入流 FileReader
//		字符输出流 FileWriter
//		缓冲字符输入流  BufferedReader
//		缓冲字符输出流 BufferedWriter
	}

}
```





