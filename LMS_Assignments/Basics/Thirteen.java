import java.io.*;

public class Thirteen{
	public static void main(String args[]){

		int num=2381,rem=0;

		System.out.print("Reverse number : ");

		while(num>0){
			rem=num%10;

			System.out.print(rem);

			num=num/10;
		}
	}
}