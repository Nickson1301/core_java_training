package Session5;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		/*System.out.println("a".compareTo("A"));
		System.out.println("Z".compareTo("g"));
		System.out.println("A".compareTo("A"));
		System.out.println("A".compareTo(null));
		*/
		
		//TreeSet t=new TreeSet();
		TreeSet<Integer> t=new TreeSet<Integer>(new MyComparator());
		//t.add("nickson");
		t.add(10);
		t.add(0);
		t.add(10);
		t.add(15);
		t.add(20);
		System.out.println(t);
	}
}
