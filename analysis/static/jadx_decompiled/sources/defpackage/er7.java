package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class er7 implements Serializable {
    public static final er7 Z = new er7(1.401298464324817E-45d, 1.401298464324817E-45d, 0.0d, 0.0f, 0.0f, 0.0f);
    public final float X;
    public final float Y;
    public final double a;
    public final double b;
    public final double c;
    public final float o;

    public er7(double d, double d2, double d3, float f, float f2, float f3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.o = f;
        this.X = f2;
        this.Y = f3;
    }

    public final boolean a() {
        return (this.a == 1.401298464324817E-45d || this.b == 1.401298464324817E-45d) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || er7.class != obj.getClass()) {
            return false;
        }
        er7 er7Var = (er7) obj;
        return Double.compare(er7Var.a, this.a) == 0 && Double.compare(er7Var.b, this.b) == 0 && Double.compare(er7Var.c, this.c) == 0 && Float.compare(er7Var.o, this.o) == 0 && Float.compare(er7Var.X, this.X) == 0 && Float.compare(er7Var.Y, this.Y) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        int i = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.c);
        int i2 = ((i * 31) + ((int) ((jDoubleToLongBits3 >>> 32) ^ jDoubleToLongBits3))) * 31;
        float f = this.o;
        int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.X;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.Y;
        return iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }

    public final String toString() {
        return "LocationData{latitude=" + this.a + ", longitude=" + this.b + ", altitude=" + this.c + ", accuracy=" + this.o + ", bearing=" + this.X + ", speed=" + this.Y + "}";
    }

    public er7(double d, double d2) {
        this.a = d;
        this.b = d2;
        this.c = 0.0d;
        this.o = 0.0f;
        this.X = 0.0f;
        this.Y = 0.0f;
    }
}
