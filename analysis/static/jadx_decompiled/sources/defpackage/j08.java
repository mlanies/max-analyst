package defpackage;

/* loaded from: classes.dex */
public final class j08 implements yd8, wd8 {
    public yd8 X;
    public wd8 Y;
    public long Z = -9223372036854775807L;
    public final xj8 a;
    public final long b;
    public final n64 c;
    public dj0 o;

    public j08(xj8 xj8Var, n64 n64Var, long j) {
        this.a = xj8Var;
        this.c = n64Var;
        this.b = j;
    }

    @Override // defpackage.yd8
    public final long A(long j, w1d w1dVar) {
        yd8 yd8Var = this.X;
        int i = maf.a;
        return yd8Var.A(j, w1dVar);
    }

    @Override // defpackage.i6d
    public final boolean C(long j) {
        yd8 yd8Var = this.X;
        return yd8Var != null && yd8Var.C(j);
    }

    @Override // defpackage.yd8
    public final void J(wd8 wd8Var, long j) {
        this.Y = wd8Var;
        yd8 yd8Var = this.X;
        if (yd8Var != null) {
            long j2 = this.Z;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            yd8Var.J(this, j2);
        }
    }

    @Override // defpackage.yd8
    public final long L(m85[] m85VarArr, boolean[] zArr, frc[] frcVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.Z;
        if (j3 == -9223372036854775807L || j != this.b) {
            j2 = j;
        } else {
            this.Z = -9223372036854775807L;
            j2 = j3;
        }
        yd8 yd8Var = this.X;
        int i = maf.a;
        return yd8Var.L(m85VarArr, zArr, frcVarArr, zArr2, j2);
    }

    @Override // defpackage.i6d
    public final boolean a() {
        yd8 yd8Var = this.X;
        return yd8Var != null && yd8Var.a();
    }

    public final long b(long j) {
        long j2 = this.Z;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // defpackage.g6d
    public final void c(i6d i6dVar) {
        wd8 wd8Var = this.Y;
        int i = maf.a;
        wd8Var.c(this);
    }

    @Override // defpackage.wd8
    public final void d(yd8 yd8Var) {
        wd8 wd8Var = this.Y;
        int i = maf.a;
        wd8Var.d(this);
    }

    @Override // defpackage.i6d
    public final long f() {
        yd8 yd8Var = this.X;
        int i = maf.a;
        return yd8Var.f();
    }

    @Override // defpackage.yd8
    public final void k() {
        yd8 yd8Var = this.X;
        if (yd8Var != null) {
            yd8Var.k();
            return;
        }
        dj0 dj0Var = this.o;
        if (dj0Var != null) {
            dj0Var.g();
        }
    }

    @Override // defpackage.yd8
    public final long l(long j) {
        yd8 yd8Var = this.X;
        int i = maf.a;
        return yd8Var.l(j);
    }

    @Override // defpackage.yd8
    public final long n() {
        yd8 yd8Var = this.X;
        int i = maf.a;
        return yd8Var.n();
    }

    @Override // defpackage.yd8
    public final sze q() {
        yd8 yd8Var = this.X;
        int i = maf.a;
        return yd8Var.q();
    }

    @Override // defpackage.i6d
    public final long r() {
        yd8 yd8Var = this.X;
        int i = maf.a;
        return yd8Var.r();
    }

    @Override // defpackage.yd8
    public final void s(long j, boolean z) {
        yd8 yd8Var = this.X;
        int i = maf.a;
        yd8Var.s(j, z);
    }

    @Override // defpackage.i6d
    public final void t(long j) {
        yd8 yd8Var = this.X;
        int i = maf.a;
        yd8Var.t(j);
    }
}
