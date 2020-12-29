package Day16;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class CodeStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(getCodeStyle("F:\\ansi.txt"));
		System.out.println(getCodeStyle("F:\\utf-8.txt"));
		System.out.println(getCodeStyle("F:\\utf-8a.txt"));
		System.out.println(getCodeStyle("F:\\utf-8b.txt"));
//		System.out.println(getCodeStyle("F:\\utf-16 BE.txt"));
	}
	
	public static String getCodeStyle(String fileName) {
		String fileCode = "GBK";
		BufferedInputStream br = null;
		try {
			br = new BufferedInputStream(new FileInputStream(fileName));
			int p = (br.read()<<8) + br.read();
			System.out.println(br.read()<<8);
			System.out.println(br.read());
			System.out.println(p);
			switch(p) {
				case 0xE595:
					fileCode = "UTF-8";
					break;
				case 0xFFFE:
					fileCode = "Unicode";
					break;
				case 0xFEFF:
					fileCode = "UTF-16BE";
					break;
				case 0x5C75:
					fileCode = "ANSI|ASCII";
					break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(null!=br) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					br = null;
				}
			}
		}
		return fileCode;
	}
}
