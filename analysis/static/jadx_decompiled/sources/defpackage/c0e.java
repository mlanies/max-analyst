package defpackage;

/* loaded from: classes2.dex */
public final class c0e {
    public final long a;
    public final int b;
    public final ms7 c;
    public final boolean d;

    public c0e(int i, long j, ms7 ms7Var, boolean z) {
        this.a = j;
        this.b = i;
        this.c = ms7Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0e)) {
            return false;
        }
        c0e c0eVar = (c0e) obj;
        return this.a == c0eVar.a && this.b == c0eVar.b && tpa.f(this.c, c0eVar.c) && this.d == c0eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ey8.g(this.b, Long.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatEntity(id=");
        sb.append(this.a);
        sb.append(", status=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "SENDING" : "WAITING");
        sb.append(", data=");
        sb.append(this.c);
        sb.append(", isCritical=");
        return au1.j(sb, this.d, ")");
    }
}
