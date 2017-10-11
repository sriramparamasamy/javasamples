package exceptionhandling;

import java.io.File;
import java.io.IOException;

public class filenotfound {
	public static void main(String args[]) {
		File file = new File("source_dir/inputtext.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.exists());
		
		try {
			System.out.println(new filenotfound().divide(20, 40));
		}catch(Exception e) {
			System.out.println("Arithmetic : " + e.getMessage());
		}finally {
			
		}
		
		
		System.out.println("End of Program");
		
	}
	
	public int divide(int a, int b) throws IOException{
		int c = a / b;
		if(c == 0) throw new UnsupportedOperationException("a is smaller than b");
		return c;
	}
}
