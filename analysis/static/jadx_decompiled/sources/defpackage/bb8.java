package defpackage;

/* loaded from: classes.dex */
public class bb8 {
    public static final bb8 h = new za8().a();
    public static final String i = Integer.toString(0, 36);
    public static final String j = Integer.toString(1, 36);
    public static final String k = Integer.toString(2, 36);
    public static final String l = Integer.toString(3, 36);
    public static final String m = Integer.toString(4, 36);
    public static final String n = Integer.toString(5, 36);
    public static final String o = Integer.toString(6, 36);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public bb8(za8 za8Var) {
        this.a = oaf.h0(za8Var.a);
        this.c = oaf.h0(za8Var.b);
        this.b = za8Var.a;
        this.d = za8Var.b;
        this.e = za8Var.c;
        this.f = za8Var.d;
        this.g = za8Var.e;
    }

    public final za8 a() {
        za8 za8Var = new za8();
        za8Var.a = this.b;
        za8Var.b = this.d;
        za8Var.c = this.e;
        za8Var.d = this.f;
        za8Var.e = this.g;
        return za8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb8)) {
            return false;
        }
        bb8 bb8Var = (bb8) obj;
        return this.b == bb8Var.b && this.d == bb8Var.d && this.e == bb8Var.e && this.f == bb8Var.f && this.g == bb8Var.g;
    }

    public final int hashCode() {
        long j2 = this.b;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.d;
        return ((((((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
