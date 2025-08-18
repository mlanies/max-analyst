package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class nv7 {
    public final /* synthetic */ int a;
    public int b;
    public long[] c;

    public nv7(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = new long[32];
                break;
            default:
                this.c = new long[32];
                break;
        }
    }

    public final void a(long j) {
        switch (this.a) {
            case 0:
                int i = this.b;
                long[] jArr = this.c;
                if (i == jArr.length) {
                    this.c = Arrays.copyOf(jArr, i * 2);
                }
                long[] jArr2 = this.c;
                int i2 = this.b;
                this.b = i2 + 1;
                jArr2[i2] = j;
                break;
            default:
                int i3 = this.b;
                long[] jArr3 = this.c;
                if (i3 == jArr3.length) {
                    this.c = Arrays.copyOf(jArr3, i3 * 2);
                }
                long[] jArr4 = this.c;
                int i4 = this.b;
                this.b = i4 + 1;
                jArr4[i4] = j;
                break;
        }
    }

    public final long b(int i) {
        switch (this.a) {
            case 0:
                if (i >= 0 && i < this.b) {
                    return this.c[i];
                }
                int i2 = this.b;
                StringBuilder sb = new StringBuilder(46);
                sb.append("Invalid index ");
                sb.append(i);
                sb.append(", size is ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            default:
                if (i >= 0 && i < this.b) {
                    return this.c[i];
                }
                StringBuilder sbN = rh4.n(i, "Invalid index ", ", size is ");
                sbN.append(this.b);
                throw new IndexOutOfBoundsException(sbN.toString());
        }
    }
}
