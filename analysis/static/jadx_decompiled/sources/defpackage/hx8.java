package defpackage;

/* loaded from: classes2.dex */
public final class hx8 {
    public final c6c a;
    public final int b;

    public hx8(c6c c6cVar, int i) {
        this.a = c6cVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx8)) {
            return false;
        }
        hx8 hx8Var = (hx8) obj;
        return tpa.f(this.a, hx8Var.a) && this.b == hx8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MessageReactionWithCount(reaction=" + this.a + ", count=" + this.b + ")";
    }
}
