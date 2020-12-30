package Day17;

public class Factory {  //工厂  
	
	//普通工厂模式
	public Car produce(String message) {  //参数为哪个实现类相关 就返回哪个类的对象
		if("audi".equalsIgnoreCase(message)||"a6".equalsIgnoreCase(message)||"a8".equalsIgnoreCase(message)) {
			return new Audi();   //Car xxx=new Audi()  //返回了一个 接口回调对象
		}
		if("benz".equals(message)) {
			return new Benz();
		}
		return null;		
	}
	
	//多方法工厂模式
	public Car produceAudi() {
		return new Audi();
	}
	public Car produceBenz() {
		return new Benz();
	}

	
	
	//静态方法工厂模式
	public static Car produceStaticAudi() {
		return new Audi();
	}
	public static Car produceStaticBenz() {
		return new Benz();
	}
}

