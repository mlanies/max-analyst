package defpackage;

/* loaded from: classes.dex */
public final class w1b {
    public static final w1b e = new w1b(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public w1b(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1b)) {
            return false;
        }
        w1b w1bVar = (w1b) obj;
        return Float.compare(this.a, w1bVar.a) == 0 && Float.compare(this.b, w1bVar.b) == 0 && Float.compare(this.c, w1bVar.c) == 0 && Float.compare(this.d, w1bVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ms2.c(ms2.c(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "PipBounds(maxLeftOffset=" + this.a + ", maxRightOffset=" + this.b + ", maxTopOffset=" + this.c + ", maxBottomOffset=" + this.d + ")";
    }
}
