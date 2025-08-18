package defpackage;

/* loaded from: classes.dex */
public final class xja {
    public final float a;
    public final int b;

    public xja(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xja)) {
            return false;
        }
        xja xjaVar = (xja) obj;
        return Float.compare(this.a, xjaVar.a) == 0 && Float.compare(0.0f, 0.0f) == 0 && this.b == xjaVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + ms2.c(Float.hashCode(this.a) * 31, 0.0f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndicatorConfig(topCorners=");
        sb.append(this.a);
        sb.append(", bottomCorners=0.0, height=");
        return zr6.j(sb, this.b, ")");
    }
}
