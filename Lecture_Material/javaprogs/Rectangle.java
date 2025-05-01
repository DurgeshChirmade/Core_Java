package shapes;

public class Rectangle implements Drawable {

	private double length, breadth;	
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}	

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Length : "+length+"\nBeradth :"+breadth;
	}

	public void drawShape() {
		System.out.println("in the draw shape of rectangle");
	}
	
	public double calArea() {
		return length*breadth;
	}

}
