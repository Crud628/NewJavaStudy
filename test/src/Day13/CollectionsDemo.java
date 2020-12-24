package Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> list=new ArrayList<String>();
//		list.add(0,"L");
//		list.add(1,"O");
//		list.add(2,"V");
//		list.add(3,"E");
//		System.out.println(list);
		
//		Collections:  操作集合的工具类  静态方法
//		Collections.addAll(list, "Y","O","U");  //指定集合中 添加指定元素（可以一次性添加多个）
//		System.out.println(list);
		
//		Collections.sort(list);  //指定集合 自然排序
//		System.out.println(list);
		
//		Collections.reverse(list);  //指定集合 反转
//		System.out.println(list);
		
//		System.out.println(Collections.max(list));  //查找指定集合中 极值
//		System.out.println(Collections.min(list));  //查找指定集合中 极值
//		
//		System.out.println(Collections.binarySearch(list, "A"));  //二分法查找指定元素  有序 去重
//		                   Arrays.binarySearch(arg0, arg1)

        
//		集合：动态长度 灵活   类型只能为 引用数据类型
//		数组：效率高 固定长度 统一数据类型  允许所有数据类型
		
//		转换  !!!功能不完善   慎用
		
//		数组 =====》 集合   非基本数据类型
//		Integer[] arr= {1,2,3,4,5,6,7};
//		List list_2=Arrays.asList(arr);
//		System.out.println(list_2);
		
//		集合 =====》数组
//		Object[] arr_strs=list.toArray();
//	    System.out.println(Arrays.toString(arr_strs));
//	    for(Object each:arr_strs) {
//	    	System.out.println((String)each);
//	    }
//		System.out.println(Math.abs(-10));//绝对值
//		System.out.println(Math.ceil(3.2));
//		System.out.println(Math.floor(3.8));
//		System.out.println(Math.round(3.8));
//		System.out.println(Math.pow(2, 3));
//		System.out.println(Math.sqrt(4));
//		System.out.println(Math.PI);
//		System.out.println(Math.max(10, 20));
//		System.out.println(Math.min(10, 20));
//		System.out.println(Math.E);
//		System.out.println(Math.random());
//		int[] arr = new int[100];
//		for (int i = 0; i < 100000000; i++) {
//			arr[(int)(Math.floor(Math.random()*100))]+=1;
//		}
////		System.out.println((int)(Math.floor(Math.random()*100+1)));
//		double sum=0;
//		double temp = 0;
//		for (int i = 0; i < arr.length; i++) {
//			temp = 1000000-arr[i];
//			sum+=temp;
//			System.out.println(temp);
//		}
//		System.out.println(sum/100);
		for (int i = 0; i < 100; i++) {
			System.out.println(int_of_bound(-2,3));
		}
	}
	/**
	 * 
	 * @param a  较小值
	 * @param b  大值
	 * @return  ab之间的数字
	 */
	public static int int_of_bound(int a,int b) {
		if(a>=0) {
			return (int)(Math.random()*(b-a+1)+a+1);
		}else if(a<0&&b>0){
			return (int)(Math.random()*(b-a+1)+2*a+1);
		}else {
			return (int)(Math.random()*(b-a+1)+a-1);
		}		
		
	}


}
