package defpackage;

/* loaded from: classes2.dex */
public final class pkf {
    public final int a;
    public final int b;
    public final int c;

    public pkf(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkf)) {
            return false;
        }
        pkf pkfVar = (pkf) obj;
        return this.a == pkfVar.a && this.b == pkfVar.b && this.c == pkfVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + s36.c(this.b, Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoQualityUpdate(maxBitrate=");
        sb.append(this.a);
        sb.append(", maxDimension=");
        sb.append(this.b);
        sb.append(", source=");
        return zr6.j(sb, this.c, ")");
    }
}
