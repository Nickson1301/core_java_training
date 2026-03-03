package task;

public class Person {

	private String name;
	private int age=18;

	
	public String toString() {
		return "Person= [name=" + name + ", age=" + age + "]";
	}


	public Person(String name) {

		this.name=name;
	}
	public static void main(String[] args) {
		Person p=new Person("nickson");
		System.out.println(p);
	}
	
}
