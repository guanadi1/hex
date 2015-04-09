package com.whatcrypt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Settings extends Activity
{
  private void a()
  {
    startActivityForResult(new Intent(this, MainActivity.class), 0);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramInt2 == -1))
    {
      str2 = paramIntent.getStringExtra("fileSelected");
      ((EditText)findViewById(2131165196)).setText(str2);
    }
    while ((paramInt1 != 2) || (paramInt2 != -1))
    {
      String str2;
      return;
    }
    String str1 = paramIntent.getStringExtra("fileSelected");
    ((EditText)findViewById(2131165204)).setText(str1);
  }

  protected void onCreate(Bundle paramBundle)
  {
    Context localContext = getApplicationContext();
    ab localab = new ab();
    String str1 = localab.a("accountName", localContext);
    String str2 = localab.a("databasePath", localContext);
    String str3 = localab.a("keyfilePath", localContext);
    super.onCreate(paramBundle);
    setContentView(2130903044);
    ((EditText)findViewById(2131165197)).setText(str1);
    EditText localEditText1 = (EditText)findViewById(2131165196);
    localEditText1.setText(str2);
    EditText localEditText2 = (EditText)findViewById(2131165204);
    localEditText2.setText(str3);
    localEditText1.setOnFocusChangeListener(new w(this));
    localEditText2.setOnFocusChangeListener(new x(this));
    ((Button)findViewById(2131165184)).setOnClickListener(new y(this, localab, localContext));
    ((Button)findViewById(2131165186)).setOnClickListener(new z(this));
    ((Button)findViewById(2131165185)).setOnClickListener(new aa(this));
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.Settings
 * JD-Core Version:    0.6.2
 */