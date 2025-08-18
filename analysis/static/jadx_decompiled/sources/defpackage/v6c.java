package defpackage;

/* loaded from: classes2.dex */
public final class v6c {
    public final long a;
    public final String b;
    public final v5c c;

    public v6c(long j, v5c v5cVar, String str) {
        this.a = j;
        this.b = str;
        this.c = v5cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6c)) {
            return false;
        }
        v6c v6cVar = (v6c) obj;
        return this.a == v6cVar.a && tpa.f(this.b, v6cVar.b) && tpa.f(this.c, v6cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rh4.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "PlayingState(msgId=" + this.a + ", url=" + this.b + ", reaction=" + ((Object) this.c) + ")";
    }
}
