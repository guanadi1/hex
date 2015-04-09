package com.whatcrypt;

import android.content.Intent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import java.util.ArrayList;

class w
  implements View.OnFocusChangeListener
{
  w(Settings paramSettings)
  {
  }

  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      Intent localIntent = new Intent(this.a, FileChooser.class);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(".crypt");
      localArrayList.add(".crypt5");
      localArrayList.add(".crypt6");
      localArrayList.add(".crypt7");
      localArrayList.add(".crypt8");
      localIntent.putStringArrayListExtra("filterFileExtension", localArrayList);
      this.a.startActivityForResult(localIntent, 1);
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.w
 * JD-Core Version:    0.6.2
 */