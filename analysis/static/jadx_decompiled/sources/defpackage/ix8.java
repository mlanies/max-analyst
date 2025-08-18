package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ix8 {
    public final List a;
    public final int b;
    public final c6c c;

    public ix8(List list, int i, c6c c6cVar) {
        this.a = list;
        this.b = i;
        this.c = c6cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix8)) {
            return false;
        }
        ix8 ix8Var = (ix8) obj;
        return tpa.f(this.a, ix8Var.a) && this.b == ix8Var.b && tpa.f(this.c, ix8Var.c);
    }

    public final int hashCode() {
        int iE = k7d.e(this.b, this.a.hashCode() * 31, 31);
        c6c c6cVar = this.c;
        return iE + (c6cVar == null ? 0 : c6cVar.hashCode());
    }

    public final String toString() {
        return "MessageReactionsData(reactions=" + this.a + ", totalCount=" + this.b + ", yourReaction=" + this.c + ")";
    }
}
