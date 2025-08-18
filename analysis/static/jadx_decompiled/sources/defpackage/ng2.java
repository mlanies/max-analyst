package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ng2 extends pg2 {
    public final xm8 b;
    public final jqe c;
    public final jqe d;
    public final List e;

    public ng2(xm8 xm8Var, jqe jqeVar, jqe jqeVar2, List list) {
        this.b = xm8Var;
        this.c = jqeVar;
        this.d = jqeVar2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng2)) {
            return false;
        }
        ng2 ng2Var = (ng2) obj;
        return tpa.f(this.b, ng2Var.b) && tpa.f(this.c, ng2Var.c) && tpa.f(this.d, ng2Var.d) && tpa.f(this.e, ng2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k7d.f(k7d.f(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "ShowConfirmationBottomSheet(model=" + this.b + ", title=" + this.c + ", description=" + this.d + ", actions=" + this.e + ")";
    }
}
