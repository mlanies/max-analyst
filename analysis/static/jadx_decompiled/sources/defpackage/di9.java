package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class di9 {
    public long[] a = new long[16];
    public int b;

    public final void a(long j) {
        int i = this.b + 1;
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.a;
        int i2 = this.b;
        jArr2[i2] = j;
        this.b = i2 + 1;
    }

    public final boolean b(long j) {
        int i;
        long[] jArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (j == jArr[i3]) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            return false;
        }
        if (i3 < 0 || i3 >= (i = this.b)) {
            StringBuilder sbN = rh4.n(i3, "Index ", " must be in 0..");
            sbN.append(this.b - 1);
            throw new IndexOutOfBoundsException(sbN.toString());
        }
        long[] jArr2 = this.a;
        long j2 = jArr2[i3];
        if (i3 != i - 1) {
            int i4 = i3 + 1;
            System.arraycopy(jArr2, i4, jArr2, i3, i - i4);
        }
        this.b--;
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof di9) {
            di9 di9Var = (di9) obj;
            int i = di9Var.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = di9Var.a;
                j37 j37VarY = ote.Y(0, i2);
                int i3 = j37VarY.a;
                int i4 = j37VarY.b;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }
}
