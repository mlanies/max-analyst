package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class jp1 {
    public final nnf a;
    public final List b;
    public final w4f c;
    public final qd7 d;
    public final boolean e;
    public final md0 f;
    public final boolean g;

    public jp1(nnf nnfVar, List list, w4f w4fVar, qd7 qd7Var, boolean z, md0 md0Var, boolean z2) {
        this.a = nnfVar;
        this.b = list;
        this.c = w4fVar;
        this.d = qd7Var;
        this.e = z;
        this.f = md0Var;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp1)) {
            return false;
        }
        jp1 jp1Var = (jp1) obj;
        return this.a == jp1Var.a && tpa.f(this.b, jp1Var.b) && tpa.f(this.c, jp1Var.c) && tpa.f(this.d, jp1Var.d) && this.e == jp1Var.e && tpa.f(this.f, jp1Var.f) && this.g == jp1Var.g;
    }

    public final int hashCode() {
        int iG = k7d.g(this.b, this.a.hashCode() * 31, 31);
        w4f w4fVar = this.c;
        int iHashCode = (iG + (w4fVar == null ? 0 : w4fVar.hashCode())) * 31;
        qd7 qd7Var = this.d;
        int iD = ms2.d((iHashCode + (qd7Var == null ? 0 : qd7Var.hashCode())) * 31, 31, this.e);
        md0 md0Var = this.f;
        return Boolean.hashCode(this.g) + ((iD + (md0Var != null ? md0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallViewState(activeMode=");
        sb.append(this.a);
        sb.append(", modes=");
        sb.append(this.b);
        sb.append(", unavailableCallState=");
        sb.append(this.c);
        sb.append(", labelSpeakerState=");
        sb.append(this.d);
        sb.append(", isGroupCall=");
        sb.append(this.e);
        sb.append(", mainSpeakerAvatar=");
        sb.append(this.f);
        sb.append(", isCallEventsUnavailable=");
        return au1.j(sb, this.g, ")");
    }
}
