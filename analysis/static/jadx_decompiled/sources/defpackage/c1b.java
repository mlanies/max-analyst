package defpackage;

/* loaded from: classes2.dex */
public final class c1b implements d1b {
    public final long a;
    public final jqe b;
    public final boolean c;

    public c1b(long j, iqe iqeVar, boolean z) {
        this.a = j;
        this.b = iqeVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1b)) {
            return false;
        }
        c1b c1bVar = (c1b) obj;
        return this.a == c1bVar.a && tpa.f(this.b, c1bVar.b) && this.c == c1bVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k7d.f(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "State(messageId=" + this.a + ", text=" + this.b + ", canClose=" + this.c + ")";
    }
}
