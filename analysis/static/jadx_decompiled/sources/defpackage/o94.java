package defpackage;

import android.os.Environment;
import com.facebook.common.file.FileUtils$CreateDirectoryException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o94 implements dl4 {
    public static final long f = TimeUnit.MINUTES.toMillis(30);
    public static final /* synthetic */ int g = 0;
    public final File a;
    public final boolean b;
    public final File c;
    public final lq9 d;
    public final qx7 e;

    public o94(File file, int i, lq9 lq9Var) {
        this.a = file;
        boolean zContains = false;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                try {
                    zContains = file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException unused) {
                    lq9Var.getClass();
                }
            }
        } catch (Exception unused2) {
            lq9Var.getClass();
        }
        this.b = zContains;
        File file2 = new File(this.a, zr6.h(i, "v2.ols100."));
        this.c = file2;
        this.d = lq9Var;
        File file3 = this.a;
        if (!file3.exists()) {
            oag.y(file2);
        } else if (!file2.exists()) {
            mqd.f(file3);
            try {
                oag.y(file2);
            } catch (FileUtils$CreateDirectoryException unused3) {
                Objects.toString(file2);
                this.d.getClass();
            }
        }
        this.e = qx7.Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.m94 g(defpackage.o94 r8, java.io.File r9) {
        /*
            r8.getClass()
            java.lang.String r0 = r9.getName()
            r1 = 46
            int r2 = r0.lastIndexOf(r1)
            r3 = 0
            if (r2 > 0) goto L12
        L10:
            r1 = r3
            goto L49
        L12:
            java.lang.String r4 = r0.substring(r2)
            java.lang.String r5 = ".cnt"
            boolean r6 = r5.equals(r4)
            java.lang.String r7 = ".tmp"
            if (r6 == 0) goto L21
            goto L2a
        L21:
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L29
            r5 = r7
            goto L2a
        L29:
            r5 = r3
        L2a:
            if (r5 != 0) goto L2d
            goto L10
        L2d:
            r4 = 0
            java.lang.String r0 = r0.substring(r4, r2)
            boolean r2 = r5.equals(r7)
            if (r2 == 0) goto L43
            int r1 = r0.lastIndexOf(r1)
            if (r1 > 0) goto L3f
            goto L10
        L3f:
            java.lang.String r0 = r0.substring(r4, r1)
        L43:
            m94 r1 = new m94
            r2 = 0
            r1.<init>(r5, r0, r2)
        L49:
            if (r1 != 0) goto L4c
            goto L62
        L4c:
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r1.c
            java.lang.String r8 = r8.i(r2)
            r0.<init>(r8)
            java.io.File r8 = r9.getParentFile()
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L62
            r3 = r1
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o94.g(o94, java.io.File):m94");
    }

    @Override // defpackage.dl4
    public final kg5 a(Object obj, String str) {
        File fileH = h(str);
        if (!fileH.exists()) {
            return null;
        }
        this.e.getClass();
        fileH.setLastModified(System.currentTimeMillis());
        return new kg5(fileH);
    }

    @Override // defpackage.dl4
    public final void b() {
        mqd.L(this.a, new ar0(this));
    }

    @Override // defpackage.dl4
    public final long c(l94 l94Var) {
        File file = l94Var.b.a;
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    @Override // defpackage.dl4
    public final Collection d() {
        qz7 qz7Var = new qz7(this);
        mqd.L(this.c, qz7Var);
        return Collections.unmodifiableList((ArrayList) qz7Var.b);
    }

    @Override // defpackage.dl4
    public final void e() {
        File[] fileArrListFiles = this.a.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                mqd.f(file);
            }
        }
    }

    @Override // defpackage.dl4
    public final vq7 f(Object obj, String str) throws IOException {
        File file = new File(i(str));
        boolean zExists = file.exists();
        lq9 lq9Var = this.d;
        if (!zExists) {
            try {
                oag.y(file);
            } catch (FileUtils$CreateDirectoryException e) {
                lq9Var.getClass();
                throw e;
            }
        }
        try {
            return new vq7(5, this, str, File.createTempFile(str.concat("."), ".tmp", file), false);
        } catch (IOException e2) {
            lq9Var.getClass();
            throw e2;
        }
    }

    public final File h(String str) {
        StringBuilder sbL = au1.l(i(str));
        sbL.append(File.separator);
        sbL.append(str);
        sbL.append(".cnt");
        return new File(sbL.toString());
    }

    public final String i(String str) {
        String strValueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        return zr6.l(sb, File.separator, strValueOf);
    }

    @Override // defpackage.dl4
    public final boolean isExternal() {
        return this.b;
    }
}
