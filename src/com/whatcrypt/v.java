package com.whatcrypt;

import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.widget.Toast;

public class v extends AsyncTask
{
  protected int a;
  protected Integer b;
  protected String c;
  protected String d;
  protected ProgressDialog e;

  public v(RecryptDatabase paramRecryptDatabase)
  {
    this.e = new ProgressDialog(paramRecryptDatabase);
  }

  protected Integer a(Integer[] paramArrayOfInteger)
  {
    if (paramArrayOfInteger[0].intValue() == 2)
      return new a().a(this.f.getApplicationContext(), Integer.valueOf(2), this.b, this.c, this.d, this.e);
    return Integer.valueOf(0);
  }

  protected void a(Integer paramInteger)
  {
    this.f.setRequestedOrientation(-1);
    this.e.dismiss();
    String str = "";
    if (this.a == 1)
    {
      str = "Decryption";
      if (paramInteger.intValue() != 4)
        break label95;
      Toast.makeText(this.f.getApplicationContext(), "Input crypt key does not exist!", 1).show();
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
      Toast.makeText(this.f.getApplicationContext(), "Backup database not found!", 1).show();
      break;
      if (paramInteger.intValue() == 3)
      {
        Toast.makeText(this.f.getApplicationContext(), "Output crypt key does not exist!", 1).show();
        return;
      }
      if (paramInteger.intValue() == 2)
      {
        Toast.makeText(this.f.getApplicationContext(), str + " Failed!", 1).show();
        return;
      }
    }
    while (paramInteger.intValue() != 1);
    Toast.makeText(this.f.getApplicationContext(), str + " Complete!", 1).show();
  }

  protected void onPreExecute()
  {
    super.onPreExecute();
    this.f.setRequestedOrientation(this.f.getResources().getConfiguration().orientation);
    this.e = new ProgressDialog(this.f);
    if (this.a == 1)
      this.e.setMessage(this.f.getResources().getString(2131034125) + " " + this.f.getResources().getString(2131034127));
    while (true)
    {
      this.e.setIndeterminate(false);
      this.e.setMax(100);
      this.e.setProgressStyle(1);
      this.e.setCancelable(false);
      this.e.show();
      return;
      if (this.a == 2)
        this.e.setMessage(this.f.getResources().getString(2131034126) + " " + this.f.getResources().getString(2131034127));
      else
        this.e.setMessage(this.f.getResources().getString(2131034127));
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.v
 * JD-Core Version:    0.6.2
 */