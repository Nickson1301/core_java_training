package Session5;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		//t.add("Rahul");
		//t.add(10);//classcastexception
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("C");
		t.add("C");
		t.add("b");
		//t.add(null);
		System.out.println(t);
	}
}
