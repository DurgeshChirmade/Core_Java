import java.io.*;

public class First{
	public static void main(String args[]){
		int n=Integer.parseInt(args[0]);

		if(n%2==0){
			System.out.println(n+" is even number.");
		}
		else{
			System.out.println(n+" is odd number.");
		}
	}
}