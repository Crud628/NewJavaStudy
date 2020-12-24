package Day13;

public class AgeOutofBoundException extends Exception {
	String message;

	public AgeOutofBoundException(Integer age) { //该构造方法目的  把错误数据赋值给异常对象
		super();
		this.message = age+" 年龄错误，人的年龄必须在1~150之间";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
}

