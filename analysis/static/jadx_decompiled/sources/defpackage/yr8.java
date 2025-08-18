package defpackage;

/* loaded from: classes.dex */
public final class yr8 implements frc {
    public final frc a;
    public final long b;

    public yr8(frc frcVar, long j) {
        this.a = frcVar;
        this.b = j;
    }

    @Override // defpackage.frc
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.frc
    public final boolean d() {
        return this.a.d();
    }

    @Override // defpackage.frc
    public final int e(long j) {
        return this.a.e(j - this.b);
    }

    @Override // defpackage.frc
    public final int g(imc imcVar, o54 o54Var, int i) {
        int iG = this.a.g(imcVar, o54Var, i);
        if (iG == -4) {
            o54Var.Y = Math.max(0L, o54Var.Y + this.b);
        }
        return iG;
    }
}
