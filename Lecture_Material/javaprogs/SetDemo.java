package demos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//Set<String> words = new HashSet<>();
		//<String> words = new LinkedHashSet<>();
		Set<String> words = new TreeSet<>();
		words.add("int");
		words.add("char");
		words.add("transient");
		words.add("class");
		words.add("public");
		words.add("interface");
		words.add("int");
		System.out.println("size : "+words.size());
		System.out.println(words);
	}

}
