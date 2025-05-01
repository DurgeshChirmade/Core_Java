public class AccountDemo {
   public static void main(String [] args) {
	Account a1;
        a1 = new Account(1002, 13000.0);  //static block gets executed

        Account a2 = new Account(1987, 167800.0);    //static block will not get executed

	a1.display();
        System.out.println("Balance with interest : "+a1.balanceWithInterest());

	a2.display();
	System.out.println("Balance with interest : "+a2.balanceWithInterest());
     
        System.out.println("After modification ....");
        Account.updateIntRate(4.7f);   //preferred
        //a1.updateIntRate(4.7f);   //discouraged
        System.out.println("Balance with interest : "+a1.balanceWithInterest());
        System.out.println("Balance with interest : "+a2.balanceWithInterest());
   
        /*Integer.parseInt
        Math.sqrt() */

   }
}