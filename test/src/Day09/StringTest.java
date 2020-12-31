package Day09;

public class StringTest {
	public static void main(String[] args) {
		  String str_01=new String("abc"); //实例化String类对象的完整代码
          String str_02=new String("abc");
          System.out.println(str_01==str_02);  //f
          System.out.println(str_01.equals(str_02));  //t  String类中  equals方法已被重写 比较内容而不是内存
          
          String str_03="abc";  //字面量赋值  推荐使用
          String str_04="abc";
          System.out.println(str_03==str_04);  //t
          System.out.println(str_01==str_03);  //f
          
//          ！！！字面量赋值 如果新的字符串的值已经存在，则不开辟新的空间存储该值，新字符串指向已经存在的值
//          ！！！String 对象 一经赋值，不可更改，（自带final属性）
          String temp="abc";
          temp="bbc";  temp+="xxx";  //删除原temp 新建temp并赋新的值
          
          str_03+="abc";
          str_04+="abc";
          System.out.println(str_03==str_04);  //f
//          !!! +=不属于字面量赋值 
          
//          str.length()  str.charAt(index)  str.toCharArray() 
//          "hello"   ===>   {'h','e','l','l','e'}  
          String demo="hello ketty";
          char[] demo_arr=demo.toCharArray();
//          System.out.println(Arrays.toString(demo_arr));
          System.out.println(demo.charAt(3));
          System.out.println(demo.length());
          
//          str.toLowerCase() str.toUpperCase()
          System.out.println(demo.toUpperCase());  //返回值结果为大写
          System.out.println(demo);  //本身不变          
          
//          str.substring(beginIndex)   str.substring(beginIndex, endIndex)
//          字符串截取
          System.out.println(demo.substring(5)); //ketty  [5,~
          System.out.println(demo.substring(5, 7));  //ke  [5,7)            
          
//          str.trim()  删除字符串 前后空格
          System.out.println(demo.trim());
          
//          str.startsWith(prefix) str.endsWith(suffix)  判断 字符串 是否以 XXX 作为开头/结尾
          System.out.println(demo.startsWith("he"));
          System.out.println(demo.endsWith("ty"));
          
//        str.indexOf(ch)  str.indexOf(ch, fromIndex)   查找指定字符下标
//        System.out.println(demo.indexOf(101));  //char  String  char对应ascii码
//        System.out.println(demo.indexOf("e", 5));  //从指定下标位置起 开始寻找
        
//        Ascii 码：
//        回车符 13
//        0~9    48~57
//        A~Z    65~90
//        a~z    97~122
        
//        str.compareTo(anotherString) str.compareToIgnoreCase(str)
//        String demo_01="ccczxzcxzc";
//        String demo_02="cac";
//        System.out.println(demo_01.compareTo(demo_02));  
        //字符串内容一致时 返回0
        //字符串前缀相同 结果为 长度差
        //字符串前缀不同 结果为 第一处不同的字符的ascii差值          
        
//  ！！！str.split(regex) str.split(regex, limit)
//        System.out.println(Arrays.toString(demo.split("e")));  //[h, llok, tty] 将e作为分隔符
//        System.out.println(Arrays.toString(demo.split("c")));  //如果作为分割的元素不存在 则返回一个元素
//        System.out.println(Arrays.toString(demo.split("")));
//        System.out.println(Arrays.toString(demo.split("",3)));  //返回数组最多3个元素
//        System.out.println(Arrays.toString(demo.split("c",3)));
        
//        str.replace(oldChar, newChar) str.replaceAll(regex, replacement)
//          System.out.println(demo.replace("ketty", "Tom"));
//        String demo_03="iphone12";
//          System.out.println(demo_03.replaceAll("[0-9]", "*"));
//        String test="aaaaaaa";
//        System.out.println(test.replace("a", "*"));   //*******
        
//        str.contains(s)  boolean
        System.out.println(demo.contains("xxx"));//判断demo是否包含xxx
        System.out.println(demo.contains(""));  //true
        
//        str.concat(str)
        System.out.println(demo.concat(str_01));

          
         //int String   互转
        //int ==>  String
        int int_01 = 10;
        System.out.println(String.valueOf(int_01)+1);//101
        
        
        //String ==》int
        String str_05 = "10";
        System.out.println(Integer.parseInt(str_05)+1);//11
        
        
//        demo.lastIndexOf(ch);
//        demo.lastIndexOf(ch, fromIndex)
//        demo.compareToIgnoreCase(str);
//        demo.equalsIgnoreCase(anotherString);
//        demo.isEmpty();
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          

	}
}
