import java.io.*;

public class Seven{
	public static void main(String args[]){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}