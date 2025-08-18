package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class gb3 extends pa3 {
    public final pa3 a;
    public final TimeUnit c;
    public final ztc o;
    public final long b = 3;
    public final pa3 X = null;

    public gb3(sa3 sa3Var, TimeUnit timeUnit, ztc ztcVar) {
        this.a = sa3Var;
        this.c = timeUnit;
        this.o = ztcVar;
    }

    @Override // defpackage.pa3
    public final void j(ab3 ab3Var) {
        hc3 hc3Var = new hc3();
        ab3Var.c(hc3Var);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        hc3Var.a(this.o.c(new r8g(this, atomicBoolean, hc3Var, ab3Var, 2), this.b, this.c));
        this.a.i(new pl8(hc3Var, atomicBoolean, ab3Var, 3));
    }
}
