import java.io.*;

public class Demo{
	public static void main(String args[]){

		int cnt=0;
		
	
		for(int i=11;i<100;i=i+2){
			boolean flag=true;
			for(int j=2;j<i/2;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag==true){
				cnt++;
			}
		}

		System.out.println("Count : "+cnt);
	}
}