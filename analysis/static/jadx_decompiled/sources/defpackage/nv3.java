package defpackage;

/* loaded from: classes.dex */
public final class nv3 {
    public final boolean a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final int f;

    public nv3(boolean z, int i, int i2, float f, float f2, int i3) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = f2;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv3)) {
            return false;
        }
        nv3 nv3Var = (nv3) obj;
        return this.a == nv3Var.a && this.b == nv3Var.b && this.c == nv3Var.c && Float.compare(this.d, nv3Var.d) == 0 && Float.compare(this.e, nv3Var.e) == 0 && this.f == nv3Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ms2.c(ms2.c(k7d.e(this.c, k7d.e(this.b, Boolean.hashCode(this.a) * 31, 31), 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        return "AnimationState(isVisible=" + this.a + ", totalHeight=" + this.b + ", directionY=" + this.c + ", offsetY=" + this.d + ", startY=" + this.e + ", inset=" + this.f + ")";
    }
}
