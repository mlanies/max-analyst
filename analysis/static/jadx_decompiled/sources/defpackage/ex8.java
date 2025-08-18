package defpackage;

/* loaded from: classes2.dex */
public final class ex8 {
    public final long a;
    public final v5c b;

    public ex8(long j, v5c v5cVar) {
        this.a = j;
        this.b = v5cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex8)) {
            return false;
        }
        ex8 ex8Var = (ex8) obj;
        return this.a == ex8Var.a && tpa.f(this.b, ex8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MessageReactionEntryData(userId=" + this.a + ", reaction=" + ((Object) this.b) + ")";
    }
}
