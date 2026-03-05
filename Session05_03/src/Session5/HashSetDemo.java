package Session5;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		//HashSet<String> h=new HashSet<String>();
		LinkedHashSet<String> h=new LinkedHashSet<String>();
		h.add("Z");
		h.add("F");
		h.add("S");
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("E");
		System.out.println(h);
		
		System.out.println(h.add("D"));
		System.out.println(h);
	}
}
