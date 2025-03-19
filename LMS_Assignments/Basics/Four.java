import java.io.*;

public class Four{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);

		System.out.print("Divisors of "+num +" is ");

		for(int i=1;i<=num;i++){
			if(num%i==0){
				System.out.print(i+" ");
			}
		}
	}
}