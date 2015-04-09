package com.whatcrypt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class e extends ArrayAdapter
{
  private Context a;
  private int b;
  private List c;

  public e(Context paramContext, int paramInt, List paramList)
  {
    super(paramContext, paramInt, paramList);
    this.a = paramContext;
    this.b = paramInt;
    this.c = paramList;
  }

  public m a(int paramInt)
  {
    return (m)this.c.get(paramInt);
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = ((LayoutInflater)this.a.getSystemService("layout_inflater")).inflate(this.b, null);
    m localm = (m)this.c.get(paramInt);
    ImageView localImageView;
    TextView localTextView1;
    TextView localTextView2;
    if (localm != null)
    {
      localImageView = (ImageView)paramView.findViewById(2131165189);
      localTextView1 = (TextView)paramView.findViewById(2131165190);
      localTextView2 = (TextView)paramView.findViewById(2131165191);
      if (!localm.b().equalsIgnoreCase("folder"))
        break label130;
      localImageView.setImageResource(2130837511);
    }
    while (true)
    {
      if (localTextView1 != null)
        localTextView1.setText(localm.a());
      if (localTextView2 != null)
        localTextView2.setText(localm.b());
      return paramView;
      label130: if (localm.b().equalsIgnoreCase("parent directory"))
      {
        localImageView.setImageResource(2130837504);
      }
      else
      {
        String str = localm.a().toLowerCase();
        if ((str.endsWith(".crypt")) || (str.endsWith(".crypt5")) || (str.endsWith(".crypt6")) || (str.endsWith(".crypt7")) || (str.endsWith(".crypt8")) || (str.endsWith(".key")) || (str.endsWith("key")))
          localImageView.setImageResource(2130837514);
      }
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.e
 * JD-Core Version:    0.6.2
 */