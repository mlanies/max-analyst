package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class id3 extends xtc {
    public volatile boolean X;
    public final ml7 a;
    public final hc3 b;
    public final ml7 c;
    public final kd3 o;

    public id3(kd3 kd3Var) {
        this.o = kd3Var;
        ml7 ml7Var = new ml7();
        this.a = ml7Var;
        hc3 hc3Var = new hc3();
        this.b = hc3Var;
        ml7 ml7Var2 = new ml7();
        this.c = ml7Var2;
        ml7Var2.a(ml7Var);
        ml7Var2.a(hc3Var);
    }

    @Override // defpackage.xtc
    public final zl4 b(Runnable runnable) {
        return this.X ? iz4.a : this.o.e(runnable, 0L, TimeUnit.MILLISECONDS, this.a);
    }

    @Override // defpackage.xtc
    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.X ? iz4.a : this.o.e(runnable, j, timeUnit, this.b);
    }

    @Override // defpackage.zl4
    public final void g() {
        if (this.X) {
            return;
        }
        this.X = true;
        this.c.g();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.X;
    }
}
