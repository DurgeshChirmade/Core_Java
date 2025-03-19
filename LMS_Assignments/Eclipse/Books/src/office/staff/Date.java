package office.staff;

public class Date {
	private int dd;
	private int mm;
	private int yy;
	
	public Date() {
		this.dd=0;
		this.mm=0;
		this.yy=0;
	}
	public Date(int dd,int mm,int yy) {
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public void display() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
	
}
