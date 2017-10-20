package readwrite;

	import java.io.File;
	/*A stream can be defined as a sequence of data. There are two kinds of Streams −
	InPutStream − The InputStream is used to read data from a source.
	OutPutStream − The OutputStream is used for writing data to a destination
	FileInputStream - This stream is used for reading data from the files. Objects can be created 
    using the keyword new and there are several types of constructors available.*/
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	/*FileOutputStream- FileOutputStream is used to create a file and write data into it. 
	*The stream would create a file, if it doesn't already exist, before opening it for output.
	 */
	import java.io.IOException;
	 
	public class Write {
	   public static void main(String[] args) {
	      FileInputStream ins = null;
	      FileOutputStream outs = null;
	      try {
	         File infile =new File("D:\\fbi.txt");
	         File outfile =new File("E:\\fbi1.txt");
	         ins = new FileInputStream(infile);
	         outs = new FileOutputStream(outfile);
	      /* The above coding are used only to create a file from one source to another destination
	       * the below coding are used to copy a content from one file to another file
	       */
	         byte[] buffer = new byte[1024];
	         int length;
	         // here we are using byteinput stream method to copy the contents in the source file
	         
	         while ((length = ins.read(buffer)) > 0) {
	            outs.write(buffer, 0, length);
	         } 
	         ins.close();
	         outs.close();
	         System.out.println("File copied successfully!!");
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } 
	   }
	}

