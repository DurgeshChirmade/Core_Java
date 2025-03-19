import java.io.*;

public class Third{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);

		if(num<2){
			System.out.println(num+" is prime number.");
		}
		else{
			boolean flag=true;

			for(int i=2;i<num/2;i++){
				if(num%i==0){
					flag=false;
				}
			}

			if(flag==true){
				System.out.println(num+" is prime number.");
			}
			else{
				System.out.println(num+" is not a prime number.");
			}
		}
	}
}