package defpackage;

/* loaded from: classes2.dex */
public final class hv0 {
    public final Integer a;
    public final int b;

    public hv0(int i, Integer num) {
        this.a = num;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv0)) {
            return false;
        }
        hv0 hv0Var = (hv0) obj;
        return tpa.f(this.a, hv0Var.a) && this.b == hv0Var.b;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Integer.hashCode(this.b) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "BackgroundColors(color=" + this.a + ", rippleColor=" + this.b + ")";
    }
}
