package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class q32 extends l32 {
    public final int X;
    public final mn5 o;

    public q32(int i, int i2, int i3, lx3 lx3Var, mn5 mn5Var) {
        super(lx3Var, i2, i3);
        this.o = mn5Var;
        this.X = i;
    }

    @Override // defpackage.l32
    public final String h() {
        return "concurrency=" + this.X;
    }

    @Override // defpackage.l32
    public final Object j(iab iabVar, Continuation continuation) {
        int i = g5d.a;
        Object objD = this.o.d(new p32((x77) continuation.getContext().get(c32.X), new f5d(this.X, 0), iabVar, new z5d(iabVar), 0), continuation);
        return objD == tx3.a ? objD : e5f.a;
    }

    @Override // defpackage.l32
    public final l32 k(lx3 lx3Var, int i, int i2) {
        return new q32(this.X, i, i2, lx3Var, this.o);
    }

    @Override // defpackage.l32
    public final p8c m(sx3 sx3Var) {
        k32 k32Var = new k32(this, null);
        vx3 vx3Var = vx3.a;
        fab fabVar = new fab(v3c.x(sx3Var, this.a), c37.a(this.b, 1, 4));
        fabVar.start(vx3Var, fabVar, k32Var);
        return fabVar;
    }
}
