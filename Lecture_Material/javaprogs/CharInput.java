package iodemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharInput {

	public static void main(String[] args) {		
		//InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 'q' to quit");
			int i;
			int count = 0;
			int alphabets = 0;
			int digits = 0;
			while( (i = br.read()) != 'q') {
				//System.out.println((char)i);
				//if(i >= '0' && i<= '9')
					//digits++;
				
				count++;
			}
			System.out.println("count : "+count);
			
			System.out.println("read - write operation is over");			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		
	}

}
