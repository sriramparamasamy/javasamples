package exceptionhandling;

import java.io.File;
import java.io.IOException;

public class tryingonmine {
	public static void main(String args[])
	{
		File amb = new File("source_dir/input.text");
		System.out.println(amb.getAbsolutePath());
		System.out.println(amb.isAbsolute());
	
	try
	{
		System.out.println(new tryingonmine().sub(30,42));
	
	}catch(Exception e) {
		System.out.println("Arithmetic : " + e.getMessage());
	}
	}
	public double sub(int a, int b) throws IOException{
		double c = a-b;
		if(c == -c) throw new UnsupportedOperationException("a is smaller than b");
		return c;

	}
	
	{
		
	}
}
