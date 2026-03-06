package Session6;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListDemo {

	public static void main(String[] args) {
		String s[]= {"A","B","C"};
		List l=Arrays.asList(s);
		
		System.out.println(l);
		s[0]="K";
		
		System.out.println(l);
		
		l.set(1, "J");
		System.out.println(l);
		
		
		//l.add("M");//java.lang.UnsupportedOperationException
		//l.remove(0);//java.lang.UnsupportedOperationException
		//l.set(0, new Integer(10));//java.lang.ArrayStoreException:
		System.out.println(l);
	}
}
