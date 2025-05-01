package office.staff;

import office.utility.Date;

public class Person {
	private String name;
	private Date bdate;
	
	public Person() {
		//super()
		//name=bdate=null
	}
	
	public Person(String name,int dd,int mm,int yy) {
		this.name = name;
		this.bdate = new Date(dd,mm,yy);
	}
	
	public void display() {
		System.out.println("Name : "+name);
		if(bdate != null) {
			System.out.println("Birthdate : ");
			bdate.display();
		}
	}

	@Override
	public String toString() {
		if(bdate != null)
			return "Name : "+name+"\nBirthdate : "+bdate;   //bdate.toString()
		else
			return "Name : "+name;
	}
	
	

}
