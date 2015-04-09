package com.whatcrypt;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public class ab
{
  public String a(String paramString, Context paramContext)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramContext).getString(paramString, null);
  }

  public void a(String paramString1, String paramString2, Context paramContext)
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(paramContext).edit();
    localEditor.putString(paramString1, paramString2);
    localEditor.commit();
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.ab
 * JD-Core Version:    0.6.2
 */