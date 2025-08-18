package defpackage;

/* loaded from: classes.dex */
public final class abf implements d2d {
    public final int X;
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long o;

    public abf(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.o = j2;
        this.X = i;
    }

    @Override // defpackage.d2d
    public final long a() {
        return this.o;
    }

    @Override // defpackage.d2d
    public final long b(long j) {
        return this.a[oaf.f(this.b, j, true)];
    }

    @Override // defpackage.v1d
    public final boolean c() {
        return true;
    }

    @Override // defpackage.v1d
    public final t1d e(long j) {
        long[] jArr = this.a;
        int iF = oaf.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.b;
        z1d z1dVar = new z1d(j2, jArr2[iF]);
        if (j2 >= j || iF == jArr.length - 1) {
            return new t1d(z1dVar, z1dVar);
        }
        int i = iF + 1;
        return new t1d(z1dVar, new z1d(jArr[i], jArr2[i]));
    }

    @Override // defpackage.v1d
    public final long f() {
        return this.c;
    }

    @Override // defpackage.d2d
    public final int h() {
        return this.X;
    }
}
