package defpackage;

/* loaded from: classes.dex */
public final class q9g implements c2d {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public q9g(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.c2d
    public final long a() {
        return this.e;
    }

    @Override // defpackage.c2d
    public final long b(long j) {
        long j2 = j - this.a;
        if (!c() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.f;
        np8.g(jArr);
        double d = (j2 * 256.0d) / this.d;
        int iF = maf.f(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (iF * j3) / 100;
        long j5 = jArr[iF];
        int i = iF + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (iF == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.u1d
    public final boolean c() {
        return this.f != null;
    }

    @Override // defpackage.u1d
    public final s1d e(long j) {
        double d;
        boolean zC = c();
        int i = this.b;
        long j2 = this.a;
        if (!zC) {
            y1d y1dVar = new y1d(0L, j2 + i);
            return new s1d(y1dVar, y1dVar);
        }
        long jK = maf.k(j, 0L, this.c);
        double d2 = (jK * 100.0d) / this.c;
        double d3 = 0.0d;
        if (d2 <= 0.0d) {
            d = 256.0d;
        } else if (d2 >= 100.0d) {
            d = 256.0d;
            d3 = 256.0d;
        } else {
            int i2 = (int) d2;
            long[] jArr = this.f;
            np8.g(jArr);
            double d4 = jArr[i2];
            d3 = (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d4) * (d2 - i2)) + d4;
            d = 256.0d;
        }
        long j3 = this.d;
        y1d y1dVar2 = new y1d(jK, j2 + maf.k(Math.round((d3 / d) * j3), i, j3 - 1));
        return new s1d(y1dVar2, y1dVar2);
    }

    @Override // defpackage.u1d
    public final long f() {
        return this.c;
    }
}
