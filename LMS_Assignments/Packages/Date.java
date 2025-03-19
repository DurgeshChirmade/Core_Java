package office.utility;

import java.io.*;

public class Date{
	private int dd;
	private int mm;
	private int yy;

	public Date(){
		dd=0;
		mm=0;
		yy=0;
	}

	public Date(int dd,int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}

	public void display(String ch){
		System.out.println(dd+ch+mm+ch+yy);
	}
} 