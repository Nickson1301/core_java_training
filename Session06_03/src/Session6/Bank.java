package Session6;

public class Bank {

	public static void main(String[] args) throws InterruptedException{
		Account a=new Account();
		Thread1 t1=new Thread1(a);
		Thread2 t2=new Thread2(a);
		
		t1.start();
		t2.start();
		
		System.out.println("balance"+a.getBalance());
	}
}
