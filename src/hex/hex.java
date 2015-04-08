package hex;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class hex {
	static String  aes;
	static String iv;
	 // The default block size
    public static int blockSize = 16;

    static Cipher encryptCipher = null;
    static Cipher decryptCipher = null;
    static Cipher ecipher =null; 
    static Cipher dcipher =null; 
    
    // Buffer used to transport the bytes from one stream to another
    byte[] buf = new byte[blockSize];       //input buffer
    byte[] obuf = new byte[512];            //output buffer

    // The key
    static byte[] key = null;
    // The initialization vector needed by the CBC mode
    static byte[] IV = null;

	public static void main(String[] args) throws FileNotFoundException,
			IOException, InvalidKeyException, ShortBufferException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException, InvalidAlgorithmParameterException {
		hexDump();
		File file = new File("msgstore.db.crypt8");	       
		removeBytesFile(file);
		
		
		
        File inFile = new File("msgstore.db.crypt8.nohdr");
        File outFile = new File("msgstore.db");
   
        InputStream fis = new FileInputStream(inFile);
        OutputStream fos = new FileOutputStream(outFile);
     
        decryptFile(inFile);
        
		// decrypt(fis, fos);
		

	}	
	  public static void hexDump() throws IOException {
			
			InputStream is = new FileInputStream("key");
			StringBuilder key = new StringBuilder();
			while (is.available() > 0) {
				int value = (int) is.read();
				key.append(String.format("%02X", value));
			}
			aes = key.substring(252,316);
			iv = key.substring(220,252);

			System.out.println("aes= "+ aes);
			System.out.println("iv= "+ iv);
			is.close();
	  }

	
	  private static void removeBytesFile(File file) throws FileNotFoundException, IOException
	   {		  
		    int remove= 67;
	        FileInputStream fis = new FileInputStream(file);
	        byte[] bFile = new byte[(int) file.length()];
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        try {
	        	
	        	
	        	fis.read(bFile);
	               for (int i = remove; i < bFile.length; i++) {
	            	   bos.write(bFile[i]);
	                }	            
	        } catch (IOException ex) {
	        }
	        byte[] bytes = bos.toByteArray();	 	    
	        File someFile = new File("msgstore.db.crypt8.nohdr");
	        FileOutputStream fos = new FileOutputStream(someFile);
	        fos.write(bytes);
	        fos.flush();
	        fis.close();
	        fos.close();
	   }	
	  
	  
	  public static void decryptFile(File file) throws 
	  NoSuchAlgorithmException, 
	  NoSuchPaddingException, 
	  InvalidKeyException, 
	  IllegalBlockSizeException, 
	  BadPaddingException, 
	  IOException{
		  
		  byte[] key = aes.getBytes();	  
		  FileInputStream fis = new FileInputStream(file);
	      byte[] bFile = new byte[(int) file.length()];

		  SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");

		  // Instantiate the cipher
		  Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
		  cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

		  byte[] encrypted = cipher.doFinal(bFile);

		  cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
		  byte[] original = cipher.doFinal(encrypted);
		  
		  fis.close();
		}

	  
	  
}