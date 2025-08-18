package defpackage;

/* loaded from: classes2.dex */
public final class hk6 {
    public final int a;
    public final String b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public hk6(int i, String str, float f, float f2, float f3, float f4, float f5) {
        this.a = i;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk6)) {
            return false;
        }
        hk6 hk6Var = (hk6) obj;
        return this.a == hk6Var.a && tpa.f(this.b, hk6Var.b) && Float.compare(this.c, hk6Var.c) == 0 && Float.compare(this.d, hk6Var.d) == 0 && Float.compare(this.e, hk6Var.e) == 0 && Float.compare(this.f, hk6Var.f) == 0 && Float.compare(this.g, hk6Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + ms2.c(ms2.c(ms2.c(ms2.c(rh4.d(Integer.hashCode(this.a) * 31, 31, this.b), this.c, 31), this.d, 31), this.e, 31), this.f, 31);
    }

    public final String toString() {
        return "SelectedLineState(line=" + this.a + ", highlightText=" + this.b + ", textX=" + this.c + ", textY=" + this.d + ", baseLine=" + this.e + ", textWidth=" + this.f + ", textHeight=" + this.g + ")";
    }
}
