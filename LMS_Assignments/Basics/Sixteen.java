import java.io.*;

public class Sixteen{
	public static void main(String args[]){

		int per=Integer.parseInt(args[0]);

		if(per>=90){
			System.out.println("Excellent");
		}
		else if(per>=80){
			System.out.println("Very Good");
		}
		else if(per>=70){
			System.out.println("Good");
		}
		else if(per>=60){
			System.out.println("Average");
		}
		else if(per>=40){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
	}
}