import java.io.*;

class Date{
	private int dd;
	private int mm;
	private int yy;
	private static int cnt=0;

	public Date(){
		cnt++;
		dd=0;
		mm=0;
		yy=0;
	}

	public Date(int dd,int mm,int yy){
		cnt++;
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}

	public void display(String ch){
		System.out.println("Count : "+cnt);
		System.out.println("Date : "+dd+ch+mm+ch+yy);
	}
}

public class Third{
	public static void main(String args[]){

		Date d = new Date(1,1,2001);

		d.display("-");

		Date d1 = new Date(22,8,2000);
		d1.display("/");
	}
}