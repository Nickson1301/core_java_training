package session3_3;

public class AllCalculations extends Factorial implements CompareCal,StaticCal{

	public int add(int a,int b) {
		return (a+b);
	}
	
	public int sub(int a,int b) {
		int c=0;
		if(a>b)
		{
			c=a-b;
		}
		else
		{
			c=b-a;
		}
		return c;
	}
	
	public int avg(int a,int b) {
		return (a+b)/2;
	}
	
	public int min(int a,int b) {
		return (a<b)?a:b;
	}
	
	public static void main(String[] args) {
		AllCalculations a=new AllCalculations();
		System.out.println("add ="+a.add(10, 20));
		System.out.println("sub ="+a.sub(4,6));
		System.out.println("min ="+a.min(30, 20));
		System.out.println("fact ="+a.fact(5));
		System.out.println("avg ="+a.avg(10, 20));
	}
}
