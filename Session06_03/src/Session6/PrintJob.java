package Session6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintJob implements Runnable{

	private String name;

	public PrintJob(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+"..Job started by thread "+
		Thread.currentThread().getName());
		try {
			Thread.sleep(500);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+"..Job completed by thread "+
				Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		PrintJob[] jobs= {
				new PrintJob("xyz"),
				new PrintJob("abc"),
				new PrintJob("efg"),
				new PrintJob("lmn"),
				new PrintJob("fgh"),
		};
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(PrintJob j:jobs)
		{
			service.submit(j);
		}
		service.shutdown();
	}
	
}
