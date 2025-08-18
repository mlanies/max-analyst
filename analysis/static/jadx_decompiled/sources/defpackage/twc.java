package defpackage;

/* loaded from: classes2.dex */
public final class twc {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public twc(long j, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twc)) {
            return false;
        }
        twc twcVar = (twc) obj;
        return this.a == twcVar.a && this.b == twcVar.b && this.c == twcVar.c && this.d == twcVar.d && this.e == twcVar.e && this.f == twcVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ms2.d(ms2.d(ms2.d(ms2.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollEvent(mark=");
        sb.append(this.a);
        sb.append(", isAlreadyLoaded=");
        sb.append(this.b);
        sb.append(", isSmoothScroll=");
        sb.append(this.c);
        sb.append(", alignToBottom=");
        sb.append(this.d);
        sb.append(", highlightScrollAnchor=");
        sb.append(this.e);
        sb.append(", approximateIndex=");
        return zr6.j(sb, this.f, ")");
    }
}
