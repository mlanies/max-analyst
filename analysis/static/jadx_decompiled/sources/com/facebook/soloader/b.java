package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import defpackage.ddc;
import defpackage.hw4;
import defpackage.nud;
import defpackage.rh4;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class b extends nud implements ddc {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashSet c;

    public b(Context context) {
        HashSet hashSet = new HashSet();
        String strH = h(context.getApplicationInfo().sourceDir);
        if (strH != null) {
            hashSet.add(strH);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                String strH2 = h(str);
                if (strH2 != null) {
                    hashSet.add(strH2);
                }
            }
        }
        this.c = hashSet;
    }

    public static String h(String str) {
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        if (str == null || str.isEmpty() || supportedAbis == null || supportedAbis.length == 0) {
            return null;
        }
        StringBuilder sbO = rh4.o(str, "!/lib/");
        sbO.append(supportedAbis[0]);
        return sbO.toString();
    }

    @Override // defpackage.ddc
    public final nud a(Context context) {
        b bVar = new b(context);
        try {
            bVar.i();
            return bVar;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.nud
    public final String b() {
        throw null;
    }

    @Override // defpackage.nud
    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws NoSuchAlgorithmException, IOException {
        if (SoLoader.b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Set set = (Set) this.a.get(str2);
            if (!TextUtils.isEmpty(str2) && set != null && set.contains(str)) {
                Set setG = g(str2, str);
                if (setG == null) {
                    ZipFile zipFile = new ZipFile(str2.substring(0, str2.indexOf(33)));
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        while (enumerationEntries.hasMoreElements()) {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            if (zipEntryNextElement != null) {
                                if (zipEntryNextElement.getName().endsWith("/" + str)) {
                                    hw4 hw4Var = new hw4(zipFile, zipEntryNextElement);
                                    try {
                                        for (String str3 : d.a(str, hw4Var)) {
                                            if (!str3.startsWith("/")) {
                                                e(str2, str, str3);
                                            }
                                        }
                                        hw4Var.close();
                                    } finally {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        zipFile.close();
                        setG = g(str2, str);
                    } catch (Throwable th) {
                        try {
                            zipFile.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (setG != null) {
                    Iterator it2 = setG.iterator();
                    while (it2.hasNext()) {
                        SoLoader.i((String) it2.next(), null, i | 1, threadPolicy);
                    }
                }
                try {
                    i |= 4;
                    SoLoader.b.l(i, str2 + File.separator + str);
                    return 1;
                } catch (UnsatisfiedLinkError unused) {
                    continue;
                }
            }
        }
        return 0;
    }

    @Override // defpackage.nud
    public final void d(int i) throws IOException {
        i();
    }

    public final void e(String str, String str2, String str3) {
        synchronized (this.b) {
            try {
                String str4 = str + str2;
                if (!this.b.containsKey(str4)) {
                    this.b.put(str4, new HashSet());
                }
                ((Set) this.b.get(str4)).add(str3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(String str, String str2) {
        synchronized (this.a) {
            try {
                if (!this.a.containsKey(str)) {
                    this.a.put(str, new HashSet());
                }
                ((Set) this.a.get(str)).add(str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Set g(String str, String str2) {
        Set set;
        synchronized (this.b) {
            set = (Set) this.b.get(str + str2);
        }
        return set;
    }

    public final void i() throws IOException {
        int iIndexOf;
        int i;
        Iterator it = this.c.iterator();
        String strSubstring = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf(33)) >= 0 && (i = iIndexOf + 2) < str.length()) {
                strSubstring = str.substring(i);
            }
            if (!TextUtils.isEmpty(strSubstring)) {
                ZipFile zipFile = new ZipFile(str.substring(0, str.indexOf(33)));
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement != null && zipEntryNextElement.getMethod() == 0 && zipEntryNextElement.getName().startsWith(strSubstring) && zipEntryNextElement.getName().endsWith(".so")) {
                            f(str, zipEntryNextElement.getName().substring(strSubstring.length() + 1));
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.nud
    public final String toString() {
        return "DirectApkSoSource[root = " + this.c.toString() + ']';
    }
}
