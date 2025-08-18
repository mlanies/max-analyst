package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i63 {
    public static final i63 h = new i63(1, 2, 3, -1, -1, null);
    public static final i63 i = new i63(1, 1, 2, -1, -1, null);
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        int i2 = oaf.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
    }

    public i63(int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = bArr;
        this.e = i5;
        this.f = i6;
    }

    public static String b(int i2) {
        return i2 != -1 ? i2 != 1 ? i2 != 2 ? zr6.h(i2, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String c(int i2) {
        return i2 != -1 ? i2 != 6 ? i2 != 1 ? i2 != 2 ? zr6.h(i2, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String d(int i2) {
        return i2 != -1 ? i2 != 10 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 6 ? i2 != 7 ? zr6.h(i2, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean f(i63 i63Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i63Var == null) {
            return true;
        }
        int i6 = i63Var.a;
        return (i6 == -1 || i6 == 1 || i6 == 2) && ((i2 = i63Var.b) == -1 || i2 == 2) && (((i3 = i63Var.c) == -1 || i3 == 3) && i63Var.d == null && (((i4 = i63Var.f) == -1 || i4 == 8) && ((i5 = i63Var.e) == -1 || i5 == 8)));
    }

    public static boolean g(i63 i63Var) {
        int i2;
        return i63Var != null && ((i2 = i63Var.c) == 7 || i2 == 6);
    }

    public static int h(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int i(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final g63 a() {
        g63 g63Var = new g63();
        g63Var.a = this.a;
        g63Var.b = this.b;
        g63Var.c = this.c;
        g63Var.d = this.d;
        g63Var.e = this.e;
        g63Var.f = this.f;
        return g63Var;
    }

    public final boolean e() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i63.class != obj.getClass()) {
            return false;
        }
        i63 i63Var = (i63) obj;
        return this.a == i63Var.a && this.b == i63Var.b && this.c == i63Var.c && Arrays.equals(this.d, i63Var.d) && this.e == i63Var.e && this.f == i63Var.f;
    }

    public final int hashCode() {
        if (this.g == 0) {
            this.g = ((((Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        }
        return this.g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(c(this.a));
        sb.append(", ");
        sb.append(b(this.b));
        sb.append(", ");
        sb.append(d(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        String str2 = "NA";
        int i2 = this.e;
        if (i2 != -1) {
            str = i2 + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i3 = this.f;
        if (i3 != -1) {
            str2 = i3 + "bit Chroma";
        }
        return zr6.l(sb, str2, ")");
    }
}
