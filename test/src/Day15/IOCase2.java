package Day15;

import java.io.File;

public class IOCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listFiles("E:\\BaiduNetdiskDownload");
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
					//再次调用当前方法
		    		 //listFiles(file2.getParent()+"/"+file2.getName());
		    		 listFiles(file2.getAbsolutePath());
				} else {
					System.out.println(file2);
				}
			}
		}
	}
}
