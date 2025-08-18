package defpackage;

/* loaded from: classes2.dex */
public final class ql1 {
    public final zad a;
    public final tad b;

    public ql1(zad zadVar, tad tadVar) {
        this.a = zadVar;
        this.b = tadVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql1)) {
            return false;
        }
        ql1 ql1Var = (ql1) obj;
        return tpa.f(this.a, ql1Var.a) && tpa.f(this.b, ql1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdatedParams(roomId=" + this.a + ", room=" + this.b + ")";
    }
}
