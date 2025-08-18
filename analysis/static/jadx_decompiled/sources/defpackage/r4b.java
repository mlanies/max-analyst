package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class r4b {
    public final p4b a;
    public final f85 b;
    public final rhe c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public r4b(f85 f85Var, p4b p4bVar, lue lueVar, int i, rhe rheVar, Looper looper) {
        this.b = f85Var;
        this.a = p4bVar;
        this.f = looper;
        this.c = rheVar;
    }

    public final synchronized void a(long j) {
        boolean z;
        np8.f(this.g);
        np8.f(this.f.getThread() != Thread.currentThread());
        this.c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z = this.i;
            if (z || j <= 0) {
                break;
            }
            this.c.getClass();
            wait(j);
            this.c.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z) {
        this.h = z | this.h;
        this.i = true;
        notifyAll();
    }

    public final void c() {
        np8.f(!this.g);
        this.g = true;
        f85 f85Var = this.b;
        synchronized (f85Var) {
            if (!f85Var.J0 && f85Var.t0.isAlive()) {
                f85Var.s0.a(14, this).b();
                return;
            }
            b(false);
        }
    }
}
