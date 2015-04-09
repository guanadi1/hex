package com.whatcrypt;

import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.widget.Toast;

public class l extends AsyncTask
{
  protected int a;
  protected ProgressDialog b;

  public l(MainActivity paramMainActivity)
  {
    this.b = new ProgressDialog(paramMainActivity);
  }

  protected Integer a(Integer[] paramArrayOfInteger)
  {
    if (paramArrayOfInteger[0].intValue() == 1)
      return new a().a(this.c.getApplicationContext(), Integer.valueOf(1), Integer.valueOf(0), "", "", this.b);
    return Integer.valueOf(0);
  }

  protected void a(Integer paramInteger)
  {
    this.c.setRequestedOrientation(-1);
    this.b.dismiss();
    String str = "";
    if (this.a == 1)
    {
      str = "Decryption";
      if (paramInteger.intValue() != 4)
        break label95;
      Toast.makeText(this.c.getApplicationContext(), "Input crypt key does not exist!", 1).show();
    }
    label95: 
    do
    {
      return;
      if (this.a == 2)
      {
        str = "Recryption";
        break;
      }
      if (paramInteger.intValue() != 5)
        break;
      Toast.makeText(this.c.getApplicationContext(), "Backup database not found!", 1).show();
      break;
      if (paramInteger.intValue() == 3)
      {
        Toast.makeText(this.c.getApplicationContext(), "Output crypt key does not exist!", 1).show();
        return;
      }
      if (paramInteger.intValue() == 2)
      {
        Toast.makeText(this.c.getApplicationContext(), str + " Failed!", 1).show();
        return;
      }
    }
    while (paramInteger.intValue() != 1);
    Toast.makeText(this.c.getApplicationContext(), str + " Complete!", 1).show();
  }

  protected void onPreExecute()
  {
    super.onPreExecute();
    this.c.setRequestedOrientation(this.c.getResources().getConfiguration().orientation);
    this.b = new ProgressDialog(this.c);
    if (this.a == 1)
      this.b.setMessage(this.c.getResources().getString(2131034125) + " " + this.c.getResources().getString(2131034127));
    while (true)
    {
      this.b.setIndeterminate(false);
      this.b.setMax(100);
      this.b.setProgressStyle(1);
      this.b.setCancelable(false);
      this.b.show();
      return;
      if (this.a == 2)
        this.b.setMessage(this.c.getResources().getString(2131034126) + " " + this.c.getResources().getString(2131034127));
      else
        this.b.setMessage(this.c.getResources().getString(2131034127));
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.l
 * JD-Core Version:    0.6.2
 */