package com.whatcrypt;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

class h
  implements View.OnClickListener
{
  h(MainActivity paramMainActivity)
  {
  }

  public void onClick(View paramView)
  {
    try
    {
      l locall = new l(this.a);
      locall.a = 1;
      Integer[] arrayOfInteger = new Integer[1];
      arrayOfInteger[0] = Integer.valueOf(1);
      locall.execute(arrayOfInteger);
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      this.a.finish();
      this.a.startActivity(this.a.getIntent());
      Toast.makeText(this.a.getApplicationContext(), "Oops... Please Try That Again!", 1).show();
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.h
 * JD-Core Version:    0.6.2
 */