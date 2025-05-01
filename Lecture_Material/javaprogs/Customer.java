package entities;

public class Customer {
	int cid;
	String cname;
	String city;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String cname, String city) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.city = city;
	}
	@Override
	public String toString() {
		return "cid=" + cid + ", cname=" + cname + ", city=" + city ;
	}
	@Override
	public int hashCode() {
		int code = 0;
		if(city.equals("Pune"))
			code = 10;
		else if(city.equals("Mumbai"))
			code = 20;
		else if(city.equals("Bangalore"))
			code = 30;
		else if(city.equals("Delhi"))
			code = 40;
		else if(city.equals("Hyderabad"))
			code = 50;
		return code;
	}
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		//this - obj
		if(obj instanceof Customer) {
			Customer c = (Customer)obj;
			//this - c
			if(this.cid == c.cid && this.cname.equals(c.cname) && this.city.equals(c.city))
				flag = true;
		}
		return flag;
	}
	
	
	
	

}
