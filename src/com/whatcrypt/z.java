package com.whatcrypt;

import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.a.a.a;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

class z
  implements View.OnClickListener
{
  z(Settings paramSettings)
  {
  }

  public void onClick(View paramView)
  {
    if (a.d())
    {
      if (a.c())
      {
        File localFile = new File(Environment.getExternalStorageDirectory() + "/WhatsApp/crypt.key");
        if (localFile.exists())
          localFile.delete();
        try
        {
          Process localProcess1 = Runtime.getRuntime().exec("su");
          DataOutputStream localDataOutputStream1 = new DataOutputStream(localProcess1.getOutputStream());
          localDataOutputStream1.writeBytes("cat /data/data/com.whatsapp/files/key > " + Environment.getExternalStorageDirectory() + "/WhatsApp/crypt.key" + "\n");
          localDataOutputStream1.flush();
          localDataOutputStream1.writeBytes("exit\n");
          localDataOutputStream1.flush();
          try
          {
            if (255 == localProcess1.waitFor())
              break label388;
            if ((localFile.exists()) && (localFile.length() == 158L))
            {
              Toast.makeText(this.a.getApplicationContext(), "Key copied successfully!", 1).show();
              return;
            }
            Process localProcess2 = Runtime.getRuntime().exec("su");
            DataOutputStream localDataOutputStream2 = new DataOutputStream(localProcess2.getOutputStream());
            localDataOutputStream2.writeBytes(" cp /data/data/com.whatsapp/files/key " + Environment.getExternalStorageDirectory() + "/WhatsApp/crypt.key" + "\n");
            localDataOutputStream2.flush();
            localDataOutputStream2.writeBytes("exit\n");
            localDataOutputStream2.flush();
            try
            {
              if (255 == localProcess2.waitFor())
                break label371;
              if ((!localFile.exists()) || (localFile.length() != 158L))
              {
                localFile.delete();
                Toast.makeText(this.a.getApplicationContext(), "Cannot copy a non-existent key!", 1).show();
                return;
              }
            }
            catch (Exception localException)
            {
              Toast.makeText(this.a.getApplicationContext(), "Unable to obtain root!", 1).show();
              return;
            }
          }
          catch (InterruptedException localInterruptedException)
          {
            Toast.makeText(this.a.getApplicationContext(), "Unable to obtain root!", 1).show();
            return;
          }
        }
        catch (IOException localIOException)
        {
          Toast.makeText(this.a.getApplicationContext(), "Unable to obtain root!", 1).show();
          return;
        }
        Toast.makeText(this.a.getApplicationContext(), "Key copied successfully!", 1).show();
        return;
        label371: Toast.makeText(this.a.getApplicationContext(), "Unable to obtain root!", 1).show();
        return;
        label388: Toast.makeText(this.a.getApplicationContext(), "Unable to obtain root!", 1).show();
        return;
      }
      Toast.makeText(this.a.getApplicationContext(), "Please grant root access!", 1).show();
      return;
    }
    Toast.makeText(this.a.getApplicationContext(), "Your device is not rooted!", 1).show();
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.z
 * JD-Core Version:    0.6.2
 */