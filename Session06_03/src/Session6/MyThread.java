package Session6;

public class MyThread extends Thread implements Runnable{

	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
	}
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		
//		t1.setName("one");
//		t2.setName("two");
//		t3.setName("three");
//		
		t1.start();
		t2.start();
		t3.start();
	}
}
