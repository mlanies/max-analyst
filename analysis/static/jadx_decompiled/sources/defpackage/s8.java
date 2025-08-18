package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s8 {
    public static final s8 g = new s8(new q8[0], 0, -9223372036854775807L, 0);
    public static final q8 h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public final Object a = null;
    public final int b;
    public final long c;
    public final long d;
    public final int e;
    public final q8[] f;

    static {
        q8 q8Var = new q8(0L, -1, -1, new int[0], new tb8[0], new long[0], 0L, false);
        int[] iArr = q8Var.f;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = q8Var.g;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        h = new q8(q8Var.a, 0, q8Var.c, iArrCopyOf, (tb8[]) Arrays.copyOf(q8Var.e, 0), jArrCopyOf, q8Var.h, q8Var.i);
        int i2 = oaf.a;
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
    }

    public s8(q8[] q8VarArr, long j2, long j3, int i2) {
        this.c = j2;
        this.d = j3;
        this.b = q8VarArr.length + i2;
        this.f = q8VarArr;
        this.e = i2;
    }

    public final q8 a(int i2) {
        int i3 = this.e;
        return i2 < i3 ? h : this.f[i2 - i3];
    }

    public final boolean b(int i2) {
        if (i2 == this.b - 1) {
            q8 q8VarA = a(i2);
            if (q8VarA.i && q8VarA.a == Long.MIN_VALUE && q8VarA.b == -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s8.class != obj.getClass()) {
            return false;
        }
        s8 s8Var = (s8) obj;
        return oaf.a(this.a, s8Var.a) && this.b == s8Var.b && this.c == s8Var.c && this.d == s8Var.d && this.e == s8Var.e && Arrays.equals(this.f, s8Var.f);
    }

    public final int hashCode() {
        int i2 = this.b * 31;
        Object obj = this.a;
        return Arrays.hashCode(this.f) + ((((((((i2 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.a);
        sb.append(", adResumePositionUs=");
        sb.append(this.c);
        sb.append(", adGroups=[");
        int i2 = 0;
        while (true) {
            q8[] q8VarArr = this.f;
            if (i2 >= q8VarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(q8VarArr[i2].a);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < q8VarArr[i2].f.length; i3++) {
                sb.append("ad(state=");
                int i4 = q8VarArr[i2].f[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(q8VarArr[i2].g[i3]);
                sb.append(')');
                if (i3 < q8VarArr[i2].f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < q8VarArr.length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }
}
