import java.io.*;

class Dates{
	private int dd;
	private int mm;
	private int yy;

	public void setDate(int dd){
		this.dd=dd;
	}

	public int getDate(){
		return dd;
	}

	public void setMonth(int mm){
		this.mm=mm;
	}

	public int getMonth(){
		return mm;
	}

	public void setYear(int yy){
		this.yy=yy;
	}

	public int getYear(){
		return yy;
	}
}

public class Second{
	public static void main(String args[]){

		Dates d1 = new Dates();

		d1.setDate(22);
		d1.setMonth(8);
		d1.setYear(2000);

		System.out.println(d1.getDate()+"-"+d1.getMonth()+"-"+d1.getYear()); 
	}
}