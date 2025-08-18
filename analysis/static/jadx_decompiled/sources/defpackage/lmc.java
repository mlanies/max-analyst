package defpackage;

import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class lmc extends xm7 {
    public final ilc l;
    public final ph4 m;
    public final Callable o;
    public final ay3 p;
    public final boolean n = true;
    public final AtomicBoolean q = new AtomicBoolean(true);
    public final AtomicBoolean r = new AtomicBoolean(false);
    public final AtomicBoolean s = new AtomicBoolean(false);
    public final kmc t = new kmc(this, 0);
    public final kmc u = new kmc(this, 1);

    public lmc(ilc ilcVar, ph4 ph4Var, oef oefVar, String[] strArr) {
        this.l = ilcVar;
        this.m = ph4Var;
        this.o = oefVar;
        this.p = new ay3(strArr, this, 1);
    }

    @Override // defpackage.xm7
    public final void g() {
        Executor executor;
        ((Set) this.m.b).add(this);
        Executor executor2 = null;
        boolean z = this.n;
        ilc ilcVar = this.l;
        if (!z ? (executor = ilcVar.b) != null : (executor = ilcVar.c) != null) {
            executor2 = executor;
        }
        executor2.execute(this.t);
    }

    @Override // defpackage.xm7
    public final void h() {
        ((Set) this.m.b).remove(this);
    }
}
