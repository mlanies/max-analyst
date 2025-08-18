package defpackage;

/* loaded from: classes2.dex */
public final class y22 extends wm9 {
    public final jqe b;
    public final jqe c;
    public final long d;

    public y22(eqe eqeVar, gqe gqeVar, long j) {
        super(e5f.a);
        this.b = eqeVar;
        this.c = gqeVar;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y22)) {
            return false;
        }
        y22 y22Var = (y22) obj;
        return tpa.f(this.b, y22Var.b) && tpa.f(this.c, y22Var.c) && this.d == y22Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + k7d.f(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowChangeOwnerBottomSheetEvent(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", contactId=");
        return zr6.k(sb, this.d, ")");
    }
}
