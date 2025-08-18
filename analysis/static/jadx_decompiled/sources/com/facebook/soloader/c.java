package com.facebook.soloader;

import defpackage.dle;
import defpackage.i85;
import defpackage.rh5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c extends e {
    public final i85[] a;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00eb, code lost:
    
        throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r11 + "]");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(defpackage.j85 r18, defpackage.p5f r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.c.<init>(j85, p5f):void");
    }

    @Override // com.facebook.soloader.e
    public final dle[] m() {
        return this.a;
    }

    @Override // com.facebook.soloader.e
    public final void n(File file) throws IOException {
        byte[] bArr = new byte[32768];
        for (i85 i85Var : this.a) {
            FileInputStream fileInputStream = new FileInputStream(i85Var.o);
            try {
                rh5 rh5Var = new rh5(i85Var, 2, fileInputStream);
                fileInputStream = null;
                try {
                    e.a(rh5Var, bArr, file);
                    rh5Var.close();
                } finally {
                }
            } catch (Throwable th) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        }
    }
}
