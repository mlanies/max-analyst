package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class jz5 implements nz5 {
    public final Long a;
    public final Set b;
    public final Long c;
    public final boolean d;
    public final zy5 e;

    public jz5(Long l, Set set, Long l2, boolean z, zy5 zy5Var, int i) {
        set = (i & 2) != 0 ? null : set;
        l2 = (i & 4) != 0 ? null : l2;
        z = (i & 8) != 0 ? false : z;
        zy5Var = (i & 16) != 0 ? null : zy5Var;
        this.a = l;
        this.b = set;
        this.c = l2;
        this.d = z;
        this.e = zy5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz5)) {
            return false;
        }
        jz5 jz5Var = (jz5) obj;
        return tpa.f(this.a, jz5Var.a) && tpa.f(this.b, jz5Var.b) && tpa.f(this.c, jz5Var.c) && this.d == jz5Var.d && tpa.f(this.e, jz5Var.e);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Set set = this.b;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        Long l2 = this.c;
        int iD = ms2.d((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.d);
        zy5 zy5Var = this.e;
        return iD + (zy5Var != null ? zy5Var.hashCode() : 0);
    }

    public final String toString() {
        return "ClosePicker(destinationId=" + this.a + ", fwdMsgIds=" + this.b + ", fwdAttachId=" + this.c + ", isForwardAttach=" + this.d + ", inAppReviewData=" + this.e + ")";
    }
}
