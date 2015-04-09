package com.whatcrypt;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;

class s
  implements View.OnClickListener
{
  s(RecryptDatabase paramRecryptDatabase, ab paramab, Context paramContext, CheckBox paramCheckBox)
  {
  }

  public void onClick(View paramView)
  {
    CheckBox localCheckBox1 = (CheckBox)this.a.findViewById(2131165199);
    CheckBox localCheckBox2 = (CheckBox)this.a.findViewById(2131165200);
    CheckBox localCheckBox3 = (CheckBox)this.a.findViewById(2131165201);
    CheckBox localCheckBox4 = (CheckBox)this.a.findViewById(2131165202);
    EditText localEditText1 = (EditText)this.a.findViewById(2131165196);
    EditText localEditText2 = (EditText)this.a.findViewById(2131165197);
    this.b.a("targetName", localEditText1.getText().toString(), this.c);
    this.b.a("targetkeyPath", localEditText2.getText().toString(), this.c);
    v localv = new v(this.a);
    localv.a = 2;
    if (localCheckBox1.isChecked())
    {
      localv.b = Integer.valueOf(5);
      localv.c = localEditText1.getText().toString();
      localv.d = "";
    }
    while (true)
    {
      Integer[] arrayOfInteger = new Integer[1];
      arrayOfInteger[0] = Integer.valueOf(2);
      localv.execute(arrayOfInteger);
      return;
      if (localCheckBox2.isChecked())
      {
        localv.b = Integer.valueOf(6);
        localv.c = "";
        localv.d = localEditText2.getText().toString();
      }
      else if (localCheckBox3.isChecked())
      {
        localv.b = Integer.valueOf(7);
        localv.c = "";
        localv.d = localEditText2.getText().toString();
      }
      else if (localCheckBox4.isChecked())
      {
        localv.b = Integer.valueOf(8);
        localv.c = "";
        localv.d = localEditText2.getText().toString();
      }
      else if (this.d.isChecked())
      {
        localv.b = Integer.valueOf(0);
        localv.c = "";
        localv.d = "";
      }
      else
      {
        localv.b = Integer.valueOf(0);
        localv.c = "";
        localv.d = "";
      }
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.s
 * JD-Core Version:    0.6.2
 */