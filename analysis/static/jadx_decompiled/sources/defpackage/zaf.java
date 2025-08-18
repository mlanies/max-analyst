package defpackage;

/* loaded from: classes.dex */
public final class zaf implements c2d {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public zaf(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.c2d
    public final long a() {
        return this.d;
    }

    @Override // defpackage.c2d
    public final long b(long j) {
        return this.a[maf.f(this.b, j, true)];
    }

    @Override // defpackage.u1d
    public final boolean c() {
        return true;
    }

    @Override // defpackage.u1d
    public final s1d e(long j) {
        long[] jArr = this.a;
        int iF = maf.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.b;
        y1d y1dVar = new y1d(j2, jArr2[iF]);
        if (j2 >= j || iF == jArr.length - 1) {
            return new s1d(y1dVar, y1dVar);
        }
        int i = iF + 1;
        return new s1d(y1dVar, new y1d(jArr[i], jArr2[i]));
    }

    @Override // defpackage.u1d
    public final long f() {
        return this.c;
    }
}
