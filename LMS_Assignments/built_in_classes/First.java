import java.io.*;

public class First
{
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your string in the form of 0 & 1 : ");
		String bin=br.readLine();
		
		int num=0;
		
		if(bin.length()>=1 && bin.length()<=8) {
			for(int i=bin.length()-1;i>=0;i--) {
				//if(bin.charAt(i)=='0' && bin.charAt(i)=='1') {
					if(bin.charAt(i)=='1') {
						num += Math.pow(2, bin.length()-1-i);
					}
				//}
			}
		}
		
		System.out.println("Binary number "+bin+" into Decimal number : "+num);

	}
}