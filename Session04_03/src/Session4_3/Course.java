package Session4_3;

public class Course implements Cloneable{

	String s1;
	String s2;
	String s3;
	
	public Course() {}

	public Course(String s1, String s2, String s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}


	public String toString() {
		return "Course [s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + "]";
	}


	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
