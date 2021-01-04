package Day19;

public class Customer extends Thread { // 客户
	private Account acc; // 账户对象 客户从哪个银行账户取钱
	private Integer money; // 每次取钱金额

	public Customer(Account acc, Integer money) {
		super();
		this.acc = acc;
		this.money = money;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			this.acc.getMoney(this.money);
		}
	}

	public static void main(String[] args) {
		Account acc = new Account(5000);
		Customer c1 = new Customer(acc, 200);
		Customer c2 = new Customer(acc, 100);
		c1.setName("小王");
		c2.setName("小刘");
		c1.start();
		c2.start();
	}
}

