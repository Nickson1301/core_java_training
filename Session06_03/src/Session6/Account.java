package Session6;

public class Account {

	private int balance;
	
	public Account()
	{
		balance=3000;
	}
	
	public void deposit(int amount) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName());
		int temp;
		temp=balance;
		temp+=amount;
		Thread.sleep(500);
		balance=temp;
		System.out.println(Thread.currentThread().getName()+" "+balance);
		
	}
	public int getBalance()
	{
		return balance;
	}
	
}
