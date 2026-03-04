package Session4_3;

public class WrapperDemo {

	public static void main(String[] args) {
		int no=100;
		Integer i=new Integer(no);//primmitive to wrapper-boxing
		
		int a=i.intValue();//wrapper to primmitive-unboxing
		
		//string to primitive
		String str="30";
		int b=Integer.parseInt(str);
		
		//string to object
		Integer c=Integer.valueOf(str);
		
		//autoboxing
		int t=20;
		Integer s=t;
		
		//auto unboxing
		int y=s;
	}
}
