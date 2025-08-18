package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class tad {
    public final yad a;
    public final String b;
    public final boolean c;
    public final int d;
    public final List e;
    public final bg1 f;
    public final Long g;

    public tad(int i, bg1 bg1Var, yad yadVar, Long l, String str, List list, boolean z) {
        this.a = yadVar;
        this.b = str;
        this.c = z;
        this.d = i;
        this.e = list;
        this.f = bg1Var;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tad)) {
            return false;
        }
        tad tadVar = (tad) obj;
        return tpa.f(this.a, tadVar.a) && tpa.f(this.b, tadVar.b) && this.c == tadVar.c && this.d == tadVar.d && tpa.f(this.e, tadVar.e) && tpa.f(this.f, tadVar.f) && tpa.f(this.g, tadVar.g);
    }

    public final int hashCode() {
        int iC = s36.c(this.d, ms2.d(rh4.d(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c));
        List list = this.e;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        bg1 bg1Var = this.f;
        int iHashCode2 = (iHashCode + (bg1Var == null ? 0 : bg1Var.hashCode())) * 31;
        Long l = this.g;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionRoom(id=" + this.a + ", name=" + this.b + ", isActive=" + this.c + ", participantCount=" + this.d + ", participantIds=" + this.e + ", pinnedParticipantId=" + this.f + ", timeoutMs=" + this.g + ")";
    }
}
