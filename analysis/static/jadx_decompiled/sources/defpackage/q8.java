package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q8 {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final tb8[] e;
    public final int[] f;
    public final long[] g;
    public final long h;
    public final boolean i;

    static {
        int i = oaf.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
        q = Integer.toString(7, 36);
        r = Integer.toString(8, 36);
    }

    public q8(long j2, int i, int i2, int[] iArr, tb8[] tb8VarArr, long[] jArr, long j3, boolean z) {
        Uri uri;
        int i3 = 0;
        fm9.f(iArr.length == tb8VarArr.length);
        this.a = j2;
        this.b = i;
        this.c = i2;
        this.f = iArr;
        this.e = tb8VarArr;
        this.g = jArr;
        this.h = j3;
        this.i = z;
        this.d = new Uri[tb8VarArr.length];
        while (true) {
            Uri[] uriArr = this.d;
            if (i3 >= uriArr.length) {
                return;
            }
            tb8 tb8Var = tb8VarArr[i3];
            if (tb8Var == null) {
                uri = null;
            } else {
                ib8 ib8Var = tb8Var.b;
                ib8Var.getClass();
                uri = ib8Var.a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f;
            if (i3 >= iArr.length || this.i || (i2 = iArr[i3]) == 0 || i2 == 1) {
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
        if (obj == null || q8.class != obj.getClass()) {
            return false;
        }
        q8 q8Var = (q8) obj;
        return this.a == q8Var.a && this.b == q8Var.b && this.c == q8Var.c && Arrays.equals(this.e, q8Var.e) && Arrays.equals(this.f, q8Var.f) && Arrays.equals(this.g, q8Var.g) && this.h == q8Var.h && this.i == q8Var.i;
    }

    public final int hashCode() {
        int i = ((this.b * 31) + this.c) * 31;
        long j2 = this.a;
        int iHashCode = (Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j3 = this.h;
        return ((iHashCode + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.i ? 1 : 0);
    }
}
