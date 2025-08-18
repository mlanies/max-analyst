package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kl1 {
    public final yad a;
    public final String b;
    public final boolean c;
    public final List d;
    public final int e;
    public final bg1 f;
    public final Long g;

    public kl1(int i, bg1 bg1Var, yad yadVar, Long l, String str, List list, boolean z) {
        this.a = yadVar;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = i;
        this.f = bg1Var;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl1)) {
            return false;
        }
        kl1 kl1Var = (kl1) obj;
        return tpa.f(this.a, kl1Var.a) && tpa.f(this.b, kl1Var.b) && this.c == kl1Var.c && tpa.f(this.d, kl1Var.d) && this.e == kl1Var.e && tpa.f(this.f, kl1Var.f) && tpa.f(this.g, kl1Var.g);
    }

    public final int hashCode() {
        int iD = ms2.d(rh4.d(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
        List list = this.d;
        int iC = s36.c(this.e, (iD + (list == null ? 0 : list.hashCode())) * 31);
        bg1 bg1Var = this.f;
        int iHashCode = (iC + (bg1Var == null ? 0 : bg1Var.hashCode())) * 31;
        Long l = this.g;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "CallSessionRoom(id=" + this.a + ", name=" + this.b + ", isActive=" + this.c + ", participantIds=" + this.d + ", participantCount=" + this.e + ", pinnedParticipantId=" + this.f + ", timeoutMs=" + this.g + ")";
    }
}
