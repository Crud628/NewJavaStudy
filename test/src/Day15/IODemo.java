package Day15;

import java.io.File;

public class IODemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      I/O体系  ：  java对于操作系统中，文件系统的支持    
//	File类 ：描述文件系统中 文件/目录的类
//	数据流I/O流： 数据的输入输出体系
//	      ！！！目录======文件夹
//	      ！！！I/O =====Input/Output

//	File: 可以获取文件/目录的 名称 大小 最后修改日期。。。    
//	     ！！！不能对文件内容进行访问
		File file_1 = new File("E:\\BaiduNetdiskDownload");
		//	1.java中 \\(双反斜杠) 表示从属关系
		//	2.！不要复制粘贴 手敲/文本编辑器转格式
//		if (file_1.exists()) { // 文件是否存在
//			System.out.println(file_1.getName()); // 获取文件名称
//			System.out.println(file_1.length()); // 获取文件大小
//			System.out.println(file_1.lastModified()); // 该文件 最后修改日期
//			System.out.println(file_1.getPath()); // 获取文件完整路径
//		} else {
//			System.out.println("文件不存在");
//		}
		String[] l = file_1.list();
		for (String string : l) {
			System.out.println(string);
		}
		
		
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
//		File file_5=new File("D:\\soft");
//		1.获取目录的子项，以子项名为元素，以字符串数组形式返回    list()
//		String[] str_arr=file_5.list();
//		for(String each:str_arr) {
//			System.out.println(each);
//		}
//		2.获取目录的子项，以file对象为元素，以file数组形式返回    listFiles()
//		File[] file_arr=file_5.listFiles();
//		for(File each:file_arr) {
//			System.out.println(each);
//		}

	}

}
