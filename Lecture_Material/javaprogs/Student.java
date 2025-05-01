package entities;

public class Student implements Comparable<Student> {
	int sid;
	String name;
	float percent;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name, float percent) {
		super();
		this.sid = sid;
		this.name = name;
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", percent=" + percent + "]";
	}
	@Override
	public int compareTo(Student s) {
		//this - s  - ascending order
		//s - this - descending order 
		//return (int)(this.percent - s.percent);
		int diff = 0;
		if(this.percent > s.percent)
			diff =1;
		else if(this.percent < s.percent)
			diff = -1;
		else {
			diff = s.name.compareTo(this.name);
			if(diff == 0) {
				diff = this.sid - s.sid;
			}
		}		
		return diff;
	}
	
	
	
	
}





