package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l13 implements u1d {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public l13(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // defpackage.u1d
    public final boolean c() {
        return true;
    }

    @Override // defpackage.u1d
    public final s1d e(long j) {
        long[] jArr = this.e;
        int iF = maf.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.c;
        y1d y1dVar = new y1d(j2, jArr2[iF]);
        if (j2 >= j || iF == this.a - 1) {
            return new s1d(y1dVar, y1dVar);
        }
        int i = iF + 1;
        return new s1d(y1dVar, new y1d(jArr[i], jArr2[i]));
    }

    @Override // defpackage.u1d
    public final long f() {
        return this.f;
    }

    public final String toString() {
        String string = Arrays.toString(this.b);
        String string2 = Arrays.toString(this.c);
        String string3 = Arrays.toString(this.e);
        String string4 = Arrays.toString(this.d);
        StringBuilder sb = new StringBuilder(rh4.e(rh4.e(rh4.e(rh4.e(71, string), string2), string3), string4));
        sb.append("ChunkIndex(length=");
        sb.append(this.a);
        sb.append(", sizes=");
        sb.append(string);
        sb.append(", offsets=");
        sb.append(string2);
        sb.append(", timeUs=");
        sb.append(string3);
        sb.append(", durationsUs=");
        return zr6.l(sb, string4, ")");
    }
}
