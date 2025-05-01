package apps;

import myclasses.Date;

public class RefterenceObjectEquality {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date();
		Date d3 = d1;
		System.out.println(d1 == d2);   //false
		System.out.println(d1 == d3);   //true
		
		//equals() method is not overridden in Date class
		/*System.out.println(d1.equals(d2));   //false 
		System.out.println(d1.equals(d3));  //true */
		
		//equals() method is overridden in Date class
		System.out.println(d1.equals(d2));    //true
		System.out.println(d1.equals(d3));    //true

	}

}
