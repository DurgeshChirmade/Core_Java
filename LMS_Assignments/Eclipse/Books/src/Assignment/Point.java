package Assignment;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		x=0;
		y=0;
	}
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public void display() {
		System.out.println("X : "+x+" Y: "+y);
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
