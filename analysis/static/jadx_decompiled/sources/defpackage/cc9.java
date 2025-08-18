package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final class cc9 implements d2d {
    public final long[] a;
    public final long[] b;
    public final long c;

    public cc9(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? oaf.S(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair d(long j, long[] jArr, long[] jArr2) {
        int iF = oaf.f(jArr, j, true);
        long j2 = jArr[iF];
        long j3 = jArr2[iF];
        int i = iF + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.d2d
    public final long a() {
        return -1L;
    }

    @Override // defpackage.d2d
    public final long b(long j) {
        return oaf.S(((Long) d(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.v1d
    public final boolean c() {
        return true;
    }

    @Override // defpackage.v1d
    public final t1d e(long j) {
        Pair pairD = d(oaf.h0(oaf.k(j, 0L, this.c)), this.b, this.a);
        z1d z1dVar = new z1d(oaf.S(((Long) pairD.first).longValue()), ((Long) pairD.second).longValue());
        return new t1d(z1dVar, z1dVar);
    }

    @Override // defpackage.v1d
    public final long f() {
        return this.c;
    }

    @Override // defpackage.d2d
    public final int h() {
        return -2147483647;
    }
}
