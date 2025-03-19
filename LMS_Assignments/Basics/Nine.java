import java.io.*;

public class Nine{
	public static void main(String args[]){

		int num=2536;
		int sum=0,rem=0;

		for(int i=1;i<=4;i++){
			rem=num%10;
			sum = sum + rem;
			num=num/10;
		}

		System.out.println("Sum : "+sum);
	}
}