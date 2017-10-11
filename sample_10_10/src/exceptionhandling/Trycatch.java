package exceptionhandling;


	import java.io.File;
	import java.io.IOException;
	public class Trycatch {

			public static void main(String args[]) {
				File theory = new File("d://sample_10_01.folder");
				System.out.println(theory.getAbsolutePath());
				System.out.println(theory.exists());
				
				try {
					System.out.println(new Filedemo().divide(20, 40));
				}catch(Arithmetic Exception) {
					System.out.println("Arithmetic : " + e.getMessage());
				}finally {
					System.out.println("True or false:");
				}		
				System.out.println("End of Program");
				
			}
			
			public int divide(int a, int b) throws IOException{
				int c = a / b;
				if(c == 0) throw new UnsupportedOperationException("a is smaller than b");
				return c;
			}
		}
}
