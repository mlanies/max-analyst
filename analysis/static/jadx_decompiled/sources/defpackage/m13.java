package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m13 implements v1d {
    public final long[] X;
    public final long Y;
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] o;

    public m13(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.o = jArr2;
        this.X = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.Y = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.Y = 0L;
        }
    }

    @Override // defpackage.v1d
    public final boolean c() {
        return true;
    }

    @Override // defpackage.v1d
    public final t1d e(long j) {
        long[] jArr = this.X;
        int iF = oaf.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.c;
        z1d z1dVar = new z1d(j2, jArr2[iF]);
        if (j2 >= j || iF == this.a - 1) {
            return new t1d(z1dVar, z1dVar);
        }
        int i = iF + 1;
        return new t1d(z1dVar, new z1d(jArr[i], jArr2[i]));
    }

    @Override // defpackage.v1d
    public final long f() {
        return this.Y;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.X) + ", durationsUs=" + Arrays.toString(this.o) + ")";
    }
}
