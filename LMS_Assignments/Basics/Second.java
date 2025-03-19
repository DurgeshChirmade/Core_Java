import java.io.*;

public class Second{
	public static void main(String args[]){
		int n1=40,n2=45,n3=35;

		if(n1>n2 && n1>n3){
			System.out.println(n1+" is maximum number.");
		}
		else if(n2>n3){
			System.out.println(n2+" is maximum number.");
		}
		else{
			System.out.println(n3+" is maximum number.");
		}
	}
}