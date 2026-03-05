package Session5;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.RandomAccess;

public class LinkedListDemo {

	public static void main(String[] args) {
       LinkedList<Integer> l=new LinkedList<Integer>();
       
       System.out.println(l instanceof RandomAccess);
       System.out.println(l instanceof Serializable);
       System.out.println(l instanceof Cloneable);
      // l.add("nickson");
       l.add(30);
      // l.add("rojar");
       l.add(31);

       l.add(32);
       l.add(33);
       l.add(34);
       System.out.println(l);
       Iterator<Integer> itr=l.iterator();
       while(itr.hasNext())
       {
    	   int i=itr.next();
    	   if((i%2)==0)
    		   System.out.println(i);
    	   else
    		   itr.remove();
       }
       System.out.println("------");
       System.out.println(l);
       
       
       
       
       
       
//       for (Object i:l) {
//    	   System.out.println(i);
//    	   
//       }
//       
//       System.out.println(l);
//       l.addFirst("nikitha");
//       l.addLast("rahul");
//       l.removeFirst();
//       l.removeLast();
//       System.out.println(l);
	}

}
