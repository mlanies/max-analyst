package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class s4b {
    public final q4b a;
    public final o4b b;
    public final she c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public s4b(o4b o4bVar, vj0 vj0Var, mue mueVar, int i, she sheVar, Looper looper) {
        this.b = o4bVar;
        this.a = vj0Var;
        this.f = looper;
        this.c = sheVar;
    }

    public final synchronized void a(long j) {
        boolean z;
        fm9.k(this.g);
        fm9.k(this.f.getThread() != Thread.currentThread());
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
        fm9.k(!this.g);
        this.g = true;
        g85 g85Var = (g85) this.b;
        synchronized (g85Var) {
            if (!g85Var.L0 && g85Var.u0.getThread().isAlive()) {
                g85Var.s0.a(14, this).b();
                return;
            }
            z04.c0("Ignoring messages sent after release.");
            b(false);
        }
    }
}
