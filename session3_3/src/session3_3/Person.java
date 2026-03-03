package session3_3;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public Person() {}

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public void display()
	{
		System.out.println("fname ="+firstName+" lname ="+lastName
				+""+"Age = "+age);
	}
	
}
