package P1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyThread extends Thread{

	static ConcurrentHashMap<Integer, String> m=new ConcurrentHashMap<Integer, String>();
 
	public void run()
	{
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("child thread updating map");
		m.put(103,"c");
	}
	
	public static void main(String[] args) throws InterruptedException{
		m.put(101, "A");
		m.put(102, "B");
		
		MyThread t1=new MyThread();
		t1.start();
		Set s=m.keySet();
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Integer i1=(Integer) itr.next();
			System.out.println("main thread iterating and current entry :"
					+i1+"-----"+m.get(i1));
			Thread.sleep(3000);
		}
		System.out.println(m);
	}
}
