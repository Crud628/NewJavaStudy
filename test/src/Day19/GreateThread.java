package Day19;

public class GreateThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		method 1:
		Car carThread = new Car(); // 3.实例化 该类对象 (线程对象)
		carThread.setName("Thread-Car");
		carThread.setPriority(1);
//		carThread.run();
//		carThread.start(); // 4.线程对象调用 start()

//		method 2:
		Runnable run_bus = new Bus(); // 3.Runnable接口 接口回调对象 = new 实现类()
		Thread busThread = new Thread(run_bus); // 4.实例化Thread对象 3中接口回调对象作为参数
		busThread.setName("Thread-Bus");
		busThread.setPriority(10);
//		busThread.start(); // 5.线程对象调用 start() 启动线程

//		实际项目中，常用写法 （匿名对象）
//		new Thread();  匿名Thread对象（线程对象）
//		new Thread().start();   匿名线程对象启动
		new Thread(new Runnable() {
			@Override	
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i <= 100; i++) {
					System.out.println(Thread.currentThread().getName()+" "+i);
				}
			}
		}).start(); // 接口式参数匿名类
		carThread.start(); 
//		Thread.sleep(3000);    main线程/主线程 一样使用
		busThread.start();
	}

}

class Car extends Thread { // 1.新建类 继承 Thread类
	@Override
	public void run() { // 2重写 run() run()中 即为 线程启动时执行的代码
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

class Bus implements Runnable { // 1.新建类 实现Runnable接口

	@Override
	public void run() { // 2重写 run() run()中 即为 线程启动时执行的代码
		// TODO Auto-generated method stub
//		try {
//			Thread.sleep(3000);  //线程休眠 3s  需要捕获异常
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}
