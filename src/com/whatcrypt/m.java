package com.whatcrypt;

public class m
  implements Comparable
{
  private String a;
  private String b;
  private String c;
  private boolean d;
  private boolean e;

  public m(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }

  public int a(m paramm)
  {
    if (this.a != null)
      return this.a.toLowerCase().compareTo(paramm.a().toLowerCase());
    throw new IllegalArgumentException();
  }

  public String a()
  {
    return this.a;
  }

  public String b()
  {
    return this.b;
  }

  public String c()
  {
    return this.c;
  }

  public boolean d()
  {
    return this.d;
  }

  public boolean e()
  {
    return this.e;
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.m
 * JD-Core Version:    0.6.2
 */