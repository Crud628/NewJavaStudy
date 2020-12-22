package Day11;

import java.util.HashSet;
import java.util.Set;

//case 2: 有数组 arr {12,3,4,65,6,8,6,8,6,8,3}
//找到数组中 重复的元素 并输出      
//建议使用set集合
public class SetCase2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,3,4,65,6,8,6,8,6,8,3};
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(!set.add(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
