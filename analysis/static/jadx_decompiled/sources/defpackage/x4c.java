package defpackage;

/* loaded from: classes.dex */
public final class x4c {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public x4c(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4c)) {
            return false;
        }
        x4c x4cVar = (x4c) obj;
        return this.a == x4cVar.a && this.b == x4cVar.b && this.c == x4cVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RateCallParams(threshold=");
        sb.append(this.a);
        sb.append(", sdkThreshold=");
        sb.append(this.b);
        sb.append(", minimumCallDuration=");
        return zr6.j(sb, this.c, ")");
    }
}
