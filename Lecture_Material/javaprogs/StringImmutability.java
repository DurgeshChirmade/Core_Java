package apps;

public class StringImmutability {

	public static void main(String[] args) {
		String s1 = new String("welcome");
		//s1.intern();
		s1.replace('e', 'E');  //separate instance
		System.out.println(s1);
		
		String s = "hello";
		
		//modification  - frequently
		s1 = s1.replace('e','E');
		System.out.println(s1);  //wElcomE
		
		StringBuilder sb = new StringBuilder("welcome");
		sb.append(" to knowit" );
		System.out.println(sb);
		
		//StringBuffer - methods are similar StringBuilder 
		System.out.println("*********************");
		String w1 = new String("welcome");
		String w2 = new String("welcome");
		System.out.println(w1 == w2);   //false
		System.out.println(w1.equals(w2));   //true
		System.out.println("***************");
		String p1 = "welcome";    //welcome string gets added in pool
		String p2 = new String("welcome");   //welcome string referred from the pool
		System.out.println(p1 == p2);   //true
		System.out.println(p1.equals(p2));   //true

	}

}
