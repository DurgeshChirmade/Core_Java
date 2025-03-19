import java.io.*;

public class Five{
	public static void main(String args[]){

		int num = Integer.parseInt(args[0]);

		int fact=1;

		if(num==0){
			System.out.println("Factorial : "+fact);
			return;
		}

		for(int i=1;i<=num;i++){
			fact = fact*i;
		}

		System.out.println("Factorial : "+fact);
	}
}