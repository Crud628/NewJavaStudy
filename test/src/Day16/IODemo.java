package Day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class IODemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader r = new BufferedReader(new FileReader("F:\\utf-8.txt"));
			BufferedWriter w = new BufferedWriter(new FileWriter("F:\\b.txt"));
			int temp = 0;
			while((temp=r.read())!=-1) {
				w.write(temp);
			}
			
//			char data[]=new char[1024];
//			//读取的字符数
//			int len=r.read(data);
//			while (len!=-1) {
//				//写入文件中
//				w.write(data, 0, len);
//				//修改len
//				len=r.read(data);
//			}
			
			
//			String str = "";
//			while((str=r.readLine())!=null) {
//				w.write(str);
////				w.write("\r\n");//等同于下面
//				w.newLine();
//			}
			r.close();
			w.flush();
			w.close();
			System.out.println("scuess");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

		
	}

}
