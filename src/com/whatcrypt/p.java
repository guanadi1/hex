package com.whatcrypt;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

class p
  implements CompoundButton.OnCheckedChangeListener
{
  p(RecryptDatabase paramRecryptDatabase, CheckBox paramCheckBox1, CheckBox paramCheckBox2, CheckBox paramCheckBox3, CheckBox paramCheckBox4, CheckBox paramCheckBox5, ab paramab, Context paramContext)
  {
  }

  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b.setChecked(false);
      this.c.setChecked(false);
      this.d.setChecked(true);
      this.e.setChecked(false);
      this.f.setChecked(false);
      this.g.a("cryptType", "0", this.h);
      return;
    }
    this.d.setChecked(false);
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.p
 * JD-Core Version:    0.6.2
 */