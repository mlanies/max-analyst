package defpackage;

/* loaded from: classes2.dex */
public final class c6c {
    public final d6c a;
    public final v5c b;

    public c6c(d6c d6cVar, v5c v5cVar) {
        this.a = d6cVar;
        this.b = v5cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6c)) {
            return false;
        }
        c6c c6cVar = (c6c) obj;
        return this.a == c6cVar.a && tpa.f(this.b, c6cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReactionData(type=" + this.a + ", id=" + ((Object) this.b) + ")";
    }
}
