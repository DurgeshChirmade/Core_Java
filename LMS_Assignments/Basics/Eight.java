import java.io.*;

public class Eight{
	public static void main(String args[]){

		int f1=1,f2=0,f3;

		System.out.print(f2+" ");

		for(int i=2;i<10;i++){
			f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		}
	}
}