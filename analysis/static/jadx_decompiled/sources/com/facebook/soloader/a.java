package com.facebook.soloader;

import defpackage.dle;
import defpackage.ja5;
import defpackage.of0;
import defpackage.p5f;
import defpackage.rh5;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class a extends e {
    public final boolean X;
    public final File Y;
    public final int Z;
    public ja5[] a;
    public final ZipFile b;
    public final p5f c;
    public final /* synthetic */ of0 o;

    public a(of0 of0Var, of0 of0Var2, boolean z) {
        this.o = of0Var;
        this.b = new ZipFile(of0Var.e);
        this.c = of0Var2;
        this.X = z;
        this.Y = new File(of0Var.d.getApplicationInfo().nativeLibraryDir);
        this.Z = of0Var.g;
    }

    public final ja5[] S() {
        ja5[] ja5VarArr = this.a;
        if (ja5VarArr != null) {
            return ja5VarArr;
        }
        ja5[] ja5VarArrO = o();
        this.a = ja5VarArrO;
        if (this.X || (this.Z & 1) == 0) {
            return ja5VarArrO;
        }
        for (ja5 ja5Var : ja5VarArrO) {
            ZipEntry zipEntry = ja5Var.o;
            zipEntry.getName();
            File file = this.Y;
            File file2 = new File(file, (String) ja5Var.b);
            try {
                if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                    if (file2.isFile()) {
                        if (file2.length() != zipEntry.getSize()) {
                            file2.toString();
                        }
                    }
                    return this.a;
                }
                continue;
            } catch (IOException e) {
                e.toString();
            }
        }
        ja5[] ja5VarArr2 = new ja5[0];
        this.a = ja5VarArr2;
        return ja5VarArr2;
    }

    @Override // com.facebook.soloader.e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // com.facebook.soloader.e
    public final dle[] m() {
        return S();
    }

    @Override // com.facebook.soloader.e
    public final void n(File file) throws IOException {
        byte[] bArr = new byte[32768];
        for (ja5 ja5Var : S()) {
            InputStream inputStream = this.b.getInputStream(ja5Var.o);
            try {
                rh5 rh5Var = new rh5(ja5Var, 2, inputStream);
                inputStream = null;
                try {
                    e.a(rh5Var, bArr, file);
                    rh5Var.close();
                } finally {
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        }
    }

    public final ja5[] o() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap map = new HashMap();
        Pattern patternCompile = Pattern.compile(this.o.f);
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        Enumeration<? extends ZipEntry> enumerationEntries = this.b.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                int i = 0;
                while (true) {
                    if (i >= supportedAbis.length) {
                        i = -1;
                        break;
                    }
                    String str = supportedAbis[i];
                    if (str != null && strGroup.equals(str)) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    linkedHashSet.add(strGroup);
                    ja5 ja5Var = (ja5) map.get(strGroup2);
                    if (ja5Var == null || i < ja5Var.X) {
                        map.put(strGroup2, new ja5(strGroup2, zipEntryNextElement, i));
                    }
                }
            }
        }
        this.c.getClass();
        ja5[] ja5VarArr = (ja5[]) map.values().toArray(new ja5[map.size()]);
        Arrays.sort(ja5VarArr);
        return ja5VarArr;
    }
}
