package defpackage;

/* loaded from: classes.dex */
public final class r9g implements d2d {
    public final long X;
    public final long Y;
    public final long[] Z;
    public final long a;
    public final int b;
    public final long c;
    public final int o;

    public r9g(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.o = i2;
        this.X = j3;
        this.Z = jArr;
        this.Y = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.d2d
    public final long a() {
        return this.Y;
    }

    @Override // defpackage.d2d
    public final long b(long j) {
        long j2 = j - this.a;
        if (!c() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.Z;
        fm9.l(jArr);
        double d = (j2 * 256.0d) / this.X;
        int iF = oaf.f(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (iF * j3) / 100;
        long j5 = jArr[iF];
        int i = iF + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (iF == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.v1d
    public final boolean c() {
        return this.Z != null;
    }

    @Override // defpackage.v1d
    public final t1d e(long j) {
        double d;
        boolean zC = c();
        int i = this.b;
        long j2 = this.a;
        if (!zC) {
            z1d z1dVar = new z1d(0L, j2 + i);
            return new t1d(z1dVar, z1dVar);
        }
        long jK = oaf.k(j, 0L, this.c);
        double d2 = (jK * 100.0d) / this.c;
        double d3 = 0.0d;
        if (d2 <= 0.0d) {
            d = 256.0d;
        } else if (d2 >= 100.0d) {
            d = 256.0d;
            d3 = 256.0d;
        } else {
            int i2 = (int) d2;
            long[] jArr = this.Z;
            fm9.l(jArr);
            double d4 = jArr[i2];
            d3 = (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d4) * (d2 - i2)) + d4;
            d = 256.0d;
        }
        long j3 = this.X;
        z1d z1dVar2 = new z1d(jK, j2 + oaf.k(Math.round((d3 / d) * j3), i, j3 - 1));
        return new t1d(z1dVar2, z1dVar2);
    }

    @Override // defpackage.v1d
    public final long f() {
        return this.c;
    }

    @Override // defpackage.d2d
    public final int h() {
        return this.o;
    }
}
