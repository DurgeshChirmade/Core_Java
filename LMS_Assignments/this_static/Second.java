import java.io.*;

class Book{
	private static int bid=0;
	private String btitle;
	private float bprice;

	public Book(){
		bid++;
		btitle="";
		bprice=0.0f;
	}

	public Book(String title){
		bid++;
		btitle=title;
	}

	public void setPrice(float price){
		bprice=price;
	}

	public void display(){
		System.out.println("Book ID :"+bid+" Title="+btitle+" Price:"+bprice);
	}

}

public class Second{
	public static void main(String args[]){

		Book b1 = new Book("Book title");
		b1.setPrice(102.45f);

		b1.display();
	}
}