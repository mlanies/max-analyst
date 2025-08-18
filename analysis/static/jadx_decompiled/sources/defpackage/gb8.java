package defpackage;

/* loaded from: classes.dex */
public final class gb8 implements su0 {
    public static final gb8 Y = new gb8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    public final float X;
    public final long a;
    public final long b;
    public final long c;
    public final float o;

    public gb8(long j, long j2, long j3, float f, float f2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = f;
        this.X = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb8)) {
            return false;
        }
        gb8 gb8Var = (gb8) obj;
        return this.a == gb8Var.a && this.b == gb8Var.b && this.c == gb8Var.c && this.o == gb8Var.o && this.X == gb8Var.X;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.o;
        int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.X;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
