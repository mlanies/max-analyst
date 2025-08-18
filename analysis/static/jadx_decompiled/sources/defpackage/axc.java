package defpackage;

/* loaded from: classes2.dex */
public final class axc {
    public final long a;
    public final long b;
    public final v5c c;

    public axc(long j, long j2, v5c v5cVar) {
        this.a = j;
        this.b = j2;
        this.c = v5cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axc)) {
            return false;
        }
        axc axcVar = (axc) obj;
        return this.a == axcVar.a && this.b == axcVar.b && tpa.f(this.c, axcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ReactionInfo(messageServerId=" + this.a + ", messageTime=" + this.b + ", reaction=" + ((Object) this.c) + ")";
    }
}
