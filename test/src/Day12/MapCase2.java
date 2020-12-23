package Day12;

import java.util.HashMap;
import java.util.Map;

public class MapCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,3,3,3,4,4,4,5,5,5,2,2,2};
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		int max = 0;
		int max_v = 0;
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
			if(max_v<map.get(arr[i])) {
				max = arr[i];
				max_v = map.get(arr[i]);
			}
		}
		System.out.println(map);
		System.out.println(max+" "+max_v);
	}

}
