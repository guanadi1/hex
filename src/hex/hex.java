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
	  
	  
	  public static void decryptFile(String keyString, String fileName){
		    try {
		    	
		    	Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding", "BC");
		    	
		        KeyGenerator kgen = KeyGenerator.getInstance("AES");
		        kgen.init(128);
		        SecretKey key = (SecretKey) new SecretKeySpec(
		            keyString.getBytes(), "AES");// kgen.generateKey();

		        AESEncrypter encrypter = new AESEncrypter(key);

		        encrypter.decrypt(new FileInputStream(
		            new java.io.File("").getCanonicalFile() +
		            File.separator + "Received"+
		            File.separator + fileName),
		            new FileOutputStream(new java.io.File("").getCanonicalFile() +
		            File.separator + "Decrypted" + 
		            File.separator + fileName));
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}

	  public  void AESEncrypter(SecretKey key) {
		    // Create an 8-byte initialization vector
		    byte[] iv = new byte[] { 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06,
		            0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f };

		    AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv);
		    try {
		        ecipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		        dcipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

		        // CBC requires an initialization vector
		        ecipher.init(Cipher.ENCRYPT_MODE, key, paramSpec);
		        dcipher.init(Cipher.DECRYPT_MODE, key, paramSpec);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
	  
	  
	  
		/*  public static void decrypt(InputStream fis, OutputStream fos)
      throws IOException,
      ShortBufferException,
      IllegalBlockSizeException,
      BadPaddingException, 
      InvalidKeyException,
      NoSuchAlgorithmException, 
      NoSuchProviderException, 
      NoSuchPaddingException, 
      InvalidAlgorithmParameterException
{
 //get the IV from the file
 // DO NOT FORGET TO reinit the cipher with the IV
 IV= iv.getBytes();
 key= aes.getBytes();
 fis.read(IV,0,IV.length);
 InitCiphers();

 byte[] buffer = new byte[blockSize];
 int noBytes = 0;
 byte[] cipherBlock =
         new byte[decryptCipher.getOutputSize(buffer.length)];
 int cipherBytes;
 while((noBytes = fis.read(buffer))!=-1)
 {
     cipherBytes =
             decryptCipher.update(buffer, 0, noBytes, cipherBlock);
     fos.write(cipherBlock, 0, cipherBytes);
 }
 //allways call doFinal
 cipherBytes = decryptCipher.doFinal(cipherBlock,0);
 fos.write(cipherBlock,0,cipherBytes);

 //close the files
 fos.close();
 fis.close();
}*/


	  /*
	    public static void InitCiphers()
	            throws NoSuchAlgorithmException,
	            NoSuchProviderException,
	            NoSuchProviderException,
	            NoSuchPaddingException,
	            InvalidKeyException,
	            InvalidAlgorithmParameterException{
	       //1. create the cipher using Bouncy Castle Provider
	       encryptCipher =
	               Cipher.getInstance("AES/CBC/PKCS5Padding");
	       //2. create the key
	       
	       byte[] encodedKey  = aes.getBytes();
	       SecretKey originalKey = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
	       SecretKey keyValue = new SecretKeySpec(key,"AES");
	       //3. create the IV
	       AlgorithmParameterSpec IVspec = new IvParameterSpec(IV);
	       //4. init the cipher
	       encryptCipher.init(Cipher.ENCRYPT_MODE, originalKey, IVspec);

	       //1 create the cipher
	       decryptCipher =Cipher.getInstance("AES/CBC/PKCS5Padding");
	       //2. the key is already created
	       //3. the IV is already created
	       //4. init the cipher
	       decryptCipher.init(Cipher.DECRYPT_MODE, originalKey, IVspec);
	    }*/

}
