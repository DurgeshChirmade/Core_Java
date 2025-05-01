package apps;

import java.util.Arrays;
import java.util.List;

public class UsingArrays {

	public static void main(String[] args) {
		//Collections - 
		// Arrays - static methods - algorithm
		List<Integer> numbers = Arrays.asList(3,5,7,8,9,12);

		int [] arr = {7,8,9,1,4,3};
		Arrays.sort(arr);
		System.out.println("Sorted array");
		for(int n : arr) {
			System.out.println(n);
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
