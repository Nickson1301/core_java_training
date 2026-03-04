package Session4_3;
import java.lang.CloneNotSupportedException;

public class Student extends Object implements Cloneable{

	private int rn;
	private String nm;
	private Course course;

	public Student() {
	}

	public Student(int rn, String nm,Course course) {
		super();
		this.rn = rn;
		this.nm = nm;
		this.course=course;
	}

	public String toString() {
		return "Student [rn=" + rn + ", nm=" + nm +", course = "+course+ "]";
	}
	 
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Student student=(Student)super.clone();
		student.course=(Course)course.clone();
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException{
		Course c=new Course("math","chemistry","comp");
		Student s1 = new Student(1, "nickson",c);
		Student s2=(Student) s1.clone();
		System.out.println(s2);
		s1.course.s1="history";
		
	}
}
