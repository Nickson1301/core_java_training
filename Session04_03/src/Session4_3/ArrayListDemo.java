package Session4_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;

public class ArrayListDemo {

	public static void main(String[] args) {
		//non-generic version of arraylist
		//ArrayList l=new ArrayList();
		
		//generic version of Arraylist - restricting the type param
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		//List<Integer> l=new ArrayList<Integer>();
		
		
//		l.add("A");
//		l.add(1.2f);
		
		l.add(10);
		l.add(20);
		l.add(null);
		System.out.println(l);
		
		l.remove(1);
		System.out.println(l);
		
		l.add(1,15);
		System.out.println(l);
		
		l.add(50);
		System.out.println(l);
		
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
	}
}
