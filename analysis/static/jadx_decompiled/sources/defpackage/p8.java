package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p8 implements su0 {
    public static final xw0 s0 = new xw0(16);
    public final long[] X;
    public final long Y;
    public final boolean Z;
    public final long a;
    public final int b;
    public final Uri[] c;
    public final int[] o;

    public p8(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        np8.d(iArr.length == uriArr.length);
        this.a = j;
        this.b = i;
        this.o = iArr;
        this.c = uriArr;
        this.X = jArr;
        this.Y = j2;
        this.Z = z;
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.o;
            if (i3 >= iArr.length || this.Z || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p8.class != obj.getClass()) {
            return false;
        }
        p8 p8Var = (p8) obj;
        return this.a == p8Var.a && this.b == p8Var.b && Arrays.equals(this.c, p8Var.c) && Arrays.equals(this.o, p8Var.o) && Arrays.equals(this.X, p8Var.X) && this.Y == p8Var.Y && this.Z == p8Var.Z;
    }

    public final int hashCode() {
        int i = this.b * 31;
        long j = this.a;
        int iHashCode = (Arrays.hashCode(this.X) + ((Arrays.hashCode(this.o) + ((((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.c)) * 31)) * 31)) * 31;
        long j2 = this.Y;
        return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.Z ? 1 : 0);
    }
}
