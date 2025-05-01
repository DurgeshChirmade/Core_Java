public class CheckPrime {
   public static void main(String [] args) {
	int n=Integer.parseInt(args[0]);
        if(n < 2)
            System.out.println(n+" is not prime");
        else {
            boolean flag = true;
	    for(int i = 2 ;i<n/2 ;i++)
        {
		if(n % i == 0) 
        {
		     flag =false;
		     break;		
                }   
            }
            if( flag == true)
	         System.out.println(n+" is prime");
	    else
		 System.out.println(n+" is not prime");

        }
   } 
}