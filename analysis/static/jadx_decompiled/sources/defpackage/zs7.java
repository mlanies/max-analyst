package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public final class zs7 {
    public final Context a;
    public final Object b;
    public volatile int c;
    public hs d;
    public int e;
    public File f;
    public int g;
    public final ConcurrentLinkedQueue h;
    public final long i;

    public zs7(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.a = applicationContext;
        this.b = new Object();
        this.c = 1;
        this.e = 1;
        this.h = new ConcurrentLinkedQueue();
        this.i = System.currentTimeMillis();
    }

    public final void a(int i) {
        if (au1.b(this.c, i) >= 0) {
            return;
        }
        synchronized (this.b) {
            try {
                int i2 = this.c;
                if (au1.b(i2, i) >= 0) {
                    return;
                }
                Context context = this.a;
                String strQ = c37.q();
                File fileJ = lk5.J(new File(context.getCacheDir(), strQ.equals(context.getPackageName()) ? "tracer" : "tracer-" + Uri.encode(strQ.replace(':', '-'))), "logs");
                File fileJ2 = lk5.J(fileJ, "a.log");
                File fileJ3 = lk5.J(fileJ, "b.log");
                File fileJ4 = lk5.J(fileJ, "stash-a.log");
                File fileJ5 = lk5.J(fileJ, "stash-b.log");
                int iS = au1.s(i2);
                if (iS == 0) {
                    int iS2 = au1.s(i);
                    if (iS2 == 1) {
                        rq9.e(fileJ4, fileJ5);
                        kpa[] kpaVarArr = {new kpa(fileJ2, fileJ4), new kpa(fileJ3, fileJ5)};
                        for (int i3 = 0; i3 < 2; i3++) {
                            kpa kpaVar = kpaVarArr[i3];
                            File file = (File) kpaVar.a;
                            File file2 = (File) kpaVar.b;
                            if (file.exists()) {
                                try {
                                    file.renameTo(file2);
                                } catch (IOException unused) {
                                    file.toString();
                                    Objects.toString(file2);
                                }
                            }
                        }
                    } else if (iS2 == 2) {
                        this.d = rq9.i(fileJ2, fileJ3);
                        rq9.e(fileJ2, fileJ3);
                    } else {
                        if (iS2 != 3) {
                            throw new AssertionError("Unreachable code");
                        }
                        rq9.e(fileJ4, fileJ5);
                        rq9.e(fileJ2, fileJ3);
                    }
                } else if (iS == 1) {
                    int iS3 = au1.s(i);
                    if (iS3 == 2) {
                        this.d = rq9.i(fileJ4, fileJ5);
                        rq9.e(fileJ4, fileJ5);
                    } else {
                        if (iS3 != 3) {
                            throw new AssertionError("Unreachable code");
                        }
                        rq9.e(fileJ4, fileJ5);
                    }
                } else {
                    if (iS != 2) {
                        throw new AssertionError("Unreachable code");
                    }
                    if (ys7.$EnumSwitchMapping$1[au1.s(i)] != 3) {
                        throw new AssertionError("Unreachable code");
                    }
                    this.d = null;
                }
                this.c = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
