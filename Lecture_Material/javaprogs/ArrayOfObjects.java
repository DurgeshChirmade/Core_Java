public class ArrayOfObjects {
    public static void main(String [] args) {
       /*Date [] dates = new Date[3];   //array instantiation
       dates[0] = new Date();
       dates[1] = new Date(23,11,2009);
       dates[2] = new Date(1998); */

       Date [] dates = { new Date() , new Date(23,11,2009)  , new Date(1998) };
       for(int i=0 ; i<dates.length; i++) {
           dates[i].display('-');
       }
   }
}
