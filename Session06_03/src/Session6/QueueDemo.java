package Session6;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		System.out.println(p.peek());
		System.out.println(p);
		for(int i=1;i<=10;i++)
		{
			p.offer(i);
		}
		System.out.println(p);
		
		//poll() and remove()
		System.out.println(p.poll());
		System.out.println(p);
	}
	 
}
