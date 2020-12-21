package Day10;

public class Book implements Comparable<Book>{
	private String name;
	private double price;
	private String press;
	private String author;
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", press=" + press + ", author=" + author + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return (int)(this.price - o.price);
	}
	public Book(String name, double price, String press, String author) {
		super();
		this.name = name;
		this.price = price;
		this.press = press;
		this.author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
