package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class rc1 {
    public static final List j = y53.M(fc1.a, hc1.a, ic1.a);
    public static final rc1 k = new rc1(null, null, null, new oc1(new iqe("")), new eqe(t7a.k), nz4.a, null, true, null);
    public final String a;
    public final uc0 b;
    public final CharSequence c;
    public final qc1 d;
    public final jqe e;
    public final List f;
    public final mc1 g;
    public final boolean h;
    public final Long i;

    public rc1(String str, uc0 uc0Var, CharSequence charSequence, qc1 qc1Var, jqe jqeVar, List list, mc1 mc1Var, boolean z, Long l) {
        this.a = str;
        this.b = uc0Var;
        this.c = charSequence;
        this.d = qc1Var;
        this.e = jqeVar;
        this.f = list;
        this.g = mc1Var;
        this.h = z;
        this.i = l;
    }

    public static rc1 a(rc1 rc1Var, uc0 uc0Var, String str, qc1 qc1Var, jqe jqeVar, List list, mc1 mc1Var, boolean z, Long l, int i) {
        String str2 = rc1Var.a;
        uc0 uc0Var2 = (i & 2) != 0 ? rc1Var.b : uc0Var;
        CharSequence charSequence = (i & 4) != 0 ? rc1Var.c : str;
        qc1 qc1Var2 = (i & 8) != 0 ? rc1Var.d : qc1Var;
        jqe jqeVar2 = (i & 16) != 0 ? rc1Var.e : jqeVar;
        mc1 mc1Var2 = (i & 64) != 0 ? rc1Var.g : mc1Var;
        boolean z2 = (i & 128) != 0 ? rc1Var.h : z;
        Long l2 = (i & 256) != 0 ? rc1Var.i : l;
        rc1Var.getClass();
        return new rc1(str2, uc0Var2, charSequence, qc1Var2, jqeVar2, list, mc1Var2, z2, l2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc1)) {
            return false;
        }
        rc1 rc1Var = (rc1) obj;
        return tpa.f(this.a, rc1Var.a) && tpa.f(this.b, rc1Var.b) && tpa.f(this.c, rc1Var.c) && tpa.f(this.d, rc1Var.d) && tpa.f(this.e, rc1Var.e) && tpa.f(this.f, rc1Var.f) && tpa.f(this.g, rc1Var.g) && this.h == rc1Var.h && tpa.f(this.i, rc1Var.i);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        uc0 uc0Var = this.b;
        int iHashCode2 = (iHashCode + (uc0Var == null ? 0 : uc0Var.hashCode())) * 31;
        CharSequence charSequence = this.c;
        int iG = k7d.g(this.f, k7d.f((this.d.hashCode() + ((iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31, 31, this.e), 31);
        mc1 mc1Var = this.g;
        int iD = ms2.d((iG + (mc1Var == null ? 0 : mc1Var.hashCode())) * 31, 31, this.h);
        Long l = this.i;
        return iD + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "CallLinkInfo(icon=" + this.a + ", avatarAbbreviationModel=" + this.b + ", callLink=" + ((Object) this.c) + ", linkInfo=" + this.d + ", title=" + this.e + ", action=" + this.f + ", button=" + this.g + ", isNew=" + this.h + ", serverChatId=" + this.i + ")";
    }
}
