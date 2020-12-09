# java笔记Day1



## 基础知识和IDE的使用

java  面向对象的语言

java ME   java     java  EE





pro   空白项目

java pro  java项目（纯后台）

static pro   静态web项目（纯前端）

dynamic pro  动态web项目  前后台





java依赖  war  jar



项目名  首字母大写 驼峰式  数字后置

package 包  包名  全部小写  .分割      表示包含关系   com.test.basic

新建java文件  new   class   命名   首字母大写 驼峰 数字后置



输出指令   ：  

```java
System.out.println("java控制台输出测试");
```



syso   alt+/ 联想   （IDEA开发工具  sout）



ctrl+z 撤销

ctrl+y 取消撤销

ctrl+s 保存

ctrl+ x/c/v

ctrl+shift+f  格式标准化



ctrl+/ 注释

ctrl+shift+/  注释

ctrl+alt+ 方向下  复制粘贴整行

ctrl+shift+L  所有快捷键



##  一.学习大纲

### 1.1basic

1.变量/常量

2.数据类型

3.符号

4.过程控制语句（判断/循环）、

5.算法



### 1.2进阶

继承 封装 多态 抽象 接口 上下转型 



### 1.3API 应用程序接口

集合体系

异常体系

数据流体系

线程体系

开发模式 

线程间通讯 java-mail 





## 二.基本数据结构

```java
package com.test.basic;



public class JavaDay01 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub



//		System.out.println("java控制台输出测试"); //输出后换行

//		System.out.print("java 运行测试");  //输出



//		1.变量/常量

//		先声明，再赋值

//		声明格式: 数据类型 变量名

		int demo_01;

//		赋值格式：

//		变量名=值

		demo_01=1080;

		demo_01=30;

		demo_01=50;

//		System.out.println(demo_01);

//		合并：

//		int demo_02=30;

//		int a=1,b,c=3;

//		System.out.println(b);

		

//		常量： 一经赋值，不可更改 /  不可以改变值的变量

//		格式： final 数据类型 变量名    (常量名 全部大写)

		final int FIDEMO;

		FIDEMO=10;

//		FIDEMO=20;

	

	

//		2.数据类型

//		基本数据类型   /    引用数据类型（类 类型）

	

//		基本数据类型： 8种

//		整数型    ：  byte       short           int             long

//	         范围：     -128~127   -32768~32767         正负21亿                 正负 2的64次方

//		字节数：      1（8位）          2               4                8

//		1m   1024kb   1kb  1024b

//		1024m  1GB 

//		1024GB   1TB

	

//		浮点型：  float  double

//		字节数：      4      8

//有效数字长度：    8             16

//		float f01=0.1234567890123456789f;  //值尾部+f

		double d01=0.1234567890123456789;

		System.out.println(d01);

		

//		布尔型  boolean    true/false

		boolean flag=false;

		System.out.println(flag);

		

//	        字符型   char 单个 数字/字母/汉字/符号  （charactor）  

		char c_01='字';   //字符  单引号

		System.out.println(c_01);

		

		

//		引用数据类型（类 类型）

//		1.系统继承的（String）   2.自定义的

		

		String str="字符串";

		System.out.println(str);

		

		

//		数据类型转换

//		数据精度：  从低到高   byte  (char)   short   int   long   float   double  

//		从低到高： 低精度的值/变量  赋值给  高精度变量  (直接转换)

		byte b_01=100;

		int i_01=b_01;

		System.out.println(i_01);
		

//		从高到底：高精度 值变量  赋值给 低精度  (需要强制转换,注意有效范围)

		int i_02=125;

		byte b_02=(byte)i_02;

		System.out.println(b_02);

//		不同精度的混合运算

//		如未指定数据类型  整数 默认为int   浮点数默认为double

//		所有变量向高精度转换，在做运算

//		2+1.5f+3.5 ===== 》 2.0  +1.5  +  3.5  ====> 7.0

		int i_03=(int)(2+1.5f+3.5);

		
	

//		3.符号

//		算术运算符： + - * / %

//		+：  两侧至少有一侧不为数字  + 做拼接符功能

		System.out.println(1+2+3);  //6

		System.out.println("1"+2+3);   //123

//		/:   取整（无四舍五入  向下取整）

		System.out.println(11/3);

//		%:求余

		System.out.println(11%3);

		

//		赋值运算符： 

//		=：  符号右侧给符号左侧赋值

//		+= -=  *=  /=  %=

//		a+=b   效果等价于  a=a+b

		int a=6;

		double b=3.6;

//		a+=b;

		a=(int)(a+b);

		System.out.println(a);

		

//		比较运算符：> < >= <=  ==  !=

//		逻辑运算符： &&并且   ||或者      !否/相反

//		优先级  ()  >   !   >   &&   >  ||

		System.out.println(true||true&&false);
	}
}
```





猜想

```java
   public static void main(String[] args) {
    /*
    自己定义的类,因为方法goldBach和ifPrime
    不是static修饰的,需要用对象引用调用方法
    */
        Day6_Practice day6Practice=new Day6_Practice();
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个大于6的偶数:");
        int n=scanner.nextInt();
        day6Practice.goldBach(n);
    }
   
    void goldBach(int n){
    //首先判断传入的数n是否是大于6的偶数
        if (n%2==0&&n>6) {
        //循环次数控制在n/2内
            for (int i = 2; i <= n/2; i++) {
            //如果质数1和质数2同时成立,则找到猜想成立的质数
                if (ifPrime(i)&&ifPrime(n-i)) {
                    System.out.println("数为: " +i + " 和" + (n-i) );
                }
            }
        }
        else System.out.println("输入错误!");
    }
    
    //判断数是否是质数
     boolean ifPrime(int num){
      //从2到偶数even的前一位,只要没有因数,就是质数
        for (int i = 2; i <num; i++) {
            if (num%i==0) return false;
        }
        //质数返回真
        return true;
    }
```





平方十位数

```java
public class _01_平方十位数 {
 
	public static void main(String[] args) {
		dfs(0);
		System.out.println(ans);
	}
	
	static int[] a = new int[] {9,8,7,6,5,4,3,2,1,0};
	static int ans=0;
	static void dfs(int m) {
		if(m>=10) {
			long res=0;
			for(int i=0;i<10;i++)
				res = 10*res+a[i];
			long r = (long) Math.sqrt(res);
			if((""+res).length()!=10)
				return;
			if(r*r==res) {
				ans++;
				System.out.println(res);
			}
			return;
		}
		
		for(int i=m;i<10;i++) {
			swap(i,m);
			dfs(m+1);
			swap(i,m);
		}
		
		
		
	}
	
	static void swap(int i,int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
 
}
```













图书排列

```java
 public class Main {  
        static int res=0;  
        public static boolean check(int a[])  
        {  
            int l=a.length;  
            for(int i=0;i<l-1;i++)  
            {  
//              两个相邻的元素，如果它们的数字是相邻的，就是两个元素相减的绝对值 == 1；那么就return false;
                if(Math.abs(a[i]-a[i+1])==1)  
                {  
                    return false;  
                }  
            }  
            return true;  
        }  
//        将a[]中的a[x] 与   a[y]  的值互换
        public static void swap(int a[],int x,int y)  
        {  
            int temp =a[x];  
            a[x]=a[y];  
            a[y]=temp;  
        }  
        public static void sort(int a[],int begin,int end)  
        {  
            if(begin==end)  
            {  
//              检查相邻的书是否被放在了相邻的位置  ：以数字来代表书；相邻两个数字的差的绝对值要不等于1
                if(check(a))  
//                  如果相邻的两个数字的差的绝对值不等于1，则找到了一种方案。
                res++;  
            }  

            for(int i = begin; i <= end; i++)  
            {  
                swap(a,begin,i);  
                sort(a,begin+1,end);  
                swap(a,begin,i);  
            }  
        }  
        public static void main(String[] args) {  

            int a[]={1,2,3,4,5,6,7,8,9,10};  
            sort(a,0,a.length-1);  
            System.out.println(res);  
        }  

    }  
```

