package Ennum;

public class EnnumDemo {

	enum Seasons{SUMMER,WINTER,RAINY};
	
	public static void main(String[] args) {
		Seasons s=Seasons.WINTER;
		System.out.println(s);
		for(Seasons s1:Seasons.values()) {
			System.out.println(s1+" "+s1.ordinal());
		}
	}
}
