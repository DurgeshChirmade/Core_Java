package demos;

import java.util.Set;
import java.util.TreeSet;

import entities.Student;

public class StudentTreeSet {

	public static void main(String[] args) {
		Set<Student> sts = new TreeSet<>();
		sts.add(new Student(12,"amit",78.7f));
		sts.add(new Student(34,"Vikas",78.2f));
		sts.add(new Student(20,"Manasi",87.4f));
		sts.add(new Student(55,"Manasi",67.4f));
		sts.add(new Student(23,"Tanay",93.4f));
		sts.add(new Student(56,"Nisha",78.2f));
		sts.add(new Student(26,"Manasi",87.4f));
		
		for(Student s : sts)
			System.out.println(s);

	}

}
