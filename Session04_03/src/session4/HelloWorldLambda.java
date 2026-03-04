package session4;

public class HelloWorldLambda{

	public static void main(String[] args) {
		HelloWorldInterface helloWorldInterface =()->{return "Hello!!";};
		System.out.println(helloWorldInterface.sayHelloWorld());
	}
}
