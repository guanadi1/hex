package com.whatcrypt;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import java.io.File;

class y
  implements View.OnClickListener
{
  y(Settings paramSettings, ab paramab, Context paramContext)
  {
  }

  public void onClick(View paramView)
  {
    EditText localEditText1 = (EditText)this.a.findViewById(2131165197);
    EditText localEditText2 = (EditText)this.a.findViewById(2131165196);
    EditText localEditText3 = (EditText)this.a.findViewById(2131165204);
    if (new File(localEditText2.getText().toString()).exists())
    {
      this.b.a("accountName", localEditText1.getText().toString(), this.c);
      this.b.a("databasePath", localEditText2.getText().toString(), this.c);
      this.b.a("keyfilePath", localEditText3.getText().toString(), this.c);
      Toast.makeText(this.a.getApplicationContext(), "Settings Saved!", 1).show();
      return;
    }
    this.b.a("accountName", localEditText1.getText().toString(), this.c);
    this.b.a("keyfilePath", localEditText3.getText().toString(), this.c);
    Toast.makeText(this.a.getApplicationContext(), "Input Database Not Found!", 1).show();
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.y
 * JD-Core Version:    0.6.2
 */