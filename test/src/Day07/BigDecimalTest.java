package Day07;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BigDecimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal num1 = new BigDecimal(3.2);
		BigDecimal num2 = new BigDecimal(1.8);
		
		System.out.println(num1.add(num2));//加法
		System.out.println(num1.subtract(num2));//减法
		System.out.println(num1.multiply(num2));//乘法
		System.out.println(num1.divide(num2));//不能整除会报错   除法
		System.out.println(num1.remainder(num2));//取余
		//以上精度由最高精度确定
		
		
		System.out.println(num1.divide(num2, BigDecimal.ROUND_CEILING));  //向上取整
		System.out.println(num1.divide(num2, BigDecimal.ROUND_HALF_UP));  //四舍五入
		System.out.println(num1.divide(num2, BigDecimal.ROUND_FLOOR));	  //向下取整
		
		
		
		System.out.println(num1.divide(num2,4,4));
		
		
		//常用的保留小数位数
		double demox = 13.7321487216;
		//1
		DecimalFormat df = new DecimalFormat("0.0000");
		String m = df.format(demox);
		BigDecimal m2 = new BigDecimal(m);
		
		
		//2
		String str = String.format("%.6f", df);
		
		
		//3
		//BidDecimal.setScale(精度  :int    ,   进位类型：int);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
				
				
				
	}

}
