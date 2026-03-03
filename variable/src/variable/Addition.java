package variable;

public class Addition {

	public int add(int b,int... a) {
		
		System.out.println("length a = "+a.length);
		System.out.println("b = "+b);
		

		int sum=0;
		for(int i=1;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Addition a=new Addition();
		
		System.out.println("sum ="+a.add(1,2,3,4,5,6,7));

	}
}
