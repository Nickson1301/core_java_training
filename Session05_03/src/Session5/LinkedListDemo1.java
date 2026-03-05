package Session5;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("rojar");
		l.add("nickson");
		l.add("girish");
		l.add("saran");
		System.out.println(l);
		
		ListIterator<String> itr=l.listIterator();
		while(itr.hasPrevious())
		{
			String s=itr.previous();
			if(s.equals("nickson"))
			{
				//itr.remove();
				//itr.add("stephan");
				itr.set("lalith");
				
			}
		}
		System.out.println(l);
	}
}
