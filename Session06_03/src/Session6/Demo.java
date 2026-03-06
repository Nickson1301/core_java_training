package Session6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("S");
		l.add("D");
		l.add("A");
		//System.out.println(l.add(new Integer(20)));
		//l.add(null);
		
		System.out.println("before sorting"+l);
		//Collections.sort(l);
		Collections.sort(l,new MyComparator());
		System.out.println("After sorting "+l);
	}
}
