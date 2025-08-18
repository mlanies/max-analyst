package defpackage;

/* loaded from: classes.dex */
public final class g7b {
    public final String a;
    public final Long b;

    public g7b(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7b)) {
            return false;
        }
        g7b g7bVar = (g7b) obj;
        return tpa.f(this.a, g7bVar.a) && tpa.f(this.b, g7bVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
