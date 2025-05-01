package demos;

import shapes.Circle;
import shapes.Drawable;
import shapes.Rectangle;

public class ShapeDemo {

	public static void main(String[] args) {
		//Drawable d = new Rectangle();
		Drawable [] shapes = new Drawable[4]; //new Drawable()
		shapes[0] = new Rectangle(4.5, 3.4);
		shapes[1] = new Circle(3.7);
		shapes[2] = new Rectangle(4.2, 2.4);
		shapes[3] = new Rectangle(2.3, 1.2);
		for(Drawable d : shapes)
		{
			if(d instanceof Rectangle)
				System.out.println("Info of rectangle.....");
			else if(d instanceof Circle)
				System.out.println("Info of circle.....");
			d.drawShape();
			System.out.println("Area : "+d.calArea());
			System.out.println("************");
		}
		
		int countR = 0;
		int countC = 0;
		for(Drawable d : shapes)
		{
			if(d instanceof Rectangle)
				countR++;
			if(d instanceof Circle)
				countC++;
		}
		System.out.println("Count of Rect : "+countR);
		System.out.println("Count of circle : "+countC);
	}

}
