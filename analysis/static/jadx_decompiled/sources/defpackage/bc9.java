package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final class bc9 implements c2d {
    public final long[] a;
    public final long[] b;
    public final long c;

    public bc9(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? maf.D(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair d(long j, long[] jArr, long[] jArr2) {
        int iF = maf.f(jArr, j, true);
        long j2 = jArr[iF];
        long j3 = jArr2[iF];
        int i = iF + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.c2d
    public final long a() {
        return -1L;
    }

    @Override // defpackage.c2d
    public final long b(long j) {
        return maf.D(((Long) d(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.u1d
    public final boolean c() {
        return true;
    }

    @Override // defpackage.u1d
    public final s1d e(long j) {
        Pair pairD = d(maf.M(maf.k(j, 0L, this.c)), this.b, this.a);
        y1d y1dVar = new y1d(maf.D(((Long) pairD.first).longValue()), ((Long) pairD.second).longValue());
        return new s1d(y1dVar, y1dVar);
    }

    @Override // defpackage.u1d
    public final long f() {
        return this.c;
    }
}
