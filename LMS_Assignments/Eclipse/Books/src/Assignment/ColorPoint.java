package Assignment;

public class ColorPoint extends Point {
	private String color;
	
	static String[] colors= {"red","blue","green","yellow","orange"};
	
	public ColorPoint() {
		super();
		color="";
	}
	
	public ColorPoint(int x,int y,String color) {
		super(x,y);
		boolean flag=false;
		for(String c:colors) {
			if(c==color) {
				flag=true;
				break;
			}
		}
		if(flag==true) {
			this.color=color;
		}
		else {
			this.color="black";
		}
	}

	@Override
	public String toString() {
		super.toString();
		return "ColorPoint [color=" + color + "]";
	}
	
	public void display() {
		super.display();
		System.out.println("Color : "+color);
	}

}
