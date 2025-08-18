package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d2a extends qy9 {
    public final ztc a;
    public final long b;
    public final TimeUnit c;

    public d2a(long j, TimeUnit timeUnit, ztc ztcVar) {
        this.b = j;
        this.c = timeUnit;
        this.a = ztcVar;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        c2a c2aVar = new c2a(f2aVar);
        f2aVar.c(c2aVar);
        zl4 zl4VarC = this.a.c(c2aVar, this.b, this.c);
        while (!c2aVar.compareAndSet(null, zl4VarC)) {
            if (c2aVar.get() != null) {
                if (c2aVar.get() == dm4.a) {
                    zl4VarC.g();
                    return;
                }
                return;
            }
        }
    }
}
