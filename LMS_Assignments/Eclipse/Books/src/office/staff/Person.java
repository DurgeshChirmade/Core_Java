package office.staff;

public class Person {
	private String name;
	private Date date;

	public Person() {
		super();
		name="";
		date=new Date();
	}
	public Person(String name,int dd,int mm,int yy) {
		this.name=name;
		this.date=new Date(dd,mm,yy);
	}
	public void display() {
		System.out.println("Name : "+name);
		
		if(date!=null) {
			System.out.println("Birthdate : ");
			date.display();
		}
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", date=" + date + "]";
	}
	
	
}
