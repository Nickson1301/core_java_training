package Session6;

public class Thread2  extends Thread1{

	Account a;

	public Thread2(Account a) {
		super(a);
		this.a = a;
	}
	

	public void run() {
		try {
			a.deposit(5000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
