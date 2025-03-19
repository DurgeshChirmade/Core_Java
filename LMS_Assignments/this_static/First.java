import java.io.*;

class BankAccount{
	private int accno;
	private float balance;

	static float interest_rate;

	static{
		interest_rate=7.25f;
	}

	public BankAccount(){
		accno=0;
		balance=0.0f;
	}

	public BankAccount(int accno,float balance){
		this.accno=accno;
		this.balance=balance;
	}

	public void display(){
		System.out.println(accno+" "+balance);
	}

	public static void updateInterestRate(float newRateOfInterest){
		interest_rate=newRateOfInterest;
	}

	public void calculate(){
		float interest=0.0f;
		interest=(balance*interest_rate)/100;

		System.out.println("Balance : "+balance+" Interest on balance : "+interest);
	}

	public void show(){
		float interest=0.0f;
		interest=(balance*interest_rate)/100;

		System.out.println("Balance : "+balance+" Interest on balance : "+interest);
	}
}

public class First{
	public static void main(String args[]){

		BankAccount b = new BankAccount(101,45000.67f);


		b.display();

		b.calculate();

		b.updateInterestRate(8.5f);

		b.show();

	}
}