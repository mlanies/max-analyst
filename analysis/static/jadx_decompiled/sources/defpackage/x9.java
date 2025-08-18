package defpackage;

/* loaded from: classes2.dex */
public final class x9 implements s29 {
    public final v5c a;
    public final String b;
    public final long c;

    public x9(long j, v5c v5cVar, String str) {
        this.a = v5cVar;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9)) {
            return false;
        }
        x9 x9Var = (x9) obj;
        return tpa.f(this.a, x9Var.a) && tpa.f(this.b, x9Var.b) && this.c == x9Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rh4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddReactionEffect(reaction=");
        sb.append((Object) this.a);
        sb.append(", effectUrl=");
        sb.append(this.b);
        sb.append(", msgId=");
        return zr6.k(sb, this.c, ")");
    }
}
