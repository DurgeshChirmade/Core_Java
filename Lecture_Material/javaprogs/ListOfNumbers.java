package demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListOfNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<>();
		//numbers.add(new Integer(23));
		numbers.add(23);    //autoboxing - built in value to wrapper class instance
		numbers.add(15); 
		numbers.add(98); 
		numbers.add(34); 
		numbers.add(8); 
		numbers.add(39); 
		numbers.add(23); 
		System.out.println("size : "+numbers.size());
		System.out.println(numbers);  //toString()
		numbers.add(99);
		System.out.println(numbers);  //toString()
		numbers.remove(Integer.valueOf(99));   //remove element 99
		System.out.println(numbers);  //toString()
		numbers.remove(3);   //remove at index 3
		System.out.println(numbers);
		
		System.out.println("Min : "+Collections.min(numbers));
		
		
		/*List<Employee> list = new LinkedList<>();
		list.add(new Employee(.)) */
		
	}

}
