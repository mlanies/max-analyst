package defpackage;

/* loaded from: classes2.dex */
public final class c6e {
    public final long a;
    public final String b;

    public c6e(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6e)) {
            return false;
        }
        c6e c6eVar = (c6e) obj;
        return this.a == c6eVar.a && tpa.f(this.b, c6eVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryState(marker=");
        sb.append(this.a);
        sb.append(", query=");
        return zr6.l(sb, this.b, ")");
    }

    public /* synthetic */ c6e(String str, int i) {
        this(0L, (i & 2) != 0 ? null : str);
    }
}
