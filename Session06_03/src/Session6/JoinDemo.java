package Session6;

public class JoinDemo implements Runnable{

	@Override
	public void run() {

		for(int i=1;i<=3;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new JoinDemo(),"t1");
		Thread t2=new Thread(new JoinDemo(),"t2");
		Thread t3=new Thread(new JoinDemo(),"t3");
		
		t1.start();
		t1.join();
		t2.start();
		t3.start();
		
	}
	
}
