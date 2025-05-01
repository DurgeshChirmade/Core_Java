package demos;

import entities.Student;
import myclasses.ArrayOperation;
import myclasses.Stack;

public class MystackDemo {

	public static void main(String[] args) {
		//type needs to be explicitly mentioned
		Stack<Character> chars= new Stack<>();
		//chars.pu
		
		//type inference
		//type will be understood automatically
		String [] arr = {"ff","ee","jj"};
		ArrayOperation.printArray(arr);
		
		Student [] arr1 = {new Student(), new Student()};
		ArrayOperation.printArray(arr1);
	}

}
