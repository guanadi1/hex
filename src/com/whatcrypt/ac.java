package com.whatcrypt;

import android.app.ProgressDialog;
import android.os.Environment;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ac
{
  private static final byte[] a = a("1e39f369e90db33aa73b442bbbb6b0b9");
  private static final byte[] b = a("346a23652a46392b4d73257c67317e352e3372482177652c");
  private static final byte[] c = a("8d4b155cc9ff81e5cbf6fa7819366a3ec621a656416cd793");

  private static Object a(Object paramObject, int paramInt)
  {
    int i = Array.getLength(paramObject);
    Object localObject = Array.newInstance(paramObject.getClass().getComponentType(), paramInt);
    int j = Math.min(i, paramInt);
    if (j > 0)
      System.arraycopy(paramObject, 0, localObject, 0, j);
    return localObject;
  }

  private static byte[] a(String paramString)
  {
    int i = paramString.length();
    byte[] arrayOfByte = new byte[i / 2];
    for (int j = 0; ; j += 2)
    {
      if (j >= i)
        return arrayOfByte;
      arrayOfByte[(j / 2)] = ((byte)((Character.digit(paramString.charAt(j), 16) << 4) + Character.digit(paramString.charAt(j + 1), 16)));
    }
  }

  private static String b(String paramString)
  {
    MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
    localMessageDigest.reset();
    localMessageDigest.update(paramString.getBytes());
    return new BigInteger(1, localMessageDigest.digest()).toString(16);
  }

  private void b(String paramString1, String paramString2, ProgressDialog paramProgressDialog, Integer paramInteger)
  {
    if (paramInteger.intValue() == 1)
      paramProgressDialog.setProgress(100);
    if (paramInteger.intValue() == 2)
      paramProgressDialog.setProgress(50);
    byte[] arrayOfByte = new byte[8192];
    try
    {
      GZIPInputStream localGZIPInputStream = new GZIPInputStream(new FileInputStream(paramString1));
      FileOutputStream localFileOutputStream = new FileOutputStream(paramString2);
      int i = localGZIPInputStream.read(arrayOfByte);
      if (i <= 0)
      {
        localGZIPInputStream.close();
        localFileOutputStream.close();
        if (paramInteger.intValue() != 1)
          break label241;
        File localFile1 = new File(Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/msgstore.db");
        localFile1.delete();
        new File(Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/msgstore.tmp").renameTo(localFile1);
      }
      while (true)
      {
        if (paramInteger.intValue() == 1)
          paramProgressDialog.setProgress(100);
        if (paramInteger.intValue() != 2)
          break label318;
        paramProgressDialog.setProgress(50);
        return;
        if (paramInteger.intValue() == 1)
          paramProgressDialog.setProgress(100);
        if (paramInteger.intValue() == 2)
          paramProgressDialog.setProgress(50);
        localFileOutputStream.write(arrayOfByte, 0, i);
        break;
        label241: File localFile2 = new File(Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/msgstore.gz");
        File localFile3 = new File(Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/msgstore.tmp");
        localFile3.delete();
        localFile2.renameTo(localFile3);
      }
      label318: return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public void a(File paramFile1, File paramFile2, ProgressDialog paramProgressDialog, String paramString, Integer paramInteger)
  {
    Cipher localCipher = Cipher.getInstance("AES");
    CipherInputStream localCipherInputStream;
    FileOutputStream localFileOutputStream;
    byte[] arrayOfByte;
    long l1;
    long l2;
    if (paramString.toLowerCase().contains("dec".toLowerCase()))
    {
      localCipher.init(2, new SecretKeySpec(b, "AES"));
      localCipherInputStream = new CipherInputStream(new FileInputStream(paramFile1), localCipher);
      localFileOutputStream = new FileOutputStream(paramFile2);
      arrayOfByte = new byte[8192];
      l1 = paramFile1.length();
      l2 = 0L;
    }
    while (true)
    {
      int i = localCipherInputStream.read(arrayOfByte);
      if (i == -1)
      {
        if ((paramInteger.intValue() == 1) || (paramInteger.intValue() == 3))
          paramProgressDialog.setProgress(100);
        if (paramInteger.intValue() == 2)
          paramProgressDialog.setProgress(50);
        localCipherInputStream.close();
        localFileOutputStream.close();
        return;
        if (!paramString.toLowerCase().contains("enc".toLowerCase()))
          break;
        localCipher.init(1, new SecretKeySpec(b, "AES"));
        break;
      }
      l2 += i;
      if (paramInteger.intValue() == 1)
        paramProgressDialog.setProgress((int)(100L * l2 / l1));
      if (paramInteger.intValue() == 2)
        paramProgressDialog.setProgress((int)(50L * l2 / l1));
      if (paramInteger.intValue() == 3)
        paramProgressDialog.setProgress((int)(50L + 50L * l2 / l1));
      localFileOutputStream.write(arrayOfByte, 0, i);
    }
  }

  public void a(File paramFile1, File paramFile2, ProgressDialog paramProgressDialog, String paramString1, String paramString2, Integer paramInteger)
  {
    String str = b(paramString2);
    byte[] arrayOfByte1 = a(str + str);
    byte[] arrayOfByte2 = (byte[])a(c, 24);
    int i = 0;
    Cipher localCipher;
    label105: CipherInputStream localCipherInputStream;
    FileOutputStream localFileOutputStream;
    byte[] arrayOfByte3;
    long l1;
    long l2;
    if (i >= 24)
    {
      localCipher = Cipher.getInstance("AES/CBC/NoPadding");
      if (!paramString1.toLowerCase().contains("dec".toLowerCase()))
        break label241;
      localCipher.init(2, new SecretKeySpec(arrayOfByte2, "AES"), new IvParameterSpec(a));
      localCipherInputStream = new CipherInputStream(new FileInputStream(paramFile1), localCipher);
      localFileOutputStream = new FileOutputStream(paramFile2);
      arrayOfByte3 = new byte[8192];
      l1 = paramFile1.length();
      l2 = 0L;
    }
    while (true)
    {
      int j = localCipherInputStream.read(arrayOfByte3);
      if (j == -1)
      {
        if ((paramInteger.intValue() == 1) || (paramInteger.intValue() == 3))
          paramProgressDialog.setProgress(100);
        if (paramInteger.intValue() == 2)
          paramProgressDialog.setProgress(50);
        localCipherInputStream.close();
        localFileOutputStream.close();
        return;
        arrayOfByte2[i] = ((byte)(arrayOfByte2[i] ^ arrayOfByte1[(i & 0xF)]));
        i++;
        break;
        label241: if (!paramString1.toLowerCase().contains("enc".toLowerCase()))
          break label105;
        localCipher.init(1, new SecretKeySpec(arrayOfByte2, "AES"), new IvParameterSpec(a));
        break label105;
      }
      l2 += j;
      if (paramInteger.intValue() == 1)
        paramProgressDialog.setProgress((int)(100L * l2 / l1));
      if (paramInteger.intValue() == 2)
        paramProgressDialog.setProgress((int)(50L * l2 / l1));
      if (paramInteger.intValue() == 3)
        paramProgressDialog.setProgress((int)(50L + 50L * l2 / l1));
      localFileOutputStream.write(arrayOfByte3, 0, j);
    }
  }

  public void a(File paramFile1, File paramFile2, File paramFile3, ProgressDialog paramProgressDialog, String paramString, Integer paramInteger)
  {
    BufferedInputStream localBufferedInputStream1 = new BufferedInputStream(new FileInputStream(paramFile3));
    BufferedInputStream localBufferedInputStream2 = new BufferedInputStream(new FileInputStream(paramFile1));
    byte[] arrayOfByte1 = new byte[3];
    arrayOfByte1[1] = 1;
    arrayOfByte1[2] = 1;
    byte[] arrayOfByte2 = new byte[''];
    localBufferedInputStream1.read(arrayOfByte2);
    byte[] arrayOfByte3 = new byte[32];
    System.arraycopy(arrayOfByte2, 30, arrayOfByte3, 0, 32);
    byte[] arrayOfByte4 = new byte[16];
    System.arraycopy(arrayOfByte2, 62, arrayOfByte4, 0, 16);
    byte[] arrayOfByte5 = new byte[16];
    System.arraycopy(arrayOfByte2, 110, arrayOfByte5, 0, 16);
    byte[] arrayOfByte6 = new byte[32];
    System.arraycopy(arrayOfByte2, 126, arrayOfByte6, 0, 32);
    Cipher localCipher = Cipher.getInstance("AES/CBC/NoPadding");
    CipherInputStream localCipherInputStream;
    FileOutputStream localFileOutputStream;
    byte[] arrayOfByte7;
    long l1;
    long l2;
    if (paramString.toLowerCase().contains("dec".toLowerCase()))
    {
      localBufferedInputStream2.read(new byte[67]);
      localCipher.init(2, new SecretKeySpec(arrayOfByte6, "AES"), new IvParameterSpec(arrayOfByte5));
      localCipherInputStream = new CipherInputStream(localBufferedInputStream2, localCipher);
      localFileOutputStream = new FileOutputStream(paramFile2);
      if (paramString.toLowerCase().contains("enc".toLowerCase()))
      {
        byte[] arrayOfByte8 = new byte[67];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte8, 0, 3);
        System.arraycopy(arrayOfByte3, 0, arrayOfByte8, 3, 32);
        System.arraycopy(arrayOfByte4, 0, arrayOfByte8, 35, 16);
        System.arraycopy(arrayOfByte5, 0, arrayOfByte8, 51, 16);
        localFileOutputStream.write(arrayOfByte8, 0, 67);
      }
      arrayOfByte7 = new byte[8192];
      l1 = paramFile1.length();
      l2 = 0L;
    }
    while (true)
    {
      int i = localCipherInputStream.read(arrayOfByte7);
      if (i == -1)
      {
        if ((paramInteger.intValue() == 1) || (paramInteger.intValue() == 3))
          paramProgressDialog.setProgress(100);
        if (paramInteger.intValue() == 2)
          paramProgressDialog.setProgress(50);
        localBufferedInputStream2.close();
        localBufferedInputStream1.close();
        localCipherInputStream.close();
        localFileOutputStream.close();
        return;
        if (!paramString.toLowerCase().contains("enc".toLowerCase()))
          break;
        localCipher.init(1, new SecretKeySpec(arrayOfByte6, "AES"), new IvParameterSpec(arrayOfByte5));
        break;
      }
      l2 += i;
      if (paramInteger.intValue() == 1)
        paramProgressDialog.setProgress((int)(100L * l2 / l1));
      if (paramInteger.intValue() == 2)
        paramProgressDialog.setProgress((int)(50L * l2 / l1));
      if (paramInteger.intValue() == 3)
        paramProgressDialog.setProgress((int)(50L + 50L * l2 / l1));
      localFileOutputStream.write(arrayOfByte7, 0, i);
    }
  }

  void a(String paramString1, String paramString2, ProgressDialog paramProgressDialog, Integer paramInteger)
  {
    paramProgressDialog.setProgress(50);
    byte[] arrayOfByte = new byte[8192];
    try
    {
      GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(new FileOutputStream(paramString2));
      FileInputStream localFileInputStream = new FileInputStream(paramString1);
      while (true)
      {
        int i = localFileInputStream.read(arrayOfByte);
        if (i <= 0)
        {
          localFileInputStream.close();
          localGZIPOutputStream.finish();
          localGZIPOutputStream.close();
          paramProgressDialog.setProgress(100);
          return;
        }
        paramProgressDialog.setProgress(50);
        localGZIPOutputStream.write(arrayOfByte, 0, i);
      }
    }
    catch (IOException localIOException)
    {
    }
  }

  public void b(File paramFile1, File paramFile2, File paramFile3, ProgressDialog paramProgressDialog, String paramString, Integer paramInteger)
  {
    BufferedInputStream localBufferedInputStream1 = new BufferedInputStream(new FileInputStream(paramFile3));
    BufferedInputStream localBufferedInputStream2 = new BufferedInputStream(new FileInputStream(paramFile1));
    byte[] arrayOfByte1 = new byte[3];
    arrayOfByte1[1] = 1;
    arrayOfByte1[2] = 1;
    byte[] arrayOfByte2 = new byte[''];
    localBufferedInputStream1.read(arrayOfByte2);
    byte[] arrayOfByte3 = new byte[32];
    System.arraycopy(arrayOfByte2, 30, arrayOfByte3, 0, 32);
    byte[] arrayOfByte4 = new byte[16];
    System.arraycopy(arrayOfByte2, 62, arrayOfByte4, 0, 16);
    byte[] arrayOfByte5 = new byte[16];
    System.arraycopy(arrayOfByte2, 110, arrayOfByte5, 0, 16);
    byte[] arrayOfByte6 = new byte[32];
    System.arraycopy(arrayOfByte2, 126, arrayOfByte6, 0, 32);
    Cipher localCipher = Cipher.getInstance("AES/CBC/NoPadding");
    CipherInputStream localCipherInputStream;
    FileOutputStream localFileOutputStream;
    byte[] arrayOfByte7;
    long l1;
    long l2;
    if (paramString.toLowerCase().contains("dec".toLowerCase()))
    {
      localBufferedInputStream2.read(new byte[67]);
      localCipher.init(2, new SecretKeySpec(arrayOfByte6, "AES"), new IvParameterSpec(arrayOfByte5));
      localCipherInputStream = new CipherInputStream(localBufferedInputStream2, localCipher);
      localFileOutputStream = new FileOutputStream(paramFile2);
      if (paramString.toLowerCase().contains("enc".toLowerCase()))
      {
        byte[] arrayOfByte8 = new byte[67];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte8, 0, 3);
        System.arraycopy(arrayOfByte3, 0, arrayOfByte8, 3, 32);
        System.arraycopy(arrayOfByte4, 0, arrayOfByte8, 35, 16);
        System.arraycopy(arrayOfByte5, 0, arrayOfByte8, 51, 16);
        localFileOutputStream.write(arrayOfByte8, 0, 67);
      }
      arrayOfByte7 = new byte[8192];
      l1 = paramFile1.length();
      l2 = 0L;
    }
    while (true)
    {
      int i = localCipherInputStream.read(arrayOfByte7);
      if (i == -1)
      {
        if ((paramInteger.intValue() == 1) || (paramInteger.intValue() == 3))
          paramProgressDialog.setProgress(100);
        if (paramInteger.intValue() == 2)
          paramProgressDialog.setProgress(50);
        localBufferedInputStream2.close();
        localBufferedInputStream1.close();
        localCipherInputStream.close();
        localFileOutputStream.close();
        return;
        if (!paramString.toLowerCase().contains("enc".toLowerCase()))
          break;
        localCipher.init(1, new SecretKeySpec(arrayOfByte6, "AES"), new IvParameterSpec(arrayOfByte5));
        break;
      }
      l2 += i;
      if (paramInteger.intValue() == 1)
        paramProgressDialog.setProgress((int)(100L * l2 / l1));
      if (paramInteger.intValue() == 2)
        paramProgressDialog.setProgress((int)(50L * l2 / l1));
      if (paramInteger.intValue() == 3)
        paramProgressDialog.setProgress((int)(50L + 50L * l2 / l1));
      localFileOutputStream.write(arrayOfByte7, 0, i);
    }
  }

  public void c(File paramFile1, File paramFile2, File paramFile3, ProgressDialog paramProgressDialog, String paramString, Integer paramInteger)
  {
    BufferedInputStream localBufferedInputStream1 = new BufferedInputStream(new FileInputStream(paramFile3));
    BufferedInputStream localBufferedInputStream2 = new BufferedInputStream(new FileInputStream(paramFile1));
    byte[] arrayOfByte1 = new byte[3];
    arrayOfByte1[1] = 1;
    arrayOfByte1[2] = 1;
    byte[] arrayOfByte2 = new byte[''];
    localBufferedInputStream1.read(arrayOfByte2);
    byte[] arrayOfByte3 = new byte[32];
    System.arraycopy(arrayOfByte2, 30, arrayOfByte3, 0, 32);
    byte[] arrayOfByte4 = new byte[16];
    System.arraycopy(arrayOfByte2, 62, arrayOfByte4, 0, 16);
    byte[] arrayOfByte5 = new byte[16];
    System.arraycopy(arrayOfByte2, 110, arrayOfByte5, 0, 16);
    byte[] arrayOfByte6 = new byte[32];
    System.arraycopy(arrayOfByte2, 126, arrayOfByte6, 0, 32);
    Cipher localCipher = Cipher.getInstance("AES/CBC/NoPadding");
    CipherInputStream localCipherInputStream;
    FileOutputStream localFileOutputStream;
    byte[] arrayOfByte7;
    long l1;
    long l2;
    if (paramString.toLowerCase().contains("dec".toLowerCase()))
    {
      localBufferedInputStream2.read(new byte[67]);
      localCipher.init(2, new SecretKeySpec(arrayOfByte6, "AES"), new IvParameterSpec(arrayOfByte5));
      localCipherInputStream = new CipherInputStream(localBufferedInputStream2, localCipher);
      localFileOutputStream = new FileOutputStream(paramFile2);
      if (paramString.toLowerCase().contains("enc".toLowerCase()))
      {
        byte[] arrayOfByte8 = new byte[67];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte8, 0, 3);
        System.arraycopy(arrayOfByte3, 0, arrayOfByte8, 3, 32);
        System.arraycopy(arrayOfByte4, 0, arrayOfByte8, 35, 16);
        System.arraycopy(arrayOfByte5, 0, arrayOfByte8, 51, 16);
        localFileOutputStream.write(arrayOfByte8, 0, 67);
      }
      arrayOfByte7 = new byte[8192];
      l1 = paramFile1.length();
      l2 = 0L;
    }
    while (true)
    {
      int i = localCipherInputStream.read(arrayOfByte7);
      if (i == -1)
      {
        if ((paramInteger.intValue() == 1) || (paramInteger.intValue() == 3))
          paramProgressDialog.setProgress(100);
        if (paramInteger.intValue() == 2)
          paramProgressDialog.setProgress(50);
        localBufferedInputStream2.close();
        localBufferedInputStream1.close();
        localCipherInputStream.close();
        localFileOutputStream.close();
        if (paramInteger.intValue() != 1)
          break label589;
        b(Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/msgstore.db", Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/msgstore.tmp", paramProgressDialog, paramInteger);
        return;
        if (!paramString.toLowerCase().contains("enc".toLowerCase()))
          break;
        localCipher.init(1, new SecretKeySpec(arrayOfByte6, "AES"), new IvParameterSpec(arrayOfByte5));
        break;
      }
      l2 += i;
      if (paramInteger.intValue() == 1)
        paramProgressDialog.setProgress((int)(100L * l2 / l1));
      if (paramInteger.intValue() == 2)
        paramProgressDialog.setProgress((int)(50L * l2 / l1));
      if (paramInteger.intValue() == 3)
        paramProgressDialog.setProgress((int)(50L + 50L * l2 / l1));
      localFileOutputStream.write(arrayOfByte7, 0, i);
    }
    label589: b(Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/msgstore.tmp", Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/msgstore.gz", paramProgressDialog, paramInteger);
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.ac
 * JD-Core Version:    0.6.2
 */