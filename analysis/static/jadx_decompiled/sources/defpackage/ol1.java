package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class ol1 {
    public final fg1 a;
    public final zad b;
    public final tad c;

    public ol1(fg1 fg1Var, zad zadVar, tad tadVar) {
        this.a = fg1Var;
        this.b = zadVar;
        this.c = tadVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol1)) {
            return false;
        }
        ol1 ol1Var = (ol1) obj;
        return tpa.f(this.a, ol1Var.a) && tpa.f(this.b, ol1Var.b) && tpa.f(this.c, ol1Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Objects.hashCode(this.a.a) * 31)) * 31;
        tad tadVar = this.c;
        return iHashCode + (tadVar == null ? 0 : tadVar.hashCode());
    }

    public final String toString() {
        return "InvitedParams(me=" + this.a + ", roomId=" + this.b + ", room=" + this.c + ")";
    }
}
