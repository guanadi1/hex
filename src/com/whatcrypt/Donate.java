package com.whatcrypt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class Donate extends Activity
{
  private void a()
  {
    startActivityForResult(new Intent(this, MainActivity.class), 0);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903042);
    ((ImageButton)findViewById(2131165195)).setOnClickListener(new c(this));
    ((Button)findViewById(2131165184)).setOnClickListener(new d(this));
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.Donate
 * JD-Core Version:    0.6.2
 */