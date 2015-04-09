package com.whatcrypt;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

class f
  implements FileFilter
{
  f(FileChooser paramFileChooser)
  {
  }

  public boolean accept(File paramFile)
  {
    return (paramFile.isDirectory()) || ((paramFile.getName().contains(".")) && (FileChooser.a(this.a).contains(paramFile.getName().substring(paramFile.getName().lastIndexOf(".")))));
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.f
 * JD-Core Version:    0.6.2
 */