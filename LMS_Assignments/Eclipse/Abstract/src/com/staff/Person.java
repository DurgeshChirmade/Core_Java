package com.staff;

public class Person {
	private String name;
	private Date date;

	public Person() {
		super();
		name="";
		date=new Date();
	}
	public Person(String name,int dd,int mm,int yy) {
		this.name=name;
		this.date=new Date(dd,mm,yy);
	}
	public void display() {
		System.out.println("Name : "+name);
		
		if(date!=null) {
			System.out.println("Birthdate : ");
			date.display();
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", date=" + date + "]";
	}
	
	
}
