package defpackage;

/* loaded from: classes.dex */
public final class hcc {
    public final long a;
    public final jqe b;
    public final b7a c;

    public hcc(long j, eqe eqeVar, b7a b7aVar) {
        this.a = j;
        this.b = eqeVar;
        this.c = b7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcc)) {
            return false;
        }
        hcc hccVar = (hcc) obj;
        return this.a == hccVar.a && tpa.f(this.b, hccVar.b) && this.c == hccVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k7d.f(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ButtonState(id=" + this.a + ", textSource=" + this.b + ", mode=" + this.c + ")";
    }
}
