import java.io.*;

public class Twelve{
	public static void main(String args[]){

		 int num=Integer.parseInt(args[0]);
		 int cnt=0;

		 int tnum=num;
		 while(tnum>0){

		 	tnum=tnum/10;
		 	cnt++;
		 }
		 
		 int rem=0,sum=0,snum=num;
		 while(snum>0){
		 	rem=snum%10;

		 	int pow=1;
		 	for(int i=1;i<=cnt;i++){
		 		pow=pow*rem;
		 	}
		 	sum=sum+pow;
		 	snum=snum/10;
		 }

		 if(sum==num){
		 	System.out.println(num+" is armstrong number");
		 }
		 else{
		 	System.out.println(num+" is not a armstrong number.");
		 }
	}
}