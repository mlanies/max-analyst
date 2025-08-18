package defpackage;

/* loaded from: classes2.dex */
public final class nl1 {
    public final zad a;
    public final tad b;

    public nl1(zad zadVar, tad tadVar) {
        this.a = zadVar;
        this.b = tadVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl1)) {
            return false;
        }
        nl1 nl1Var = (nl1) obj;
        return tpa.f(this.a, nl1Var.a) && tpa.f(this.b, nl1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tad tadVar = this.b;
        return iHashCode + (tadVar == null ? 0 : tadVar.hashCode());
    }

    public final String toString() {
        return "ActiveRoomChangedParams(roomId=" + this.a + ", room=" + this.b + ")";
    }
}
