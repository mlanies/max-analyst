package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class ds extends s5c {
    public static volatile ds e;
    public static final cs f = new cs(0);
    public final de4 d = new de4();

    public static ds g0() {
        if (e != null) {
            return e;
        }
        synchronized (ds.class) {
            try {
                if (e == null) {
                    e = new ds();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e;
    }

    public final boolean h0() {
        this.d.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void i0(Runnable runnable) {
        de4 de4Var = this.d;
        if (de4Var.f == null) {
            synchronized (de4Var.d) {
                try {
                    if (de4Var.f == null) {
                        de4Var.f = Handler.createAsync(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        de4Var.f.post(runnable);
    }
}
