package Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * case 2: 创建一个类Book 成员变量 name书名 price书价格 press出版社 author作者
 * 	创建5个Book对象 放入 list集合中， 并按照price从小至大排序
 * 	循环集合输出每本书的详细信息
 * @author Administrator
 *
 */
public class Listcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("aa",2,"aa","aa"));
		books.add(new Book("bb",4,"bb","bb"));
		books.add(new Book("cc",3,"cc","cc"));
		books.add(new Book("dd",5,"dd","dd"));
		books.add(new Book("ee",1,"ee","ee"));
		
		Collections.sort(books);
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
	}

}
