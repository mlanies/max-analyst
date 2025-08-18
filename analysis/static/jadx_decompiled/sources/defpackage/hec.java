package defpackage;

/* loaded from: classes2.dex */
public final class hec implements jx3 {
    public final iec a;

    public hec(iec iecVar) {
        this.a = iecVar;
    }

    @Override // defpackage.lx3
    public final Object fold(Object obj, a66 a66Var) {
        return a66Var.invoke(obj, this);
    }

    @Override // defpackage.lx3
    public final jx3 get(kx3 kx3Var) {
        return tpa.r(this, kx3Var);
    }

    @Override // defpackage.jx3
    public final kx3 getKey() {
        return this.a;
    }

    @Override // defpackage.lx3
    public final lx3 minusKey(kx3 kx3Var) {
        return tpa.y(this, kx3Var);
    }

    @Override // defpackage.lx3
    public final lx3 plus(lx3 lx3Var) {
        return ema.z(this, lx3Var);
    }
}
