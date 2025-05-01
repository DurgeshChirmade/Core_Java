public class DateDemo {
    public static void main(String [] args) {
        int n;
	Date d1;   //d1 is reference variable
        d1 = new Date(); 
         /*  allocate sufficient memory on heap
             call appropriate constructor
         */ 
        d1.display();
        //System.out.println(n);  //can not access n it not initialized

        d1.display('-'); 

        Date d2;
        d2 = new Date(12,11,1999);
        d2.display();
        d2.display('.');

        Date d3;
        d3 = new Date(d2);
        d3.display();
        d3.display(':');

        Date d4;
        d4 = new Date(2000);
        d4.display();
        d4.display('-');
  
    }
}