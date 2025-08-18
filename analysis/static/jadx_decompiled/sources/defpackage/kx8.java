package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kx8 {
    public final List a;
    public final ix8 b;
    public final ex8 c;
    public final long d;

    public kx8(List list, ix8 ix8Var, ex8 ex8Var, long j) {
        this.a = list;
        this.b = ix8Var;
        this.c = ex8Var;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx8)) {
            return false;
        }
        kx8 kx8Var = (kx8) obj;
        return tpa.f(this.a, kx8Var.a) && tpa.f(this.b, kx8Var.b) && tpa.f(this.c, kx8Var.c) && this.d == kx8Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ix8 ix8Var = this.b;
        int iHashCode2 = (iHashCode + (ix8Var == null ? 0 : ix8Var.hashCode())) * 31;
        ex8 ex8Var = this.c;
        return Long.hashCode(this.d) + ((iHashCode2 + (ex8Var != null ? ex8Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MessageReactionsDetailedData(reactionEntries=" + this.a + ", reactionsInfo=" + this.b + ", yourReactionEntry=" + this.c + ", markerForNextQuery=" + this.d + ")";
    }
}
