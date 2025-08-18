package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r8 implements su0 {
    public static final r8 Y = new r8(new p8[0], 0, -9223372036854775807L, 0);
    public static final p8 Z;
    public static final xw0 s0;
    public final p8[] X;
    public final int a;
    public final long b;
    public final long c;
    public final int o;

    static {
        int iMax = Math.max(0, 0);
        int[] iArrCopyOf = Arrays.copyOf(new int[0], iMax);
        Arrays.fill(iArrCopyOf, 0, iMax, 0);
        int iMax2 = Math.max(0, 0);
        long[] jArrCopyOf = Arrays.copyOf(new long[0], iMax2);
        Arrays.fill(jArrCopyOf, 0, iMax2, -9223372036854775807L);
        Z = new p8(0L, 0, iArrCopyOf, (Uri[]) Arrays.copyOf(new Uri[0], 0), jArrCopyOf, 0L, false);
        s0 = new xw0(15);
    }

    public r8(p8[] p8VarArr, long j, long j2, int i) {
        this.b = j;
        this.c = j2;
        this.a = p8VarArr.length + i;
        this.X = p8VarArr;
        this.o = i;
    }

    public final p8 a(int i) {
        int i2 = this.o;
        return i < i2 ? Z : this.X[i - i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8.class != obj.getClass()) {
            return false;
        }
        r8 r8Var = (r8) obj;
        return maf.a(null, null) && this.a == r8Var.a && this.b == r8Var.b && this.c == r8Var.c && this.o == r8Var.o && Arrays.equals(this.X, r8Var.X);
    }

    public final int hashCode() {
        return (((((((this.a * 961) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.o) * 31) + Arrays.hashCode(this.X);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.b);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            p8[] p8VarArr = this.X;
            if (i >= p8VarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(p8VarArr[i].a);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < p8VarArr[i].o.length; i2++) {
                sb.append("ad(state=");
                int i3 = p8VarArr[i].o[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(p8VarArr[i].X[i2]);
                sb.append(')');
                if (i2 < p8VarArr[i].o.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < p8VarArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
