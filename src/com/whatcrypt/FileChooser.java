package com.whatcrypt;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileChooser extends ListActivity
{
  private File a;
  private e b;
  private FileFilter c;
  private File d;
  private ArrayList e;

  private void a(File paramFile)
  {
    File[] arrayOfFile;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    if (this.c != null)
    {
      arrayOfFile = paramFile.listFiles(this.c);
      setTitle(getString(2131034136) + ": " + paramFile.getName());
      localArrayList1 = new ArrayList();
      localArrayList2 = new ArrayList();
    }
    while (true)
    {
      int j;
      try
      {
        int i = arrayOfFile.length;
        j = 0;
        if (j >= i)
        {
          Collections.sort(localArrayList1);
          Collections.sort(localArrayList2);
          localArrayList1.addAll(localArrayList2);
          if ((!paramFile.getName().equalsIgnoreCase("sdcard")) && (paramFile.getParentFile() != null))
            localArrayList1.add(0, new m("..", getString(2131034139), paramFile.getParent(), false, true));
          this.b = new e(this, 2130903041, localArrayList1);
          setListAdapter(this.b);
          return;
          arrayOfFile = paramFile.listFiles();
          break;
        }
        File localFile = arrayOfFile[j];
        if ((localFile.isDirectory()) && (!localFile.isHidden()))
          localArrayList1.add(new m(localFile.getName(), getString(2131034137), localFile.getAbsolutePath(), true, false));
        else if (!localFile.isHidden())
          localArrayList2.add(new m(localFile.getName(), getString(2131034138) + ": " + localFile.length(), localFile.getAbsolutePath(), false, false));
      }
      catch (Exception localException)
      {
        continue;
      }
      j++;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getIntent().getExtras();
    if ((localBundle != null) && (localBundle.getStringArrayList("filterFileExtension") != null))
    {
      this.e = localBundle.getStringArrayList("filterFileExtension");
      this.c = new f(this);
    }
    this.a = new File(Environment.getExternalStorageDirectory() + "/WhatsApp/Databases");
    a(this.a);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if ((!this.a.getName().equals("sdcard")) && (this.a.getParentFile() != null))
      {
        this.a = this.a.getParentFile();
        a(this.a);
      }
      while (true)
      {
        return false;
        finish();
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onListItemClick(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    super.onListItemClick(paramListView, paramView, paramInt, paramLong);
    m localm = this.b.a(paramInt);
    if ((localm.d()) || (localm.e()))
    {
      this.a = new File(localm.c());
      a(this.a);
      return;
    }
    this.d = new File(localm.c());
    Intent localIntent = new Intent();
    localIntent.putExtra("fileSelected", this.d.getAbsolutePath());
    setResult(-1, localIntent);
    finish();
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.FileChooser
 * JD-Core Version:    0.6.2
 */