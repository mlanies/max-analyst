package defpackage;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class dsf implements v1d {
    public final long X;
    public final bsf a;
    public final int b;
    public final long c;
    public final long o;

    public dsf(bsf bsfVar, int i, long j, long j2) {
        this.a = bsfVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / bsfVar.c;
        this.o = j3;
        this.X = d(j3);
    }

    @Override // defpackage.v1d
    public final boolean c() {
        return true;
    }

    public final long d(long j) {
        long j2 = j * this.b;
        long j3 = this.a.b;
        int i = oaf.a;
        return oaf.a0(j2, 1000000L, j3, RoundingMode.FLOOR);
    }

    @Override // defpackage.v1d
    public final t1d e(long j) {
        bsf bsfVar = this.a;
        long j2 = this.o;
        long jK = oaf.k((bsfVar.b * j) / (this.b * 1000000), 0L, j2 - 1);
        long j3 = this.c;
        long jD = d(jK);
        z1d z1dVar = new z1d(jD, (bsfVar.c * jK) + j3);
        if (jD >= j || jK == j2 - 1) {
            return new t1d(z1dVar, z1dVar);
        }
        long j4 = jK + 1;
        return new t1d(z1dVar, new z1d(d(j4), (bsfVar.c * j4) + j3));
    }

    @Override // defpackage.v1d
    public final long f() {
        return this.X;
    }
}
