package session3_3;
//Covariant return types
public class D {

	public D m1()
	{
		return new D();
	}
	
	public void getMsg() {
		System.out.println("helloo");
	}
	
	public static void main(String[] args) {
		new D().m1().getMsg();
		new C().m1().getMsg();
	}
}
