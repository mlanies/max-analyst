package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class fmb {
    public static final nic a = new nic();
    public static final Object b = new Object();
    public static yb9 c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? dmb.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static yb9 b() {
        yb9 yb9Var = new yb9();
        c = yb9Var;
        a.i(yb9Var);
        return c;
    }

    public static void c(Context context, boolean z) {
        emb embVarA;
        int i;
        if (z || c == null) {
            synchronized (b) {
                if (!z) {
                    try {
                        if (c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (Build.VERSION.SDK_INT == 30) {
                    b();
                    return;
                }
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                int i2 = 0;
                boolean z2 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z3 = file2.exists() && length2 > 0;
                try {
                    long jA = a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            embVarA = emb.a(file3);
                        } catch (IOException unused) {
                            b();
                            return;
                        }
                    } else {
                        embVarA = null;
                    }
                    if (embVarA != null && embVarA.c == jA && (i = embVarA.b) != 2) {
                        i2 = i;
                    } else if (z2) {
                        i2 = 1;
                    } else if (z3) {
                        i2 = 2;
                    }
                    if (z && z3 && i2 != 1) {
                        i2 = 2;
                    }
                    emb embVar = new emb(1, (embVarA == null || embVarA.b != 2 || i2 != 1 || length >= embVarA.d) ? i2 : 3, jA, length2);
                    if (embVarA == null || !embVarA.equals(embVar)) {
                        try {
                            embVar.b(file3);
                        } catch (IOException unused2) {
                        }
                    }
                    b();
                } catch (PackageManager.NameNotFoundException unused3) {
                    b();
                }
            }
        }
    }
}
