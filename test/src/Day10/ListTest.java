package Day10;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
//		List接口 ： Collection接口的子接口 拓展了父接口的方法 提供了 对指定元素位置的操作（支持下标）
		
//		实现类： ArrayList(动态数组)
		
        List<String> list_1=new ArrayList<String>();
        list_1.add(0, "张一");
        list_1.add(1, "张二");
        list_1.add(2, "张三");
        list_1.add(3, "张四");
        list_1.add(4, "张五");
        list_1.add(4, "张五五");
        list_1.add(6, "张六");   //两个参的add() 没有返回值
        
//        ！！！！！！list_1.add(7, "张六");  //下标越界
        System.out.println(list_1);
        
        System.out.println(list_1.indexOf("张三三"));  //查询元素首次出现下标值 / -1
        System.out.println(list_1.remove(2));//根据下标值删除元素
        System.out.println(list_1.get(5));
        list_1.set(5, "mm");
        
        System.out.println(list_1);
        
//        关于remove(下标)/ remove(元素)
//        List<Integer> list_demo=new ArrayList<Integer>();
//        list_demo.add(5);
//        list_demo.add(6);
//        list_demo.add(7);
//        list_demo.add(8);
//        list_demo.add(9);
//        list_demo.add(10);
////        list_demo.remove(5); //删除下标5对应元素
//        list_demo.remove(new Integer(5)); //删除 元素 5 （Integer对象）
//        System.out.println(list_demo);

	}
}
