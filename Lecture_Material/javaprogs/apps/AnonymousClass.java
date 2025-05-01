package apps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

abstract class Operations {
	
	public abstract void simple();
}




public class AnonymousClass {

	public static void main(String[] args) {
		Operations obj = new Operations() {

			@Override
			public void simple() {
				// TODO Auto-generated method stub
				
			}

		};
		
		
		Comparator<String> obj1 = new Comparator<>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}			
		}; 		
		Set<String> words = new TreeSet<> (obj1);
		
		
		
		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		//Runnable r1 = () -> {System.out.println("Hello from lambada expression");};
		Thread t1 = new Thread(()->System.out.println("Hello"));
		t1.start();
		
		/*Set<String> words1 = new TreeSet<String>((String s1,String s2)->{
			return s1.length() - s2.length();
		});*/
		Set<String> words1 = new TreeSet<String>((String s1,String s2)->{
			return s1.length() - s2.length();
		});
		
		
		List<String> list = new ArrayList<>();
		list.add("gg");
		list.add("ff");
		list.add("rr");
		list.add("ee");
		//Consumer - functional interface
		list.forEach(new Consumer<String>() {
			public void accept(String t) {				
				System.out.println(t);
			}			
		});		
		list.forEach((String t)->{System.out.println(t);});
		list.forEach(t -> System.out.println(t));
		
	}
}




