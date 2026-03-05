package Session5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> h=new HashMap<String, Integer>();
		h.put("Nickson", 100);
		h.put("Rojar", 400);
		h.put("Sankar", 600);
		System.out.println(h.put("Girish", 800));
		h.put("Saran", 1000);
		
		System.out.println(h);
		Set<String> s=h.keySet();
		System.out.println(s);
		
		Collection<Integer> c=h.values();
		
		System.out.println(c);
		
		Set s1=h.entrySet();
		System.out.println(s1);
		
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> m=(Map.Entry<String, Integer>) itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
			if(m.getKey().equals("Nickson"))
				m.setValue(2000);
		}
		System.out.println(h);
		
	}
}
