package defpackage;

/* loaded from: classes2.dex */
public final class h2b implements l2b {
    public final CharSequence a;
    public final long b;

    public h2b(CharSequence charSequence, long j) {
        this.a = charSequence;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2b)) {
            return false;
        }
        h2b h2bVar = (h2b) obj;
        return tpa.f(this.a, h2bVar.a) && this.b == h2bVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Abbreviation(abbreviation=" + ((Object) this.a) + ", avatarSourceId=" + this.b + ")";
    }
}
