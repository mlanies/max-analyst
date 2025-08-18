package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class hb8 {
    public static final hb8 f = new fb8().a();
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        int i2 = oaf.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public hb8(fb8 fb8Var) {
        long j2 = fb8Var.a;
        long j3 = fb8Var.b;
        long j4 = fb8Var.c;
        float f2 = fb8Var.d;
        float f3 = fb8Var.e;
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = f2;
        this.e = f3;
    }

    public static hb8 b(Bundle bundle) {
        fb8 fb8Var = new fb8();
        hb8 hb8Var = f;
        fb8Var.a = bundle.getLong(g, hb8Var.a);
        fb8Var.b = bundle.getLong(h, hb8Var.b);
        fb8Var.c = bundle.getLong(i, hb8Var.c);
        fb8Var.d = bundle.getFloat(j, hb8Var.d);
        fb8Var.e = bundle.getFloat(k, hb8Var.e);
        return new hb8(fb8Var);
    }

    public final fb8 a() {
        fb8 fb8Var = new fb8();
        fb8Var.a = this.a;
        fb8Var.b = this.b;
        fb8Var.c = this.c;
        fb8Var.d = this.d;
        fb8Var.e = this.e;
        return fb8Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        hb8 hb8Var = f;
        long j2 = hb8Var.a;
        long j3 = this.a;
        if (j3 != j2) {
            bundle.putLong(g, j3);
        }
        long j4 = hb8Var.b;
        long j5 = this.b;
        if (j5 != j4) {
            bundle.putLong(h, j5);
        }
        long j6 = hb8Var.c;
        long j7 = this.c;
        if (j7 != j6) {
            bundle.putLong(i, j7);
        }
        float f2 = hb8Var.d;
        float f3 = this.d;
        if (f3 != f2) {
            bundle.putFloat(j, f3);
        }
        float f4 = hb8Var.e;
        float f5 = this.e;
        if (f5 != f4) {
            bundle.putFloat(k, f5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb8)) {
            return false;
        }
        hb8 hb8Var = (hb8) obj;
        return this.a == hb8Var.a && this.b == hb8Var.b && this.c == hb8Var.c && this.d == hb8Var.d && this.e == hb8Var.e;
    }

    public final int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.c;
        int i3 = (i2 + ((int) ((j4 >>> 32) ^ j4))) * 31;
        float f2 = this.d;
        int iFloatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.e;
        return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }
}
