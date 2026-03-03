package session3_3;

public class Child extends Parent {

	private int no;
	
	public Child()
	{
		super(10);
		System.out.println("in default const in child");
	}
	
	public Child(int no)
	{
		super(101);
		System.out.println("in param const in child");
		this.no=no;
		System.out.println(no);
	}
	public static void main(String[] args) {
		Child c=new Child(100);
	}
}
