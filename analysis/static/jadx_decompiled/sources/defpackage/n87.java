package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n87 {
    public final Executor a;
    public final m87 b;
    public final l87 c = new l87(this, 0);
    public final l87 d = new l87(this, 1);
    public g05 e = null;
    public int f = 0;
    public int g = 1;
    public long h = 0;
    public long i = 0;

    public n87(Executor executor, m87 m87Var) {
        this.a = executor;
        this.b = m87Var;
    }

    public static boolean d(g05 g05Var, int i) {
        return fi0.a(i) || fi0.l(i, 4) || g05.m0(g05Var);
    }

    public final void a(long j) {
        l87 l87Var = this.d;
        if (j <= 0) {
            l87Var.run();
            return;
        }
        if (tfg.f == null) {
            tfg.f = Executors.newSingleThreadScheduledExecutor();
        }
        tfg.f.schedule(l87Var, j, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        boolean z;
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                z = true;
                if (this.g == 4) {
                    jMax = Math.max(this.i + 100, jUptimeMillis);
                    this.h = jUptimeMillis;
                    this.g = 2;
                } else {
                    this.g = 1;
                    jMax = 0;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            a(jMax - jUptimeMillis);
        }
    }

    public final void c() {
        boolean z;
        long j;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (d(this.e, this.f)) {
                    int iS = au1.s(this.g);
                    if (iS != 0) {
                        if (iS == 2) {
                            this.g = 4;
                        }
                        z = false;
                        j = 0;
                    } else {
                        long jMax = Math.max(this.i + 100, jUptimeMillis);
                        this.h = jUptimeMillis;
                        this.g = 2;
                        z = true;
                        j = jMax;
                    }
                    if (z) {
                        a(j - jUptimeMillis);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(g05 g05Var, int i) {
        g05 g05Var2;
        if (!d(g05Var, i)) {
            return false;
        }
        synchronized (this) {
            g05Var2 = this.e;
            this.e = g05.a(g05Var);
            this.f = i;
        }
        g05.d(g05Var2);
        return true;
    }
}
