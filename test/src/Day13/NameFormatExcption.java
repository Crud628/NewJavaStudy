package Day13;

public class NameFormatExcption extends Exception{
	String message;

	public NameFormatExcption(String name) {
		super();
		this.message = name+"名字格式异常";
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
}
