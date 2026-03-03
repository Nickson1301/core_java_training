package session3_3;

public class Factorial {

	public int fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
}
