package defpackage;

/* loaded from: classes.dex */
public final class jlf {
    public static final jlf e = new jlf(0, 0);
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    static {
        int i2 = oaf.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
    }

    public jlf(int i2, int i3) {
        this(1.0f, i2, i3, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlf)) {
            return false;
        }
        jlf jlfVar = (jlf) obj;
        return this.a == jlfVar.a && this.b == jlfVar.b && this.c == jlfVar.c && this.d == jlfVar.d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31);
    }

    public jlf(float f2, int i2, int i3, int i4) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = f2;
    }
}
