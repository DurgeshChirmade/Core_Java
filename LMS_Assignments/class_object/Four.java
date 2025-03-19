import java.io.*;

class Student{
	int rno;
	String name;
	int no_of_subjects;
	int marks[];

	Student(){
		rno=0;
		name="";
		no_of_subjects=0;
	}
	Student(int rno,String name,int no_of_subjects){
		this.rno=rno;
		this.name=name;
		this.no_of_subjects=no_of_subjects;
		marks=new int[no_of_subjects];
		for(int i=0;i<no_of_subjects;i++){
			marks[i]=45+i;
		}
	}
	void display(){
		System.out.println("Rno : "+rno+" Name : "+name+" No.of Subjects : "+no_of_subjects);
		int sum=0; float per=0.0f;
		int total=no_of_subjects*100;
		for(int i=0;i<no_of_subjects;i++){
			System.out.println(marks[i]);
			sum=sum+marks[i];
		}
		per=((float)sum)/total;
		per=per*100;
		System.out.println("Name : "+name+" Per : "+per);
	}

}
public class Four{
	public static void main(String args[]){

		Student s = new Student(101,"Durgesh",7);

		s.display();

	}
}