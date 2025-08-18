package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class nb1 {
    public final md0 a;
    public final m38 b;
    public final m38 c;
    public final boolean d;
    public final jqe e;
    public final List f;
    public final jqe g;

    public nb1(md0 md0Var, m38 m38Var, m38 m38Var2, boolean z, jqe jqeVar, List list, jqe jqeVar2) {
        this.a = md0Var;
        this.b = m38Var;
        this.c = m38Var2;
        this.d = z;
        this.e = jqeVar;
        this.f = list;
        this.g = jqeVar2;
    }

    public static nb1 a(nb1 nb1Var, md0 md0Var, m38 m38Var, m38 m38Var2, boolean z, jqe jqeVar, ArrayList arrayList, jqe jqeVar2, int i) {
        md0 md0Var2 = (i & 1) != 0 ? nb1Var.a : md0Var;
        m38 m38Var3 = (i & 2) != 0 ? nb1Var.b : m38Var;
        m38 m38Var4 = (i & 4) != 0 ? nb1Var.c : m38Var2;
        boolean z2 = (i & 8) != 0 ? nb1Var.d : z;
        jqe jqeVar3 = (i & 16) != 0 ? nb1Var.e : jqeVar;
        List list = (i & 32) != 0 ? nb1Var.f : arrayList;
        jqe jqeVar4 = (i & 64) != 0 ? nb1Var.g : jqeVar2;
        nb1Var.getClass();
        return new nb1(md0Var2, m38Var3, m38Var4, z2, jqeVar3, list, jqeVar4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb1)) {
            return false;
        }
        nb1 nb1Var = (nb1) obj;
        return tpa.f(this.a, nb1Var.a) && this.b == nb1Var.b && this.c == nb1Var.c && this.d == nb1Var.d && tpa.f(this.e, nb1Var.e) && tpa.f(this.f, nb1Var.f) && tpa.f(this.g, nb1Var.g);
    }

    public final int hashCode() {
        md0 md0Var = this.a;
        int iF = k7d.f(ms2.d((this.c.hashCode() + ((this.b.hashCode() + ((md0Var == null ? 0 : md0Var.hashCode()) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        List list = this.f;
        int iHashCode = (iF + (list == null ? 0 : list.hashCode())) * 31;
        jqe jqeVar = this.g;
        return iHashCode + (jqeVar != null ? jqeVar.hashCode() : 0);
    }

    public final String toString() {
        return "UserPreviewState(avatar=" + this.a + ", microphoneState=" + this.b + ", videoState=" + this.c + ", isFrontCamera=" + this.d + ", title=" + this.e + ", avatarInfo=" + this.f + ", participantsTitle=" + this.g + ")";
    }
}
