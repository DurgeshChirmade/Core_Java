package demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		/*
		List l = new ArrayList<>();
		l.add("hello");
		l.add(new Date());
		l.add(new Thread());
		
		System.out.println(((String)l.get(1)).toUpperCase());
		*/
		List<String> l = new ArrayList<>(8);
		l.add("java");
		l.add("ds");
		l.add("c++");
		l.add("python");
		l.add("javascript");
		l.add("jquery");
		l.add("json");
		l.add("java");
		System.out.println(l);   //toString()
		System.out.println("Element at index 1 :"+l.get(1).toUpperCase());
		System.out.println("Size : "+l.size());		
		//based on index
		l.remove(3);
		System.out.println(l);   //toString()
		//based on value
		l.remove("java");        //only first occurrence
		System.out.println(l);   //toString()
		
		//iteration
		//for-each loop(advanced)
		for( String element :l)
			System.out.println(element+" : "+element.length());
		System.out.println("********************");		
		
		//using Iterator
		 Iterator<String> itr = l.iterator();
		 while(itr.hasNext())
			 System.out.println(itr.next().toUpperCase());
		 System.out.println("*********************");		 
		 
		 //using list iterator
		 System.out.println("using list iterator......");
		 ListIterator<String>  litr= l.listIterator();
		 while(litr.hasNext())    //make the pointer moved to last
			 litr.next();
		 while(litr.hasPrevious())
			 System.out.println(litr.previous().toUpperCase());
		 
		 //forEach() -- lambda expression
		 //l.forEach(null);
		 
		 //common algorithms 
		 Collections.sort(l);
		 System.out.println("After sorting .....");
		 for( String element :l)
				System.out.println(element+" : "+element.length());
		 System.out.println("********************");	
		 
		 
		 //idx = 0 to size-1 
		 //l should be sorted
		 int idx = Collections.binarySearch(l, "javascript");
		 if(idx >= 0 && idx < l.size()-1)
			 System.out.println("element present");
		 else
			 System.out.println("element not present");
		 //System.out.println("Java present at : "+idx);
		 System.out.println("*******************");
		 //random reordering
		 Collections.shuffle(l);
		 for( String element :l)
				System.out.println(element+" : "+element.length());
		 System.out.println("********************");	
		 
		 
		 
	}

}


