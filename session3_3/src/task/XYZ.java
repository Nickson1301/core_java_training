package task;
import java.util.Scanner;

public class XYZ {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter size of array :");
		int size=s.nextInt();
		
		int a[][]=new int[size][3];
		
		System.out.println("enter "+ size +" Array elements : ");
		System.out.println("enter the id,price,quantity :");
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				a[i][j]=s.nextInt();
				
			}
			System.out.println();
		}
		
		for (int i[]:a) {
			for(int j:i) {
				System.out.print(j+"   ");
			}
			System.out.println();
		}
	}
}
