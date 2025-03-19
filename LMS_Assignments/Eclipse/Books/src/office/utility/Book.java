package office.utility;

public class Book {
	private int bookid;
	private String title;
	private float price;

	public Book() {
		super();
	}

	public Book(int bookid, String title, float price) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.price = price;
	}
	
	

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void display() {
		System.out.println(bookid + " " + title + " " + price);
	}
}
