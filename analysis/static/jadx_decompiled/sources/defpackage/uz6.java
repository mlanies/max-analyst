package defpackage;

/* loaded from: classes.dex */
public final class uz6 implements u1d {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public uz6(long j, long[] jArr, long[] jArr2) {
        np8.d(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.c = j;
    }

    @Override // defpackage.u1d
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.u1d
    public final s1d e(long j) {
        if (!this.d) {
            y1d y1dVar = y1d.c;
            return new s1d(y1dVar, y1dVar);
        }
        long[] jArr = this.b;
        int iF = maf.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.a;
        y1d y1dVar2 = new y1d(j2, jArr2[iF]);
        if (j2 == j || iF == jArr.length - 1) {
            return new s1d(y1dVar2, y1dVar2);
        }
        int i = iF + 1;
        return new s1d(y1dVar2, new y1d(jArr[i], jArr2[i]));
    }

    @Override // defpackage.u1d
    public final long f() {
        return this.c;
    }
}
