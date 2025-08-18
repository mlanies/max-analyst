package defpackage;

/* loaded from: classes.dex */
public final class wz6 implements c2d {
    public final long a;
    public final nv7 b;
    public final nv7 c;
    public long d;

    public wz6(long j, long j2, long j3) {
        this.d = j;
        this.a = j3;
        nv7 nv7Var = new nv7(0);
        this.b = nv7Var;
        nv7 nv7Var2 = new nv7(0);
        this.c = nv7Var2;
        nv7Var.a(0L);
        nv7Var2.a(j2);
    }

    @Override // defpackage.c2d
    public final long a() {
        return this.a;
    }

    @Override // defpackage.c2d
    public final long b(long j) {
        return this.b.b(maf.d(this.c, j));
    }

    @Override // defpackage.u1d
    public final boolean c() {
        return true;
    }

    public final boolean d(long j) {
        nv7 nv7Var = this.b;
        return j - nv7Var.b(nv7Var.b - 1) < 100000;
    }

    @Override // defpackage.u1d
    public final s1d e(long j) {
        nv7 nv7Var = this.b;
        int iD = maf.d(nv7Var, j);
        long jB = nv7Var.b(iD);
        nv7 nv7Var2 = this.c;
        y1d y1dVar = new y1d(jB, nv7Var2.b(iD));
        if (jB == j || iD == nv7Var.b - 1) {
            return new s1d(y1dVar, y1dVar);
        }
        int i = iD + 1;
        return new s1d(y1dVar, new y1d(nv7Var.b(i), nv7Var2.b(i)));
    }

    @Override // defpackage.u1d
    public final long f() {
        return this.d;
    }
}
