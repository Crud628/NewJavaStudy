package Day15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

public class IODemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  I/O数据流   数据的无结构化传递
		//字节流  字符流
//		区别  ：  处理数据的最小单位  一个是字节，一个是字符
//		使用场景：
//			字符：纯文本文件
//			字节：非纯文本文件
		
		
//		字节流：字节输入流  字节输出流
//		输入：外部传输数据至JVM（java虚拟机）
//		输出：jvm传递数据至外部
//		字节流：  字节输入流   字节输出流
//		输入：  外部传输数据至jvm（java虚拟机）
//		输出： jvm传递数据至外部

//		 字节输入流： FileInputStream

//		try {
////			File file=new File("D:\\IO_test\\a.txt");
////			FileInputStream file_in=new FileInputStream(file);  //实例化FileInputStream对象
//			FileInputStream file_in=new FileInputStream("D:\\IO_test\\img12.jpg");  //构造方法 file对象/文件路径
			//读取文件内容   字节输入流.read()   file_in.read()
//			该方法功能 获取当前字符的ascii码值 并指向下一个字符 直到字符为空 返回 -1
//			1234567890
//			          ^ 
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
//			FileOutputStream file_out=new FileOutputStream("D:\\IO_test\\b.txt");
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
//		long start = new Date().getTime();
//		try {
//			File file = new File("E:\\BaiduNetdiskDownload\\贝\\贝-原图.jpg");
//			FileInputStream file_in = new FileInputStream(file);
//			File file2 = new File("E:\\Users\\asus\\Desktop\\贝-副本.jpg");
//			FileOutputStream fos = new FileOutputStream(file2);
//			int temp = 0;
//			while((temp=file_in.read())!=-1) {
//				fos.write(temp);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		long end = new Date().getTime();
//		System.out.println(end-start);
		
		
		long start = new Date().getTime();
		try {
//			File file = new File("E:\\BaiduNetdiskDownload\\贝\\贝-原图.jpg");
//			FileInputStream file_in = new FileInputStream(file);
//			File file2 = new File("E:\\Users\\asus\\Desktop\\aa.jpg");
//			file.mkdir();
//			FileOutputStream fos = new FileOutputStream(file2);
//			int temp = 0;
//			while((temp=file_in.read())!=-1) {
//				fos.write(temp);
//			}

			
//			byte data[]=new byte[1024];
//			int len=0;
//			while ((len=file_in.read(data))!=-1) {
//				//将读到的内容写入到文件中
//				fos.write(data, 0, len);
//			}
			
			InputStream ins = new BufferedInputStream(new FileInputStream("E:\\BaiduNetdiskDownload\\贝\\贝-原图.jpg"));
			OutputStream ops = new BufferedOutputStream(new FileOutputStream("E:\\Users\\asus\\Desktop\\贝-buffer-副本.jpg"));
			//复制2.86M的图片
			//120ms左右
//			int temp = 0;
//			while((temp = ins.read()) !=-1) {
//				ops.write(temp);
//			}
			
			//15ms左右
			byte[] data=new byte[1024];
			int len=0;
			while ((len=ins.read(data))!=-1) {
				ops.write(data, 0, len);
			}
			ins.close();
			ops.flush();
			ops.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = new Date().getTime();
		System.out.println(end-start);
	}


}
