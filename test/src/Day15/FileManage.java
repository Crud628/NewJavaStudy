package com.common;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class FileManage {
	/**
	 * 将内容写入当前项目中的指定文件中，可实现追加的功能
	 * @param sc
	 */
	public static void writeFile(Scanner sc){
		OutputStream ops=null;
		System.out.println("请录入文件名");
		try {
			//追加
			ops=new FileOutputStream(new File(sc.next()),true);
			System.out.println("请录入内容");
			ops.write(sc.next().getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			//关闭资源
			/*try {
				ops.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		
	}
	/**
	 * 从文件中读取数据，将结果输出到控制台
	 * @param fName
	 */
	public static void readFile(String fName){
		InputStream ips=null;
		try {
			ips=new FileInputStream(fName);
			//读
			byte data[]=new byte[1024];
			//长度
			int len=0;
			//循环读
			while ((len=ips.read(data))!=-1) {
				//输出到控制台
				System.out.println(new String(data,0,len));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			//关闭资源
			try {
				ips.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * 将文件src复制到当前项目路径下的desc
	 * @param src
	 * @param desc  目标
	 */
	public static void fileCopy(String src,String desc){
		//先读文件再写文件
		InputStream ips=null;
		OutputStream ops=null;
		try {
			ips=new FileInputStream(src);
			ops=new FileOutputStream(desc);
			//循环地读写
			byte data[]=new byte[1024];
			int len=0;
			while ((len=ips.read(data))!=-1) {
				//将读到的内容写入到文件中
				ops.write(data, 0, len);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			//关闭资源  先使用后关闭
			try {
				ops.close();
				ips.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	/**
	 * 将指定文件夹下的文件复制到当前项目下指定目录下的文件
	 * @param srcDir
	 * @param srcName
	 * @param descDir
	 * @param descName
	 */
	public static void filecopy(String srcDir,String srcName,String descDir,String descName){
		//先读再写
		InputStream ips=null;
		OutputStream ops=null;
		try {
			if (!new File(srcDir).exists()) {
				System.out.println("目录不存在");
				return;
			}
			ips=new FileInputStream(new File(srcDir+"/"+srcName));
			//如果没有目标目录,则创建目录
			File desc=new File(descDir);
			if (!desc.exists()) {
				desc.mkdir();
			}
			ops=new FileOutputStream(new File(descDir+"/"+descName));
			//循环地读写
			byte data[]=new byte[1024];
			int len=0;
			while ((len=ips.read(data))!=-1) {
				//将读到的内容写入到文件中
				ops.write(data, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			//关闭资源先使用后关闭
			try {
				if (ops!=null&&ips!=null) {
					ops.close();
					ips.close();
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	/**
	 * 将指定文件夹下的文件复制到当前项目下指定目录下的文件
	 * @param srcDir
	 * @param srcName
	 * @param descDir
	 * @param descName
	 */
	public static void filecopy(String srcDir,List<File> files,String descDir){
		//先读再写
		InputStream ips=null;
		OutputStream ops=null;
		try {
			if (!new File(srcDir).exists()) {
				System.out.println("目录不存在");
				return;
			}
			//得到该目录下的所有的文件 引用数据类型
			listFiles(new File(srcDir), files);
			for (int i = 0; i < files.size(); i++) {
				
				ips=new FileInputStream(files.get(i));
				//如果没有目标目录,则创建目录
				File desc=new File(descDir);
				if (!desc.exists()) {
					desc.mkdir();
				}
				ops=new FileOutputStream(new File(descDir+"/"+files.get(i).getName()));
				//循环地读写
				byte data[]=new byte[1024];
				int len=0;
				while ((len=ips.read(data))!=-1) {
					//将读到的内容写入到文件中
					ops.write(data, 0, len);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			//关闭资源先使用后关闭
			try {
				if (ops!=null&&ips!=null) {
					ops.close();
					ips.close();
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	/**
	 * 得到某个目录下的所有文件
	 * @param dir
	 */
	public static void listFiles(String dir){
		//文件对象
		File file=new File(dir);
		//判断是否为目录
		if (file.isDirectory()) {
			//得到某个目录下的所有文件存入文件数组中（装 的是文件及目录）
		     File data[]=file.listFiles();
		     //输出
		     for (File file2 : data) {
		    	 //判断是否是目录  递归
		    	 if (file2.isDirectory()) {
					//再次调用当前方法   img2 需要的是目录的完整路径：f:/img/img2
		    		 //listFiles(file2.getParent()+"/"+file2.getName());
		    		 listFiles(file2.getAbsolutePath());
				} else {
					System.out.println(file2);

				}
			}
		}
	}
	/**
	 * 得到某个目录下的文件及子目录下的文件
	 * @param file
	 */
	public static File[] listFiles(File file){
		if (file.isDirectory()) {
			//得到所有的文件或目录
			File data[]=file.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					// TODO Auto-generated method stub
					//()表示分组  |表示或者  第一个点表示的是任意字符，第二个是＼．aa.txt
					if (pathname.isDirectory()) {
						//如果是目录的话递归
						listFiles(pathname);
					}
					return pathname.getName().matches("^.+\\.(jpg|png)$");
				}
			});
			
			for (File file2 : data) {
				//判断是否是目录
				/*if (file2.isDirectory()) {
					//递归
					listFiles(file2);
				} else {*/
					//List<File>  用集合存文件对象
						System.out.println(file2);
						
				//}
			}
			return data;
		}
		return null;
	}
	/**
	 * 将得到的所有文件存入集合中
	 */
	public static void listFiles(File file,List<File> files){
		if (file.isDirectory()) {
			//得到所有的文件或目录
			File data[]=file.listFiles();
			
			for (File file2 : data) {
				//判断是否是目录
				if (file2.isDirectory()) {
					//递归
					listFiles(file2,files);
				} else {
					//List<File>  用集合存文件对象
					if (file2.getName().matches("^.+\\.(jpg|png)$")) {
						files.add(file2);
					}
						
				}
			}
		}
	}
}
