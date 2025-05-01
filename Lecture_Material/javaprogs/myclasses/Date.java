package myclasses;


import java.io.Serializable;

public class Date implements Serializable{
	private int dd;
	private int mm;
	private int yy;
	
	public Date() {
		//dd, mm, yy = 0
		//super();
		// TODO Auto-generated constructor stub
	}

	public Date(int dd, int mm, int yy) {
		//super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}
	
	public void display() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	public void display(char ch) {
		System.out.println(dd+""+ch+mm+""+ch+yy);
	}

	@Override
	public String toString() {
		return dd+"/"+mm+"/"+yy;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if(obj instanceof Date) {
			Date d = (Date)obj;
			if(this.dd == d.dd && this.mm == d.mm && this.yy == d.yy)
				flag = true;
		}		
		return flag;
	}
	
	
	
	
	

}
