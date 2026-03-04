package Session4_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ARDemo {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("abc.txt");
				FileOutputStream fos=new FileOutputStream("abc.txt",true))
		{
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
