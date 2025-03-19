package office.utility;

import java.io.*;

public class Person{
	private int id;
	private String name;
	private float salary;

	public Person(){
		id=0;
		name="";
		salary=0.0f;
	}

	public Person(int id,String name,float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public void display(){
		System.out.println(id+" "+name+" "+salary);
	}
}