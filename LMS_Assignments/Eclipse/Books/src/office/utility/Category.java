package office.utility;

public class Category {
	private int id;
	private String name;
	private Book books[];
	
	public Category() {
		super();
	}

	public Category(int id, String name, Book[] books) {
		super();
		this.id = id;
		this.name = name;
		this.books = books;
	}
	
	Book getBookWithMaxPrice() {
		float max=books[0].getPrice();
		int maxi=0;
		for(int i=0;i<books.length;i++) {
			if(max<books[i].getPrice()) {
				max=books[i].getPrice();
				maxi=i;
			}
		}
		return books[maxi];
		
	}
	

}
