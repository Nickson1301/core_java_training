package finalkeyword;

public final class A {

	private final float PI;
	
	public A() {
		PI=3.14f;
	}
	
	public final void sayHello() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		A a=new A();
		a.sayHello();
	}
}
