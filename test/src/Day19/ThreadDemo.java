package Day19;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		进程与线程
//		进程： 程序的一次动态运行
//		线程： 运算调度的最小单位，是进程的执行单位
		
//		单线程/多线程
//		同一时刻一个进程只拥有一个线程（单线程运行）
//		一个进程 多个线程同时运行（多线程运行/并发操作）
//		！！！至目前位置 都是单线程运行   jvm运行main函数（main线程）
		
//		多线程运行
//		1.实例化线程对象   2.线程对象启动
		
//		method 1:
//		1.新建类 继承 Thread类
//		2.重写 run()   run()中  即为 线程启动时执行的代码
//		3.实例化 该类对象 (线程对象)
//		4.线程对象调用 start()
		
//		method 2：
//		1.新建类 实现Runnable接口
//		2.重写 run()   run()中  即为 线程启动时执行的代码
//		3.Runnable接口  接口回调对象 = new 实现类()
//		4.实例化Thread对象  3中接口回调对象作为参数
//		5.线程对象调用 start()  启动线程
		
		
//		!!!run()  start() 异同
//		1.相同点  都执行run()中代码
//		2.不同点
//		    run()  由main线程来执行
//		    start()   启动新线程执行
		
//		线程常用方法：
//		Thread.currentThread()  获取当前线程对象
//		Thread.currentThread().getName()   获取当前线程名
//		线程对象.setName("线程名");   设置线程名
//		线程对象.setPriority(优先级)   设置线程优先级   1~10  1最低  10最高  默认 5 
//		Thread.sleep(millies);  当前线程休眠


	}

}
