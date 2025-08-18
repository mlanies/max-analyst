package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hq0 extends gle {
    public final qzd X;
    public final List c;
    public final wm3 o;

    public hq0(List list, wm3 wm3Var, qzd qzdVar) {
        this.c = list;
        this.o = wm3Var;
        this.X = qzdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq0)) {
            return false;
        }
        hq0 hq0Var = (hq0) obj;
        return tpa.f(this.c, hq0Var.c) && tpa.f(this.o, hq0Var.o) && tpa.f(this.X, hq0Var.X);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        wm3 wm3Var = this.o;
        int iHashCode2 = (iHashCode + (wm3Var == null ? 0 : wm3Var.hashCode())) * 31;
        qzd qzdVar = this.X;
        return iHashCode2 + (qzdVar != null ? qzdVar.hashCode() : 0);
    }

    @Override // defpackage.zje
    public final String toString() {
        return "Response(botCommands=" + this.c + ", contact=" + this.o + ", startMessage=" + this.X + ")";
    }
}
