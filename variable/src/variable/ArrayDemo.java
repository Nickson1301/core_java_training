package variable;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array :");
		int size=s.nextInt();
		int a[]=new int[size];
		
		System.out.println("enter "+ size +"Array elements : ");
		
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Array elemets are as follows:");
		
		for(int i:a) {
			System.out.println(i);
		}
	}
}
