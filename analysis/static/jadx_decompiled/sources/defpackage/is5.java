package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class is5 extends wq5 {
    public final ztc b;
    public final long c;
    public final TimeUnit o;

    public is5(long j, TimeUnit timeUnit, ztc ztcVar) {
        this.c = j;
        this.o = timeUnit;
        this.b = ztcVar;
    }

    @Override // defpackage.wq5
    public final void g(vae vaeVar) {
        hs5 hs5Var = new hs5(vaeVar);
        vaeVar.f(hs5Var);
        zl4 zl4VarC = this.b.c(hs5Var, this.c, this.o);
        while (!hs5Var.compareAndSet(null, zl4VarC)) {
            if (hs5Var.get() != null) {
                if (hs5Var.get() == dm4.a) {
                    zl4VarC.g();
                    return;
                }
                return;
            }
        }
    }
}
