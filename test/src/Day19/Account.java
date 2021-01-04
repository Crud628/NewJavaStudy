package Day19;

public class Account { // 银行账户
	private Integer count; // 账户余额

	public Account(Integer count) {
		super();
		this.count = count;
	}

	public synchronized /* 方法锁 */ void getMoney(int money) { // 动态方法 从该账户取钱
//		synchronized (this) { // 代码锁 同一时刻 只能有一个线程对象 对 参数做操作
//			try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		try {
			if (money == 200 && count <= 3000 && count>1000) {  //当余额小于3000，小王线程 休眠
				wait();   //休眠/挂起  
			}
			if(money==100&&count<=1000) {  //当余额小于1000，小刘线程 休眠
				notify();  //唤醒小王
				wait();  //小刘休眠
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (money <= this.count) {
			System.out.print("账户原有" + count + "元，");
			count -= money;
			System.out.println(Thread.currentThread().getName() + "取了" + money + "元，账户余额为" + count + "元");
		} else {
			System.out.println("账户余额不足");
			System.exit(0); // 终止jvm虚拟机
		}
//		}

	}

//	public static void main(String[] args) throws InterruptedException {
//		Account acc_1=new Account(1000);
//		while(true) {
//			Thread.sleep(1000);
//			acc_1.getMoney(200);
//		}
//	}

}

