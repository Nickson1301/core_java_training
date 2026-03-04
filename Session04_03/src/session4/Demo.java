package session4;

public class Demo {

	public static void getMessage() {
		msg();
	}
	
	public static void msg() {
		try
		{
			int no=10/0;
			System.out.println("no="+no);
			
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
			
		}
		System.out.println("done");
	}
	
	public static void main(String[] args) {
		Demo.getMessage();
		System.out.println("finish");
	}
}
