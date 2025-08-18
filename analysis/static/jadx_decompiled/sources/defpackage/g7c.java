package defpackage;

/* loaded from: classes2.dex */
public final class g7c {
    public final v5c a;
    public final long b;
    public final long c;
    public final ix8 d;

    public g7c(v5c v5cVar, long j, long j2, ix8 ix8Var) {
        this.a = v5cVar;
        this.b = j;
        this.c = j2;
        this.d = ix8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7c)) {
            return false;
        }
        g7c g7cVar = (g7c) obj;
        return tpa.f(this.a, g7cVar.a) && this.b == g7cVar.b && this.c == g7cVar.c && tpa.f(this.d, g7cVar.d);
    }

    public final int hashCode() {
        int iM = h4f.m(h4f.m(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ix8 ix8Var = this.d;
        return iM + (ix8Var == null ? 0 : ix8Var.hashCode());
    }

    public final String toString() {
        return "SelfReactionData(selfReaction=" + ((Object) this.a) + ", msgLocalId=" + this.b + ", msgServerId=" + this.c + ", reactions=" + this.d + ")";
    }
}
