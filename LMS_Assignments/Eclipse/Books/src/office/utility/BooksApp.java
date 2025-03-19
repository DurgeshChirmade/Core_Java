package office.utility;

public class BooksApp {

	public static void main(String[] args) {
		
		Book b[]=new Book[3];
		
		b[0]=new Book(101,"AAA",452.21f);
		b[1]=new Book(102,"BBB",987.67f);
		b[2]=new Book(103,"CCC",9678.56f);

		Category c1 = new Category(1,"IT",b);
		
		Book b1 = c1.getBookWithMaxPrice();
		
		b1.display();
	}

}
