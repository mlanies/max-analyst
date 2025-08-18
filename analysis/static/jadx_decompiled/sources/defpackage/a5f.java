package defpackage;

/* loaded from: classes.dex */
public final class a5f implements jx3, kx3 {
    public static final a5f a = new a5f();

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
        return this;
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
