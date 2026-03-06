package Session6;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentTraditionalDemo extends Thread{

	static ArrayList l=new ArrayList();
	
	public void run() {
		try {
			Thread.currentThread().sleep(2000);
		
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("child thread updating list");
		l.add("D");
	}
	
	public static void main(String[] args) throws InterruptedException{
		l.add("A");
		l.add("B");
		l.add("C");
		
		ConcurrentTraditionalDemo t1=new ConcurrentTraditionalDemo();
		t1.start();
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println("main thread iterating list and current object"
			+s);
			Thread.sleep(3000);
		}
		System.out.println(l);
	}
}
