import office.student.Student;     //office\student\Student.class
import office.staff.Trainer;
public class PackageAppp {
    public static void main(String [] args) {
        //1. fully qualified name 
	//office.student.Student s1 = new office.student.Student();
        Student s1 = new Student(); 
        s1.display();

        //office.staff.Trainer t1 = new office.staff.Trainer();
        //2. simple name of class + import statement 
        Trainer t1 = new Trainer();
        t1.display(); 
    }
}