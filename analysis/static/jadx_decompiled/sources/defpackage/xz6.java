package defpackage;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class xz6 implements d2d {
    public long X;
    public final long a;
    public final nv7 b;
    public final nv7 c;
    public final int o;

    public xz6(long j, long j2, long j3) {
        this.X = j;
        this.a = j3;
        nv7 nv7Var = new nv7(1);
        this.b = nv7Var;
        nv7 nv7Var2 = new nv7(1);
        this.c = nv7Var2;
        nv7Var.a(0L);
        nv7Var2.a(j2);
        int i = -2147483647;
        if (j == -9223372036854775807L) {
            this.o = -2147483647;
            return;
        }
        long jA0 = oaf.a0(j2 - j3, 8L, j, RoundingMode.HALF_UP);
        if (jA0 > 0 && jA0 <= 2147483647L) {
            i = (int) jA0;
        }
        this.o = i;
    }

    @Override // defpackage.d2d
    public final long a() {
        return this.a;
    }

    @Override // defpackage.d2d
    public final long b(long j) {
        return this.b.b(oaf.c(this.c, j));
    }

    @Override // defpackage.v1d
    public final boolean c() {
        return true;
    }

    public final boolean d(long j) {
        nv7 nv7Var = this.b;
        return j - nv7Var.b(nv7Var.b - 1) < 100000;
    }

    @Override // defpackage.v1d
    public final t1d e(long j) {
        nv7 nv7Var = this.b;
        int iC = oaf.c(nv7Var, j);
        long jB = nv7Var.b(iC);
        nv7 nv7Var2 = this.c;
        z1d z1dVar = new z1d(jB, nv7Var2.b(iC));
        if (jB == j || iC == nv7Var.b - 1) {
            return new t1d(z1dVar, z1dVar);
        }
        int i = iC + 1;
        return new t1d(z1dVar, new z1d(nv7Var.b(i), nv7Var2.b(i)));
    }

    @Override // defpackage.v1d
    public final long f() {
        return this.X;
    }

    @Override // defpackage.d2d
    public final int h() {
        return this.o;
    }
}
