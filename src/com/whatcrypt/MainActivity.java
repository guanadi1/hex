package com.whatcrypt;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Button;
import java.io.File;

public class MainActivity extends Activity
{
  private String a()
  {
    AccountManager localAccountManager = (AccountManager)getSystemService("account");
    Account[] arrayOfAccount = localAccountManager.getAccounts();
    int i;
    if (localAccountManager != null)
      i = arrayOfAccount.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return "";
      Account localAccount = arrayOfAccount[j];
      if ((localAccount.type.equalsIgnoreCase("com.google")) && (localAccount.name != null))
        return localAccount.name;
    }
  }

  private void b()
  {
    startActivityForResult(new Intent(this, RecryptDatabase.class), 0);
  }

  private void c()
  {
    startActivityForResult(new Intent(this, Settings.class), 0);
  }

  private void d()
  {
    startActivityForResult(new Intent(this, Donate.class), 0);
  }

  protected void onCreate(Bundle paramBundle)
  {
    Context localContext = getApplicationContext();
    ab localab = new ab();
    String str1 = localab.a("cryptType", localContext);
    label353: File localFile1;
    try
    {
      File localFile2;
      String str4;
      Object localObject;
      if ((!str1.equals("5")) && (!str1.equals("6")) && (!str1.equals("7")) && (!str1.equals("8")) && (!str1.equals("0")))
      {
        localFile2 = new a().a(Environment.getExternalStorageDirectory() + "/WhatsApp/Databases");
        if ((localFile2.exists()) && (localFile2 != null))
          break label353;
        str4 = "8";
        localObject = Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/msgstore.db.crypt8";
      }
      while (true)
      {
        localab.a("accountName", a(), localContext);
        localab.a("targetName", a(), localContext);
        localab.a("keyfilePath", Environment.getExternalStorageDirectory() + "/WhatsApp/crypt.key", localContext);
        localab.a("targetkeyPath", Environment.getExternalStorageDirectory() + "/WhatsApp/crypt.key", localContext);
        localab.a("cryptType", str4, localContext);
        localab.a("databasePath", (String)localObject, localContext);
        super.onCreate(paramBundle);
        setContentView(2130903040);
        ((Button)findViewById(2131165184)).setOnClickListener(new g(this));
        ((Button)findViewById(2131165185)).setOnClickListener(new h(this));
        ((Button)findViewById(2131165186)).setOnClickListener(new i(this));
        ((Button)findViewById(2131165187)).setOnClickListener(new j(this));
        ((Button)findViewById(2131165188)).setOnClickListener(new k(this));
        return;
        if (localFile2.getName().endsWith(".db.crypt8"))
        {
          str4 = "8";
          localObject = Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/" + localFile2.getName();
        }
        else if (localFile2.getName().endsWith(".db.crypt7"))
        {
          str4 = "7";
          localObject = Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/" + localFile2.getName();
        }
        else if (localFile2.getName().endsWith(".db.crypt6"))
        {
          str4 = "6";
          localObject = Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/" + localFile2.getName();
        }
        else if (localFile2.getName().endsWith(".db.crypt5"))
        {
          str4 = "5";
          localObject = Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/" + localFile2.getName();
        }
        else if (localFile2.getName().endsWith(".db.crypt"))
        {
          str4 = "0";
          localObject = Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/" + localFile2.getName();
        }
        else
        {
          str4 = "0";
          String str5 = Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/msgstore.db.crypt";
          localObject = str5;
        }
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      localFile1 = new a().a(Environment.getExternalStorageDirectory() + "/WhatsApp/Databases");
      if (!localFile1.exists())
        break label690;
    }
    label690: String str2;
    String str3;
    if (localFile1 == null)
    {
      str2 = "8";
      str3 = Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/msgstore.db.crypt8";
    }
    while (true)
    {
      localab.a("accountName", a(), localContext);
      localab.a("targetName", a(), localContext);
      localab.a("keyfilePath", Environment.getExternalStorageDirectory() + "/WhatsApp/crypt.key", localContext);
      localab.a("targetkeyPath", Environment.getExternalStorageDirectory() + "/WhatsApp/crypt.key", localContext);
      localab.a("cryptType", str2, localContext);
      localab.a("databasePath", str3, localContext);
      break;
      if (localFile1.getName().endsWith(".db.crypt8"))
      {
        str2 = "8";
        str3 = Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/" + localFile1.getName();
      }
      else if (localFile1.getName().endsWith(".db.crypt7"))
      {
        str2 = "7";
        str3 = Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/" + localFile1.getName();
      }
      else if (localFile1.getName().endsWith(".db.crypt6"))
      {
        str2 = "6";
        str3 = Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/" + localFile1.getName();
      }
      else if (localFile1.getName().endsWith(".db.crypt5"))
      {
        str2 = "5";
        str3 = Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/" + localFile1.getName();
      }
      else if (localFile1.getName().endsWith(".db.crypt"))
      {
        str2 = "0";
        str3 = Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/" + localFile1.getName();
      }
      else
      {
        str2 = "0";
        str3 = Environment.getExternalStorageDirectory() + "/WhatsApp/Databases/msgstore.db.crypt";
      }
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.MainActivity
 * JD-Core Version:    0.6.2
 */