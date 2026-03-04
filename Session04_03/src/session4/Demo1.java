package session4;


public class Demo1 {

	public static void main(String[] args) {
		int a,b,c=0;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("c= "+c);
		}
		catch (Exception e) {
			if(e instanceof ArithmeticException)
			{
				System.out.println("denominator should not be zero");
			}
			else if(e instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println("enter atleast two values");
			}
			else if(e instanceof NumberFormatException)
			{
				System.out.println("enter only integer values");
			}
			else {
				System.out.println("exception occured ");
			}
		}
		
		
		
		
//		catch (ArrayIndexOutOfBoundsException e) {
//
//			System.out.println("enter atleast two values");
//		}
//		catch (NumberFormatException e) {
//			System.out.println("enter only integer values");
//		}
//		catch (ArithmeticException e) {
//			System.out.println("Denominator should not be zero");
//		}
//		catch (Exception e) {
//			System.out.println("error");
//		}
	}
}
