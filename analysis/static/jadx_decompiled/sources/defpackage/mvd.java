package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class mvd {
    public final List a;
    public final zx7 b;
    public final qma c;

    public mvd(List list, zx7 zx7Var, qma qmaVar) {
        this.a = list;
        this.b = zx7Var;
        this.c = qmaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvd)) {
            return false;
        }
        mvd mvdVar = (mvd) obj;
        return tpa.f(this.a, mvdVar.a) && tpa.f(this.b, mvdVar.b) && tpa.f(this.c, mvdVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zx7 zx7Var = this.b;
        int iHashCode2 = (iHashCode + (zx7Var == null ? 0 : zx7Var.hashCode())) * 31;
        qma qmaVar = this.c;
        return iHashCode2 + (qmaVar != null ? qmaVar.hashCode() : 0);
    }

    public final String toString() {
        return "SpeakerModeState(opponentsPages=" + this.a + ", mainOpponentState=" + this.b + ", opponentPipState=" + this.c + ")";
    }
}
