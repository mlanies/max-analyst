package defpackage;

/* loaded from: classes2.dex */
public final class l5e {
    public final String a;
    public final long b;

    public /* synthetic */ l5e(String str, int i) {
        this((i & 1) != 0 ? null : str, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5e)) {
            return false;
        }
        l5e l5eVar = (l5e) obj;
        return tpa.f(this.a, l5eVar.a) && this.b == l5eVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Long.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryState(query=");
        sb.append(this.a);
        sb.append(", marker=");
        return zr6.k(sb, this.b, ")");
    }

    public l5e(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
