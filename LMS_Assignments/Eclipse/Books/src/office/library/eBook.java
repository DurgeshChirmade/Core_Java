package office.library;

public class eBook extends Book {
	private String downloadUrl;
	private double sizeInMBs;
	
	public eBook() {
		super();
		downloadUrl="";
		sizeInMBs=0.0;
	}
	public eBook(int bookid,String title,float price,String downloadUrl,double sizeInMBs) {
		super(bookid,title,price);
		this.downloadUrl=downloadUrl;
		this.sizeInMBs=sizeInMBs;
	}
	public void display() {
		super.display();
		System.out.println("URL : "+downloadUrl+" SIZE : "+sizeInMBs);
	}
}
