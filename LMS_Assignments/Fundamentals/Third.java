import java.io.*;

class Box{
	private int height;
	private int width;
	private int depth;

	Box(int height,int width,int depth){
		this.height=height;
		this.width=width;
		this.depth=depth;
	}

	public void display(){
		System.out.println("Height : "+height+" Width : "+width+" depth : "+depth);
	}

	public int volume(){
		return height*width*depth;
	}
}

public class Third{
	public static void main(String args[]){

		Box b = new Box(10,20,30);

		b.display();
		
		System.out.println("Volume : "+b.volume());
	}
}