package apps;


import Assignment.ColorPoint;
import Assignment.Point;

public class PointDemo {

	public static void main(String[] args) {
		
		Point p = new ColorPoint(10,20,"red");
		System.out.println(p);
		p.display();
		
		Point p1 = new ColorPoint(30,40,"Pink");
		System.out.println(p1);
		p1.display();

	}

}
