package session4;

public class Test {

	public static void main(String[] args) {
		A a=new A();
		double d=a.div(5,2);
		if(d<1)
		{
			try
			{
				throws new MyException();
				
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("d ="+d);
	}
}
