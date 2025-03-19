import java.io.*;

class Date{
	private int dd;
	private int mm;
	private int yy;

	public void setDate(int dd,int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}

	public void getDate(){
		System.out.println(dd+"/"+mm+"/"+yy);
	}

}

public class First{
	public static void main(String args[]){

		Date d1 = new Date();
		d1.setDate(01,01,2001);
		d1.getDate();
	}
}