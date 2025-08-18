package defpackage;

/* loaded from: classes.dex */
public final class k08 implements zd8, xd8 {
    public zd8 X;
    public xd8 Y;
    public long Z = -9223372036854775807L;
    public final yj8 a;
    public final long b;
    public final n64 c;
    public ej0 o;

    public k08(yj8 yj8Var, n64 n64Var, long j) {
        this.a = yj8Var;
        this.c = n64Var;
        this.b = j;
    }

    @Override // defpackage.j6d
    public final boolean a() {
        zd8 zd8Var = this.X;
        return zd8Var != null && zd8Var.a();
    }

    public final void b(yj8 yj8Var) {
        long j = this.Z;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        ej0 ej0Var = this.o;
        ej0Var.getClass();
        zd8 zd8VarC = ej0Var.c(yj8Var, this.c, j);
        this.X = zd8VarC;
        if (this.Y != null) {
            zd8VarC.i(this, j);
        }
    }

    public final void c() {
        if (this.X != null) {
            ej0 ej0Var = this.o;
            ej0Var.getClass();
            ej0Var.o(this.X);
        }
    }

    @Override // defpackage.xd8
    public final void e(zd8 zd8Var) {
        xd8 xd8Var = this.Y;
        int i = oaf.a;
        xd8Var.e(this);
    }

    @Override // defpackage.j6d
    public final long f() {
        zd8 zd8Var = this.X;
        int i = oaf.a;
        return zd8Var.f();
    }

    @Override // defpackage.zd8
    public final long g(n85[] n85VarArr, boolean[] zArr, grc[] grcVarArr, boolean[] zArr2, long j) {
        long j2 = this.Z;
        long j3 = (j2 == -9223372036854775807L || j != this.b) ? j : j2;
        this.Z = -9223372036854775807L;
        zd8 zd8Var = this.X;
        int i = oaf.a;
        return zd8Var.g(n85VarArr, zArr, grcVarArr, zArr2, j3);
    }

    @Override // defpackage.zd8
    public final long h(long j, x1d x1dVar) {
        zd8 zd8Var = this.X;
        int i = oaf.a;
        return zd8Var.h(j, x1dVar);
    }

    @Override // defpackage.zd8
    public final void i(xd8 xd8Var, long j) {
        this.Y = xd8Var;
        zd8 zd8Var = this.X;
        if (zd8Var != null) {
            long j2 = this.Z;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            zd8Var.i(this, j2);
        }
    }

    @Override // defpackage.h6d
    public final void j(j6d j6dVar) {
        xd8 xd8Var = this.Y;
        int i = oaf.a;
        xd8Var.j(this);
    }

    @Override // defpackage.zd8
    public final void k() {
        zd8 zd8Var = this.X;
        if (zd8Var != null) {
            zd8Var.k();
            return;
        }
        ej0 ej0Var = this.o;
        if (ej0Var != null) {
            ej0Var.k();
        }
    }

    @Override // defpackage.zd8
    public final long l(long j) {
        zd8 zd8Var = this.X;
        int i = oaf.a;
        return zd8Var.l(j);
    }

    @Override // defpackage.zd8
    public final long n() {
        zd8 zd8Var = this.X;
        int i = oaf.a;
        return zd8Var.n();
    }

    @Override // defpackage.j6d
    public final boolean o(qo7 qo7Var) {
        zd8 zd8Var = this.X;
        return zd8Var != null && zd8Var.o(qo7Var);
    }

    @Override // defpackage.zd8
    public final tze q() {
        zd8 zd8Var = this.X;
        int i = oaf.a;
        return zd8Var.q();
    }

    @Override // defpackage.j6d
    public final long r() {
        zd8 zd8Var = this.X;
        int i = oaf.a;
        return zd8Var.r();
    }

    @Override // defpackage.zd8
    public final void s(long j, boolean z) {
        zd8 zd8Var = this.X;
        int i = oaf.a;
        zd8Var.s(j, z);
    }

    @Override // defpackage.j6d
    public final void t(long j) {
        zd8 zd8Var = this.X;
        int i = oaf.a;
        zd8Var.t(j);
    }
}
