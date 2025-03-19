import java.io.*;

class Point{
	private int x;
	private int y;

	public void accept(int x,int y){
		this.x=x;
		this.y=y;
	}

	public void display(){
		System.out.println("Co-ordinates : "+x+","+y);
	}
}

public class Four{
	public static void main(String args[]){

		Point p = new Point();

		p.accept(10,20);

		p.display();
	}
}