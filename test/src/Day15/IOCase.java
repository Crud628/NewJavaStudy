package Day15;

import java.io.File;

//case 1: 
//查看某目录下的子项，输出并判断其是文件还是目录
//case 2:
//自己任意选定一个目录，输出该目录下 所有子项，若子项仍是目录，继续输出其子项目录里的子项
//直到 所有文件都被输出
public class IOCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file_1 = new File("E:\\BaiduNetdiskDownload");
		File[] file_arr=file_1.listFiles();
		for (File file : file_arr) {
			if(file.isDirectory()) {
				System.out.println("文件夹\t"+file.getName());
			}else {
				System.out.println("文件\t"+file.getName());
			}
		}
	}

}
