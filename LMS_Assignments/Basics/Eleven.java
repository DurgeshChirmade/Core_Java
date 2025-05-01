import java.io.*;
public class Eleven
{
	public static void main(String args[]) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter how many rows you want in floyd's triangle : ");
		int row=Integer.parseInt(br.readLine());

		int num=1;

		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}