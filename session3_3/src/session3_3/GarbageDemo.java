package session3_3;

public class GarbageDemo {

	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("object Grabage collected");
	}
	
	public static void main(String[] args) {
		GarbageDemo g1=new GarbageDemo();
		GarbageDemo g2=new GarbageDemo();
		GarbageDemo g3=new GarbageDemo();
		
		g1=null;
		g2=null;
		g3=null;
		 
		System.gc();
	}
}
