package hex;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.zip.GZIPInputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class hex {
	public static String cypt8 = "msgstore.db.crypt8";
	public static String nohdr = "msgstore.db.crypt8.nohdr";
	public static String gz = "msgstore.gz";
	public static String db = "msgstore.db";
	public static String key = "key";
	public static byte[] aes = null;
	public static byte[] iv = null;

	public static void main(String[] args){
		hexDump(key);
		removeBytesFile(cypt8, nohdr);
		decryptFile(nohdr, gz);
		gzip(gz, db);

	}

	public static void hexDump(String key)  {

		try {
		
		InputStream in = new FileInputStream(key);
		StringBuilder keyString = new StringBuilder();
		while (in.available() > 0) {
			int value = (int) in.read();
			keyString.append(String.format("%02X", value));
		}
		aes = clave(keyString.substring(252, 316));
		iv = clave(keyString.substring(220, 252));
	    System.out.println("aes= "+ aes);
		System.out.println("iv= "+ iv);
		in.close();
		} catch (IOException ex) {
		}
	}

	private static void removeBytesFile(String cypt8, String nohdr) {
		
		try {
			
		File file = new File(cypt8);
		int remove = 67;
		FileInputStream fis = new FileInputStream(file);
		byte[] bFile = new byte[(int) file.length()];
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
	
			fis.read(bFile);
			for (int i = remove; i < bFile.length; i++) {
				bos.write(bFile[i]);
			}
		
		byte[] bytes = bos.toByteArray();
		File someFile = new File(nohdr);
		FileOutputStream fos = new FileOutputStream(someFile);
		fos.write(bytes);
		fos.flush();
		fis.close();
		fos.close();
		
		} catch (IOException ex) {
		}
	}

	public static void decryptFile(String nohdr, String gz) {

		try {
	    byte[] original= null; 
		File file = new File(nohdr);
		FileInputStream fis = new FileInputStream(file);
		byte[] bFile = new byte[(int) file.length()];
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
	

			fis.read(bFile);
			for (int i = 0; i < bFile.length; i++) {
				bos.write(bFile[i]);
			}
	
		byte[] bytes = bos.toByteArray();
		// byte[] aesByte = aes.getBytes();
		// byte[] ivByte = aes.getBytes();
		Cipher localCipher;
		try {
			localCipher = Cipher.getInstance("AES/CBC/NoPadding");


		localCipher.init(2, new SecretKeySpec(aes, "AES"), new IvParameterSpec(
				iv));
		original = localCipher.doFinal(bytes);

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (InvalidAlgorithmParameterException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}


		File someFile = new File(gz);
		FileOutputStream fos = new FileOutputStream(someFile);
		fos.write(original);
		fos.flush();
		fis.close();
		fos.close();

		} catch (IOException ex) {
		}
	}

	private static void gzip(String gz, String db) {

		byte[] buffer = new byte[1024];

		try {

			FileInputStream fileIn = new FileInputStream(gz);

			GZIPInputStream gZIPInputStream = new GZIPInputStream(fileIn);

			FileOutputStream fileOutputStream = new FileOutputStream(db);

			int bytes_read;

			while ((bytes_read = gZIPInputStream.read(buffer)) > 0) {

				fileOutputStream.write(buffer, 0, bytes_read);
			}

			gZIPInputStream.close();
			fileOutputStream.close();

			System.out.println("decompressed successfully!");

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private static byte[] clave(String paramString) {
		
		int i = paramString.length();
		byte[] arrayOfByte = new byte[i / 2];
		for (int j = 0;; j += 2) {
			if (j >= i)
				return arrayOfByte;
			arrayOfByte[(j / 2)] = ((byte) ((Character.digit(
					paramString.charAt(j), 16) << 4) + Character.digit(
					paramString.charAt(j + 1), 16)));
		}
	}

}
