import java.io.*;

public class Fifteen
{
	public static void main(String []args){

		for(int i=1;i<=5;i++){
			//print leading spaces
			for(int s=1;s<=5-i;s++){
				System.out.print(" ");
			}

			//print increasing numbers
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}

			//print decreasing numbers
			for(int k=i-1;k>=1;k--){
				System.out.print(k+" ");
			}

			//Move to the next line
			System.out.println();
		}
	}
}