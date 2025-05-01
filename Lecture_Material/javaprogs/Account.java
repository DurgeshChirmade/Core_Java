class Account {
   private int accno;   //non-static/instance data member
   private double balance;
   private static float int_rate;   //static data member
   
   static{
        System.out.println("static block called");
	int_rate = 4.5f;
   }

   public Account() {
	accno = 0;
        balance = 0.0;
   }
   public Account(int accno, double balance) {
	this.accno = accno;
        this.balance = balance;
   }
   public void display () {
	System.out.println("Accno : "+accno);
        System.out.println("Balance : "+balance);
   }

   //non-static method
   public double balanceWithInterest() {
        //it can access static and non-static data
	return balance + (balance * int_rate/100);
   }

   //static method
   public  static void updateIntRate(float newrate) {
        //it can access only static // this is not available
	int_rate = newrate;
        //System.out.println("Balance : "+balance); 
   }
  

}




