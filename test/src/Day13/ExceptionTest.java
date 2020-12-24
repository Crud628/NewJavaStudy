package Day13;

//case:
//创建Student类
//private String name;
//private Integer age;
//实例化Student类对象，给该对象成员变量赋值，如该对象名字中包含数字，则报姓名格式异常
//如  张三   没问题
//      张3  则输出 名字格式有误
//NameFormatException  名字格式异常

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("aa",1);
		try {
			s.setName("张三");
			s.setName("张3");
		} catch (NameFormatExcption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
	}

}
