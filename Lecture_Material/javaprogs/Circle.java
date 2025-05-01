package shapes;

public class Circle implements Drawable {

	private double radius;
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public void drawShape() {
		System.out.println("in the draw method of circle");
	}
	
	public double calArea() {
		return PI*radius*radius;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Radius : "+radius;
	}
	
	

}
