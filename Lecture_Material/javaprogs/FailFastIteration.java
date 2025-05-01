package demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastIteration {

	public static void main(String[] args) {		
		Map<String,Integer> map = new ConcurrentHashMap<>();
		map.put("gmail.com", 1);
		map.put("knowit.com", 3);
		Set<Entry<String,Integer>> set = map.entrySet();
		Iterator<Entry<String,Integer>> mitr = set.iterator();
		//does not fail inspite of adding the new element
		set.add(Map.entry("object.com", 2));		
		while(mitr.hasNext()) {
			Entry obj = mitr.next();
			System.out.println(obj.getKey()+" : "+obj.getValue());
		}
		
		System.out.println("************************");
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(45);
		numbers.add(23);
		numbers.add(67);
		numbers.add(45);
		Iterator<Integer>  itr = numbers.iterator();
		numbers.add(2,98);
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		
		
		
	}

}
