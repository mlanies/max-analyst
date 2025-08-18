package defpackage;

/* loaded from: classes.dex */
public final class csf implements u1d {
    public final bsf a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public csf(bsf bsfVar, int i, long j, long j2) {
        this.a = bsfVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / bsfVar.c;
        this.d = j3;
        this.e = maf.J(j3 * i, 1000000L, bsfVar.b);
    }

    @Override // defpackage.u1d
    public final boolean c() {
        return true;
    }

    @Override // defpackage.u1d
    public final s1d e(long j) {
        bsf bsfVar = this.a;
        int i = this.b;
        long j2 = (bsfVar.b * j) / (i * 1000000);
        long j3 = this.d - 1;
        long jK = maf.k(j2, 0L, j3);
        int i2 = bsfVar.c;
        long j4 = this.c;
        long J = maf.J(jK * i, 1000000L, bsfVar.b);
        y1d y1dVar = new y1d(J, (i2 * jK) + j4);
        if (J >= j || jK == j3) {
            return new s1d(y1dVar, y1dVar);
        }
        long j5 = jK + 1;
        return new s1d(y1dVar, new y1d(maf.J(j5 * i, 1000000L, bsfVar.b), (i2 * j5) + j4));
    }

    @Override // defpackage.u1d
    public final long f() {
        return this.e;
    }
}
