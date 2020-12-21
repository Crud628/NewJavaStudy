package Day10;

import java.util.ArrayList;
import java.util.Collection;

public class ApiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> col2 = new ArrayList<Integer>();
		col2.add(1);
		col2.add(2);
		col2.addAll(col2);
		System.out.println(col2);
		System.out.println(col2.contains(1));
		System.out.println(col2.containsAll(col2));
		System.out.println(col2.isEmpty());
		col2.remove(1);
//		col2.removeAll(col2);
		System.out.println(col2);
		System.out.println(col2.size());
		col2.clear();
		System.out.println(col2);
	}

}
