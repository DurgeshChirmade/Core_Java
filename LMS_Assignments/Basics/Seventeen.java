import java.io.*;

public class Seventeen{
	public static void main(String args[]) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your number : ");
		String d=br.readLine();

		boolean flag=true;

		for(int i=0;i<d.length();i++){
			if(d.charAt(i)!='0' && d.charAt(i)!='1'){
				flag=false;
				break;
			}
		}

		if(flag){
			System.out.println(d+ " is a binary number.");
		} else{
			System.out.println(d+" is not a binary number.");
		}
		
	}
}