package defpackage;

/* loaded from: classes.dex */
public final class i2a extends vu4 {
    public final vu4 Z;
    public final float s0;

    public i2a(f08 f08Var, float f) {
        this.Z = f08Var;
        this.s0 = f;
    }

    @Override // defpackage.vu4
    public final boolean n() {
        return this.Z.n();
    }

    @Override // defpackage.vu4
    public final void p(float f, float f2, float f3, pjd pjdVar) {
        this.Z.p(f, f2 - this.s0, f3, pjdVar);
    }
}
