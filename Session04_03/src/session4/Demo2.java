
package session4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// FileOutputStream fos=null;

		FileInputStream fis = null;
		try {
//			fos=new FileOutputStream("abc.txt",true);
//			fos.write(65);
//			String str="core java";
//			
//			byte b[]=str.getBytes();
//			fos.write(b);

			int i = 0;
			fis = new FileInputStream("abc.txt");
			while ((i = fis.read()) != -1) {
				System.out.println((char) i);

			}
			System.out.println("\nSuccess");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("in finally");
			fis.close();
		}
	}

}
