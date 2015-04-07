package hex;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class hex {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		hexDump();
		File file = new File("msgstore.db.crypt8");	       
	      readContentIntoByteArray(file);

	}	
	  public static void hexDump() throws IOException {
			String aes;
			String iv;
			InputStream is = new FileInputStream("key");
			StringBuilder key = new StringBuilder();
			while (is.available() > 0) {
				int value = (int) is.read();
				key.append(String.format("%02X", value));
			}
			aes = key.substring(252,316);
			iv = key.substring(220,252);

			System.out.println(key);
			System.out.println(aes);
			System.out.println(iv);

			is.close();
	  }

	
	  private static void readContentIntoByteArray(File file) throws FileNotFoundException, IOException
	   {		  
	        FileInputStream fis = new FileInputStream(file);
	        byte[] bFile = new byte[(int) file.length()];
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        try {
	        	
	        	
	        	fis.read(bFile);
	               for (int i = 67; i < bFile.length; i++) {
	            	   bos.write(bFile[i]);
	                }
	               
	        	
	            //    int readNum = fis.read(bFile,67,(int)file.length());
	              //  bos.write(bFile, 0, readNum); //no doubt here is 0
	                //Writes len bytes from the specified byte array starting at offset off to this byte array output stream.
	                //System.out.println("read " + readNum + " bytes,");
	            
	        } catch (IOException ex) {
	        }
	        byte[] bytes = bos.toByteArray();	 
	        //below is the different part
	        File someFile = new File("msgstore.db.crypt8.nohdr");
	        FileOutputStream fos = new FileOutputStream(someFile);
	        fos.write(bytes);
	        fos.flush();
	        fis.close();
	        fos.close();
	   }	

}
