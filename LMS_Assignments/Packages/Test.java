import java.io.*;
import office.utility.Person;
import office.utility.Date;

public class Test{
	public static void main(String args[]){

		Person p1 = new Person(101,"ABC",4500.45f);
		p1.display();

		Date d1 = new Date(1,1,2001);
		d1.display("-");
	}
}
