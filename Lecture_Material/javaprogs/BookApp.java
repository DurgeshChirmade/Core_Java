package apps;

public class BookApp {

	public static void main(String[] args) {
		Book [] books = new Book[5];  //bookid(int), title(String), price(float)
		
		Catergory c1 = new Category(1, "IT", books);
		//id(int), name(String), books(Book[])
		
		Book b = c1.getBookWithMaxPrice();
		
		b.display();
	}

}

class Category{
	int id;
	String name;
	Book [] books;
	
	Book getBookWithMaxPrice() {
		
		//iterate books array
		//find the book with max price
		//return book (one of the array elements)
	}
	
	
	
	
	
}
