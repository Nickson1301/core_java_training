package session3_3;

public class Teacher extends Person {

	private String subject;
	
	public Teacher() {}

	public Teacher(String fnm, String lnm, int age,String subject) {
		super(fnm, lnm, age);
		this.subject=subject;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Subject ="+subject);
	}
	
}
