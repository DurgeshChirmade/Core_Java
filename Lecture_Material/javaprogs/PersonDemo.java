public class PersonDemo {
   public static void main(String [] args) {

        //NullPointerException  - calling method on null reference
  	Person p1 = new Person();
	p1.display();

        Person p2 = new Person(12, "Bakul" , 12, 11, 1999);
	p2.display();

   }
}