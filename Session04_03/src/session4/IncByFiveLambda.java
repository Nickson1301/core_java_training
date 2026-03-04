package session4;

public class IncByFiveLambda {

	public static void main(String[] args) {
		IncByFiveInterface i=(a)->(a+5);
		System.out.println(i.incByFive(6));
		System.out.println(i.incByFive(11));
	}
}
