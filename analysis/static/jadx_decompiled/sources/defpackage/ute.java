package defpackage;

/* loaded from: classes.dex */
public final class ute implements zd8, xd8 {
    public final zd8 a;
    public final long b;
    public xd8 c;

    public ute(zd8 zd8Var, long j) {
        this.a = zd8Var;
        this.b = j;
    }

    @Override // defpackage.j6d
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.xd8
    public final void e(zd8 zd8Var) {
        xd8 xd8Var = this.c;
        xd8Var.getClass();
        xd8Var.e(this);
    }

    @Override // defpackage.j6d
    public final long f() {
        long jF = this.a.f();
        if (jF == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + jF;
    }

    @Override // defpackage.zd8
    public final long g(n85[] n85VarArr, boolean[] zArr, grc[] grcVarArr, boolean[] zArr2, long j) {
        grc[] grcVarArr2 = new grc[grcVarArr.length];
        int i = 0;
        while (true) {
            grc grcVar = null;
            if (i >= grcVarArr.length) {
                break;
            }
            tte tteVar = (tte) grcVarArr[i];
            if (tteVar != null) {
                grcVar = tteVar.a;
            }
            grcVarArr2[i] = grcVar;
            i++;
        }
        long j2 = this.b;
        long jG = this.a.g(n85VarArr, zArr, grcVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < grcVarArr.length; i2++) {
            grc grcVar2 = grcVarArr2[i2];
            if (grcVar2 == null) {
                grcVarArr[i2] = null;
            } else {
                grc grcVar3 = grcVarArr[i2];
                if (grcVar3 == null || ((tte) grcVar3).a != grcVar2) {
                    grcVarArr[i2] = new tte(grcVar2, j2);
                }
            }
        }
        return jG + j2;
    }

    @Override // defpackage.zd8
    public final long h(long j, x1d x1dVar) {
        long j2 = this.b;
        return this.a.h(j - j2, x1dVar) + j2;
    }

    @Override // defpackage.zd8
    public final void i(xd8 xd8Var, long j) {
        this.c = xd8Var;
        this.a.i(this, j - this.b);
    }

    @Override // defpackage.h6d
    public final void j(j6d j6dVar) {
        xd8 xd8Var = this.c;
        xd8Var.getClass();
        xd8Var.j(this);
    }

    @Override // defpackage.zd8
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.zd8
    public final long l(long j) {
        long j2 = this.b;
        return this.a.l(j - j2) + j2;
    }

    @Override // defpackage.zd8
    public final long n() {
        long jN = this.a.n();
        if (jN == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.b + jN;
    }

    @Override // defpackage.j6d
    public final boolean o(qo7 qo7Var) {
        po7 po7Var = new po7();
        po7Var.b = qo7Var.b;
        po7Var.c = qo7Var.c;
        po7Var.a = qo7Var.a - this.b;
        return this.a.o(new qo7(po7Var));
    }

    @Override // defpackage.zd8
    public final tze q() {
        return this.a.q();
    }

    @Override // defpackage.j6d
    public final long r() {
        long jR = this.a.r();
        if (jR == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + jR;
    }

    @Override // defpackage.zd8
    public final void s(long j, boolean z) {
        this.a.s(j - this.b, z);
    }

    @Override // defpackage.j6d
    public final void t(long j) {
        this.a.t(j - this.b);
    }
}
