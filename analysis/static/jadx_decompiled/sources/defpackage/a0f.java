package defpackage;

/* loaded from: classes.dex */
public final class a0f {
    public final kze a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public a0f(kze kzeVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        fm9.f(iArr.length == jArr2.length);
        fm9.f(jArr.length == jArr2.length);
        fm9.f(iArr2.length == jArr2.length);
        this.a = kzeVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        for (int iB = oaf.b(jArr, j, true); iB < jArr.length; iB++) {
            if ((this.g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }
}
