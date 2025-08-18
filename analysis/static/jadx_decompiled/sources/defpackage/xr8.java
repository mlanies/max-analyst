package defpackage;

/* loaded from: classes.dex */
public final class xr8 implements yd8, wd8 {
    public final yd8 a;
    public final long b;
    public wd8 c;

    public xr8(yd8 yd8Var, long j) {
        this.a = yd8Var;
        this.b = j;
    }

    @Override // defpackage.yd8
    public final long A(long j, w1d w1dVar) {
        long j2 = this.b;
        return this.a.A(j - j2, w1dVar) + j2;
    }

    @Override // defpackage.i6d
    public final boolean C(long j) {
        return this.a.C(j - this.b);
    }

    @Override // defpackage.yd8
    public final void J(wd8 wd8Var, long j) {
        this.c = wd8Var;
        this.a.J(this, j - this.b);
    }

    @Override // defpackage.yd8
    public final long L(m85[] m85VarArr, boolean[] zArr, frc[] frcVarArr, boolean[] zArr2, long j) {
        frc[] frcVarArr2 = new frc[frcVarArr.length];
        int i = 0;
        while (true) {
            frc frcVar = null;
            if (i >= frcVarArr.length) {
                break;
            }
            yr8 yr8Var = (yr8) frcVarArr[i];
            if (yr8Var != null) {
                frcVar = yr8Var.a;
            }
            frcVarArr2[i] = frcVar;
            i++;
        }
        long j2 = this.b;
        long jL = this.a.L(m85VarArr, zArr, frcVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < frcVarArr.length; i2++) {
            frc frcVar2 = frcVarArr2[i2];
            if (frcVar2 == null) {
                frcVarArr[i2] = null;
            } else {
                frc frcVar3 = frcVarArr[i2];
                if (frcVar3 == null || ((yr8) frcVar3).a != frcVar2) {
                    frcVarArr[i2] = new yr8(frcVar2, j2);
                }
            }
        }
        return jL + j2;
    }

    @Override // defpackage.i6d
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.g6d
    public final void c(i6d i6dVar) {
        wd8 wd8Var = this.c;
        wd8Var.getClass();
        wd8Var.c(this);
    }

    @Override // defpackage.wd8
    public final void d(yd8 yd8Var) {
        wd8 wd8Var = this.c;
        wd8Var.getClass();
        wd8Var.d(this);
    }

    @Override // defpackage.i6d
    public final long f() {
        long jF = this.a.f();
        if (jF == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + jF;
    }

    @Override // defpackage.yd8
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.yd8
    public final long l(long j) {
        long j2 = this.b;
        return this.a.l(j - j2) + j2;
    }

    @Override // defpackage.yd8
    public final long n() {
        long jN = this.a.n();
        if (jN == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.b + jN;
    }

    @Override // defpackage.yd8
    public final sze q() {
        return this.a.q();
    }

    @Override // defpackage.i6d
    public final long r() {
        long jR = this.a.r();
        if (jR == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + jR;
    }

    @Override // defpackage.yd8
    public final void s(long j, boolean z) {
        this.a.s(j - this.b, z);
    }

    @Override // defpackage.i6d
    public final void t(long j) {
        this.a.t(j - this.b);
    }
}
