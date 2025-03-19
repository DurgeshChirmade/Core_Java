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

public class Second{
	public static void main(String args[]){

		Box b[] = new Box[3];


		b[0]=new Box(10,20,30);
		b[1]=new Box(20,30,40);
		b[2]=new Box(50,60,70);

		for(int i=0;i<3;i++){
			System.out.println("Volume : "+b[i].volume());
		}

		for(int i=0;i<3;i++){
			b[i].display();
		}
		
		
	}
}