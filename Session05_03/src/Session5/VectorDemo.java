package Session5;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		System.out.println(v.capacity());
		
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		
		v.addElement(10);
		//newCapacity=currentCapacity*2
//		System.out.println(v.capacity());
//		System.out.println(v);
//		v.addElement(11);
//		v.addElement(12);
//		v.addElement(13);
//		v.addElement(14);
//		v.addElement(15);
//		v.addElement(16);
//		v.addElement(17);
//		v.addElement(18);
//		v.addElement(20);
//		v.addElement(21);
//		v.addElement(22);
//		v.addElement(23);
//		System.out.println(v.capacity());
//		System.out.println(v);
		
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements())
		{
			int i=e.nextElement();
			if((i%2)==0)
				System.out.println(i);
			
		}
		System.out.println(v);
	}
}
