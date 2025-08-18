package defpackage;

/* loaded from: classes.dex */
public abstract class e0 implements jx3 {
    private final kx3 key;

    public e0(kx3 kx3Var) {
        this.key = kx3Var;
    }

    @Override // defpackage.lx3
    public <R> R fold(R r, a66 a66Var) {
        return (R) a66Var.invoke(r, this);
    }

    @Override // defpackage.lx3
    public jx3 get(kx3 kx3Var) {
        return tpa.r(this, kx3Var);
    }

    @Override // defpackage.jx3
    public kx3 getKey() {
        return this.key;
    }

    @Override // defpackage.lx3
    public lx3 minusKey(kx3 kx3Var) {
        return tpa.y(this, kx3Var);
    }

    @Override // defpackage.lx3
    public lx3 plus(lx3 lx3Var) {
        return ema.z(this, lx3Var);
    }
}
