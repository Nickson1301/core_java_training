package Session6;

public class Thread1 extends Thread{

	Account a;

	public Thread1(Account a) {
		super();
		this.a = a;
	}
	
	
	public void run() {
		try {
			a.deposit(4000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
