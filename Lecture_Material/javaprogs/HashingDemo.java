package demos;

import java.util.HashSet;
import java.util.Set;

import entities.Customer;

public class HashingDemo {

	public static void main(String[] args) {		
		Set<Customer> custs = new HashSet<>();
		custs.add(new Customer(34,"XXX","Pune"));
		custs.add(new Customer(12,"YYY","Mumbai"));
		custs.add(new Customer(45,"III","Pune"));
		custs.add(new Customer(23,"DDD","Bangalore"));
		custs.add(new Customer(19,"EEE","Pune"));
		custs.add(new Customer(20,"XXX","Delhi"));
		custs.add(new Customer(56,"AAA","Pune"));
		custs.add(new Customer(11,"RRR","Mumbai"));
		custs.add(new Customer(90,"LLL","Bangalore"));
		custs.add(new Customer(66,"QQQ","Mumbai"));
		custs.add(new Customer(76,"uuu","Pune"));
		custs.add(new Customer(82,"zzz","Hyderabad"));
		custs.add(new Customer(24,"www","Pune"));
		custs.add(new Customer(94,"GGG","Delhi"));
		custs.add(new Customer(13,"lll","Pune"));
		System.out.println("size : "+custs.size());
		custs.add(new Customer(45,"III","Pune"));
		
		System.out.println("size : "+custs.size());
		for(Customer c : custs)
			System.out.println(c);
		
		//hashset - find out hashCode() and go to the right bucket
		boolean flag = custs.contains(new Customer(76,"uuu","Pune"));
		System.out.println("Customer with 76 id : "+flag);
	
		custs.remove(new Customer(94,"GGG","Delhi"));
		System.out.println("size : "+custs.size());
		
	}

}
