package defpackage;

/* loaded from: classes2.dex */
public final class qd2 extends gle {
    public final Boolean X;
    public final long c;
    public final int o;

    public qd2(long j, int i, Boolean bool) {
        this.c = j;
        this.o = i;
        this.X = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd2)) {
            return false;
        }
        qd2 qd2Var = (qd2) obj;
        return this.c == qd2Var.c && this.o == qd2Var.o && tpa.f(this.X, qd2Var.X);
    }

    public final int hashCode() {
        int iE = k7d.e(this.o, Long.hashCode(this.c) * 31, 31);
        Boolean bool = this.X;
        return iE + (bool == null ? 0 : bool.hashCode());
    }

    @Override // defpackage.zje
    public final String toString() {
        return "Response(mark=" + this.c + ", unread=" + this.o + ", success=" + this.X + ")";
    }
}
