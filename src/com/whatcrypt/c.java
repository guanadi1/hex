package com.whatcrypt;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

class c
  implements View.OnClickListener
{
  c(Donate paramDonate)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://whatcrypt.com/donate.php"));
    this.a.startActivity(localIntent);
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.c
 * JD-Core Version:    0.6.2
 */