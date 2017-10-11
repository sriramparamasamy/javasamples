package exceptionhandling;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read implements Reader{



	   public static void main(String args[]) {
	      FileReader fr = null;		
	      try {
	         File file = new File("file.txt");
	      }catch(IOException e) {
	         e.printStackTrace();
	      }finally {
	         try {
	            fr.close();
	         }catch(IOException ex) {		
	            ex.printStackTrace();
	         }
	      }
	   }
	}

}
