package com.whatcrypt;

import java.io.File;

public class a
{
  public File a(String paramString)
  {
    File[] arrayOfFile = new File(paramString).listFiles(new b(this));
    long l = -9223372036854775808L;
    int i = arrayOfFile.length;
    int j = 0;
    Object localObject = null;
    while (true)
    {
      if (j >= i)
        return localObject;
      File localFile = arrayOfFile[j];
      if ((localFile.lastModified() > l) && ((localFile.getName().endsWith(".db.crypt5")) || (localFile.getName().endsWith(".db.crypt6")) || (localFile.getName().endsWith(".db.crypt7")) || (localFile.getName().endsWith(".db.crypt8"))))
      {
        l = localFile.lastModified();
        localObject = localFile;
      }
      j++;
    }
  }

  // ERROR //
  public java.lang.Integer a(android.content.Context paramContext, java.lang.Integer paramInteger1, java.lang.Integer paramInteger2, String paramString1, String paramString2, android.app.ProgressDialog paramProgressDialog)
  {
    // Byte code:
    //   0: new 59	com/whatcrypt/ab
    //   3: dup
    //   4: invokespecial 60	com/whatcrypt/ab:<init>	()V
    //   7: astore 7
    //   9: aload 7
    //   11: ldc 62
    //   13: aload_1
    //   14: invokevirtual 65	com/whatcrypt/ab:a	(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    //   17: astore 8
    //   19: aload 7
    //   21: ldc 67
    //   23: aload_1
    //   24: invokevirtual 65	com/whatcrypt/ab:a	(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    //   27: astore 9
    //   29: aload 7
    //   31: ldc 69
    //   33: aload_1
    //   34: invokevirtual 65	com/whatcrypt/ab:a	(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    //   37: astore 10
    //   39: new 12	java/io/File
    //   42: dup
    //   43: aload 8
    //   45: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   48: astore 11
    //   50: aload 11
    //   52: invokevirtual 73	java/io/File:exists	()Z
    //   55: ifeq +8 -> 63
    //   58: aload 11
    //   60: ifnonnull +34 -> 94
    //   63: aload_0
    //   64: new 75	java/lang/StringBuilder
    //   67: dup
    //   68: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   71: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   74: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   77: ldc 88
    //   79: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   85: invokevirtual 96	com/whatcrypt/a:a	(Ljava/lang/String;)Ljava/io/File;
    //   88: astore 38
    //   90: aload 38
    //   92: astore 11
    //   94: aload 11
    //   96: invokevirtual 73	java/io/File:exists	()Z
    //   99: ifeq +8 -> 107
    //   102: aload 11
    //   104: ifnonnull +8 -> 112
    //   107: iconst_5
    //   108: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   111: areturn
    //   112: aload 11
    //   114: invokevirtual 34	java/io/File:getName	()Ljava/lang/String;
    //   117: ldc 104
    //   119: invokevirtual 42	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   122: ifne +29 -> 151
    //   125: aload 11
    //   127: invokevirtual 34	java/io/File:getName	()Ljava/lang/String;
    //   130: ldc 106
    //   132: invokevirtual 42	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   135: ifne +16 -> 151
    //   138: aload 11
    //   140: invokevirtual 34	java/io/File:getName	()Ljava/lang/String;
    //   143: ldc 108
    //   145: invokevirtual 42	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   148: ifeq +32 -> 180
    //   151: new 12	java/io/File
    //   154: dup
    //   155: aload 9
    //   157: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   160: astore 13
    //   162: aload 13
    //   164: invokevirtual 73	java/io/File:exists	()Z
    //   167: ifeq +8 -> 175
    //   170: aload 13
    //   172: ifnonnull +8 -> 180
    //   175: iconst_4
    //   176: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   179: areturn
    //   180: aload_2
    //   181: invokevirtual 112	java/lang/Integer:intValue	()I
    //   184: iconst_1
    //   185: if_icmpne +457 -> 642
    //   188: new 114	com/whatcrypt/ac
    //   191: dup
    //   192: invokespecial 115	com/whatcrypt/ac:<init>	()V
    //   195: astore 14
    //   197: aload 11
    //   199: invokevirtual 34	java/io/File:getName	()Ljava/lang/String;
    //   202: ldc 108
    //   204: invokevirtual 42	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   207: ifeq +136 -> 343
    //   210: aload 14
    //   212: aload 11
    //   214: new 12	java/io/File
    //   217: dup
    //   218: new 75	java/lang/StringBuilder
    //   221: dup
    //   222: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   225: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   228: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   231: ldc 117
    //   233: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   239: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   242: new 12	java/io/File
    //   245: dup
    //   246: new 75	java/lang/StringBuilder
    //   249: dup
    //   250: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   253: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   256: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   259: ldc 119
    //   261: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   267: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   270: aload 6
    //   272: ldc 121
    //   274: aload_2
    //   275: invokevirtual 125	com/whatcrypt/ac:c	(Ljava/io/File;Ljava/io/File;Ljava/io/File;Landroid/app/ProgressDialog;Ljava/lang/String;Ljava/lang/Integer;)V
    //   278: new 127	java/io/BufferedReader
    //   281: dup
    //   282: new 129	java/io/FileReader
    //   285: dup
    //   286: new 75	java/lang/StringBuilder
    //   289: dup
    //   290: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   293: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   296: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   299: ldc 117
    //   301: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   307: invokespecial 130	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   310: invokespecial 133	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   313: astore 16
    //   315: aload 16
    //   317: invokevirtual 136	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   320: invokevirtual 139	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   323: ldc 141
    //   325: invokevirtual 139	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   328: invokevirtual 145	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   331: ifeq +295 -> 626
    //   334: iconst_1
    //   335: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   338: astore 19
    //   340: aload 19
    //   342: areturn
    //   343: aload 11
    //   345: invokevirtual 34	java/io/File:getName	()Ljava/lang/String;
    //   348: ldc 106
    //   350: invokevirtual 42	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   353: ifeq +81 -> 434
    //   356: aload 14
    //   358: aload 11
    //   360: new 12	java/io/File
    //   363: dup
    //   364: new 75	java/lang/StringBuilder
    //   367: dup
    //   368: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   371: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   374: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   377: ldc 117
    //   379: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   382: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   385: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   388: new 12	java/io/File
    //   391: dup
    //   392: new 75	java/lang/StringBuilder
    //   395: dup
    //   396: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   399: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   402: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   405: ldc 119
    //   407: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   410: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   413: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   416: aload 6
    //   418: ldc 121
    //   420: aload_2
    //   421: invokevirtual 148	com/whatcrypt/ac:b	(Ljava/io/File;Ljava/io/File;Ljava/io/File;Landroid/app/ProgressDialog;Ljava/lang/String;Ljava/lang/Integer;)V
    //   424: goto -146 -> 278
    //   427: astore 15
    //   429: iconst_2
    //   430: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   433: areturn
    //   434: aload 11
    //   436: invokevirtual 34	java/io/File:getName	()Ljava/lang/String;
    //   439: ldc 104
    //   441: invokevirtual 42	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   444: ifeq +74 -> 518
    //   447: aload 14
    //   449: aload 11
    //   451: new 12	java/io/File
    //   454: dup
    //   455: new 75	java/lang/StringBuilder
    //   458: dup
    //   459: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   462: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   465: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   468: ldc 117
    //   470: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   473: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   476: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   479: new 12	java/io/File
    //   482: dup
    //   483: new 75	java/lang/StringBuilder
    //   486: dup
    //   487: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   490: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   493: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   496: ldc 119
    //   498: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   501: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   504: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   507: aload 6
    //   509: ldc 121
    //   511: aload_2
    //   512: invokevirtual 150	com/whatcrypt/ac:a	(Ljava/io/File;Ljava/io/File;Ljava/io/File;Landroid/app/ProgressDialog;Ljava/lang/String;Ljava/lang/Integer;)V
    //   515: goto -237 -> 278
    //   518: aload 11
    //   520: invokevirtual 34	java/io/File:getName	()Ljava/lang/String;
    //   523: ldc 152
    //   525: invokevirtual 42	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   528: ifeq +48 -> 576
    //   531: aload 14
    //   533: aload 11
    //   535: new 12	java/io/File
    //   538: dup
    //   539: new 75	java/lang/StringBuilder
    //   542: dup
    //   543: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   546: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   549: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   552: ldc 117
    //   554: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   557: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   560: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   563: aload 6
    //   565: ldc 121
    //   567: aload 10
    //   569: aload_2
    //   570: invokevirtual 155	com/whatcrypt/ac:a	(Ljava/io/File;Ljava/io/File;Landroid/app/ProgressDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    //   573: goto -295 -> 278
    //   576: aload 14
    //   578: aload 11
    //   580: new 12	java/io/File
    //   583: dup
    //   584: new 75	java/lang/StringBuilder
    //   587: dup
    //   588: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   591: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   594: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   597: ldc 117
    //   599: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   602: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   605: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   608: aload 6
    //   610: ldc 121
    //   612: aload_2
    //   613: invokevirtual 158	com/whatcrypt/ac:a	(Ljava/io/File;Ljava/io/File;Landroid/app/ProgressDialog;Ljava/lang/String;Ljava/lang/Integer;)V
    //   616: goto -338 -> 278
    //   619: astore 20
    //   621: iconst_2
    //   622: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   625: areturn
    //   626: iconst_2
    //   627: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   630: astore 18
    //   632: aload 18
    //   634: areturn
    //   635: astore 17
    //   637: iconst_2
    //   638: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   641: areturn
    //   642: aload_2
    //   643: invokevirtual 112	java/lang/Integer:intValue	()I
    //   646: iconst_2
    //   647: if_icmpne +1041 -> 1688
    //   650: new 114	com/whatcrypt/ac
    //   653: dup
    //   654: invokespecial 115	com/whatcrypt/ac:<init>	()V
    //   657: astore 21
    //   659: aload 11
    //   661: invokevirtual 34	java/io/File:getName	()Ljava/lang/String;
    //   664: ldc 108
    //   666: invokevirtual 42	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   669: ifeq +173 -> 842
    //   672: aload 21
    //   674: aload 11
    //   676: new 12	java/io/File
    //   679: dup
    //   680: new 75	java/lang/StringBuilder
    //   683: dup
    //   684: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   687: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   690: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   693: ldc 160
    //   695: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   698: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   701: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   704: new 12	java/io/File
    //   707: dup
    //   708: new 75	java/lang/StringBuilder
    //   711: dup
    //   712: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   715: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   718: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   721: ldc 119
    //   723: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   726: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   729: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   732: aload 6
    //   734: ldc 121
    //   736: aload_2
    //   737: invokevirtual 125	com/whatcrypt/ac:c	(Ljava/io/File;Ljava/io/File;Ljava/io/File;Landroid/app/ProgressDialog;Ljava/lang/String;Ljava/lang/Integer;)V
    //   740: new 127	java/io/BufferedReader
    //   743: dup
    //   744: new 129	java/io/FileReader
    //   747: dup
    //   748: new 75	java/lang/StringBuilder
    //   751: dup
    //   752: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   755: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   758: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   761: ldc 160
    //   763: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   766: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   769: invokespecial 130	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   772: invokespecial 133	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   775: astore 23
    //   777: aload 23
    //   779: invokevirtual 136	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   782: invokevirtual 139	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   785: ldc 141
    //   787: invokevirtual 139	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   790: invokevirtual 145	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   793: istore 26
    //   795: iload 26
    //   797: ifeq +882 -> 1679
    //   800: aload_3
    //   801: invokevirtual 112	java/lang/Integer:intValue	()I
    //   804: bipush 8
    //   806: if_icmpne +413 -> 1219
    //   809: new 12	java/io/File
    //   812: dup
    //   813: aload 5
    //   815: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   818: astore 31
    //   820: aload 31
    //   822: invokevirtual 73	java/io/File:exists	()Z
    //   825: ifeq +8 -> 833
    //   828: aload 31
    //   830: ifnonnull +295 -> 1125
    //   833: iconst_3
    //   834: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   837: astore 34
    //   839: aload 34
    //   841: areturn
    //   842: aload 11
    //   844: invokevirtual 34	java/io/File:getName	()Ljava/lang/String;
    //   847: ldc 106
    //   849: invokevirtual 42	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   852: ifeq +81 -> 933
    //   855: aload 21
    //   857: aload 11
    //   859: new 12	java/io/File
    //   862: dup
    //   863: new 75	java/lang/StringBuilder
    //   866: dup
    //   867: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   870: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   873: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   876: ldc 160
    //   878: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   881: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   884: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   887: new 12	java/io/File
    //   890: dup
    //   891: new 75	java/lang/StringBuilder
    //   894: dup
    //   895: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   898: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   901: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   904: ldc 119
    //   906: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   909: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   912: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   915: aload 6
    //   917: ldc 121
    //   919: aload_2
    //   920: invokevirtual 148	com/whatcrypt/ac:b	(Ljava/io/File;Ljava/io/File;Ljava/io/File;Landroid/app/ProgressDialog;Ljava/lang/String;Ljava/lang/Integer;)V
    //   923: goto -183 -> 740
    //   926: astore 22
    //   928: iconst_2
    //   929: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   932: areturn
    //   933: aload 11
    //   935: invokevirtual 34	java/io/File:getName	()Ljava/lang/String;
    //   938: ldc 104
    //   940: invokevirtual 42	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   943: ifeq +74 -> 1017
    //   946: aload 21
    //   948: aload 11
    //   950: new 12	java/io/File
    //   953: dup
    //   954: new 75	java/lang/StringBuilder
    //   957: dup
    //   958: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   961: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   964: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   967: ldc 160
    //   969: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   972: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   975: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   978: new 12	java/io/File
    //   981: dup
    //   982: new 75	java/lang/StringBuilder
    //   985: dup
    //   986: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   989: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   992: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   995: ldc 119
    //   997: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1000: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1003: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   1006: aload 6
    //   1008: ldc 121
    //   1010: aload_2
    //   1011: invokevirtual 150	com/whatcrypt/ac:a	(Ljava/io/File;Ljava/io/File;Ljava/io/File;Landroid/app/ProgressDialog;Ljava/lang/String;Ljava/lang/Integer;)V
    //   1014: goto -274 -> 740
    //   1017: aload 11
    //   1019: invokevirtual 34	java/io/File:getName	()Ljava/lang/String;
    //   1022: ldc 152
    //   1024: invokevirtual 42	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   1027: ifeq +48 -> 1075
    //   1030: aload 21
    //   1032: aload 11
    //   1034: new 12	java/io/File
    //   1037: dup
    //   1038: new 75	java/lang/StringBuilder
    //   1041: dup
    //   1042: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   1045: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   1048: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1051: ldc 160
    //   1053: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1056: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1059: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   1062: aload 6
    //   1064: ldc 121
    //   1066: aload 10
    //   1068: aload_2
    //   1069: invokevirtual 155	com/whatcrypt/ac:a	(Ljava/io/File;Ljava/io/File;Landroid/app/ProgressDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    //   1072: goto -332 -> 740
    //   1075: aload 21
    //   1077: aload 11
    //   1079: new 12	java/io/File
    //   1082: dup
    //   1083: new 75	java/lang/StringBuilder
    //   1086: dup
    //   1087: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   1090: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   1093: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1096: ldc 160
    //   1098: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1101: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1104: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   1107: aload 6
    //   1109: ldc 121
    //   1111: aload_2
    //   1112: invokevirtual 158	com/whatcrypt/ac:a	(Ljava/io/File;Ljava/io/File;Landroid/app/ProgressDialog;Ljava/lang/String;Ljava/lang/Integer;)V
    //   1115: goto -375 -> 740
    //   1118: astore 37
    //   1120: iconst_2
    //   1121: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1124: areturn
    //   1125: aload 21
    //   1127: new 75	java/lang/StringBuilder
    //   1130: dup
    //   1131: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   1134: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   1137: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1140: ldc 160
    //   1142: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1145: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1148: new 75	java/lang/StringBuilder
    //   1151: dup
    //   1152: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   1155: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   1158: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1161: ldc 162
    //   1163: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1166: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1169: aload 6
    //   1171: iconst_3
    //   1172: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1175: invokevirtual 165	com/whatcrypt/ac:a	(Ljava/lang/String;Ljava/lang/String;Landroid/app/ProgressDialog;Ljava/lang/Integer;)V
    //   1178: new 12	java/io/File
    //   1181: dup
    //   1182: new 75	java/lang/StringBuilder
    //   1185: dup
    //   1186: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   1189: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   1192: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1195: ldc 160
    //   1197: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1200: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1203: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   1206: invokevirtual 168	java/io/File:delete	()Z
    //   1209: pop
    //   1210: iconst_1
    //   1211: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1214: astore 33
    //   1216: aload 33
    //   1218: areturn
    //   1219: aload_3
    //   1220: invokevirtual 112	java/lang/Integer:intValue	()I
    //   1223: bipush 7
    //   1225: if_icmpne +149 -> 1374
    //   1228: new 12	java/io/File
    //   1231: dup
    //   1232: aload 5
    //   1234: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   1237: astore 35
    //   1239: aload 35
    //   1241: invokevirtual 73	java/io/File:exists	()Z
    //   1244: ifeq +8 -> 1252
    //   1247: aload 35
    //   1249: ifnonnull +8 -> 1257
    //   1252: iconst_3
    //   1253: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1256: areturn
    //   1257: aload 21
    //   1259: new 12	java/io/File
    //   1262: dup
    //   1263: new 75	java/lang/StringBuilder
    //   1266: dup
    //   1267: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   1270: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   1273: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1276: ldc 160
    //   1278: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1281: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1284: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   1287: new 12	java/io/File
    //   1290: dup
    //   1291: new 75	java/lang/StringBuilder
    //   1294: dup
    //   1295: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   1298: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   1301: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1304: ldc 170
    //   1306: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1309: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1312: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   1315: aload 35
    //   1317: aload 6
    //   1319: ldc 172
    //   1321: iconst_3
    //   1322: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1325: invokevirtual 148	com/whatcrypt/ac:b	(Ljava/io/File;Ljava/io/File;Ljava/io/File;Landroid/app/ProgressDialog;Ljava/lang/String;Ljava/lang/Integer;)V
    //   1328: goto -150 -> 1178
    //   1331: astore 28
    //   1333: new 12	java/io/File
    //   1336: dup
    //   1337: new 75	java/lang/StringBuilder
    //   1340: dup
    //   1341: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   1344: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   1347: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1350: ldc 160
    //   1352: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1355: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1358: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   1361: invokevirtual 168	java/io/File:delete	()Z
    //   1364: pop
    //   1365: iconst_2
    //   1366: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1369: astore 30
    //   1371: aload 30
    //   1373: areturn
    //   1374: aload_3
    //   1375: invokevirtual 112	java/lang/Integer:intValue	()I
    //   1378: bipush 6
    //   1380: if_icmpne +145 -> 1525
    //   1383: new 12	java/io/File
    //   1386: dup
    //   1387: aload 5
    //   1389: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   1392: astore 36
    //   1394: aload 36
    //   1396: invokevirtual 73	java/io/File:exists	()Z
    //   1399: ifeq +8 -> 1407
    //   1402: aload 36
    //   1404: ifnonnull +8 -> 1412
    //   1407: iconst_3
    //   1408: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1411: areturn
    //   1412: aload 21
    //   1414: new 12	java/io/File
    //   1417: dup
    //   1418: new 75	java/lang/StringBuilder
    //   1421: dup
    //   1422: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   1425: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   1428: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1431: ldc 160
    //   1433: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1436: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1439: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   1442: new 12	java/io/File
    //   1445: dup
    //   1446: new 75	java/lang/StringBuilder
    //   1449: dup
    //   1450: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   1453: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   1456: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1459: ldc 174
    //   1461: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1464: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1467: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   1470: aload 36
    //   1472: aload 6
    //   1474: ldc 172
    //   1476: iconst_3
    //   1477: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1480: invokevirtual 150	com/whatcrypt/ac:a	(Ljava/io/File;Ljava/io/File;Ljava/io/File;Landroid/app/ProgressDialog;Ljava/lang/String;Ljava/lang/Integer;)V
    //   1483: goto -305 -> 1178
    //   1486: astore 24
    //   1488: new 12	java/io/File
    //   1491: dup
    //   1492: new 75	java/lang/StringBuilder
    //   1495: dup
    //   1496: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   1499: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   1502: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1505: ldc 160
    //   1507: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1510: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1513: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   1516: invokevirtual 168	java/io/File:delete	()Z
    //   1519: pop
    //   1520: iconst_2
    //   1521: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1524: areturn
    //   1525: aload_3
    //   1526: invokevirtual 112	java/lang/Integer:intValue	()I
    //   1529: iconst_5
    //   1530: if_icmpne +77 -> 1607
    //   1533: aload 21
    //   1535: new 12	java/io/File
    //   1538: dup
    //   1539: new 75	java/lang/StringBuilder
    //   1542: dup
    //   1543: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   1546: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   1549: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1552: ldc 160
    //   1554: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1557: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1560: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   1563: new 12	java/io/File
    //   1566: dup
    //   1567: new 75	java/lang/StringBuilder
    //   1570: dup
    //   1571: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   1574: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   1577: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1580: ldc 176
    //   1582: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1585: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1588: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   1591: aload 6
    //   1593: ldc 172
    //   1595: aload 4
    //   1597: iconst_3
    //   1598: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1601: invokevirtual 155	com/whatcrypt/ac:a	(Ljava/io/File;Ljava/io/File;Landroid/app/ProgressDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    //   1604: goto -426 -> 1178
    //   1607: aload 21
    //   1609: new 12	java/io/File
    //   1612: dup
    //   1613: new 75	java/lang/StringBuilder
    //   1616: dup
    //   1617: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   1620: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   1623: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1626: ldc 160
    //   1628: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1631: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1634: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   1637: new 12	java/io/File
    //   1640: dup
    //   1641: new 75	java/lang/StringBuilder
    //   1644: dup
    //   1645: invokespecial 76	java/lang/StringBuilder:<init>	()V
    //   1648: invokestatic 82	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   1651: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1654: ldc 178
    //   1656: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1659: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1662: invokespecial 15	java/io/File:<init>	(Ljava/lang/String;)V
    //   1665: aload 6
    //   1667: ldc 172
    //   1669: iconst_3
    //   1670: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1673: invokevirtual 158	com/whatcrypt/ac:a	(Ljava/io/File;Ljava/io/File;Landroid/app/ProgressDialog;Ljava/lang/String;Ljava/lang/Integer;)V
    //   1676: goto -498 -> 1178
    //   1679: iconst_2
    //   1680: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1683: astore 27
    //   1685: aload 27
    //   1687: areturn
    //   1688: iconst_0
    //   1689: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1692: areturn
    //   1693: astore 12
    //   1695: goto -1601 -> 94
    //
    // Exception table:
    //   from	to	target	type
    //   197	278	427	java/lang/Exception
    //   343	424	427	java/lang/Exception
    //   434	515	427	java/lang/Exception
    //   518	573	427	java/lang/Exception
    //   576	616	427	java/lang/Exception
    //   278	315	619	java/io/FileNotFoundException
    //   315	340	635	java/io/IOException
    //   626	632	635	java/io/IOException
    //   659	740	926	java/lang/Exception
    //   842	923	926	java/lang/Exception
    //   933	1014	926	java/lang/Exception
    //   1017	1072	926	java/lang/Exception
    //   1075	1115	926	java/lang/Exception
    //   740	777	1118	java/io/FileNotFoundException
    //   800	828	1331	java/lang/Exception
    //   833	839	1331	java/lang/Exception
    //   1125	1178	1331	java/lang/Exception
    //   1219	1247	1331	java/lang/Exception
    //   1252	1257	1331	java/lang/Exception
    //   1257	1328	1331	java/lang/Exception
    //   1374	1402	1331	java/lang/Exception
    //   1407	1412	1331	java/lang/Exception
    //   1412	1483	1331	java/lang/Exception
    //   1525	1604	1331	java/lang/Exception
    //   1607	1676	1331	java/lang/Exception
    //   777	795	1486	java/io/IOException
    //   800	828	1486	java/io/IOException
    //   833	839	1486	java/io/IOException
    //   1125	1178	1486	java/io/IOException
    //   1178	1216	1486	java/io/IOException
    //   1219	1247	1486	java/io/IOException
    //   1252	1257	1486	java/io/IOException
    //   1257	1328	1486	java/io/IOException
    //   1333	1371	1486	java/io/IOException
    //   1374	1402	1486	java/io/IOException
    //   1407	1412	1486	java/io/IOException
    //   1412	1483	1486	java/io/IOException
    //   1525	1604	1486	java/io/IOException
    //   1607	1676	1486	java/io/IOException
    //   1679	1685	1486	java/io/IOException
    //   63	90	1693	java/lang/NullPointerException
  }
}

/* Location:           /Users/diego/Documents/workspace/apktool/dex2jar/classes_dex2jar.jar
 * Qualified Name:     com.whatcrypt.a
 * JD-Core Version:    0.6.2
 */