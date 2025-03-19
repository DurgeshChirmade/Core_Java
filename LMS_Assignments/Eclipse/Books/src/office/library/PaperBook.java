package office.library;

import office.staff.Date;

public class PaperBook extends Book {
	private int numberOfPages;
	private Date dateOfPublication;
	
	public PaperBook() {
		super();
		numberOfPages=0;
		dateOfPublication=new Date();
	}
	public PaperBook(int bookid,String title,float price,int numberOfPages,int dd,int mm,int yy) {
		super(bookid,title,price);
		this.numberOfPages=numberOfPages;
		this.dateOfPublication=new Date(dd,mm,yy);
	}
	public void display() {
		super.display();
		System.out.println("Number of Pages : "+numberOfPages+" Date of publication : ");
		dateOfPublication.display();
	}
}
