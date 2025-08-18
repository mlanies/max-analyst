package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class fz9 extends AtomicReference implements Runnable, zl4 {
    public final Object a;
    public final long b;
    public final gz9 c;
    public final AtomicBoolean o = new AtomicBoolean();

    public fz9(Object obj, long j, gz9 gz9Var) {
        this.a = obj;
        this.b = j;
        this.c = gz9Var;
    }

    @Override // defpackage.zl4
    public final void g() {
        dm4.a(this);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get() == dm4.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.o.compareAndSet(false, true)) {
            gz9 gz9Var = this.c;
            long j = this.b;
            Object obj = this.a;
            if (j == gz9Var.Z) {
                gz9Var.a.e(obj);
                dm4.a(this);
            }
        }
    }
}
