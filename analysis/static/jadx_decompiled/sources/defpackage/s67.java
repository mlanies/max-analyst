package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class s67 extends xtc implements Runnable {
    public final r67 b;
    public final t67 c;
    public final AtomicBoolean o = new AtomicBoolean();
    public final hc3 a = new hc3();

    public s67(r67 r67Var) {
        t67 t67Var;
        t67 t67Var2;
        this.b = r67Var;
        if (r67Var.c.b) {
            t67Var2 = u67.h;
        } else {
            while (true) {
                if (r67Var.b.isEmpty()) {
                    t67Var = new t67(r67Var.Y);
                    r67Var.c.a(t67Var);
                    break;
                } else {
                    t67Var = (t67) r67Var.b.poll();
                    if (t67Var != null) {
                        break;
                    }
                }
            }
            t67Var2 = t67Var;
        }
        this.c = t67Var2;
    }

    @Override // defpackage.xtc
    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.a.b ? iz4.a : this.c.e(runnable, j, timeUnit, this.a);
    }

    @Override // defpackage.zl4
    public final void g() {
        if (this.o.compareAndSet(false, true)) {
            this.a.g();
            if (u67.i) {
                this.c.e(this, 0L, TimeUnit.NANOSECONDS, null);
                return;
            }
            r67 r67Var = this.b;
            r67Var.getClass();
            long jNanoTime = System.nanoTime() + r67Var.a;
            t67 t67Var = this.c;
            t67Var.c = jNanoTime;
            r67Var.b.offer(t67Var);
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.o.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        r67 r67Var = this.b;
        r67Var.getClass();
        long jNanoTime = System.nanoTime() + r67Var.a;
        t67 t67Var = this.c;
        t67Var.c = jNanoTime;
        r67Var.b.offer(t67Var);
    }
}
