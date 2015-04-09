package com.whatcrypt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class RecryptDatabase extends Activity
{
  private void a()
  {
    startActivityForResult(new Intent(this, MainActivity.class), 0);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramInt2 == -1))
    {
      String str = paramIntent.getStringExtra("fileSelected");
      ((EditText)findViewById(2131165197)).setText(str);
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    Context localContext = getApplicationContext();
    ab localab = new ab();
    String str1 = localab.a("accountName", localContext);
    String str2 = localab.a("targetName", localContext);
    String str3 = localab.a("keyfilePath", localContext);
    String str4 = localab.a("targetkeyPath", localContext);
    String str5 = localab.a("cryptType", localContext);
    super.onCreate(paramBundle);
    setContentView(2130903043);
    CheckBox localCheckBox1 = (CheckBox)findViewById(2131165199);
    CheckBox localCheckBox2 = (CheckBox)findViewById(2131165200);
    CheckBox localCheckBox3 = (CheckBox)findViewById(2131165198);
    CheckBox localCheckBox4 = (CheckBox)findViewById(2131165201);
    CheckBox localCheckBox5 = (CheckBox)findViewById(2131165202);
    EditText localEditText1;
    EditText localEditText2;
    if (str5 == "0")
    {
      localCheckBox1.setChecked(false);
      localCheckBox2.setChecked(false);
      localCheckBox3.setChecked(true);
      localCheckBox4.setChecked(false);
      localCheckBox5.setChecked(false);
      localCheckBox1.setOnCheckedChangeListener(new n(this, localCheckBox1, localCheckBox2, localCheckBox3, localCheckBox4, localCheckBox5, localab, localContext));
      localCheckBox2.setOnCheckedChangeListener(new o(this, localCheckBox2, localCheckBox1, localCheckBox3, localCheckBox4, localCheckBox5, localab, localContext));
      localCheckBox3.setOnCheckedChangeListener(new p(this, localCheckBox2, localCheckBox1, localCheckBox3, localCheckBox4, localCheckBox5, localab, localContext));
      localCheckBox4.setOnCheckedChangeListener(new q(this, localCheckBox2, localCheckBox1, localCheckBox3, localCheckBox4, localCheckBox5, localab, localContext));
      localCheckBox5.setOnCheckedChangeListener(new r(this, localCheckBox2, localCheckBox1, localCheckBox3, localCheckBox4, localCheckBox5, localab, localContext));
      localEditText1 = (EditText)findViewById(2131165196);
      localEditText2 = (EditText)findViewById(2131165197);
      if (str2 != "")
        break label587;
      localEditText1.setText(str1);
      label322: if (str4 != "")
        break label597;
      localEditText2.setText(str3);
    }
    while (true)
    {
      ((Button)findViewById(2131165184)).setOnClickListener(new s(this, localab, localContext, localCheckBox3));
      localEditText2.setOnFocusChangeListener(new t(this));
      ((Button)findViewById(2131165185)).setOnClickListener(new u(this));
      return;
      if (str5 == "5")
      {
        localCheckBox1.setChecked(true);
        localCheckBox2.setChecked(false);
        localCheckBox3.setChecked(false);
        localCheckBox4.setChecked(false);
        localCheckBox5.setChecked(false);
        break;
      }
      if (str5 == "6")
      {
        localCheckBox1.setChecked(false);
        localCheckBox2.setChecked(true);
        localCheckBox3.setChecked(false);
        localCheckBox4.setChecked(false);
        localCheckBox5.setChecked(false);
        break;
      }
      if (str5 == "7")
      {
        localCheckBox1.setChecked(false);
        localCheckBox2.setChecked(false);
        localCheckBox3.setChecked(false);
        localCheckBox4.setChecked(true);
        localCheckBox5.setChecked(false);
        break;
      }
      if (str5 == "8")
      {
        localCheckBox1.setChecked(false);
        localCheckBox2.setChecked(false);
        localCheckBox3.setChecked(false);
        localCheckBox4.setChecked(false);
        localCheckBox5.setChecked(true);
        break;
      }
      localCheckBox1.setChecked(false);
      localCheckBox2.setChecked(false);
      localCheckBox3.setChecked(true);
      localCheckBox4.setChecked(false);
      localCheckBox5.setChecked(false);
      break;
      label587: localEditText1.setText(str2);
      break label322;
      label597: localEditText2.setText(str4);
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.RecryptDatabase
 * JD-Core Version:    0.6.2
 */