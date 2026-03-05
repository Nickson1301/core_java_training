package Session5;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Temp, String> h=new Hashtable<Temp, String>();
		h.put(new Temp(5), "A");
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "C");
		h.put(new Temp(12), "D");
		h.put(new Temp(23), "E");
		h.put(new Temp(15), "F");
		h.put(new Temp(25), "G");
		System.out.println(h);
	}
}
